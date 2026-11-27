// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ep8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ep8(kea keaVar, zh6 zh6Var, int i, byte b) {
        this.a = b;
        this.b = keaVar;
        this.c = zh6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dc, code lost:
    
        if (r4 != null) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Type inference failed for: r0v104, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v16, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.text.SpannableStringBuilder] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        j61 j61Var;
        ArrayList arrayList;
        int i;
        int i2;
        String str;
        int i3;
        ?? r10;
        String str2;
        byte b2;
        int i4;
        String[] strArr;
        String str3;
        String str4;
        boolean z;
        String str5;
        RLottieNative rLottieNative;
        FileOutputStream fileOutputStream;
        ry8 ry8Var;
        byte b3 = 23;
        String str6 = null;
        final byte b4 = 1;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                RectF rectF = ProfileActivity.Z6;
                long j = profileActivity.B2;
                if (j != 0) {
                    TLRPC.User X1 = profileActivity.getMessagesController().X1(Long.valueOf(j));
                    profileActivity.getMessagesController().d0(profileActivity.f1, X1);
                    if (profileActivity.F2 != null && X1 != null && d31.a(profileActivity)) {
                        d31.D(profileActivity, X1, profileActivity.F2.title).j();
                    }
                    if (profileActivity.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity.Z3(true, false);
                        return;
                    }
                    return;
                }
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                if (hl.O1()) {
                    b = 0;
                    profileActivity.getNotificationCenter().k(4, Long.valueOf(-profileActivity.f1));
                } else {
                    b = 0;
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity.getMessagesController().d0(profileActivity.f1, profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.getUserConfig().e())));
                profileActivity.J1 = b;
                profileActivity.finishFragment();
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getClass();
                ((skb) view).setChecked(profileActivity2.t2.f());
                return;
            case 2:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF3 = ProfileActivity.Z6;
                hl.g("https://" + profileActivity3.getMessagesController().N2 + "/" + xc2.K(chat, false));
                return;
            case 3:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF4 = ProfileActivity.Z6;
                v21.e();
                m01.u(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                return;
            case 4:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                f82 f82Var = (f82) this.c;
                RectF rectF5 = ProfileActivity.Z6;
                b82 b82Var = f82Var.e;
                uj3 uj3Var = profileActivity5.l5;
                View C = (uj3Var == null || uj3Var.getFragmentView() == null) ? profileActivity5.m5.C() : profileActivity5.l5.getFragmentView();
                RectF rectF6 = profileActivity5.l6;
                profileActivity5.k6 = yic.c(b82Var, C, rectF6) ? rectF6.left : 0.0f;
                profileActivity5.W1();
                return;
            case 5:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity6.F2 = profileActivity6.getMessagesStorage().P(profileActivity6.f1);
                countDownLatch.countDown();
                return;
            case 6:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity7.getNotificationCenter().n(profileActivity7, 4);
                profileActivity7.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity7.presentFragment(new zu1(bundle), true);
                return;
            case 7:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF9 = ProfileActivity.Z6;
                profileActivity8.H2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                return;
            case 8:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                RectF rectF10 = ProfileActivity.Z6;
                if (!zArr[0] && (j61Var = profileActivity9.D5) != null) {
                    j61Var.run();
                }
                profileActivity9.D5 = null;
                return;
            case 9:
                dq8 dq8Var = (dq8) this.b;
                zh6 zh6Var = (zh6) this.c;
                ProfileActivity profileActivity10 = dq8Var.U2.c;
                d31.x(profileActivity10.getParentActivity(), profileActivity10.s5, zh6Var.m(), zh6Var.m() == 1 ? ((TLRPC.Dialog) zh6Var.n(0)).id : 0L, aob.v0(aob.wj, dq8Var.J0), aob.v0(aob.yj, dq8Var.J0)).j();
                return;
            case 10:
                uq8 uq8Var = (uq8) this.b;
                zh6 zh6Var2 = (zh6) this.c;
                ProfileActivity profileActivity11 = uq8Var.U2;
                d31.x(profileActivity11.getParentActivity(), profileActivity11.s5, zh6Var2.m(), zh6Var2.m() == 1 ? ((TLRPC.Dialog) zh6Var2.n(0)).id : 0L, aob.v0(aob.wj, uq8Var.J0), aob.v0(aob.yj, uq8Var.J0)).j();
                return;
            case 11:
                ((wr8) this.b).e.presentFragment(ProfileActivity.Q2(((Long) this.c).longValue()));
                return;
            case 12:
                e eVar = (e) this.b;
                vnb vnbVar = (vnb) this.c;
                ie1 ie1Var = new ie1(null);
                ie1Var.d = vnbVar;
                eVar.presentFragment(ie1Var);
                return;
            case 13:
                fs8 fs8Var = (fs8) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                fs8Var.d.addAll(arrayList2);
                int i5 = fs8Var.f;
                uc7.s1(i5).i2 = arrayList2;
                uc7.s1(i5).j2 = fs8Var.F;
                if (fs8Var.x) {
                    return;
                }
                fs8Var.f();
                return;
            case 14:
                fs8 fs8Var2 = (fs8) this.b;
                String str7 = (String) this.c;
                ArrayList arrayList3 = fs8Var2.d;
                e eVar2 = fs8Var2.e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                int i6 = 0;
                while (i6 < split.length) {
                    String str8 = str6;
                    String S0 = ob6.D0().S0(split[i6], true, false);
                    strArr2[i6] = S0;
                    if (S0.equals(split[i6])) {
                        strArr2[i6] = str8;
                    }
                    i6++;
                    str6 = str8;
                }
                String str9 = str6;
                int i7 = 0;
                while (true) {
                    es8[] es8VarArr = fs8Var2.c;
                    if (i7 >= es8VarArr.length) {
                        String[] strArr3 = strArr2;
                        if (fs8Var2.F != null) {
                            int size = arrayList3.size();
                            int i8 = 0;
                            while (i8 < size) {
                                hc7 hc7Var = (hc7) arrayList3.get(i8);
                                String str10 = " " + hc7Var.a.toLowerCase();
                                String str11 = str9;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < split.length) {
                                        if (split[i9].length() != 0) {
                                            String str12 = split[i9];
                                            arrayList = arrayList3;
                                            int indexOf = str10.indexOf(" " + str12);
                                            if (indexOf >= 0 || (str2 = strArr3[i9]) == null) {
                                                i3 = indexOf;
                                            } else {
                                                str12 = str2;
                                                i3 = str10.indexOf(" ".concat(str2));
                                            }
                                            if (i3 >= 0) {
                                                if (str11 == null) {
                                                    i = size;
                                                    r10 = new SpannableStringBuilder(hc7Var.a);
                                                } else {
                                                    i = size;
                                                    r10 = str11;
                                                }
                                                i2 = i8;
                                                r10.setSpan(new ForegroundColorSpan(eVar2.getThemedColor(aob.q6)), i3, str12.length() + i3, 33);
                                                str = r10;
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i = size;
                                            i2 = i8;
                                            str = str11;
                                        }
                                        if (str != null && i9 == split.length - 1) {
                                            arrayList5.add(hc7Var);
                                            arrayList6.add(str);
                                        }
                                        i9++;
                                        arrayList3 = arrayList;
                                        size = i;
                                        i8 = i2;
                                        str11 = str;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i8++;
                                arrayList3 = arrayList;
                                size = size;
                            }
                        }
                        hl.c3(new cp7(fs8Var2, str7, arrayList4, arrayList5, arrayList6));
                        return;
                    }
                    es8 es8Var = es8VarArr[i7];
                    if (es8Var == null) {
                        i4 = i7;
                        strArr = strArr2;
                        b2 = b4;
                    } else {
                        String str13 = es8Var.a;
                        b2 = b4;
                        String str14 = " " + str13.toLowerCase();
                        i4 = i7;
                        ?? r102 = str9;
                        int i10 = 0;
                        while (true) {
                            if (i10 < split.length) {
                                if (split[i10].length() != 0) {
                                    String str15 = split[i10];
                                    strArr = strArr2;
                                    int indexOf2 = str14.indexOf(" " + str15);
                                    if (indexOf2 >= 0 || (str5 = strArr[i10]) == null) {
                                        str5 = str15;
                                    } else {
                                        indexOf2 = str14.indexOf(" ".concat(str5));
                                    }
                                    if (indexOf2 >= 0) {
                                        if (r102 == 0) {
                                            r102 = new SpannableStringBuilder(str13);
                                        }
                                        String str16 = str5;
                                        str3 = str14;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(eVar2.getThemedColor(aob.q6));
                                        int length = str16.length() + indexOf2;
                                        str4 = str13;
                                        r102.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                        z = r102;
                                    }
                                } else {
                                    str3 = str14;
                                    strArr = strArr2;
                                    str4 = str13;
                                    z = r102;
                                }
                                if (z && i10 == split.length - 1) {
                                    if (es8Var.f == 502) {
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= 4) {
                                                i11 = -1;
                                            } else if (yac.h(i11).o()) {
                                                i11++;
                                            }
                                        }
                                        if (i11 < 0) {
                                        }
                                    }
                                    arrayList4.add(es8Var);
                                    arrayList6.add(z);
                                }
                                i10++;
                                strArr2 = strArr;
                                str13 = str4;
                                str14 = str3;
                                r102 = z;
                            } else {
                                strArr = strArr2;
                            }
                        }
                    }
                    i7 = i4 + 1;
                    b4 = b2;
                    strArr2 = strArr;
                }
                break;
            case 15:
                ks8 ks8Var = (ks8) this.b;
                ks8Var.f.add((ms8) this.c);
                ks8Var.a();
                return;
            case 16:
                cga cgaVar = (cga) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                cgaVar.h(new v35(cgaVar, tL_starGiftCollection, b3), tL_starGiftCollection.title);
                return;
            case 17:
                au8 au8Var = (au8) this.b;
                hl.g((String) this.c);
                d31.b0(au8Var.a.a).k(false).j();
                return;
            case 18:
                ((cw8) this.b).z((zy9) this.c);
                return;
            case 19:
                oy8 oy8Var = (oy8) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = oy8Var.a;
                qwe qweVar = new qwe();
                qweVar.a = 256;
                atomicReference.set(new af0(new cgd(context, qweVar)));
                oy8Var.a((xab) oy8Var.f);
                return;
            case 20:
                ((dab) ((oy8) this.b).c).a((my8) this.c);
                return;
            case 21:
                ez8 ez8Var = (ez8) this.b;
                File file = (File) this.c;
                int i12 = ez8Var.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i12, i12, config);
                            rLottieNative.c(0, createBitmap, true);
                            ?? createBitmap2 = Bitmap.createBitmap(i12, i12, config);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                            createBitmap.recycle();
                            createBitmap2.setHasMipMap(true);
                            rLottieNative.d();
                            str6 = createBitmap2;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                cc4.g(th, true);
                                break;
                            } finally {
                                if (rLottieNative != null) {
                                    rLottieNative.d();
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    rLottieNative = null;
                }
                hl.c3(new ep8(ez8Var, str6, (byte) 22));
                return;
            case 22:
                ez8 ez8Var2 = (ez8) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                ez8Var2.h = true;
                if (ez8Var2.e) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap != null) {
                        ez8Var2.d.a(bitmap);
                        return;
                    }
                    return;
                }
            case 23:
                jz8 jz8Var = (jz8) this.b;
                ym4 ym4Var = (ym4) this.c;
                if (jz8Var.W) {
                    return;
                }
                jz8Var.e();
                jz8Var.a.d((String) ym4Var.b);
                return;
            case 24:
                li7 li7Var = (li7) this.b;
                ym4 ym4Var2 = (ym4) this.c;
                jz8 jz8Var2 = (jz8) li7Var.b;
                if (jz8Var2.m0 || jz8Var2.W || jz8Var2.V) {
                    return;
                }
                jz8Var2.m0 = true;
                jz8Var2.i0 = false;
                jz8Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) ym4Var2.c;
                boolean z3 = pointFArr.length >= 3;
                if (z3) {
                    jz8Var2.n0 = pointFArr;
                    jz8Var2.invalidate();
                }
                hl.d3(new ep8(jz8Var2, ym4Var2, b3), z3 ? 450L : 0L);
                return;
            case 25:
                ((rz8) this.b).a0((AnimatorSet) this.c);
                return;
            case 26:
                rz8 rz8Var = (rz8) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                File file2 = new File(hl.D0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                try {
                    z2 = bitmap2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    bitmap2.recycle();
                    if (z2) {
                        hl.c3(new ep8(rz8Var, file2, (byte) 28));
                        return;
                    }
                    return;
                } finally {
                }
            case 27:
                final rz8 rz8Var2 = (rz8) this.b;
                jz8 jz8Var3 = (jz8) this.c;
                if (jz8.d(rz8Var2.getParentActivity())) {
                    jz8Var3.e();
                    sb sbVar = new sb((byte) 9);
                    final byte b5 = z2 ? (byte) 1 : (byte) 0;
                    pcc pccVar = new pcc() { // from class: mz8
                        @Override // pcc
                        public final void a(Object obj) {
                            byte b6 = b5;
                            rz8 rz8Var3 = rz8Var2;
                            switch (b6) {
                                case 0:
                                    String str17 = (String) obj;
                                    if (rz8Var3.getParentActivity() != null) {
                                        m01.u(rz8Var3.getParentActivity(), str17);
                                        break;
                                    }
                                    break;
                                default:
                                    g09 g09Var = rz8Var3.d;
                                    if (g09Var != null && !rz8Var3.isFinished) {
                                        g09Var.d1(R.drawable.msg_download, ob6.M0(2131746198, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    w78 w78Var = new w78(10, false, false, null);
                    w78Var.H = (byte) 1;
                    w78Var.I = false;
                    w78Var.y = false;
                    w78Var.W = new pm3((Object) sbVar, (Object) rz8Var2, (Object) pccVar, (byte) 25);
                    rz8Var2.presentFragment(w78Var);
                    return;
                }
                return;
            case 28:
                final rz8 rz8Var3 = (rz8) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = rz8Var3.getParentActivity();
                if (parentActivity != null) {
                    MediaController.g0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new pcc() { // from class: mz8
                        @Override // pcc
                        public final void a(Object obj) {
                            byte b6 = b4;
                            rz8 rz8Var32 = rz8Var3;
                            switch (b6) {
                                case 0:
                                    String str17 = (String) obj;
                                    if (rz8Var32.getParentActivity() != null) {
                                        m01.u(rz8Var32.getParentActivity(), str17);
                                        break;
                                    }
                                    break;
                                default:
                                    g09 g09Var = rz8Var32.d;
                                    if (g09Var != null && !rz8Var32.isFinished) {
                                        g09Var.d1(R.drawable.msg_download, ob6.M0(2131746198, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                g09 g09Var = (g09) this.b;
                ry8 ry8Var2 = (ry8) this.c;
                sy8 sy8Var = g09Var.t0;
                if (sy8Var.q == 2 && sy8Var.o < 1.0f) {
                    sy8Var.m = ry8Var2;
                    g09Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                g09Var.q2 = g09.j(g09Var.o2, 0.03f, 0.005f);
                g09Var.o2 = currentAnimationTimeMillis;
                ry8 ry8Var3 = sy8Var.m;
                if (ry8Var3 == null) {
                    sy8Var.m = ry8Var2;
                    sy8Var.n = null;
                    sy8Var.o = 1.0f;
                    return;
                }
                int i13 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (sy8Var.o < 1.0f && (ry8Var = sy8Var.n) != null) {
                    ry8Var3 = ry8Var;
                }
                sy8Var.n = ry8Var3;
                sy8Var.m = ry8Var2;
                sy8Var.o = 0.0f;
                sy8Var.q = i13;
                sy8Var.p = System.currentTimeMillis();
                boolean[] zArr2 = sy8Var.s;
                if (zArr2 != null) {
                    int length2 = zArr2.length;
                    int i14 = sy8Var.n.e;
                    if (length2 >= i14 * i14) {
                        Arrays.fill(zArr2, false);
                        sy8Var.G = i13 == 1;
                        return;
                    }
                }
                int i15 = sy8Var.n.e;
                sy8Var.s = new boolean[i15 * i15];
                sy8Var.G = i13 == 1;
                return;
        }
    }

    public /* synthetic */ ep8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
