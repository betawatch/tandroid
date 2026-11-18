package ji;

import ai.c2;
import ai.z;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.vr;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ h(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        p pVar;
        int C0;
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
                    pf pfVar = mVar2.b;
                    String trim = mVar2.n.trim();
                    if (!trim.isEmpty() && mVar2.h != null) {
                        g0.r(mVar2.k0);
                        g0.r(mVar2.j0);
                        Drawable drawable = null;
                        if (vr.k == mVar2) {
                            vr.k = null;
                        }
                        c2 c2Var = mVar2.f;
                        if (c2Var != null) {
                            c2Var.c();
                            mVar2.f = null;
                        }
                        z zVar = mVar2.d;
                        if (zVar != null) {
                            zVar.d();
                            mVar2.d = null;
                        }
                        mVar2.e = null;
                        mVar2.c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        mVar2.h.setListening(false);
                        pfVar.e();
                        if (mVar2.H == null) {
                            mVar2.H = trim;
                        }
                        boolean z10 = obj instanceof ai.g;
                        mVar2.h.setStyleLabel(z10 ? ((ai.g) obj).a() : null);
                        p pVar2 = mVar2.h;
                        ChatActivityEnterView chatActivityEnterView = pfVar.a;
                        if (z10) {
                            ai.g gVar = (ai.g) obj;
                            long j3 = gVar.b;
                            if (j3 != 0) {
                                drawable = o5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (gVar.d) {
                                drawable = new w2(chatActivityEnterView.getContext());
                                if (n6.I.q()) {
                                    C0 = -1;
                                } else {
                                    int i10 = n6.G6;
                                    int i11 = ChatActivityEnterView.n7;
                                    C0 = chatActivityEnterView.C0(i10);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(C0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        pVar2.setStyleIcon(drawable);
                        mVar2.h.setReview(true);
                        mVar2.h.setBusy(true);
                        pfVar.f(obj, mVar2.H, new h(mVar2, i7));
                        g0.h3(mVar2.I, 400L);
                        break;
                    }
                }
                break;
        }
    }
}
