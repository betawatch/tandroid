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
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.e;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4b implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n4b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        l5c l5cVar;
        String str;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                t4b t4bVar = (t4b) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (t4bVar.c2 || t4bVar.b2 != null) {
                    TLRPC.WebPage webPage = t4bVar.b2;
                    o4b o4bVar = new o4b(t4bVar, (byte) 0);
                    int i = r4b.b;
                    c4c K = c4c.K(r4b.class);
                    K.H = webPage;
                    K.E = o4bVar;
                    arrayList.add(K);
                }
                arrayList.add(c4c.k(t4bVar.T1));
                arrayList.add(c4c.B(1, null));
                c4c i2 = c4c.i(2, k96.M0(2131744397, null));
                i2.L(t4bVar.h2);
                arrayList.add(i2);
                if (t4bVar.h2) {
                    arrayList.add(c4c.k(t4bVar.U1));
                }
                arrayList.add(c4c.B(3, null));
                arrayList.add(c4c.k(t4bVar.V1));
                break;
            case 1:
                t7b t7bVar = (t7b) obj3;
                Float f = (Float) obj2;
                long duration = t7bVar.Y0.getDuration() < 100 ? t7bVar.L1.h0 : t7bVar.Y0.getDuration();
                float floatValue = ((f.floatValue() / 0.96f) * 0.04f) + f.floatValue();
                f4b f4bVar = t7bVar.L1;
                float f2 = f4bVar.a0;
                float f3 = f4bVar.Z;
                float f4 = (f2 - f3) * floatValue;
                float f5 = duration;
                long j = (long) (f4 * f5);
                i7b i7bVar = t7bVar.Y0;
                long j2 = (long) ((f3 * f5) + j);
                t7bVar.N1 = j2;
                i7bVar.m(j2);
                x6b x6bVar = t7bVar.w1;
                if (x6bVar != null) {
                    x6bVar.setCoverTime(t7bVar.N1);
                }
                f4b f4bVar2 = t7bVar.L1;
                if (f4bVar2 != null && f4bVar2.g) {
                    f4bVar2.j = true;
                    break;
                }
                break;
            case 2:
                ((fbb) obj3).Y((ArrayList) obj, (l5c) obj2);
                break;
            case 3:
                ((ydb) obj3).C0((ArrayList) obj, (l5c) obj2);
                break;
            case 4:
                xdb xdbVar = (xdb) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(c4c.k(xdbVar.T1));
                arrayList2.add(c4c.k(xdbVar.U1));
                break;
            case 5:
                ((dob) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 6:
                ((vob) obj3).Y((ArrayList) obj, (l5c) obj2);
                break;
            case 7:
                jpb jpbVar = (jpb) obj3;
                hx4 hx4Var = jpbVar.F;
                Bitmap bitmap = (Bitmap) obj2;
                jpbVar.r = (Bitmap) obj;
                Paint paint = new Paint(1);
                jpbVar.w = paint;
                Bitmap bitmap2 = jpbVar.r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                jpbVar.s = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                gl.i(colorMatrix, bkb.I.o() ? 0.05f : 0.25f);
                gl.h(colorMatrix, bkb.I.o() ? -0.02f : -0.04f);
                jpbVar.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                jpbVar.x = new Matrix();
                hx4Var.a(bitmap);
                tk0.c(hx4Var, jpbVar.b);
                jpbVar.G.d();
                break;
            case 8:
                rzb rzbVar = (rzb) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                bzb bzbVar = rzbVar.y1;
                qzb qzbVar = rzbVar.H1;
                if (str2 != null) {
                    rzbVar.O1 = false;
                    rzbVar.z1.setText(rzbVar.M0(str2));
                    qzbVar.D(bzbVar);
                    break;
                } else if (!rzbVar.J) {
                    if (rzbVar.O1) {
                        rzbVar.dismiss();
                        kk7.e().k(kk7.R4, 1, k96.M0(bool.booleanValue() ? 2131743708 : 2131743707, null));
                        break;
                    } else {
                        yjb.x(null, bool.booleanValue() ? 2131743708 : 2131743707, new u21((FrameLayout) rzbVar.b, rzbVar.J0), null);
                        mzb mzbVar = rzbVar.w1.e;
                        String str3 = rzbVar.v1;
                        rzbVar.u1 = str3;
                        mzbVar.setText(rzb.J0(str3, null, null));
                        qzbVar.D(bzbVar);
                        break;
                    }
                }
                break;
            case 9:
                ((n5c) obj3).Y((ArrayList) obj, (l5c) obj2);
                break;
            case 10:
                hmc hmcVar = (hmc) obj3;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    hmcVar.V0 = true;
                    hmcVar.W0 = password.has_password;
                    va vaVar = hmcVar.a;
                    if (vaVar != null && (l5cVar = vaVar.g3) != null) {
                        l5cVar.O(true);
                        break;
                    }
                }
                break;
            case 11:
                ukc ukcVar = (ukc) obj3;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    ukcVar.a(null);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        d01.t(S.getContext(), onrampsession.url);
                        break;
                    }
                } else {
                    if (tL_error == null || (str = tL_error.text) == null) {
                        str = "NO_SESSION";
                    }
                    ukcVar.a(str);
                    break;
                }
                break;
            case 12:
                WalletEngine2.HttpTransport.lambda$execute$0((e) obj3, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            case 13:
                ((ypc) obj3).h = false;
                break;
            default:
                uvc uvcVar = (uvc) obj3;
                TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                uvcVar.e = 0;
                HashMap hashMap = vvc.l;
                StringBuilder sb = new StringBuilder();
                int i3 = uvcVar.a;
                sb.append(i3);
                sb.append("/");
                long j3 = uvcVar.b;
                sb.append(j3);
                if (hashMap.get(sb.toString()) == uvcVar) {
                    if (messages_widgetpublicdata != null) {
                        int i4 = messages_widgetpublicdata.period;
                        uvcVar.d = i4 <= 0 ? 30 : Math.max(5, Math.min(3600, i4));
                        if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                            TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                            long j4 = tL_messages_widgetPublicData.hash;
                            uvcVar.c = j4;
                            String str4 = tL_messages_widgetPublicData.data;
                            String C = vvc.C(str4);
                            for (svc svcVar : vvc.a.values()) {
                                if (svcVar.b == i3 && svcVar.l == j3 && !svcVar.k && (!TextUtils.equals(svcVar.p, C) || svcVar.q != j4)) {
                                    svcVar.q = j4;
                                    vvc.a(svcVar, svcVar.o, C);
                                    TLRPC.TL_messageMediaWidget tL_messageMediaWidget = svcVar.r;
                                    if (tL_messageMediaWidget != null) {
                                        tL_messageMediaWidget.public_data_hash = j4;
                                    }
                                    ad7 Y = ad7.Y(i3);
                                    Y.a.c(new sb2(Y, svcVar.d, svcVar.c, str4 == null ? "" : str4, j4, (String) null));
                                    str4 = str4;
                                }
                            }
                        }
                    }
                    gl.e3(uvcVar.f, uvcVar.d * 1000);
                    break;
                }
                break;
        }
    }
}
