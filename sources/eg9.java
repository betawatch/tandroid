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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg9 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // qac
    public final void a(Object obj) {
        String str;
        l7c l7cVar;
        byte b = this.a;
        TL_account.TL_birthday tL_birthday = null;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ch9 ch9Var = (ch9) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    ch9Var.N1(pageblockmath);
                    break;
                }
                break;
            case 1:
                oo9 oo9Var = (oo9) obj2;
                if (((Boolean) obj).booleanValue() && !oo9Var.w) {
                    oo9Var.n = true;
                    oo9Var.R = true;
                    oo9Var.E(false);
                    s96.N = oo9Var;
                    oo9Var.S = NativeInstance.createVideoCapturer(oo9Var.Q, oo9Var.R ? 1 : 0);
                    oo9Var.M();
                    oo9Var.I();
                    oo9Var.n();
                    nm7.f(oo9Var.e).k(nm7.G2, Long.valueOf(oo9Var.f.id));
                    break;
                }
                break;
            case 2:
                jac jacVar = (jac) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                gm.i(colorMatrix, cmb.I.o() ? 0.04f : 0.25f);
                gm.h(colorMatrix, cmb.I.o() ? -0.04f : -0.07f);
                Bitmap l = gm.l(bitmap, colorMatrix);
                l.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(cmb.I.o() ? 2.0f : 3.0f);
                if (!cmb.I.o()) {
                    gm.h(colorMatrix2, cmb.I.o() ? -0.2f : -0.07f);
                }
                Bitmap l2 = gm.l(bitmap, colorMatrix2);
                l2.setHasAlpha(false);
                bitmap.recycle();
                jacVar.a(l, l2);
                break;
            case 3:
                zz9 zz9Var = (zz9) obj2;
                Long l3 = (Long) obj;
                zz9Var.y2 = false;
                TLRPC.User W1 = l3 != null ? oc7.r1(zz9Var.a).W1(l3) : null;
                zz9Var.x2 = W1;
                zz9Var.z2 = W1 == null;
                if (W1 != null) {
                    zz9Var.b1();
                    break;
                }
                break;
            case 4:
                HashMap hashMap = ((v0a) obj2).r;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 5:
                i2a i2aVar = (i2a) obj;
                p2a p2aVar = ((m2a) obj2).e;
                while (true) {
                    ArrayList arrayList = p2aVar.H;
                    if (i >= arrayList.size()) {
                        break;
                    } else {
                        if (i2aVar != arrayList.get(i)) {
                            ((i2a) arrayList.get(i)).getClass();
                        }
                        i++;
                    }
                }
            case 6:
                yn0.j(((j3a) obj2).getContext(), (TLRPC.TL_error) obj);
                break;
            case 7:
                kpa kpaVar = (kpa) obj2;
                kpaVar.d2.g();
                kpaVar.f2.O(true);
                break;
            case 8:
                hra hraVar = (hra) obj2;
                hraVar.s = new Matrix();
                hraVar.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                hraVar.r = bitmapShader;
                Paint paint = hraVar.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                gm.i(colorMatrix3, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 9:
                dta dtaVar = (dta) obj2;
                boolean e = e86.e(131072);
                if (dtaVar.e != e) {
                    dtaVar.e = e;
                    dtaVar.invalidate();
                    break;
                }
                break;
            case 10:
                ((jva) obj2).S((TL_stars.StarGifts) obj);
                break;
            case 11:
                ((my0) obj2).a(((Boolean) obj).booleanValue());
                break;
            case 12:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i2 = starGift.availability_remains;
                    if (!z) {
                        int i3 = starGift.availability_total;
                        textView.setText(i2 <= 0 ? jb6.H(',', "Gift2Availability2ValueNone", i3) : jb6.K("Gift2Availability4Value", i2, ',', jb6.E(i3, ',')));
                        break;
                    } else {
                        textView.setText(i2 <= 0 ? jb6.H(',', "Gift2QuantityIssuedNone", starGift.availability_total) : jb6.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(jb6.H(',', "Gift2QuantityIssued2", starGift.availability_total)));
                        break;
                    }
                }
                break;
            case 13:
                ((StickersActivity) obj2).q0((View) obj);
                break;
            case 14:
                g5b g5bVar = (g5b) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                g5bVar.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    g5bVar.m = true;
                    g5bVar.l = str;
                    g5bVar.f = TextUtils.isEmpty(str);
                    View view = g5bVar.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = g5bVar.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 15:
                n6b n6bVar = (n6b) obj2;
                n6bVar.n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                n6bVar.s = paint2;
                Bitmap bitmap2 = n6bVar.n;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
                n6bVar.r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                gm.i(colorMatrix4, cmb.I.o() ? 0.08f : 0.25f);
                gm.h(colorMatrix4, cmb.I.o() ? -0.02f : -0.07f);
                n6bVar.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                n6bVar.w = new Matrix();
                break;
            case 16:
                u6b u6bVar = (u6b) obj2;
                c66 c66Var = (c66) obj;
                if (c66Var != null) {
                    u6bVar.j2 = c66Var.e;
                    u6bVar.i2 = c66Var.f;
                    break;
                } else {
                    u6bVar.Z0();
                    break;
                }
            case 17:
                ((r7b) obj2).n.a0.B1 = ((Integer) obj).intValue();
                break;
            case 18:
                ((v8b) obj2).h((qac) obj);
                break;
            case 19:
                ycb ycbVar = (ycb) obj2;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i4 = ycbVar.a;
                TLRPC.UserFull X1 = oc7.r1(i4).X1(z8c.h(i4).e());
                if (X1 != null) {
                    tL_birthday = X1.birthday;
                    X1.flags2 |= 32;
                    X1.birthday = tL_birthday2;
                    cf7.Y(i4).g2(X1, false);
                }
                ConnectionsManager.getInstance(i4).sendRequest(updatebirthday, new fm8((Object) ycbVar, (Object) X1, (Object) tL_birthday, (byte) 23), 1024);
                oc7.r1(i4).i2();
                oc7.r1(i4).p4(0L, "BIRTHDAY_SETUP");
                nm7.f(i4).k(nm7.s1, new Object[0]);
                break;
            case 20:
                ((ThemeActivity) obj2).B0((TL_account.contentSettings) obj);
                break;
            case 21:
                ((hs1) obj2).E(((Integer) obj).intValue());
                break;
            case 22:
                ((sxb) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            case 23:
                q7c q7cVar = (q7c) obj2;
                q7cVar.g3.R(q7cVar.T((View) obj), q7cVar.k3);
                break;
            case 24:
                ((iic) obj2).v(true);
                break;
            case 25:
                ((VoIPService) obj2).lambda$onStartCommand$1((Boolean) obj);
                break;
            case 26:
                ((glc) ((xvc) obj2).e).l(obj);
                break;
            case 27:
                gm.c3(new qhc(obj2, obj, (byte) 22));
                break;
            case 28:
                pqc pqcVar = (pqc) obj2;
                byte b2 = ((Integer) obj).intValue() == 0 ? (byte) 12 : (byte) 24;
                if (pqcVar.a != b2) {
                    pqcVar.a = b2;
                    pqcVar.Z(pqcVar.getParentActivity());
                    pqcVar.d0();
                    pqcVar.h.setText(pqcVar.s != null ? jb6.V(null, null, 2131742775, Integer.valueOf(b2)) : jb6.V(null, null, 2131742773, Integer.valueOf(b2)));
                    break;
                }
                break;
            default:
                uuc uucVar = (uuc) obj2;
                uucVar.r = ((ArrayList) obj).size();
                va vaVar = uucVar.a;
                if (vaVar != null && (l7cVar = vaVar.g3) != null && vaVar.H) {
                    l7cVar.O(true);
                    break;
                }
                break;
        }
    }
}
