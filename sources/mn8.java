// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mn8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mn8(tca tcaVar, vh6 vh6Var, int i, byte b) {
        this.a = b;
        this.b = tcaVar;
        this.c = vh6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0104, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013c, code lost:
    
        if (r6 == null) goto L56;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        byte b;
        i71 i71Var;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        String str;
        byte b2;
        int i4;
        String[] strArr;
        String str2;
        String str3;
        String str4;
        RLottieNative rLottieNative;
        Bitmap bitmap;
        byte b3 = 3;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                qn8 qn8Var = (qn8) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = qn8Var.a;
                int i5 = qn8Var.s;
                int size = arrayList2.size();
                qn8Var.s = size;
                if (i5 != size && qn8Var.Q != null) {
                    qn8Var.g();
                }
                int size2 = arrayList3.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    nn8 nn8Var = (nn8) arrayList3.get(i6);
                    if (nn8Var.o && !nn8Var.p) {
                        arrayList2.add(nn8Var);
                    } else if (qn8.i(nn8Var.a, arrayList2) == null) {
                        qn8 qn8Var2 = nn8Var.y;
                        float f = qn8Var2.L;
                        RectF rectF = nn8Var.c;
                        RectF rectF2 = nn8Var.f;
                        qa6 qa6Var = nn8Var.r;
                        if (qa6Var != null) {
                            qa6Var.a();
                            z = false;
                            nn8Var.t = false;
                            nn8Var.s = false;
                        } else {
                            z = false;
                        }
                        nn8Var.o = true;
                        boolean z4 = rectF.left - 1.0f <= f ? true : z;
                        boolean z5 = rectF.right + 1.0f >= ((float) qn8Var2.getMeasuredWidth()) - f;
                        if (z4 && z5) {
                            z5 = false;
                            z4 = false;
                        }
                        nn8Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z4) {
                            rectF2.right = rectF2.left;
                        } else if (z5) {
                            rectF2.left = rectF2.right;
                        } else {
                            byte b4 = nn8Var.a;
                            if (b4 == 3 || b4 == 2) {
                                z2 = true;
                                if (qn8Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    nn8Var.e.e(z2, 0.0f);
                                    arrayList2.add(nn8Var);
                                }
                            } else {
                                z2 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            nn8Var.e.e(z2, 0.0f);
                            arrayList2.add(nn8Var);
                        }
                        z2 = true;
                        nn8Var.e.e(z2, 0.0f);
                        arrayList2.add(nn8Var);
                    }
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                qn8Var.invalidate();
                return;
            case 1:
                qn8 qn8Var3 = (qn8) this.b;
                nn8 nn8Var2 = (nn8) this.c;
                pn8 pn8Var = qn8Var3.y;
                byte b5 = nn8Var2.a;
                RectF rectF3 = nn8Var2.d;
                float f2 = rectF3.left;
                float f3 = rectF3.top;
                ProfileActivity profileActivity = ((tn8) pn8Var).b;
                RectF rectF4 = ProfileActivity.e7;
                profileActivity.w2(f2, f3, b5);
                return;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF5 = ProfileActivity.e7;
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                profileActivity2.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity2.presentFragment(new yv1(bundle), true);
                return;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                RectF rectF6 = ProfileActivity.e7;
                long j = profileActivity3.B2;
                if (j != 0) {
                    TLRPC.User W1 = profileActivity3.getMessagesController().W1(Long.valueOf(j));
                    profileActivity3.getMessagesController().b0(profileActivity3.f1, W1);
                    if (profileActivity3.F2 != null && W1 != null && c41.a(profileActivity3)) {
                        c41.D(profileActivity3, W1, profileActivity3.F2.title).j();
                    }
                    if (profileActivity3.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity3.c4(true, false);
                        return;
                    }
                    return;
                }
                profileActivity3.getNotificationCenter().n(profileActivity3, 4);
                if (gm.O1()) {
                    b = 0;
                    profileActivity3.getNotificationCenter().k(4, Long.valueOf(-profileActivity3.f1));
                } else {
                    b = 0;
                    profileActivity3.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity3.getMessagesController().b0(profileActivity3.f1, profileActivity3.getMessagesController().W1(Long.valueOf(profileActivity3.getUserConfig().e())));
                profileActivity3.J1 = b;
                profileActivity3.finishFragment();
                return;
            case 4:
                mc mcVar = (mc) this.b;
                String str5 = (String) this.c;
                RectF rectF7 = ProfileActivity.e7;
                TL_agent.disconnect disconnectVar = new TL_agent.disconnect();
                disconnectVar.provider = str5;
                ConnectionsManager.getInstance(mcVar.a).sendRequestTyped(disconnectVar, new kc((byte) 0), new lc(mcVar, b3));
                return;
            case 5:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF8 = ProfileActivity.e7;
                gm.g("https://" + profileActivity4.getMessagesController().N2 + "/" + sd2.K(chat, false));
                return;
            case 6:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF9 = ProfileActivity.e7;
                u31.e();
                l11.u(profileActivity5.getParentActivity(), tL_collectibleInfo.url);
                return;
            case 7:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                z82 z82Var = (z82) this.c;
                RectF rectF10 = ProfileActivity.e7;
                v82 v82Var = z82Var.e;
                nk3 nk3Var = profileActivity6.q5;
                View B = (nk3Var == null || nk3Var.getFragmentView() == null) ? profileActivity6.r5.B() : profileActivity6.q5.getFragmentView();
                RectF rectF11 = profileActivity6.q6;
                profileActivity6.p6 = zgc.c(v82Var, B, rectF11) ? rectF11.left : 0.0f;
                profileActivity6.X1();
                return;
            case 8:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF12 = ProfileActivity.e7;
                profileActivity7.F2 = profileActivity7.getMessagesStorage().N(profileActivity7.f1);
                countDownLatch.countDown();
                return;
            case 9:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF13 = ProfileActivity.e7;
                profileActivity8.getClass();
                ((xib) view).setChecked(profileActivity8.t2.f());
                return;
            case 10:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF14 = ProfileActivity.e7;
                profileActivity9.H2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                return;
            case 11:
                ProfileActivity profileActivity10 = (ProfileActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                RectF rectF15 = ProfileActivity.e7;
                if (!zArr[0] && (i71Var = profileActivity10.I5) != null) {
                    i71Var.run();
                }
                profileActivity10.I5 = null;
                return;
            case 12:
                to8 to8Var = (to8) this.b;
                vh6 vh6Var = (vh6) this.c;
                ProfileActivity profileActivity11 = to8Var.U2.c;
                c41.x(profileActivity11.getParentActivity(), profileActivity11.x5, vh6Var.m(), vh6Var.m() == 1 ? ((TLRPC.Dialog) vh6Var.n(0)).id : 0L, cmb.v0(cmb.vj, to8Var.J0), cmb.v0(cmb.xj, to8Var.J0)).j();
                return;
            case 13:
                jp8 jp8Var = (jp8) this.b;
                vh6 vh6Var2 = (vh6) this.c;
                ProfileActivity profileActivity12 = jp8Var.U2;
                c41.x(profileActivity12.getParentActivity(), profileActivity12.x5, vh6Var2.m(), vh6Var2.m() == 1 ? ((TLRPC.Dialog) vh6Var2.n(0)).id : 0L, cmb.v0(cmb.vj, jp8Var.J0), cmb.v0(cmb.xj, jp8Var.J0)).j();
                return;
            case 14:
                ((lq8) this.b).e.presentFragment(ProfileActivity.S2(((Long) this.c).longValue()));
                return;
            case 15:
                d dVar = (d) this.b;
                ylb ylbVar = (ylb) this.c;
                hf1 hf1Var = new hf1(null);
                hf1Var.d = ylbVar;
                dVar.presentFragment(hf1Var);
                return;
            case 16:
                uq8 uq8Var = (uq8) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList4 = uq8Var.d;
                d dVar2 = uq8Var.e;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String[] split = str6.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i7 = 0; i7 < split.length; i7++) {
                    String S0 = jb6.D0().S0(split[i7], true, false);
                    strArr2[i7] = S0;
                    if (S0.equals(split[i7])) {
                        strArr2[i7] = null;
                    }
                }
                int i8 = 0;
                while (true) {
                    tq8[] tq8VarArr = uq8Var.c;
                    if (i8 >= tq8VarArr.length) {
                        String[] strArr3 = strArr2;
                        if (uq8Var.F != null) {
                            int size3 = arrayList4.size();
                            int i9 = 0;
                            while (i9 < size3) {
                                bc7 bc7Var = (bc7) arrayList4.get(i9);
                                String str7 = " " + bc7Var.a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder = null;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < split.length) {
                                        if (split[i10].length() != 0) {
                                            String str8 = split[i10];
                                            arrayList = arrayList4;
                                            int indexOf = str7.indexOf(" " + str8);
                                            if (indexOf >= 0 || (str = strArr3[i10]) == null) {
                                                i3 = indexOf;
                                            } else {
                                                str8 = str;
                                                i3 = str7.indexOf(" ".concat(str));
                                            }
                                            if (i3 >= 0) {
                                                if (spannableStringBuilder == null) {
                                                    i = size3;
                                                    spannableStringBuilder = new SpannableStringBuilder(bc7Var.a);
                                                } else {
                                                    i = size3;
                                                }
                                                i2 = i9;
                                                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar2.getThemedColor(cmb.p6)), i3, str8.length() + i3, 33);
                                            }
                                        } else {
                                            arrayList = arrayList4;
                                            i = size3;
                                            i2 = i9;
                                        }
                                        if (spannableStringBuilder != null && i10 == split.length - 1) {
                                            arrayList6.add(bc7Var);
                                            arrayList7.add(spannableStringBuilder);
                                        }
                                        i10++;
                                        arrayList4 = arrayList;
                                        size3 = i;
                                        i9 = i2;
                                    } else {
                                        arrayList = arrayList4;
                                    }
                                }
                                i9++;
                                arrayList4 = arrayList;
                                size3 = size3;
                            }
                        }
                        gm.c3(new hz7((Object) uq8Var, (Object) str6, (Object) arrayList5, (Object) arrayList6, (Object) arrayList7, (byte) 13));
                        return;
                    }
                    tq8 tq8Var = tq8VarArr[i8];
                    if (tq8Var == null) {
                        i4 = i8;
                        strArr = strArr2;
                        b2 = r10;
                    } else {
                        String str9 = tq8Var.a;
                        b2 = r10;
                        String str10 = " " + str9.toLowerCase();
                        i4 = i8;
                        SpannableStringBuilder spannableStringBuilder2 = null;
                        int i11 = 0;
                        while (true) {
                            if (i11 < split.length) {
                                if (split[i11].length() != 0) {
                                    String str11 = split[i11];
                                    strArr = strArr2;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr[i11]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        if (spannableStringBuilder2 == null) {
                                            spannableStringBuilder2 = new SpannableStringBuilder(str9);
                                        }
                                        String str12 = str4;
                                        str2 = str10;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(dVar2.getThemedColor(cmb.p6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str9;
                                        spannableStringBuilder2.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    }
                                } else {
                                    str2 = str10;
                                    strArr = strArr2;
                                    str3 = str9;
                                }
                                if (spannableStringBuilder2 != null && i11 == split.length - 1) {
                                    if (tq8Var.f == 502) {
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= 4) {
                                                i12 = -1;
                                            } else if (z8c.h(i12).o()) {
                                                i12++;
                                            }
                                        }
                                        if (i12 < 0) {
                                        }
                                    }
                                    arrayList5.add(tq8Var);
                                    arrayList7.add(spannableStringBuilder2);
                                }
                                i11++;
                                strArr2 = strArr;
                                str9 = str3;
                                str10 = str2;
                            } else {
                                strArr = strArr2;
                            }
                        }
                    }
                    i8 = i4 + 1;
                    r10 = b2;
                    strArr2 = strArr;
                }
                break;
            case 17:
                uq8 uq8Var2 = (uq8) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                uq8Var2.d.addAll(arrayList8);
                int i13 = uq8Var2.f;
                oc7.r1(i13).i2 = arrayList8;
                oc7.r1(i13).j2 = uq8Var2.F;
                if (uq8Var2.x) {
                    return;
                }
                uq8Var2.f();
                return;
            case 18:
                zq8 zq8Var = (zq8) this.b;
                zq8Var.f.add((br8) this.c);
                zq8Var.a();
                return;
            case 19:
                lea leaVar = (lea) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                leaVar.h(new u35(leaVar, tL_starGiftCollection, (byte) 23), tL_starGiftCollection.title);
                return;
            case 20:
                rs8 rs8Var = (rs8) this.b;
                gm.g((String) this.c);
                c41.b0(rs8Var.a.a).k(false).j();
                return;
            case 21:
                ((uu8) this.b).z((ix9) this.c);
                return;
            case 22:
                ex8 ex8Var = (ex8) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = ex8Var.a;
                cue cueVar = new cue();
                cueVar.a = 256;
                atomicReference.set(new yf0(new ldd(context, cueVar)));
                ex8Var.a((a9b) ex8Var.f);
                return;
            case 23:
                ((g8b) ((ex8) this.b).c).a((cx8) this.c);
                return;
            case 24:
                ux8 ux8Var = (ux8) this.b;
                File file = (File) this.c;
                int i14 = ux8Var.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                } catch (Throwable th) {
                    th = th;
                    rLottieNative = null;
                }
                if (rLottieNative != null) {
                    try {
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap createBitmap = Bitmap.createBitmap(i14, i14, config);
                        rLottieNative.c(0, createBitmap, true);
                        Bitmap createBitmap2 = Bitmap.createBitmap(i14, i14, config);
                        Paint paint = new Paint(2);
                        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                        createBitmap.recycle();
                        createBitmap2.setHasMipMap(true);
                        rLottieNative.d();
                        bitmap = createBitmap2;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fc4.g(th, true);
                            break;
                        } finally {
                            if (rLottieNative != null) {
                                rLottieNative.d();
                            }
                        }
                    }
                    gm.c3(new mn8(ux8Var, bitmap, (byte) 25));
                    return;
                }
                break;
            case 25:
                ux8 ux8Var2 = (ux8) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                ux8Var2.h = true;
                if (ux8Var2.e) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap2 != null) {
                        ux8Var2.d.a(bitmap2);
                        return;
                    }
                    return;
                }
            case 26:
                zx8 zx8Var = (zx8) this.b;
                mj4 mj4Var = (mj4) this.c;
                if (zx8Var.W) {
                    return;
                }
                zx8Var.e();
                zx8Var.a.e((String) mj4Var.b);
                return;
            case 27:
                ei7 ei7Var = (ei7) this.b;
                mj4 mj4Var2 = (mj4) this.c;
                zx8 zx8Var2 = (zx8) ei7Var.b;
                if (zx8Var2.m0 || zx8Var2.W || zx8Var2.V) {
                    return;
                }
                zx8Var2.m0 = true;
                zx8Var2.i0 = false;
                zx8Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) mj4Var2.c;
                r10 = pointFArr.length < 3 ? (byte) 0 : (byte) 1;
                if (r10 != 0) {
                    zx8Var2.n0 = pointFArr;
                    zx8Var2.invalidate();
                }
                gm.d3(new mn8(zx8Var2, mj4Var2, (byte) 26), r10 != 0 ? 450L : 0L);
                return;
            case 28:
                ((iy8) this.b).b0((AnimatorSet) this.c);
                return;
            default:
                iy8 iy8Var = (iy8) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(gm.D0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z3 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                bitmap3.recycle();
                if (z3) {
                    gm.c3(new ey8(iy8Var, file2, r10));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ mn8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
