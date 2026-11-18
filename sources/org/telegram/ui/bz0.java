package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bz0 extends rg.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public bz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4 || i7 == 6;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.s.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((cz0) this.d.s.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        View view = f1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((cz0) arrayList.get(i7)).a == 1) {
            ((org.telegram.ui.Cells.n8) view).setNeedDivider(saveToGallerySettingsActivity.w.size() > 0);
            return;
        }
        if (((cz0) arrayList.get(i7)).a == 6) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            org.telegram.messenger.lv c02 = saveToGallerySettingsActivity.c0();
            if (i7 == saveToGallerySettingsActivity.e) {
                s8Var.f(org.telegram.messenger.gd.M0(2131745725, null), c02.a, true);
                int i10 = org.telegram.ui.ActionBar.n6.ck;
                s8Var.c(saveToGallerySettingsActivity.getThemedColor(i10), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, s8Var, i10);
                return;
            }
            s8Var.f(org.telegram.messenger.gd.M0(2131745718, null), c02.b, false);
            int i11 = org.telegram.ui.ActionBar.n6.Zj;
            s8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, s8Var, i11);
            return;
        }
        if (((cz0) arrayList.get(i7)).a == 7) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 != saveToGallerySettingsActivity.h) {
                a9Var.setText(((cz0) arrayList.get(i7)).d);
                return;
            }
            long j3 = saveToGallerySettingsActivity.c0().c;
            if (saveToGallerySettingsActivity.c != null) {
                a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintCurrent", null, 2131745721, new Object[0]));
                return;
            }
            int i12 = saveToGallerySettingsActivity.a;
            if (i12 == 1) {
                a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintUser", null, 2131745719, new Object[0]));
                return;
            } else if (i12 == 4) {
                a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintChannels", null, 2131745722, new Object[0]));
                return;
            } else {
                if (i12 == 2) {
                    a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintGroup", null, 2131745720, new Object[0]));
                    return;
                }
                return;
            }
        }
        if (((cz0) arrayList.get(i7)).a == 5) {
            ((org.telegram.ui.Cells.o4) view).setText(((cz0) arrayList.get(i7)).d);
            return;
        }
        if (((cz0) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            org.telegram.messenger.kv kvVar = ((cz0) arrayList.get(i7)).c;
            TLObject g22 = saveToGallerySettingsActivity.getMessagesController().g2(kvVar.d);
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                str = user.self ? org.telegram.messenger.gd.M0(2131745706, null) : org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
            } else {
                str = g22 instanceof TLRPC.Chat ? ((TLRPC.Chat) g22).title : null;
            }
            raVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (kvVar.a()) {
                if (kvVar.a) {
                    sb2.append(org.telegram.messenger.gd.M0(2131745725, null));
                }
                if (kvVar.b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j10 = kvVar.c;
                    if (j10 <= 0 || j10 >= 4194304000L) {
                        sb2.append(org.telegram.messenger.gd.a0("SaveToGalleryVideos", null, 2131745718, new Object[0]));
                    } else {
                        sb2.append(org.telegram.messenger.gd.a0("SaveToGalleryVideosUpTo", null, 2131745717, org.telegram.messenger.g0.i0(j10, true, false)));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.gd.M0(2131745726, null));
            }
            raVar.d(g22, str, sb2, i7 == arrayList.size() - 1 || ((cz0) arrayList.get(i7 + 1)).a == 2);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        TLObject O0;
        int i11;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i7) {
            case 1:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131747730, null), true);
                n8Var.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n8Var, null);
                view3 = n8Var;
                break;
            case 2:
                View raVar = new org.telegram.ui.Cells.ra(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, raVar, null);
                view = raVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var2.k(org.telegram.messenger.gd.M0(2131747722, null), false);
                n8Var2.g(-1, org.telegram.ui.ActionBar.n6.p7);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n8Var2, null);
                view2 = n8Var2;
                view3 = view2;
                break;
            case 5:
                View o4Var = new org.telegram.ui.Cells.o4(viewGroup.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, null);
                view2 = o4Var;
                view3 = view2;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, s8Var, null);
                view2 = s8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                dz0 dz0Var = new dz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                dz0Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                dz0Var.setText(org.telegram.messenger.g0.i0(524288L, true, false));
                frameLayout.addView(dz0Var, c8.ma.e(-2, -2, 83));
                dz0 dz0Var2 = new dz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                dz0Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
                frameLayout.addView(dz0Var2, c8.ma.e(-2, -2, 81));
                dz0 dz0Var3 = new dz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                dz0Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
                dz0Var3.setText(org.telegram.messenger.g0.i0(4194304000L, true, false));
                frameLayout.addView(dz0Var3, c8.ma.e(-2, -2, 85));
                linearLayout.addView(frameLayout, c8.ma.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(ym0Var, c8.ma.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.c0().c;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                ym0Var.setReportChanges(true);
                ym0Var.setDelegate(new a8.r7(this, ym0Var, dz0Var, dz0Var2, dz0Var3));
                ym0Var.setProgress(((float) j3) > ((float) 104857600) * 0.7f ? com.google.android.gms.internal.vision.e2.c(j3 - 104857600, 4089446400L, 0.3f, 0.7f) : ((j3 - 524288) / 104333312) * 0.7f);
                ym0Var.y.n(false, ym0Var.getProgress());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, linearLayout, null);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.qa qaVar = new org.telegram.ui.Cells.qa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.n5.E(saveToGallerySettingsActivity.b)) {
                    i11 = ((org.telegram.ui.ActionBar.h2) saveToGallerySettingsActivity).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.h2) saveToGallerySettingsActivity).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                qaVar.a(null, O0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, qaVar, saveToGallerySettingsActivity.getResourceProvider());
                view2 = qaVar;
                view3 = view2;
                break;
            case 10:
                view2 = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                view3 = view2;
                break;
        }
        return i5.c.q(view3, view3, -1, -2);
    }
}
