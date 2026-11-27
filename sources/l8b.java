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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8b implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l8b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        l9c l9cVar;
        String str;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                r8b r8bVar = (r8b) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (r8bVar.c2 || r8bVar.b2 != null) {
                    TLRPC.WebPage webPage = r8bVar.b2;
                    m8b m8bVar = new m8b(r8bVar, (byte) 0);
                    int i = p8b.b;
                    b8c K = b8c.K(p8b.class);
                    K.H = webPage;
                    K.E = m8bVar;
                    arrayList.add(K);
                }
                arrayList.add(b8c.k(r8bVar.T1));
                arrayList.add(b8c.B(1, null));
                b8c i2 = b8c.i(2, ob6.M0(2131744291, null));
                i2.L(r8bVar.h2);
                arrayList.add(i2);
                if (r8bVar.h2) {
                    arrayList.add(b8c.k(r8bVar.U1));
                }
                arrayList.add(b8c.B(3, null));
                arrayList.add(b8c.k(r8bVar.V1));
                break;
            case 1:
                rbb rbbVar = (rbb) obj3;
                Float f = (Float) obj2;
                long duration = rbbVar.Y0.getDuration() < 100 ? rbbVar.L1.h0 : rbbVar.Y0.getDuration();
                float floatValue = ((f.floatValue() / 0.96f) * 0.04f) + f.floatValue();
                c8b c8bVar = rbbVar.L1;
                float f2 = c8bVar.a0;
                float f3 = c8bVar.Z;
                float f4 = (f2 - f3) * floatValue;
                float f5 = duration;
                long j = (long) (f4 * f5);
                gbb gbbVar = rbbVar.Y0;
                long j2 = (long) ((f3 * f5) + j);
                rbbVar.N1 = j2;
                gbbVar.m(j2);
                vab vabVar = rbbVar.w1;
                if (vabVar != null) {
                    vabVar.setCoverTime(rbbVar.N1);
                }
                c8b c8bVar2 = rbbVar.L1;
                if (c8bVar2 != null && c8bVar2.g) {
                    c8bVar2.j = true;
                    break;
                }
                break;
            case 2:
                ((bfb) obj3).Y((ArrayList) obj, (l9c) obj2);
                break;
            case 3:
                ((thb) obj3).D0((ArrayList) obj, (l9c) obj2);
                break;
            case 4:
                shb shbVar = (shb) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(b8c.k(shbVar.T1));
                arrayList2.add(b8c.k(shbVar.U1));
                break;
            case 5:
                ((dsb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 6:
                ((vsb) obj3).Y((ArrayList) obj, (l9c) obj2);
                break;
            case 7:
                ktb ktbVar = (ktb) obj3;
                nz4 nz4Var = ktbVar.F;
                Bitmap bitmap = (Bitmap) obj2;
                ktbVar.r = (Bitmap) obj;
                Paint paint = new Paint(1);
                ktbVar.w = paint;
                Bitmap bitmap2 = ktbVar.r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                ktbVar.s = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                hl.i(colorMatrix, aob.I.o() ? 0.05f : 0.25f);
                hl.h(colorMatrix, aob.I.o() ? -0.02f : -0.04f);
                ktbVar.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ktbVar.x = new Matrix();
                nz4Var.a(bitmap);
                uk0.c(nz4Var, ktbVar.b);
                ktbVar.G.d();
                break;
            case 8:
                r3c r3cVar = (r3c) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                b3c b3cVar = r3cVar.y1;
                q3c q3cVar = r3cVar.H1;
                if (str2 == null) {
                    if (!r3cVar.J) {
                        if (!r3cVar.O1) {
                            xnb.x(null, bool.booleanValue() ? 2131743602 : 2131743601, new d31((FrameLayout) r3cVar.b, r3cVar.J0), null);
                            m3c m3cVar = r3cVar.w1.e;
                            String str3 = r3cVar.v1;
                            r3cVar.u1 = str3;
                            m3cVar.setText(r3c.K0(str3, null, null));
                            q3cVar.D(b3cVar);
                            break;
                        } else {
                            r3cVar.dismiss();
                            jn7.e().k(jn7.S4, 1, ob6.M0(bool.booleanValue() ? 2131743602 : 2131743601, null));
                            break;
                        }
                    }
                } else {
                    r3cVar.O1 = false;
                    r3cVar.z1.setText(r3cVar.N0(str2));
                    q3cVar.D(b3cVar);
                    break;
                }
                break;
            case 9:
                ((n9c) obj3).Y((ArrayList) obj, (l9c) obj2);
                break;
            case 10:
                uqc uqcVar = (uqc) obj3;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    uqcVar.V0 = true;
                    uqcVar.W0 = password.has_password;
                    wa waVar = uqcVar.a;
                    if (waVar != null && (l9cVar = waVar.g3) != null) {
                        l9cVar.O(true);
                        break;
                    }
                }
                break;
            case 11:
                gpc gpcVar = (gpc) obj3;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    gpcVar.a(null);
                    e S = LaunchActivity.S();
                    if (S != null) {
                        m01.u(S.getContext(), onrampsession.url);
                        break;
                    }
                } else {
                    if (tL_error == null || (str = tL_error.text) == null) {
                        str = "NO_SESSION";
                    }
                    gpcVar.a(str);
                    break;
                }
                break;
            case 12:
                WalletEngine2.HttpTransport.lambda$execute$0((org.telegram.ui.Wallet.e) obj3, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            case 13:
                ((muc) obj3).h = false;
                break;
            default:
                ((am3) obj3).a((TLRPC.TL_messages_botWidgetQueryAnswer) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
