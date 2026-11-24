// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.e;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6b implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o6b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        l7c l7cVar;
        String str;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                u6b u6bVar = (u6b) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (u6bVar.c2 || u6bVar.b2 != null) {
                    TLRPC.WebPage webPage = u6bVar.b2;
                    p6b p6bVar = new p6b(u6bVar, (byte) 0);
                    int i = s6b.b;
                    c6c K = c6c.K(s6b.class);
                    K.H = webPage;
                    K.E = p6bVar;
                    arrayList.add(K);
                }
                arrayList.add(c6c.k(u6bVar.T1));
                arrayList.add(c6c.B(1, null));
                c6c i2 = c6c.i(2, jb6.M0(2131744323, null));
                i2.L(u6bVar.h2);
                arrayList.add(i2);
                if (u6bVar.h2) {
                    arrayList.add(c6c.k(u6bVar.U1));
                }
                arrayList.add(c6c.B(3, null));
                arrayList.add(c6c.k(u6bVar.V1));
                break;
            case 1:
                v9b v9bVar = (v9b) obj3;
                Float f = (Float) obj2;
                long duration = v9bVar.Y0.getDuration() < 100 ? v9bVar.L1.h0 : v9bVar.Y0.getDuration();
                float floatValue = ((f.floatValue() / 0.96f) * 0.04f) + f.floatValue();
                g6b g6bVar = v9bVar.L1;
                float f2 = g6bVar.a0;
                float f3 = g6bVar.Z;
                float f4 = (f2 - f3) * floatValue;
                float f5 = duration;
                long j = (long) (f4 * f5);
                k9b k9bVar = v9bVar.Y0;
                long j2 = (long) ((f3 * f5) + j);
                v9bVar.N1 = j2;
                k9bVar.m(j2);
                z8b z8bVar = v9bVar.w1;
                if (z8bVar != null) {
                    z8bVar.setCoverTime(v9bVar.N1);
                }
                g6b g6bVar2 = v9bVar.L1;
                if (g6bVar2 != null && g6bVar2.g) {
                    g6bVar2.j = true;
                    break;
                }
                break;
            case 2:
                ((hdb) obj3).Z((ArrayList) obj, (l7c) obj2);
                break;
            case 3:
                ((yfb) obj3).D0((ArrayList) obj, (l7c) obj2);
                break;
            case 4:
                xfb xfbVar = (xfb) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(c6c.k(xfbVar.T1));
                arrayList2.add(c6c.k(xfbVar.U1));
                break;
            case 5:
                ((eqb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 6:
                ((wqb) obj3).Z((ArrayList) obj, (l7c) obj2);
                break;
            case 7:
                krb krbVar = (krb) obj3;
                jz4 jz4Var = krbVar.F;
                Bitmap bitmap = (Bitmap) obj2;
                krbVar.r = (Bitmap) obj;
                Paint paint = new Paint(1);
                krbVar.w = paint;
                Bitmap bitmap2 = krbVar.r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                krbVar.s = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                gm.i(colorMatrix, cmb.I.o() ? 0.05f : 0.25f);
                gm.h(colorMatrix, cmb.I.o() ? -0.02f : -0.04f);
                krbVar.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                krbVar.x = new Matrix();
                jz4Var.a(bitmap);
                tl0.c(jz4Var, krbVar.b);
                krbVar.G.d();
                break;
            case 8:
                s1c s1cVar = (s1c) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                c1c c1cVar = s1cVar.y1;
                r1c r1cVar = s1cVar.H1;
                if (str2 == null) {
                    if (!s1cVar.J) {
                        if (!s1cVar.O1) {
                            mlb.y(null, bool.booleanValue() ? 2131743634 : 2131743633, new c41((FrameLayout) s1cVar.b, s1cVar.J0), null);
                            n1c n1cVar = s1cVar.w1.e;
                            String str3 = s1cVar.v1;
                            s1cVar.u1 = str3;
                            n1cVar.setText(s1c.J0(str3, null, null));
                            r1cVar.D(c1cVar);
                            break;
                        } else {
                            s1cVar.dismiss();
                            nm7.e().k(nm7.T4, 1, jb6.M0(bool.booleanValue() ? 2131743634 : 2131743633, null));
                            break;
                        }
                    }
                } else {
                    s1cVar.O1 = false;
                    s1cVar.z1.setText(s1cVar.M0(str2));
                    r1cVar.D(c1cVar);
                    break;
                }
                break;
            case 9:
                ((n7c) obj3).Z((ArrayList) obj, (l7c) obj2);
                break;
            case 10:
                goc gocVar = (goc) obj3;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    gocVar.V0 = true;
                    gocVar.W0 = password.has_password;
                    va vaVar = gocVar.a;
                    if (vaVar != null && (l7cVar = vaVar.g3) != null) {
                        l7cVar.O(true);
                        break;
                    }
                }
                break;
            case 11:
                tmc tmcVar = (tmc) obj3;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    tmcVar.a(null);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        l11.u(S.getContext(), onrampsession.url);
                        break;
                    }
                } else {
                    if (tL_error == null || (str = tL_error.text) == null) {
                        str = "NO_SESSION";
                    }
                    tmcVar.a(str);
                    break;
                }
                break;
            case 12:
                WalletEngine2.HttpTransport.lambda$execute$0((e) obj3, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            case 13:
                ((asc) obj3).h = false;
                break;
            default:
                ((tm3) obj3).a((TLRPC.TL_messages_botWidgetQueryAnswer) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
