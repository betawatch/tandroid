package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class py0 extends sg.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public py0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 1 || i3 == 2 || i3 == 4 || i3 == 6;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.s.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((qy0) this.d.s.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        View view = d1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((qy0) arrayList.get(i3)).a == 1) {
            ((org.telegram.ui.Cells.l8) view).setNeedDivider(saveToGallerySettingsActivity.w.size() > 0);
            return;
        }
        if (((qy0) arrayList.get(i3)).a == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            org.telegram.messenger.jv c02 = saveToGallerySettingsActivity.c0();
            if (i3 == saveToGallerySettingsActivity.e) {
                q8Var.f(org.telegram.messenger.bd.M0(2131745930, null), c02.a, true);
                int i10 = org.telegram.ui.ActionBar.k6.Zj;
                q8Var.c(saveToGallerySettingsActivity.getThemedColor(i10), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, q8Var, i10);
                return;
            }
            q8Var.f(org.telegram.messenger.bd.M0(2131745923, null), c02.b, false);
            int i11 = org.telegram.ui.ActionBar.k6.Wj;
            q8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, q8Var, i11);
            return;
        }
        if (((qy0) arrayList.get(i3)).a == 7) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 != saveToGallerySettingsActivity.h) {
                y8Var.setText(((qy0) arrayList.get(i3)).d);
                return;
            }
            long j10 = saveToGallerySettingsActivity.c0().c;
            if (saveToGallerySettingsActivity.c != null) {
                y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintCurrent", null, 2131745926, new Object[0]));
                return;
            }
            int i12 = saveToGallerySettingsActivity.a;
            if (i12 == 1) {
                y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintUser", null, 2131745924, new Object[0]));
                return;
            } else if (i12 == 4) {
                y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintChannels", null, 2131745927, new Object[0]));
                return;
            } else {
                if (i12 == 2) {
                    y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintGroup", null, 2131745925, new Object[0]));
                    return;
                }
                return;
            }
        }
        if (((qy0) arrayList.get(i3)).a == 5) {
            ((org.telegram.ui.Cells.n4) view).setText(((qy0) arrayList.get(i3)).d);
            return;
        }
        if (((qy0) arrayList.get(i3)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            org.telegram.messenger.iv ivVar = ((qy0) arrayList.get(i3)).c;
            TLObject e22 = saveToGallerySettingsActivity.getMessagesController().e2(ivVar.d);
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                str = user.self ? org.telegram.messenger.bd.M0(2131745911, null) : org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
            } else {
                str = e22 instanceof TLRPC.Chat ? ((TLRPC.Chat) e22).title : null;
            }
            paVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (ivVar.a()) {
                if (ivVar.a) {
                    sb2.append(org.telegram.messenger.bd.M0(2131745930, null));
                }
                if (ivVar.b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j11 = ivVar.c;
                    if (j11 <= 0 || j11 >= 4194304000L) {
                        sb2.append(org.telegram.messenger.bd.a0("SaveToGalleryVideos", null, 2131745923, new Object[0]));
                    } else {
                        sb2.append(org.telegram.messenger.bd.a0("SaveToGalleryVideosUpTo", null, 2131745922, org.telegram.messenger.g0.i0(j11, true, false)));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.bd.M0(2131745931, null));
            }
            paVar.d(e22, str, sb2, i3 == arrayList.size() - 1 || ((qy0) arrayList.get(i3 + 1)).a == 2);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        int i10;
        TLObject M0;
        int i11;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i3) {
            case 1:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131747931, null), true);
                l8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, null);
                view3 = l8Var;
                break;
            case 2:
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, paVar, null);
                view = paVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var2.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                l8Var2.g(-1, org.telegram.ui.ActionBar.k6.p7);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var2, null);
                view2 = l8Var2;
                view3 = view2;
                break;
            case 5:
                View n4Var = new org.telegram.ui.Cells.n4(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, null);
                view2 = n4Var;
                view3 = view2;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, q8Var, null);
                view2 = q8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                ry0 ry0Var = new ry0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ry0Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                ry0Var.setText(org.telegram.messenger.g0.i0(524288L, true, false));
                frameLayout.addView(ry0Var, b8.mf.e(-2, -2, 83));
                ry0 ry0Var2 = new ry0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ry0Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
                frameLayout.addView(ry0Var2, b8.mf.e(-2, -2, 81));
                ry0 ry0Var3 = new ry0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ry0Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
                ry0Var3.setText(org.telegram.messenger.g0.i0(4194304000L, true, false));
                frameLayout.addView(ry0Var3, b8.mf.e(-2, -2, 85));
                linearLayout.addView(frameLayout, b8.mf.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(pm0Var, b8.mf.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.c0().c;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                pm0Var.setReportChanges(true);
                pm0Var.setDelegate(new b8.ke(this, pm0Var, ry0Var, ry0Var2, ry0Var3));
                pm0Var.setProgress(((float) j10) > ((float) 104857600) * 0.7f ? a1.g.A(j10 - 104857600, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                pm0Var.y.k(false, pm0Var.getProgress());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, linearLayout, null);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.oa oaVar = new org.telegram.ui.Cells.oa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.m5.E(saveToGallerySettingsActivity.b)) {
                    i11 = ((org.telegram.ui.ActionBar.d2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.d2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                oaVar.a(null, M0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, oaVar, saveToGallerySettingsActivity.getResourceProvider());
                view2 = oaVar;
                view3 = view2;
                break;
            case 10:
                view2 = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view3 = view2;
                break;
        }
        return k2.p1.p(view3, view3, -1, -2);
    }
}
