// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.SaveToGallerySettingsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class np9 extends ka {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public np9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 1 || i == 2 || i == 4 || i == 6;
    }

    @Override // w39
    public final int b() {
        return this.d.s.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((op9) this.d.s.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String str;
        View view = s49Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((op9) arrayList.get(i)).a == 1) {
            ((wgb) view).setNeedDivider(saveToGallerySettingsActivity.w.size() > 0);
            return;
        }
        if (((op9) arrayList.get(i)).a == 6) {
            ahb ahbVar = (ahb) view;
            rp9 b0 = saveToGallerySettingsActivity.b0();
            if (i == saveToGallerySettingsActivity.e) {
                ahbVar.f(k96.M0(2131745728, null), b0.a, true);
                int i2 = bkb.bk;
                ahbVar.c(saveToGallerySettingsActivity.getThemedColor(i2), R.drawable.msg_filled_data_photos);
                saveToGallerySettingsActivity.a0(ahbVar, i2);
                return;
            }
            ahbVar.f(k96.M0(2131745721, null), b0.b, false);
            int i3 = bkb.Yj;
            ahbVar.c(saveToGallerySettingsActivity.getThemedColor(i3), R.drawable.msg_filled_data_videos);
            saveToGallerySettingsActivity.a0(ahbVar, i3);
            return;
        }
        if (((op9) arrayList.get(i)).a == 7) {
            mhb mhbVar = (mhb) view;
            if (i != saveToGallerySettingsActivity.h) {
                mhbVar.setText(((op9) arrayList.get(i)).d);
                return;
            }
            long j = saveToGallerySettingsActivity.b0().c;
            if (saveToGallerySettingsActivity.c != null) {
                mhbVar.setText(k96.a0("SaveToGalleryVideoHintCurrent", null, 2131745724, new Object[0]));
                return;
            }
            int i4 = saveToGallerySettingsActivity.a;
            if (i4 == 1) {
                mhbVar.setText(k96.a0("SaveToGalleryVideoHintUser", null, 2131745722, new Object[0]));
                return;
            } else if (i4 == 4) {
                mhbVar.setText(k96.a0("SaveToGalleryVideoHintChannels", null, 2131745725, new Object[0]));
                return;
            } else {
                if (i4 == 2) {
                    mhbVar.setText(k96.a0("SaveToGalleryVideoHintGroup", null, 2131745723, new Object[0]));
                    return;
                }
                return;
            }
        }
        if (((op9) arrayList.get(i)).a == 5) {
            ((ld5) view).setText(((op9) arrayList.get(i)).d);
            return;
        }
        if (((op9) arrayList.get(i)).a == 2) {
            v6c v6cVar = (v6c) view;
            qp9 qp9Var = ((op9) arrayList.get(i)).c;
            TLObject Z1 = saveToGallerySettingsActivity.getMessagesController().Z1(qp9Var.d);
            if (Z1 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) Z1;
                str = user.self ? k96.M0(2131745709, null) : qu2.m(0, user.first_name, user.last_name);
            } else {
                str = Z1 instanceof TLRPC.Chat ? ((TLRPC.Chat) Z1).title : null;
            }
            v6cVar.setSelfAsSavedMessages(true);
            StringBuilder sb = new StringBuilder();
            if (qp9Var.a()) {
                if (qp9Var.a) {
                    sb.append(k96.M0(2131745728, null));
                }
                if (qp9Var.b) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    long j2 = qp9Var.c;
                    if (j2 <= 0 || j2 >= 4194304000L) {
                        sb.append(k96.a0("SaveToGalleryVideos", null, 2131745721, new Object[0]));
                    } else {
                        sb.append(k96.a0("SaveToGalleryVideosUpTo", null, 2131745720, gl.i0(j2, true, false)));
                    }
                }
            } else {
                sb.append(k96.M0(2131745729, null));
            }
            v6cVar.d(Z1, str, sb, i == arrayList.size() - 1 || ((op9) arrayList.get(i + 1)).a == 2);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        TLObject K0;
        int i3;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i) {
            case 1:
                wgb wgbVar = new wgb(viewGroup.getContext());
                wgbVar.o(R.drawable.msg_contact_add, k96.M0(2131747730, null), true);
                wgbVar.g(bkb.u6, bkb.t6);
                zkb.h(bkb.c6, null, wgbVar);
                view3 = wgbVar;
                break;
            case 2:
                View v6cVar = new v6c(4, 0, null, viewGroup.getContext(), false, false);
                zkb.h(bkb.c6, null, v6cVar);
                view = v6cVar;
                view3 = view;
                break;
            case 3:
                view2 = new b9a(viewGroup.getContext(), (de9) null);
                view3 = view2;
                break;
            case 4:
                wgb wgbVar2 = new wgb(viewGroup.getContext());
                wgbVar2.k(k96.M0(2131747722, null), false);
                wgbVar2.g(-1, bkb.o7);
                zkb.h(bkb.c6, null, wgbVar2);
                view2 = wgbVar2;
                view3 = view2;
                break;
            case 5:
                View ld5Var = new ld5(viewGroup.getContext());
                zkb.h(bkb.c6, null, ld5Var);
                view2 = ld5Var;
                view3 = view2;
                break;
            case 6:
                View ahbVar = new ahb(viewGroup.getContext());
                zkb.h(bkb.c6, null, ahbVar);
                view2 = ahbVar;
                view3 = view2;
                break;
            case 7:
                view3 = new mhb(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                av9 av9Var = new av9(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                pp9 pp9Var = new pp9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                pp9Var.setTextSize(gl.L(13.0f));
                pp9Var.setText(gl.i0(524288L, true, false));
                frameLayout.addView(pp9Var, nme.e(-2, -2, 83));
                pp9 pp9Var2 = new pp9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                pp9Var2.setTextSize(gl.L(13.0f));
                frameLayout.addView(pp9Var2, nme.e(-2, -2, 81));
                pp9 pp9Var3 = new pp9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                pp9Var3.setTextSize(gl.L(13.0f));
                pp9Var3.setText(gl.i0(4194304000L, true, false));
                frameLayout.addView(pp9Var3, nme.e(-2, -2, 85));
                linearLayout.addView(frameLayout, nme.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(av9Var, nme.t(-1, 38, 0, 5, 0, 5, 4));
                long j = saveToGallerySettingsActivity.b0().c;
                if (j < 0 || j > 4194304000L) {
                    j = 4194304000L;
                }
                av9Var.setReportChanges(true);
                av9Var.setDelegate(new gl2(this, av9Var, pp9Var, pp9Var2, pp9Var3));
                av9Var.setProgress(((float) j) > 7.340032E7f ? b00.A(j - 104857600, 4.0894464E9f, 0.3f, 0.7f) : ((j - 524288) / 1.0433331E8f) * 0.7f);
                av9Var.y.j(false, av9Var.getProgress());
                zkb.h(bkb.c6, null, linearLayout);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                u6c u6cVar = new u6c(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (cf3.D(saveToGallerySettingsActivity.b)) {
                    i3 = ((d) saveToGallerySettingsActivity).currentAccount;
                    K0 = na7.q1(i3).V1(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i2 = ((d) saveToGallerySettingsActivity).currentAccount;
                    K0 = na7.q1(i2).K0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                u6cVar.a(null, K0);
                zkb.h(bkb.c6, saveToGallerySettingsActivity.getResourceProvider(), u6cVar);
                view2 = u6cVar;
                view3 = view2;
                break;
            case 10:
                view2 = new b9a(viewGroup.getContext(), (de9) null);
                view3 = view2;
                break;
        }
        return ls6.h(view3, view3, -1, -2);
    }
}
