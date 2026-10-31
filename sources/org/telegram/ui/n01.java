package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n01 extends hg.c {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public n01(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.s.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((o01) this.d.s.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        View view = c1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((o01) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.p8) view).setNeedDivider(saveToGallerySettingsActivity.w.size() > 0);
            return;
        }
        if (((o01) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            org.telegram.messenger.cw b02 = saveToGallerySettingsActivity.b0();
            if (i10 == saveToGallerySettingsActivity.e) {
                t8Var.f(org.telegram.messenger.cd.L0(2131745937, null), b02.a, true);
                int i11 = org.telegram.ui.ActionBar.t6.Zj;
                t8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.a0(saveToGallerySettingsActivity, t8Var, i11);
                return;
            }
            t8Var.f(org.telegram.messenger.cd.L0(2131745930, null), b02.b, false);
            int i12 = org.telegram.ui.ActionBar.t6.Wj;
            t8Var.c(saveToGallerySettingsActivity.getThemedColor(i12), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.a0(saveToGallerySettingsActivity, t8Var, i12);
            return;
        }
        if (((o01) arrayList.get(i10)).a == 7) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 != saveToGallerySettingsActivity.h) {
                b9Var.setText(((o01) arrayList.get(i10)).d);
                return;
            }
            long j10 = saveToGallerySettingsActivity.b0().c;
            if (saveToGallerySettingsActivity.c != null) {
                b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintCurrent", null, 2131745933, new Object[0]));
                return;
            }
            int i13 = saveToGallerySettingsActivity.a;
            if (i13 == 1) {
                b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintUser", null, 2131745931, new Object[0]));
                return;
            } else if (i13 == 4) {
                b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintChannels", null, 2131745934, new Object[0]));
                return;
            } else {
                if (i13 == 2) {
                    b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintGroup", null, 2131745932, new Object[0]));
                    return;
                }
                return;
            }
        }
        if (((o01) arrayList.get(i10)).a == 5) {
            ((org.telegram.ui.Cells.p4) view).setText(((o01) arrayList.get(i10)).d);
            return;
        }
        if (((o01) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            org.telegram.messenger.bw bwVar = ((o01) arrayList.get(i10)).c;
            TLObject d22 = saveToGallerySettingsActivity.getMessagesController().d2(bwVar.d);
            if (d22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) d22;
                str = user.self ? org.telegram.messenger.cd.L0(2131745918, null) : org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
            } else {
                str = d22 instanceof TLRPC.Chat ? ((TLRPC.Chat) d22).title : null;
            }
            paVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (bwVar.a()) {
                if (bwVar.a) {
                    sb2.append(org.telegram.messenger.cd.L0(2131745937, null));
                }
                if (bwVar.b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j11 = bwVar.c;
                    if (j11 <= 0 || j11 >= 4194304000L) {
                        sb2.append(org.telegram.messenger.cd.a0("SaveToGalleryVideos", null, 2131745930, new Object[0]));
                    } else {
                        sb2.append(org.telegram.messenger.cd.a0("SaveToGalleryVideosUpTo", null, 2131745929, org.telegram.messenger.i0.i0(j11, true, false)));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.cd.L0(2131745938, null));
            }
            paVar.d(d22, str, sb2, i10 == arrayList.size() - 1 || ((o01) arrayList.get(i10 + 1)).a == 2);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject L0;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.cd.L0(2131747939, null), true);
                p8Var.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, null);
                view3 = p8Var;
                break;
            case 2:
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, paVar, null);
                view = paVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var2.k(org.telegram.messenger.cd.L0(2131747931, null), false);
                p8Var2.g(-1, org.telegram.ui.ActionBar.t6.p7);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var2, null);
                view2 = p8Var2;
                view3 = view2;
                break;
            case 5:
                View p4Var = new org.telegram.ui.Cells.p4(viewGroup.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, null);
                view2 = p4Var;
                view3 = view2;
                break;
            case 6:
                View t8Var = new org.telegram.ui.Cells.t8(viewGroup.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, t8Var, null);
                view2 = t8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.b9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                p01 p01Var = new p01(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                p01Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
                p01Var.setText(org.telegram.messenger.i0.i0(524288L, true, false));
                frameLayout.addView(p01Var, w7.b6.e(-2, -2, 83));
                p01 p01Var2 = new p01(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                p01Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
                frameLayout.addView(p01Var2, w7.b6.e(-2, -2, 81));
                p01 p01Var3 = new p01(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                p01Var3.setTextSize(org.telegram.messenger.i0.L(13.0f));
                p01Var3.setText(org.telegram.messenger.i0.i0(4194304000L, true, false));
                frameLayout.addView(p01Var3, w7.b6.e(-2, -2, 85));
                linearLayout.addView(frameLayout, w7.b6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(nn0Var, w7.b6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.b0().c;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                nn0Var.setReportChanges(true);
                bh.d dVar = new bh.d();
                dVar.e = this;
                dVar.a = nn0Var;
                dVar.b = p01Var;
                dVar.c = p01Var2;
                dVar.d = p01Var3;
                nn0Var.setDelegate(dVar);
                nn0Var.setProgress(((float) j10) > ((float) 104857600) * 0.7f ? a1.g.c(j10 - 104857600, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                nn0Var.y.k(false, nn0Var.getProgress());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, linearLayout, null);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.oa oaVar = new org.telegram.ui.Cells.oa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.o5.E(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.k2) saveToGallerySettingsActivity).currentAccount;
                    L0 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.k2) saveToGallerySettingsActivity).currentAccount;
                    L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                oaVar.a(null, L0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, oaVar, saveToGallerySettingsActivity.getResourceProvider());
                view2 = oaVar;
                view3 = view2;
                break;
            case 10:
                view2 = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view3 = view2;
                break;
        }
        return sc.e.o(view3, view3, -1, -2);
    }
}
