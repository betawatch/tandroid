package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ i3(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.x2 x2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.messenger.camera.i iVar) {
        this.c = frameLayout;
        this.d = i6Var;
        this.e = x2Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        int[] iArr = this.b;
        ViewGroup viewGroup = this.f;
        KeyEvent.Callback callback = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i7) {
            case 0:
                di.i0 i0Var = (di.i0) obj2;
                hi.w4 w4Var = (hi.w4) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (b5.c(null, (sb0) obj4, (sb0) callback, (sb0) viewGroup, (sb0) obj3) / 1000);
                int i10 = iArr[0];
                mt mtVar = (mt) i0Var.c;
                int i11 = i0Var.a;
                int i12 = i0Var.b;
                Editable text = mtVar.getText();
                dz0 dz0Var = new dz0();
                dz0Var.a |= 128;
                dz0Var.b = i11;
                dz0Var.c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new k00(text.subSequence(i11, i12).toString(), dz0Var, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                kt ktVar = mtVar.T1;
                if (ktVar != null) {
                    ktVar.g();
                }
                ((org.telegram.ui.ActionBar.x2) w4Var.b).y0.run();
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q()) {
                    y60 G = y60.G(x2Var.c, i6Var, frameLayout2);
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        G.c(0, strArr[i13], new c3(iArr2, iArr[i13], runnable), false);
                    }
                    G.i = 1;
                    G.a0();
                    break;
                } else {
                    new lc(frameLayout, i6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131748305, null), new org.telegram.messenger.j2(23))).j();
                    break;
                }
        }
    }

    public /* synthetic */ i3(boolean[] zArr, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, sb0 sb0Var4, di.i0 i0Var, int[] iArr, hi.w4 w4Var) {
        this.c = zArr;
        this.d = sb0Var;
        this.e = sb0Var2;
        this.f = sb0Var3;
        this.h = sb0Var4;
        this.n = i0Var;
        this.b = iArr;
        this.r = w4Var;
    }
}
