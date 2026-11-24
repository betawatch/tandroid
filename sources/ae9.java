// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ae9 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ae9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p8c
    public final void a(Object obj) {
        String str;
        l5c l5cVar;
        byte b = this.a;
        TL_account.TL_birthday tL_birthday = null;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ye9 ye9Var = (ye9) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    ye9Var.N1(pageblockmath);
                    break;
                }
                break;
            case 1:
                nm9 nm9Var = (nm9) obj2;
                if (((Boolean) obj).booleanValue() && !nm9Var.w) {
                    nm9Var.n = true;
                    nm9Var.R = true;
                    nm9Var.E(false);
                    t76.N = nm9Var;
                    nm9Var.S = NativeInstance.createVideoCapturer(nm9Var.Q, nm9Var.R ? 1 : 0);
                    nm9Var.M();
                    nm9Var.I();
                    nm9Var.n();
                    kk7.f(nm9Var.e).k(kk7.F2, Long.valueOf(nm9Var.f.id));
                    break;
                }
                break;
            case 2:
                i8c i8cVar = (i8c) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                gl.i(colorMatrix, bkb.I.o() ? 0.04f : 0.25f);
                gl.h(colorMatrix, bkb.I.o() ? -0.04f : -0.07f);
                Bitmap l = gl.l(bitmap, colorMatrix);
                l.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(bkb.I.o() ? 2.0f : 3.0f);
                if (!bkb.I.o()) {
                    gl.h(colorMatrix2, bkb.I.o() ? -0.2f : -0.07f);
                }
                Bitmap l2 = gl.l(bitmap, colorMatrix2);
                l2.setHasAlpha(false);
                bitmap.recycle();
                i8cVar.a(l, l2);
                break;
            case 3:
                yx9 yx9Var = (yx9) obj2;
                Long l3 = (Long) obj;
                yx9Var.y2 = false;
                TLRPC.User V1 = l3 != null ? na7.q1(yx9Var.a).V1(l3) : null;
                yx9Var.x2 = V1;
                yx9Var.z2 = V1 == null;
                if (V1 != null) {
                    yx9Var.b1();
                    break;
                }
                break;
            case 4:
                HashMap hashMap = ((ty9) obj2).r;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 5:
                g0a g0aVar = (g0a) obj;
                n0a n0aVar = ((k0a) obj2).e;
                while (true) {
                    ArrayList arrayList = n0aVar.H;
                    if (i >= arrayList.size()) {
                        break;
                    } else {
                        if (g0aVar != arrayList.get(i)) {
                            ((g0a) arrayList.get(i)).getClass();
                        }
                        i++;
                    }
                }
            case 6:
                ym0.j(((h1a) obj2).getContext(), (TLRPC.TL_error) obj);
                break;
            case 7:
                kna knaVar = (kna) obj2;
                knaVar.d2.g();
                knaVar.f2.O(true);
                break;
            case 8:
                hpa hpaVar = (hpa) obj2;
                hpaVar.s = new Matrix();
                hpaVar.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                hpaVar.r = bitmapShader;
                Paint paint = hpaVar.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                gl.i(colorMatrix3, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 9:
                cra craVar = (cra) obj2;
                boolean e = e66.e(131072);
                if (craVar.e != e) {
                    craVar.e = e;
                    craVar.invalidate();
                    break;
                }
                break;
            case 10:
                ((gta) obj2).S((TL_stars.StarGifts) obj);
                break;
            case 11:
                ((fx0) obj2).a(((Boolean) obj).booleanValue());
                break;
            case 12:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i2 = starGift.availability_remains;
                    if (!z) {
                        int i3 = starGift.availability_total;
                        textView.setText(i2 <= 0 ? k96.H(',', "Gift2Availability2ValueNone", i3) : k96.K("Gift2Availability4Value", i2, ',', k96.E(i3, ',')));
                        break;
                    } else {
                        textView.setText(i2 <= 0 ? k96.H(',', "Gift2QuantityIssuedNone", starGift.availability_total) : k96.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(k96.H(',', "Gift2QuantityIssued2", starGift.availability_total)));
                        break;
                    }
                }
                break;
            case 13:
                ((StickersActivity) obj2).p0((View) obj);
                break;
            case 14:
                f3b f3bVar = (f3b) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                f3bVar.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    f3bVar.m = true;
                    f3bVar.l = str;
                    f3bVar.f = TextUtils.isEmpty(str);
                    View view = f3bVar.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = f3bVar.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 15:
                m4b m4bVar = (m4b) obj2;
                m4bVar.n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                m4bVar.s = paint2;
                Bitmap bitmap2 = m4bVar.n;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
                m4bVar.r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                gl.i(colorMatrix4, bkb.I.o() ? 0.08f : 0.25f);
                gl.h(colorMatrix4, bkb.I.o() ? -0.02f : -0.07f);
                m4bVar.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                m4bVar.w = new Matrix();
                break;
            case 16:
                t4b t4bVar = (t4b) obj2;
                c46 c46Var = (c46) obj;
                if (c46Var != null) {
                    t4bVar.j2 = c46Var.e;
                    t4bVar.i2 = c46Var.f;
                    break;
                } else {
                    t4bVar.Z0();
                    break;
                }
            case 17:
                ((p5b) obj2).n.a0.B1 = ((Integer) obj).intValue();
                break;
            case 18:
                ((t6b) obj2).h((p8c) obj);
                break;
            case 19:
                xab xabVar = (xab) obj2;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i4 = xabVar.a;
                TLRPC.UserFull W1 = na7.q1(i4).W1(y6c.h(i4).e());
                if (W1 != null) {
                    tL_birthday = W1.birthday;
                    W1.flags2 |= 32;
                    W1.birthday = tL_birthday2;
                    ad7.Y(i4).g2(W1, false);
                }
                ConnectionsManager.getInstance(i4).sendRequest(updatebirthday, new ck8((Object) xabVar, (Object) W1, (Object) tL_birthday, (byte) 23), 1024);
                na7.q1(i4).h2();
                na7.q1(i4).n4(0L, "BIRTHDAY_SETUP");
                kk7.f(i4).k(kk7.r1, new Object[0]);
                break;
            case 20:
                ((ThemeActivity) obj2).A0((TL_account.contentSettings) obj);
                break;
            case 21:
                ((vq1) obj2).E(((Integer) obj).intValue());
                break;
            case 22:
                ((qvb) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            case 23:
                q5c q5cVar = (q5c) obj2;
                q5cVar.g3.R(q5cVar.T((View) obj), q5cVar.k3);
                break;
            case 24:
                ((hgc) obj2).v(true);
                break;
            case 25:
                ((VoIPService) obj2).lambda$onStartCommand$1((Boolean) obj);
                break;
            case 26:
                ((gjc) ((c5a) obj2).e).l(obj);
                break;
            case 27:
                gl.c3(new mhc((koc) obj2, (TLRPC.UserFull) obj, (byte) 20));
                break;
            case 28:
                noc nocVar = (noc) obj2;
                byte b2 = ((Integer) obj).intValue() == 0 ? (byte) 12 : (byte) 24;
                if (nocVar.a != b2) {
                    nocVar.a = b2;
                    nocVar.Y(nocVar.getParentActivity());
                    nocVar.c0();
                    nocVar.h.setText(nocVar.s != null ? k96.V(null, null, 2131742849, Integer.valueOf(b2)) : k96.V(null, null, 2131742847, Integer.valueOf(b2)));
                    break;
                }
                break;
            default:
                tsc tscVar = (tsc) obj2;
                tscVar.r = ((ArrayList) obj).size();
                va vaVar = tscVar.a;
                if (vaVar != null && (l5cVar = vaVar.g3) != null && vaVar.H) {
                    l5cVar.O(true);
                    break;
                }
                break;
        }
    }
}
