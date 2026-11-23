package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ao0(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qq0 qq0Var;
        CharSequence text;
        int i7;
        int i10 = this.a;
        int i11 = 19;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        int i15 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                int i16 = i15 + 1;
                if (i16 < 6 && (qq0Var = photoViewer.f0) != null) {
                    qq0Var.invalidate();
                    org.telegram.messenger.g0.h3(new ao0(photoViewer, i16, i14), 100L);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String N0 = org.telegram.messenger.gd.N0(2131746451, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131746452, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new ai.n1(profileActivity, i15, i11));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 2:
                iw0 iw0Var = (iw0) obj;
                ProfileActivity profileActivity2 = iw0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, org.telegram.messenger.ks.s1);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().s4(0L, "PREMIUM_GRACE");
                    vf.c.t(iw0Var.getContext(), profileActivity2.getMessagesController().O5);
                } else {
                    profileActivity2.getMessagesController().s4(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, org.telegram.messenger.ks.s1);
                profileActivity2.H5(false, false);
                break;
            case 3:
                wx0 wx0Var = (wx0) obj;
                org.telegram.messenger.g0.v1(wx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = wx0Var.a;
                    if (i14 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i14 != 0 && ((i15 != 3 || i14 != 4) && ((i15 != 2 || (i14 != 4 && i14 != 1)) && (i15 != 1 || (i14 != 1 && i14 != 2 && i14 != 3))))) {
                            editTextBoldCursorArr[i14].setText((CharSequence) null);
                        }
                        i14++;
                    }
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i15);
                sessionsActivity.r0();
                y21 y21Var = sessionsActivity.a;
                if (y21Var != null) {
                    y21Var.f();
                    break;
                }
                break;
            case 5:
                fc1 fc1Var = (fc1) obj;
                fc1Var.G.setSignalBarCount(i15);
                if (i15 > 1) {
                    org.telegram.ui.Components.voip.y2 y2Var = fc1Var.w;
                    if (y2Var.W != 2) {
                        y2Var.W = 2;
                        y2Var.c();
                        ValueAnimator valueAnimator = y2Var.P;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            y2Var.P.cancel();
                        }
                        ValueAnimator ofInt = ValueAnimator.ofInt(y2Var.I, 0);
                        y2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var, i14));
                        y2Var.P.setDuration(500L);
                        y2Var.P.start();
                    }
                    fc1Var.G.c(false);
                    break;
                } else {
                    org.telegram.ui.Components.voip.y2 y2Var2 = fc1Var.w;
                    if (y2Var2.W != 3) {
                        y2Var2.W = 3;
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(y2Var2.I, org.telegram.messenger.ks.e4);
                        y2Var2.P = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var2, i12));
                        y2Var2.P.setDuration(500L);
                        y2Var2.P.start();
                    }
                    fc1Var.G.c(true);
                    break;
                }
            case 6:
                org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i15);
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i15);
                org.telegram.ui.Wallet.i0 i0Var = new org.telegram.ui.Wallet.i0(f10, (bd0) obj, D);
                f10.b(i0Var, org.telegram.messenger.ks.d4);
                org.telegram.messenger.g0.h3(i0Var, 10000L);
                if (D.e == null && D.C < 0) {
                    D.h0();
                }
                D.f0();
                i0Var.a();
                break;
            case 7:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj;
                HashSet hashSet = v0Var.G;
                hashSet.remove(Integer.valueOf(i15));
                if (hashSet.isEmpty()) {
                    v0Var.a0();
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.ks.f(i15).n((org.telegram.ui.Wallet.n2) obj, org.telegram.messenger.ks.d4);
                break;
            case 9:
                org.telegram.ui.Wallet.q6 q6Var = (org.telegram.ui.Wallet.q6) obj;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.e21(q6Var, i15, org.telegram.ui.Wallet.q6.h(q6Var.R, i15), i11));
                break;
            case 10:
                org.telegram.ui.Wallet.n7 n7Var = (org.telegram.ui.Wallet.n7) obj;
                if (n7Var.r && !n7Var.y && i15 == n7Var.l0) {
                    n7Var.postDelayed(n7Var.m0, 500L);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Wallet.v8 v8Var = (org.telegram.ui.Wallet.v8) obj;
                ArrayList arrayList = v8Var.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) v8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i15 < arrayList.size() && i14 < split.length) {
                            ((org.telegram.ui.Wallet.eb) arrayList.get(i15)).setText(split[i14]);
                            i15++;
                            i14++;
                        }
                        v8Var.d0();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 12:
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) obj;
                if (!oaVar.r && i15 == oaVar.K) {
                    oaVar.M = false;
                    oaVar.a.g3.O(true);
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.lx) obj).w0(i15, 0, null);
                break;
            case 14:
                tg.n nVar = (tg.n) obj;
                nVar.N = i15;
                nVar.M = true;
                try {
                    nVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = nVar.R;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = nVar.S;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                nVar.R = duration;
                duration.setInterpolator(org.telegram.ui.Components.kr.f);
                nVar.R.addUpdateListener(new tg.j(nVar, 5));
                nVar.R.addListener(new tg.k(nVar, i12));
                nVar.R.start();
                break;
            case 15:
                vp0 vp0Var = (vp0) obj;
                sg.g1 g1Var = vp0Var.u1;
                vp0Var.v0(g1Var, null);
                sg.j0.e(i15).j(g1Var.c);
                break;
            case 16:
                org.telegram.messenger.ks.f(i15).k(org.telegram.messenger.ks.u3, Boolean.FALSE);
                ((tg.i2) obj).h();
                break;
            case 17:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
                if (t1Var2 != null) {
                    try {
                        t1Var2.setOnCancelListener(new h60(i15, i13));
                        t1VarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 18:
                org.telegram.ui.Components.j80 j80Var = ((wg.o0) obj).e;
                try {
                    if (j80Var.getLayout().getLineForOffset(i15) == 0) {
                        j80Var.getEditableText().insert(i15, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                zi.d0 d0Var = ((zi.t) obj).N;
                if (d0Var != null && d0Var.s != (i7 = ((i15 % 360) + 360) % 360)) {
                    d0Var.s = i7;
                    d0Var.v();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ao0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
