package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dz0 extends rg.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public dz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4 || i7 == 6;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.s.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((ez0) this.d.s.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        View view = d1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((ez0) arrayList.get(i7)).a == 1) {
            ((org.telegram.ui.Cells.m8) view).setNeedDivider(saveToGallerySettingsActivity.w.size() > 0);
            return;
        }
        if (((ez0) arrayList.get(i7)).a == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            org.telegram.messenger.rv c02 = saveToGallerySettingsActivity.c0();
            if (i7 == saveToGallerySettingsActivity.e) {
                r8Var.f(org.telegram.messenger.id.M0(2131745920, null), c02.a, true);
                int i10 = org.telegram.ui.ActionBar.m6.Zj;
                r8Var.c(saveToGallerySettingsActivity.getThemedColor(i10), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, r8Var, i10);
                return;
            }
            r8Var.f(org.telegram.messenger.id.M0(2131745913, null), c02.b, false);
            int i11 = org.telegram.ui.ActionBar.m6.Wj;
            r8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, r8Var, i11);
            return;
        }
        if (((ez0) arrayList.get(i7)).a == 7) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 != saveToGallerySettingsActivity.h) {
                z8Var.setText(((ez0) arrayList.get(i7)).d);
                return;
            }
            long j3 = saveToGallerySettingsActivity.c0().c;
            if (saveToGallerySettingsActivity.c != null) {
                z8Var.setText(org.telegram.messenger.id.a0("SaveToGalleryVideoHintCurrent", null, 2131745916, new Object[0]));
                return;
            }
            int i12 = saveToGallerySettingsActivity.a;
            if (i12 == 1) {
                z8Var.setText(org.telegram.messenger.id.a0("SaveToGalleryVideoHintUser", null, 2131745914, new Object[0]));
                return;
            } else if (i12 == 4) {
                z8Var.setText(org.telegram.messenger.id.a0("SaveToGalleryVideoHintChannels", null, 2131745917, new Object[0]));
                return;
            } else {
                if (i12 == 2) {
                    z8Var.setText(org.telegram.messenger.id.a0("SaveToGalleryVideoHintGroup", null, 2131745915, new Object[0]));
                    return;
                }
                return;
            }
        }
        if (((ez0) arrayList.get(i7)).a == 5) {
            ((org.telegram.ui.Cells.n4) view).setText(((ez0) arrayList.get(i7)).d);
            return;
        }
        if (((ez0) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            org.telegram.messenger.qv qvVar = ((ez0) arrayList.get(i7)).c;
            TLObject e22 = saveToGallerySettingsActivity.getMessagesController().e2(qvVar.d);
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                str = user.self ? org.telegram.messenger.id.M0(2131745901, null) : org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
            } else {
                str = e22 instanceof TLRPC.Chat ? ((TLRPC.Chat) e22).title : null;
            }
            paVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (qvVar.a()) {
                if (qvVar.a) {
                    sb2.append(org.telegram.messenger.id.M0(2131745920, null));
                }
                if (qvVar.b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j10 = qvVar.c;
                    if (j10 <= 0 || j10 >= 4194304000L) {
                        sb2.append(org.telegram.messenger.id.a0("SaveToGalleryVideos", null, 2131745913, new Object[0]));
                    } else {
                        sb2.append(org.telegram.messenger.id.a0("SaveToGalleryVideosUpTo", null, 2131745912, org.telegram.messenger.g0.i0(j10, true, false)));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.id.M0(2131745921, null));
            }
            paVar.d(e22, str, sb2, i7 == arrayList.size() - 1 || ((ez0) arrayList.get(i7 + 1)).a == 2);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        TLObject M0;
        int i11;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i7) {
            case 1:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131747923, null), true);
                m8Var.g(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, m8Var, null);
                view3 = m8Var;
                break;
            case 2:
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, paVar, null);
                view = paVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var2.k(org.telegram.messenger.id.M0(2131747915, null), false);
                m8Var2.g(-1, org.telegram.ui.ActionBar.m6.p7);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, m8Var2, null);
                view2 = m8Var2;
                view3 = view2;
                break;
            case 5:
                View n4Var = new org.telegram.ui.Cells.n4(viewGroup.getContext());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n4Var, null);
                view2 = n4Var;
                view3 = view2;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, r8Var, null);
                view2 = r8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                fz0 fz0Var = new fz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                fz0Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                fz0Var.setText(org.telegram.messenger.g0.i0(524288L, true, false));
                frameLayout.addView(fz0Var, c8.ha.e(-2, -2, 83));
                fz0 fz0Var2 = new fz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                fz0Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
                frameLayout.addView(fz0Var2, c8.ha.e(-2, -2, 81));
                fz0 fz0Var3 = new fz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                fz0Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
                fz0Var3.setText(org.telegram.messenger.g0.i0(4194304000L, true, false));
                frameLayout.addView(fz0Var3, c8.ha.e(-2, -2, 85));
                linearLayout.addView(frameLayout, c8.ha.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(mm0Var, c8.ha.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.c0().c;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                mm0Var.setReportChanges(true);
                mm0Var.setDelegate(new a8.r7(this, mm0Var, fz0Var, fz0Var2, fz0Var3));
                mm0Var.setProgress(((float) j3) > ((float) 104857600) * 0.7f ? com.google.android.recaptcha.internal.a.c(j3 - 104857600, 4089446400L, 0.3f, 0.7f) : ((j3 - 524288) / 104333312) * 0.7f);
                mm0Var.y.l(false, mm0Var.getProgress());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, linearLayout, null);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.oa oaVar = new org.telegram.ui.Cells.oa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.m5.E(saveToGallerySettingsActivity.b)) {
                    i11 = ((org.telegram.ui.ActionBar.f2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                oaVar.a(null, M0);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, oaVar, saveToGallerySettingsActivity.getResourceProvider());
                view2 = oaVar;
                view3 = view2;
                break;
            case 10:
                view2 = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view3 = view2;
                break;
        }
        return jg.g.r(view3, view3, -1, -2);
    }
}
