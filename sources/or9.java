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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class or9 extends ka {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public or9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 1 || i == 2 || i == 4 || i == 6;
    }

    @Override // y59
    public final int b() {
        return this.d.s.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((pr9) this.d.s.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String str;
        View view = u69Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((pr9) arrayList.get(i)).a == 1) {
            ((xib) view).setNeedDivider(saveToGallerySettingsActivity.w.size() > 0);
            return;
        }
        if (((pr9) arrayList.get(i)).a == 6) {
            bjb bjbVar = (bjb) view;
            sr9 c0 = saveToGallerySettingsActivity.c0();
            if (i == saveToGallerySettingsActivity.e) {
                bjbVar.f(jb6.M0(2131745654, null), c0.a, true);
                int i2 = cmb.bk;
                bjbVar.c(saveToGallerySettingsActivity.getThemedColor(i2), R.drawable.msg_filled_data_photos);
                saveToGallerySettingsActivity.b0(bjbVar, i2);
                return;
            }
            bjbVar.f(jb6.M0(2131745647, null), c0.b, false);
            int i3 = cmb.Yj;
            bjbVar.c(saveToGallerySettingsActivity.getThemedColor(i3), R.drawable.msg_filled_data_videos);
            saveToGallerySettingsActivity.b0(bjbVar, i3);
            return;
        }
        if (((pr9) arrayList.get(i)).a == 7) {
            njb njbVar = (njb) view;
            if (i != saveToGallerySettingsActivity.h) {
                njbVar.setText(((pr9) arrayList.get(i)).d);
                return;
            }
            long j = saveToGallerySettingsActivity.c0().c;
            if (saveToGallerySettingsActivity.c != null) {
                njbVar.setText(jb6.a0("SaveToGalleryVideoHintCurrent", null, 2131745650, new Object[0]));
                return;
            }
            int i4 = saveToGallerySettingsActivity.a;
            if (i4 == 1) {
                njbVar.setText(jb6.a0("SaveToGalleryVideoHintUser", null, 2131745648, new Object[0]));
                return;
            } else if (i4 == 4) {
                njbVar.setText(jb6.a0("SaveToGalleryVideoHintChannels", null, 2131745651, new Object[0]));
                return;
            } else {
                if (i4 == 2) {
                    njbVar.setText(jb6.a0("SaveToGalleryVideoHintGroup", null, 2131745649, new Object[0]));
                    return;
                }
                return;
            }
        }
        if (((pr9) arrayList.get(i)).a == 5) {
            ((jf5) view).setText(((pr9) arrayList.get(i)).d);
            return;
        }
        if (((pr9) arrayList.get(i)).a == 2) {
            w8c w8cVar = (w8c) view;
            rr9 rr9Var = ((pr9) arrayList.get(i)).c;
            TLObject a2 = saveToGallerySettingsActivity.getMessagesController().a2(rr9Var.d);
            if (a2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) a2;
                str = user.self ? jb6.M0(2131745635, null) : bw2.m(0, user.first_name, user.last_name);
            } else {
                str = a2 instanceof TLRPC.Chat ? ((TLRPC.Chat) a2).title : null;
            }
            w8cVar.setSelfAsSavedMessages(true);
            StringBuilder sb = new StringBuilder();
            if (rr9Var.a()) {
                if (rr9Var.a) {
                    sb.append(jb6.M0(2131745654, null));
                }
                if (rr9Var.b) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    long j2 = rr9Var.c;
                    if (j2 <= 0 || j2 >= 4194304000L) {
                        sb.append(jb6.a0("SaveToGalleryVideos", null, 2131745647, new Object[0]));
                    } else {
                        sb.append(jb6.a0("SaveToGalleryVideosUpTo", null, 2131745646, gm.i0(j2, true, false)));
                    }
                }
            } else {
                sb.append(jb6.M0(2131745655, null));
            }
            w8cVar.d(a2, str, sb, i == arrayList.size() - 1 || ((pr9) arrayList.get(i + 1)).a == 2);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        TLObject L0;
        int i3;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i) {
            case 1:
                xib xibVar = new xib(viewGroup.getContext());
                xibVar.o(R.drawable.msg_contact_add, jb6.M0(2131747656, null), true);
                xibVar.g(cmb.u6, cmb.t6);
                anb.h(cmb.c6, null, xibVar);
                view3 = xibVar;
                break;
            case 2:
                View w8cVar = new w8c(4, 0, null, viewGroup.getContext(), false, false);
                anb.h(cmb.c6, null, w8cVar);
                view = w8cVar;
                view3 = view;
                break;
            case 3:
                view2 = new bba(viewGroup.getContext(), (hg9) null);
                view3 = view2;
                break;
            case 4:
                xib xibVar2 = new xib(viewGroup.getContext());
                xibVar2.k(jb6.M0(2131747648, null), false);
                xibVar2.g(-1, cmb.o7);
                anb.h(cmb.c6, null, xibVar2);
                view2 = xibVar2;
                view3 = view2;
                break;
            case 5:
                View jf5Var = new jf5(viewGroup.getContext());
                anb.h(cmb.c6, null, jf5Var);
                view2 = jf5Var;
                view3 = view2;
                break;
            case 6:
                View bjbVar = new bjb(viewGroup.getContext());
                anb.h(cmb.c6, null, bjbVar);
                view2 = bjbVar;
                view3 = view2;
                break;
            case 7:
                view3 = new njb(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                dx9 dx9Var = new dx9(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                qr9 qr9Var = new qr9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                qr9Var.setTextSize(gm.L(13.0f));
                qr9Var.setText(gm.i0(524288L, true, false));
                frameLayout.addView(qr9Var, qoe.e(-2, -2, 83));
                qr9 qr9Var2 = new qr9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                qr9Var2.setTextSize(gm.L(13.0f));
                frameLayout.addView(qr9Var2, qoe.e(-2, -2, 81));
                qr9 qr9Var3 = new qr9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                qr9Var3.setTextSize(gm.L(13.0f));
                qr9Var3.setText(gm.i0(4194304000L, true, false));
                frameLayout.addView(qr9Var3, qoe.e(-2, -2, 85));
                linearLayout.addView(frameLayout, qoe.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(dx9Var, qoe.t(-1, 38, 0, 5, 0, 5, 4));
                long j = saveToGallerySettingsActivity.c0().c;
                if (j < 0 || j > 4194304000L) {
                    j = 4194304000L;
                }
                dx9Var.setReportChanges(true);
                dx9Var.setDelegate(new sm2(this, dx9Var, qr9Var, qr9Var2, qr9Var3));
                dx9Var.setProgress(((float) j) > 7.340032E7f ? b10.A(j - 104857600, 4.0894464E9f, 0.3f, 0.7f) : ((j - 524288) / 1.0433331E8f) * 0.7f);
                dx9Var.y.n(false, dx9Var.getProgress());
                anb.h(cmb.c6, null, linearLayout);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                v8c v8cVar = new v8c(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (pg3.D(saveToGallerySettingsActivity.b)) {
                    i3 = ((d) saveToGallerySettingsActivity).currentAccount;
                    L0 = oc7.r1(i3).W1(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i2 = ((d) saveToGallerySettingsActivity).currentAccount;
                    L0 = oc7.r1(i2).L0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                v8cVar.a(null, L0);
                anb.h(cmb.c6, saveToGallerySettingsActivity.getResourceProvider(), v8cVar);
                view2 = v8cVar;
                view3 = view2;
                break;
            case 10:
                view2 = new bba(viewGroup.getContext(), (hg9) null);
                view3 = view2;
                break;
        }
        return kt6.h(view3, view3, -1, -2);
    }
}
