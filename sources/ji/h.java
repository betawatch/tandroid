package ji;

import ai.b2;
import ai.y;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.xr;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gf;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ h(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        p pVar;
        int u02;
        int i7 = 0;
        switch (this.a) {
            case 0:
                m mVar = this.b;
                String str = (String) obj;
                if (mVar.c == 3 && (pVar = mVar.h) != null) {
                    pVar.setBusy(false);
                    if (str != null && !str.trim().isEmpty()) {
                        mVar.n = str;
                        mVar.h.r(str);
                        break;
                    }
                }
                break;
            default:
                m mVar2 = this.b;
                if (!mVar2.n.trim().isEmpty()) {
                    gf gfVar = mVar2.b;
                    String trim = mVar2.n.trim();
                    if (!trim.isEmpty() && mVar2.h != null) {
                        g0.r(mVar2.k0);
                        g0.r(mVar2.j0);
                        Drawable drawable = null;
                        if (xr.k == mVar2) {
                            xr.k = null;
                        }
                        b2 b2Var = mVar2.f;
                        if (b2Var != null) {
                            b2Var.c();
                            mVar2.f = null;
                        }
                        y yVar = mVar2.d;
                        if (yVar != null) {
                            yVar.d();
                            mVar2.d = null;
                        }
                        mVar2.e = null;
                        mVar2.c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        mVar2.h.setListening(false);
                        gfVar.e();
                        if (mVar2.H == null) {
                            mVar2.H = trim;
                        }
                        boolean z10 = obj instanceof ai.h;
                        mVar2.h.setStyleLabel(z10 ? ((ai.h) obj).a : null);
                        p pVar2 = mVar2.h;
                        ChatActivityEnterView chatActivityEnterView = gfVar.a;
                        if (z10) {
                            ai.h hVar = (ai.h) obj;
                            long j3 = hVar.c;
                            if (j3 != 0) {
                                drawable = g5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (hVar.e) {
                                drawable = new t2(chatActivityEnterView.getContext());
                                if (j6.I.q()) {
                                    u02 = -1;
                                } else {
                                    int i10 = j6.G6;
                                    int i11 = ChatActivityEnterView.N6;
                                    u02 = chatActivityEnterView.u0(i10);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(u02, PorterDuff.Mode.SRC_IN));
                            } else {
                                String str2 = hVar.b;
                                if (str2 != null) {
                                    drawable = org.telegram.messenger.j6.f(str2);
                                }
                            }
                        }
                        pVar2.setStyleIcon(drawable);
                        mVar2.h.setReview(true);
                        mVar2.h.setBusy(true);
                        gfVar.f(obj, mVar2.H, new h(mVar2, i7));
                        g0.i3(mVar2.I, 400L);
                        break;
                    }
                }
                break;
        }
    }
}
