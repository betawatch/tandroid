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
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ll8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ll8(taa taaVar, vf6 vf6Var, int i, byte b) {
        this.a = b;
        this.b = taaVar;
        this.c = vf6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x015e, code lost:
    
        if (r6 != null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.text.SpannableStringBuilder] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        b61 b61Var;
        ArrayList arrayList;
        int i;
        String str;
        String str2;
        int i2;
        ?? r9;
        String str3;
        byte b2;
        int i3;
        String[] strArr;
        String str4;
        String str5;
        boolean z;
        String str6;
        RLottieNative rLottieNative;
        String str7 = null;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        switch (this.a) {
            case 0:
                pl8 pl8Var = (pl8) this.b;
                ml8 ml8Var = (ml8) this.c;
                ol8 ol8Var = pl8Var.y;
                byte b3 = ml8Var.a;
                RectF rectF = ml8Var.d;
                float f = rectF.left;
                float f2 = rectF.top;
                ProfileActivity profileActivity = ((ql8) ol8Var).b;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.t2(f, f2, b3);
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                profileActivity2.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity2.presentFragment(new mu1(bundle), true);
                return;
            case 2:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                RectF rectF4 = ProfileActivity.Z6;
                long j = profileActivity3.B2;
                if (j != 0) {
                    TLRPC.User V1 = profileActivity3.getMessagesController().V1(Long.valueOf(j));
                    profileActivity3.getMessagesController().b0(profileActivity3.f1, V1);
                    if (profileActivity3.F2 != null && V1 != null && u21.a(profileActivity3)) {
                        u21.D(profileActivity3, V1, profileActivity3.F2.title).j();
                    }
                    if (profileActivity3.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity3.Y3(true, false);
                        return;
                    }
                    return;
                }
                profileActivity3.getNotificationCenter().n(profileActivity3, 4);
                if (gl.O1()) {
                    b = 0;
                    profileActivity3.getNotificationCenter().k(4, Long.valueOf(-profileActivity3.f1));
                } else {
                    b = 0;
                    profileActivity3.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity3.getMessagesController().b0(profileActivity3.f1, profileActivity3.getMessagesController().V1(Long.valueOf(profileActivity3.getUserConfig().e())));
                profileActivity3.J1 = b;
                profileActivity3.finishFragment();
                return;
            case 3:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF5 = ProfileActivity.Z6;
                gl.g("https://" + profileActivity4.getMessagesController().N2 + "/" + hc2.K(chat, false));
                return;
            case 4:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF6 = ProfileActivity.Z6;
                m21.e();
                d01.t(profileActivity5.getParentActivity(), tL_collectibleInfo.url);
                return;
            case 5:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                o72 o72Var = (o72) this.c;
                RectF rectF7 = ProfileActivity.Z6;
                k72 k72Var = o72Var.e;
                cj3 cj3Var = profileActivity6.l5;
                View C = (cj3Var == null || cj3Var.getFragmentView() == null) ? profileActivity6.m5.C() : profileActivity6.l5.getFragmentView();
                RectF rectF8 = profileActivity6.l6;
                profileActivity6.k6 = zec.c(k72Var, C, rectF8) ? rectF8.left : 0.0f;
                profileActivity6.V1();
                return;
            case 6:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF9 = ProfileActivity.Z6;
                profileActivity7.F2 = profileActivity7.getMessagesStorage().N(profileActivity7.f1);
                countDownLatch.countDown();
                return;
            case 7:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF10 = ProfileActivity.Z6;
                profileActivity8.getClass();
                ((wgb) view).setChecked(profileActivity8.t2.f());
                return;
            case 8:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF11 = ProfileActivity.Z6;
                profileActivity9.H2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                return;
            case 9:
                ProfileActivity profileActivity10 = (ProfileActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                RectF rectF12 = ProfileActivity.Z6;
                if (!zArr[0] && (b61Var = profileActivity10.D5) != null) {
                    b61Var.run();
                }
                profileActivity10.D5 = null;
                return;
            case 10:
                sm8 sm8Var = (sm8) this.b;
                vf6 vf6Var = (vf6) this.c;
                ProfileActivity profileActivity11 = sm8Var.U2.c;
                u21.x(profileActivity11.getParentActivity(), profileActivity11.s5, vf6Var.m(), vf6Var.m() == 1 ? ((TLRPC.Dialog) vf6Var.n(0)).id : 0L, bkb.v0(bkb.vj, sm8Var.J0), bkb.v0(bkb.xj, sm8Var.J0)).j();
                return;
            case 11:
                in8 in8Var = (in8) this.b;
                vf6 vf6Var2 = (vf6) this.c;
                ProfileActivity profileActivity12 = in8Var.U2;
                u21.x(profileActivity12.getParentActivity(), profileActivity12.s5, vf6Var2.m(), vf6Var2.m() == 1 ? ((TLRPC.Dialog) vf6Var2.n(0)).id : 0L, bkb.v0(bkb.vj, in8Var.J0), bkb.v0(bkb.xj, in8Var.J0)).j();
                return;
            case 12:
                ((ko8) this.b).e.presentFragment(ProfileActivity.P2(((Long) this.c).longValue()));
                return;
            case 13:
                d dVar = (d) this.b;
                wjb wjbVar = (wjb) this.c;
                zd1 zd1Var = new zd1(null);
                zd1Var.d = wjbVar;
                dVar.presentFragment(zd1Var);
                return;
            case 14:
                to8 to8Var = (to8) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList2 = to8Var.d;
                d dVar2 = to8Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str9 = " ";
                String[] split = str8.split(" ");
                String[] strArr2 = new String[split.length];
                int i4 = 0;
                while (i4 < split.length) {
                    String str10 = str7;
                    String S0 = k96.D0().S0(split[i4], true, false);
                    strArr2[i4] = S0;
                    if (S0.equals(split[i4])) {
                        strArr2[i4] = str10;
                    }
                    i4++;
                    str7 = str10;
                }
                String str11 = str7;
                int i5 = 0;
                while (true) {
                    so8[] so8VarArr = to8Var.c;
                    if (i5 >= so8VarArr.length) {
                        String[] strArr3 = strArr2;
                        if (to8Var.F != null) {
                            int size = arrayList2.size();
                            int i6 = 0;
                            while (i6 < size) {
                                aa7 aa7Var = (aa7) arrayList2.get(i6);
                                String str12 = str9 + aa7Var.a.toLowerCase();
                                String str13 = str11;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < split.length) {
                                        if (split[i7].length() != 0) {
                                            String str14 = split[i7];
                                            arrayList = arrayList2;
                                            int indexOf = str12.indexOf(str9 + str14);
                                            if (indexOf >= 0 || (str3 = strArr3[i7]) == null) {
                                                i2 = indexOf;
                                            } else {
                                                str14 = str3;
                                                i2 = str12.indexOf(str9.concat(str3));
                                            }
                                            if (i2 >= 0) {
                                                if (str13 == null) {
                                                    i = size;
                                                    r9 = new SpannableStringBuilder(aa7Var.a);
                                                } else {
                                                    i = size;
                                                    r9 = str13;
                                                }
                                                str = str9;
                                                r9.setSpan(new ForegroundColorSpan(dVar2.getThemedColor(bkb.p6)), i2, str14.length() + i2, 33);
                                                str2 = r9;
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            i = size;
                                            str = str9;
                                            str2 = str13;
                                        }
                                        if (str2 != null && i7 == split.length - 1) {
                                            arrayList4.add(aa7Var);
                                            arrayList5.add(str2);
                                        }
                                        i7++;
                                        arrayList2 = arrayList;
                                        size = i;
                                        str9 = str;
                                        str13 = str2;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i6++;
                                arrayList2 = arrayList;
                                size = size;
                                str9 = str9;
                            }
                        }
                        gl.d3(new ex7((Object) to8Var, (Object) str8, (Object) arrayList3, (Object) arrayList4, (Object) arrayList5, (byte) 13));
                        return;
                    }
                    so8 so8Var = so8VarArr[i5];
                    if (so8Var == null) {
                        i3 = i5;
                        strArr = strArr2;
                        b2 = r9;
                    } else {
                        String str15 = so8Var.a;
                        b2 = r9;
                        String str16 = " " + str15.toLowerCase();
                        i3 = i5;
                        ?? r92 = str11;
                        int i8 = 0;
                        while (true) {
                            if (i8 < split.length) {
                                if (split[i8].length() != 0) {
                                    String str17 = split[i8];
                                    strArr = strArr2;
                                    int indexOf2 = str16.indexOf(" " + str17);
                                    if (indexOf2 >= 0 || (str6 = strArr[i8]) == null) {
                                        str6 = str17;
                                    } else {
                                        indexOf2 = str16.indexOf(" ".concat(str6));
                                    }
                                    if (indexOf2 >= 0) {
                                        if (r92 == 0) {
                                            r92 = new SpannableStringBuilder(str15);
                                        }
                                        String str18 = str6;
                                        str4 = str16;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(dVar2.getThemedColor(bkb.p6));
                                        int length = str18.length() + indexOf2;
                                        str5 = str15;
                                        r92.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                        z = r92;
                                    }
                                } else {
                                    str4 = str16;
                                    strArr = strArr2;
                                    str5 = str15;
                                    z = r92;
                                }
                                if (z && i8 == split.length - 1) {
                                    if (so8Var.f == 502) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= 4) {
                                                i9 = -1;
                                            } else if (y6c.h(i9).o()) {
                                                i9++;
                                            }
                                        }
                                        if (i9 < 0) {
                                        }
                                    }
                                    arrayList3.add(so8Var);
                                    arrayList5.add(z);
                                }
                                i8++;
                                strArr2 = strArr;
                                str15 = str5;
                                str16 = str4;
                                r92 = z;
                            } else {
                                strArr = strArr2;
                            }
                        }
                    }
                    i5 = i3 + 1;
                    r9 = b2;
                    strArr2 = strArr;
                }
                break;
            case 15:
                to8 to8Var2 = (to8) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                to8Var2.d.addAll(arrayList6);
                int i10 = to8Var2.f;
                na7.q1(i10).i2 = arrayList6;
                na7.q1(i10).j2 = to8Var2.F;
                if (to8Var2.x) {
                    return;
                }
                to8Var2.f();
                return;
            case 16:
                yo8 yo8Var = (yo8) this.b;
                yo8Var.f.add((ap8) this.c);
                yo8Var.a();
                return;
            case 17:
                lca lcaVar = (lca) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                lcaVar.h(new x15(lcaVar, tL_starGiftCollection, (byte) 22), tL_starGiftCollection.title);
                return;
            case 18:
                pq8 pq8Var = (pq8) this.b;
                gl.g((String) this.c);
                u21.b0(pq8Var.a.a).k(false).j();
                return;
            case 19:
                ((ts8) this.b).z((fv9) this.c);
                return;
            case 20:
                dv8 dv8Var = (dv8) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = dv8Var.a;
                zre zreVar = new zre();
                zreVar.a = 256;
                atomicReference.set(new ye0(new jbd(context, zreVar)));
                dv8Var.a((y6b) dv8Var.f);
                return;
            case 21:
                ((e6b) ((dv8) this.b).c).a((bv8) this.c);
                return;
            case 22:
                tv8 tv8Var = (tv8) this.b;
                File file = (File) this.c;
                int i11 = tv8Var.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i11, i11, config);
                            rLottieNative.c(0, createBitmap, true);
                            ?? createBitmap2 = Bitmap.createBitmap(i11, i11, config);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                            createBitmap.recycle();
                            createBitmap2.setHasMipMap(true);
                            rLottieNative.d();
                            str7 = createBitmap2;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                fa4.g(th, true);
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
                gl.d3(new ll8(tv8Var, str7, (byte) 23));
                return;
            case 23:
                tv8 tv8Var2 = (tv8) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                tv8Var2.h = true;
                if (tv8Var2.e) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap != null) {
                        tv8Var2.d.a(bitmap);
                        return;
                    }
                    return;
                }
            case 24:
                yv8 yv8Var = (yv8) this.b;
                sk4 sk4Var = (sk4) this.c;
                if (yv8Var.W) {
                    return;
                }
                yv8Var.e();
                yv8Var.a.e((String) sk4Var.b);
                return;
            case 25:
                bg7 bg7Var = (bg7) this.b;
                sk4 sk4Var2 = (sk4) this.c;
                yv8 yv8Var2 = (yv8) bg7Var.b;
                if (yv8Var2.m0 || yv8Var2.W || yv8Var2.V) {
                    return;
                }
                yv8Var2.m0 = true;
                yv8Var2.i0 = false;
                yv8Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) sk4Var2.c;
                r9 = pointFArr.length < 3 ? (byte) 0 : (byte) 1;
                if (r9 != 0) {
                    yv8Var2.n0 = pointFArr;
                    yv8Var2.invalidate();
                }
                gl.e3(new ll8(yv8Var2, sk4Var2, (byte) 24), r9 != 0 ? 450L : 0L);
                return;
            case 26:
                ((gw8) this.b).a0((AnimatorSet) this.c);
                return;
            case 27:
                gw8 gw8Var = (gw8) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                File file2 = new File(gl.D0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z2 = bitmap2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                bitmap2.recycle();
                if (z2) {
                    gl.d3(new ll8(gw8Var, file2, (byte) 29));
                    return;
                }
                return;
            case 28:
                final gw8 gw8Var2 = (gw8) this.b;
                yv8 yv8Var3 = (yv8) this.c;
                if (yv8.d(gw8Var2.getParentActivity())) {
                    yv8Var3.e();
                    pb pbVar = new pb((byte) 9);
                    final byte b4 = z2 ? (byte) 1 : (byte) 0;
                    p8c p8cVar = new p8c() { // from class: bw8
                        @Override // p8c
                        public final void a(Object obj) {
                            byte b5 = b4;
                            gw8 gw8Var3 = gw8Var2;
                            switch (b5) {
                                case 0:
                                    String str19 = (String) obj;
                                    if (gw8Var3.getParentActivity() != null) {
                                        d01.t(gw8Var3.getParentActivity(), str19);
                                        break;
                                    }
                                    break;
                                default:
                                    vw8 vw8Var = gw8Var3.d;
                                    if (vw8Var != null && !gw8Var3.isFinished) {
                                        vw8Var.d1(R.drawable.msg_download, k96.M0(2131746278, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    g48 g48Var = new g48(10, false, false, null);
                    g48Var.H = (byte) 1;
                    g48Var.I = false;
                    g48Var.y = false;
                    g48Var.W = new xl3((Object) pbVar, (Object) gw8Var2, (Object) p8cVar, (byte) 25);
                    gw8Var2.presentFragment(g48Var);
                    return;
                }
                return;
            default:
                final gw8 gw8Var3 = (gw8) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = gw8Var3.getParentActivity();
                if (parentActivity != null) {
                    MediaController.d0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new p8c() { // from class: bw8
                        @Override // p8c
                        public final void a(Object obj) {
                            byte b5 = r2;
                            gw8 gw8Var32 = gw8Var3;
                            switch (b5) {
                                case 0:
                                    String str19 = (String) obj;
                                    if (gw8Var32.getParentActivity() != null) {
                                        d01.t(gw8Var32.getParentActivity(), str19);
                                        break;
                                    }
                                    break;
                                default:
                                    vw8 vw8Var = gw8Var32.d;
                                    if (vw8Var != null && !gw8Var32.isFinished) {
                                        vw8Var.d1(R.drawable.msg_download, k96.M0(2131746278, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ll8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
