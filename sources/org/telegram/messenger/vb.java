package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import org.telegram.messenger.secretmedia.EncryptedFileInputStream;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Components.zt0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class vb implements Runnable {
    public Thread a;
    public final Object b = new Object();
    public final ub c;
    public boolean d;
    public final /* synthetic */ gc e;

    public vb(gc gcVar, ub ubVar) {
        this.e = gcVar;
        this.c = ubVar;
    }

    public static Bitmap a(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
        int i7;
        if (!wallPaper.pattern || wallPaper.settings == null) {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            return (wallPaperSettings == null || !wallPaperSettings.blur) ? bitmap : Utilities.e(bitmap);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
        boolean z9 = true;
        if (wallPaperSettings2.second_background_color == 0) {
            i7 = g0.V0(wallPaperSettings2.background_color, false);
            canvas.drawColor(i0.a.o(wallPaper.settings.background_color, qs.e4));
        } else if (wallPaperSettings2.third_background_color == 0) {
            int o4 = i0.a.o(wallPaperSettings2.background_color, qs.e4);
            int o10 = i0.a.o(wallPaper.settings.second_background_color, qs.e4);
            int w02 = g0.w0(o4, o10);
            GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.k9.d(wallPaper.settings.rotation), new int[]{o4, o10});
            gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            gradientDrawable.draw(canvas);
            i7 = w02;
        } else {
            int o11 = i0.a.o(wallPaperSettings2.background_color, qs.e4);
            int o12 = i0.a.o(wallPaper.settings.second_background_color, qs.e4);
            int o13 = i0.a.o(wallPaper.settings.third_background_color, qs.e4);
            int i10 = wallPaper.settings.fourth_background_color;
            int o14 = i10 == 0 ? 0 : i0.a.o(i10, qs.e4);
            int g10 = qa0.g(o11, o12, o13, o14);
            qa0 qa0Var = new qa0();
            qa0Var.n(o11, o12, o13, o14);
            qa0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            qa0Var.s(bitmap, wallPaper.settings.intensity);
            qa0Var.draw(canvas);
            z9 = false;
            i7 = g10;
        }
        if (z9) {
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            paint.setAlpha((int) ((wallPaper.settings.intensity / 100.0f) * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        return createBitmap;
    }

    public final void b(zg0 zg0Var, int i7, int i10, boolean z9, boolean z10) {
        Bitmap createBitmap;
        Canvas canvas;
        BitmapDrawable bitmapDrawable;
        if (z9 && z10) {
            float f10 = i7 * 1.2f;
            float f11 = i10 * 1.2f;
            createBitmap = Bitmap.createBitmap((int) f10, (int) f11, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            canvas.scale(2.0f, 2.0f, f10 / 2.0f, f11 / 2.0f);
        } else {
            createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
        }
        zg0Var.b();
        Bitmap createBitmap2 = Bitmap.createBitmap(zg0Var.b, zg0Var.c, Bitmap.Config.ARGB_8888);
        zg0Var.C0 = z9 ? zg0Var.e[0] - 1 : 0;
        zg0Var.a(createBitmap2);
        zg0Var.c();
        canvas.save();
        if (!z9 || !z10) {
            canvas.scale(createBitmap2.getWidth() / i7, createBitmap2.getHeight() / i10, i7 / 2.0f, i10 / 2.0f);
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (z9 && z10) {
            canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
            bitmapDrawable = new mc(createBitmap);
        } else {
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        zg0Var.C(false);
        createBitmap2.recycle();
        c(bitmapDrawable);
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        g0.h3(new y4(19, this, bitmapDrawable));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:933|(2:935|(12:937|938|939|(1:941)(1:963)|942|943|944|945|(2:951|(1:953))|(1:955)(1:958)|956|957))|966|938|939|(0)(0)|942|943|944|945|(4:947|949|951|(0))|(0)(0)|956|957) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(6:74|75|76|77|(1:79)(1:125)|80)|(3:82|83|(9:85|86|87|(1:119)|(3:104|(1:118)(4:107|(1:111)|112|(1:116))|117)(1:93)|94|(1:103)(1:98)|(1:100)(1:102)|101))|124|86|87|(0)|119|(0)|104|(0)|118|117|94|(1:96)|103|(0)(0)|101) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:356|(1:932)(1:363)|364|(2:366|(1:930)(1:370))(1:931)|371|(15:373|(3:375|(1:377)(1:917)|378)(2:918|(3:920|(1:922)(1:924)|923)(2:925|(2:927|928)))|379|380|381|(15:383|384|385|(6:868|869|870|871|872|873)(1:387)|388|389|(1:391)(2:853|(1:855)(2:856|(1:858)(2:859|(1:861)(1:862))))|392|393|394|395|(1:397)(2:844|(1:846))|398|(1:843)(9:402|404|(2:797|(15:805|806|(4:808|809|810|(12:812|(1:814)|816|817|818|819|820|(4:825|826|827|(1:829))|830|826|827|(0)))(1:837)|834|(0)|816|817|818|819|820|(5:822|825|826|827|(0))|830|826|827|(0))(4:799|(1:801)(1:804)|802|803))(3:407|(4:786|787|788|789)(1:409)|410)|411|(1:784)(1:415)|416|(1:418)|419|(1:783)(3:425|(2:426|(1:429)(1:428))|430))|431)(3:884|(11:886|887|888|(1:890)(1:910)|891|893|894|(1:896)|897|(3:899|(2:900|(1:903)(1:902))|904)(1:907)|905)(1:913)|906)|432|433|434|(3:690|691|898)(4:436|437|438|a2c)|475|(3:478|(1:480)(1:482)|481)|(2:488|(1:490))|491|(3:(1:504)(1:507)|505|506)(3:(1:496)(1:499)|497|498))|929|928|379|380|381|(0)(0)|432|433|434|(0)(0)|475|(3:478|(0)(0)|481)|(4:484|486|488|(0))|491|(1:493)|(0)(0)|505|506) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0215, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0216, code lost:
    
        org.telegram.messenger.a8.f(r0);
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x0878, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:916:0x0879, code lost:
    
        r35 = r3;
        r21 = r6;
        r22 = r7;
        r32 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:960:0x0d83, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:961:0x0d87, code lost:
    
        org.telegram.messenger.a8.f(r0);
        r0 = r3;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:964:0x0d85, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:965:0x0d86, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0a63 A[Catch: all -> 0x0a4f, TryCatch #30 {all -> 0x0a4f, blocks: (B:438:0x0a25, B:439:0x0a2c, B:448:0x0a3a, B:451:0x0a42, B:454:0x0a49, B:456:0x0a5b, B:460:0x0a63, B:462:0x0a6d, B:467:0x0a8b, B:508:0x0a97, B:509:0x0aa7, B:513:0x0abc, B:517:0x0add, B:519:0x0ae1, B:679:0x0ac4, B:684:0x0a56, B:688:0x0cad, B:441:0x0a2d, B:443:0x0a31, B:446:0x0a37), top: B:437:0x0a25, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0cbf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0cff  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0d0b  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0d30  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0aa7 A[Catch: all -> 0x0a4f, TryCatch #30 {all -> 0x0a4f, blocks: (B:438:0x0a25, B:439:0x0a2c, B:448:0x0a3a, B:451:0x0a42, B:454:0x0a49, B:456:0x0a5b, B:460:0x0a63, B:462:0x0a6d, B:467:0x0a8b, B:508:0x0a97, B:509:0x0aa7, B:513:0x0abc, B:517:0x0add, B:519:0x0ae1, B:679:0x0ac4, B:684:0x0a56, B:688:0x0cad, B:441:0x0a2d, B:443:0x0a31, B:446:0x0a37), top: B:437:0x0a25, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0bf9 A[Catch: all -> 0x0b47, TryCatch #22 {all -> 0x0b47, blocks: (B:524:0x0b43, B:556:0x0be4, B:558:0x0bee, B:560:0x0bf4, B:562:0x0bf9, B:564:0x0bff, B:568:0x0c13, B:574:0x0c21, B:576:0x0c27, B:578:0x0c44, B:580:0x0c31, B:582:0x0c37, B:585:0x0c4c, B:587:0x0c59, B:588:0x0c62), top: B:523:0x0b43 }] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0c44 A[Catch: all -> 0x0b47, TryCatch #22 {all -> 0x0b47, blocks: (B:524:0x0b43, B:556:0x0be4, B:558:0x0bee, B:560:0x0bf4, B:562:0x0bf9, B:564:0x0bff, B:568:0x0c13, B:574:0x0c21, B:576:0x0c27, B:578:0x0c44, B:580:0x0c31, B:582:0x0c37, B:585:0x0c4c, B:587:0x0c59, B:588:0x0c62), top: B:523:0x0b43 }] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0891 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:717:0x08f4 A[Catch: all -> 0x08c0, TryCatch #16 {all -> 0x08c0, blocks: (B:691:0x0891, B:692:0x0898, B:701:0x08a6, B:703:0x08bc, B:707:0x08c7, B:708:0x08cc, B:710:0x08e0, B:715:0x08ed, B:717:0x08f4, B:719:0x0918, B:721:0x0922, B:725:0x0928, B:726:0x092e, B:728:0x0934, B:732:0x0946, B:734:0x094c, B:736:0x0957, B:738:0x095d, B:773:0x08fe, B:775:0x090f, B:776:0x0909, B:780:0x0a17, B:694:0x0899, B:696:0x089d, B:699:0x08a3), top: B:690:0x0891, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:814:0x0726 A[Catch: all -> 0x071e, TRY_LEAVE, TryCatch #44 {all -> 0x071e, blocks: (B:810:0x071a, B:814:0x0726), top: B:809:0x071a }] */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0755 A[Catch: all -> 0x0748, TryCatch #23 {all -> 0x0748, blocks: (B:411:0x077d, B:415:0x078b, B:419:0x07a2, B:426:0x07b2, B:430:0x07bb, B:783:0x07c0, B:784:0x0794, B:820:0x0737, B:822:0x073d, B:827:0x074e, B:829:0x0755, B:801:0x0766, B:803:0x0777, B:804:0x0771), top: B:404:0x06c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:884:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:941:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:953:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:963:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0274  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r40v0, types: [org.telegram.messenger.vb] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        wz0 wz0Var;
        boolean z9;
        boolean z10;
        Bitmap bitmap;
        Object obj;
        byte[] bArr;
        fw fwVar;
        boolean z11;
        boolean z12;
        String str;
        Long l10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String str2;
        Long l11;
        float f10;
        float f11;
        float f12;
        boolean z17;
        Bitmap bitmap2;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        int i7;
        boolean z24;
        ?? r14;
        boolean z25;
        boolean z26;
        int i10;
        int i11;
        boolean z27;
        float f13;
        char c10;
        Bitmap createScaledBitmap;
        boolean z28;
        String str3;
        Object obj2;
        int i12;
        int i13;
        boolean z29;
        Bitmap createScaledBitmap2;
        ?? r82;
        Bitmap bitmap3;
        boolean z30;
        boolean z31;
        int i14;
        FileInputStream fileInputStream;
        Bitmap bitmap4;
        Rect rect;
        String str4;
        String str5;
        boolean z32;
        FileInputStream fileInputStream2;
        int i15;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        ?? r83;
        boolean z38;
        boolean z39;
        boolean z40;
        boolean z41;
        boolean z42;
        boolean z43;
        boolean z44;
        int i16;
        boolean z45;
        Long l12;
        String str6;
        byte[] bArr2;
        boolean z46;
        boolean z47;
        boolean z48;
        boolean z49;
        boolean z50;
        Bitmap bitmap5;
        MediaMetadataRetriever mediaMetadataRetriever;
        bg.f fVar;
        boolean z51;
        org.telegram.ui.Components.v5 v5Var;
        int i17;
        int i18;
        boolean z52;
        String str7;
        int i19;
        boolean z53;
        int i20;
        int i21;
        int i22;
        boolean z54;
        boolean z55;
        boolean z56;
        boolean z57;
        boolean z58;
        int i23;
        String str8;
        ?? r22;
        RandomAccessFile randomAccessFile;
        Throwable th2;
        RandomAccessFile randomAccessFile2;
        boolean z59;
        bg.f fVar2;
        bg.f fVar3;
        int i24;
        int i25;
        zg0 zg0Var;
        zg0 zg0Var2;
        byte[] bArr3;
        boolean z60;
        int i26;
        boolean z61;
        boolean z62;
        boolean z63;
        boolean z64;
        int i27;
        int i28;
        String str9;
        int i29;
        int i30;
        synchronized (this.b) {
            try {
                this.a = Thread.currentThread();
                Thread.interrupted();
                if (this.d) {
                    return;
                }
                ub ubVar = this.c;
                hc hcVar = ubVar.i;
                TLRPC.PhotoSize photoSize = hcVar.k;
                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                    Bitmap F = gc.F("b", ((TLRPC.TL_photoStrippedSize) photoSize).bytes);
                    c(F != null ? new BitmapDrawable(F) : null);
                    return;
                }
                int i31 = ubVar.l;
                if (i31 == 5) {
                    try {
                        ub ubVar2 = this.c;
                        wz0Var = new wz0(ubVar2.p, (s5) ubVar2.i.i);
                    } catch (Throwable th3) {
                        a8.f(th3);
                        wz0Var = null;
                    }
                    c(wz0Var);
                    return;
                }
                boolean z65 = false;
                if (i31 == 3 || i31 == 4) {
                    Point point = g0.q;
                    int i32 = point.x;
                    int i33 = point.y;
                    String str10 = ubVar.f;
                    if (str10 != null) {
                        String[] split = str10.split("_");
                        if (split.length >= 2) {
                            z9 = false;
                            float parseFloat = Float.parseFloat(split[0]);
                            z10 = true;
                            float parseFloat2 = Float.parseFloat(split[1]);
                            float f14 = g0.p;
                            int i34 = (int) (parseFloat2 * f14);
                            i32 = (int) (parseFloat * f14);
                            i33 = i34;
                            ub ubVar3 = this.c;
                            pz pzVar = sz.m(ubVar3.p, i32, i33, ubVar3.l != 4 ? z10 : z9);
                            bitmap = pzVar.d();
                            pz pzVar2 = pzVar;
                            if (bitmap != null && !TextUtils.isEmpty(this.c.f) && this.c.f.contains("wallpaper")) {
                                obj = this.c.j;
                                if (obj instanceof TLRPC.WallPaper) {
                                    bitmap = a(bitmap, (TLRPC.WallPaper) obj);
                                }
                            }
                            c(gg.b.a(bitmap, pzVar2 != null ? pzVar2.e() : null));
                            return;
                        }
                    }
                    z9 = false;
                    z10 = true;
                    ub ubVar32 = this.c;
                    pz pzVar3 = sz.m(ubVar32.p, i32, i33, ubVar32.l != 4 ? z10 : z9);
                    bitmap = pzVar3.d();
                    pz pzVar22 = pzVar3;
                    if (bitmap != null) {
                        obj = this.c.j;
                        if (obj instanceof TLRPC.WallPaper) {
                        }
                    }
                    c(gg.b.a(bitmap, pzVar22 != null ? pzVar22.e() : null));
                    return;
                }
                if (i31 == 1) {
                    int min = Math.min(512, g0.L(170.6f));
                    int min2 = Math.min(512, g0.L(170.6f));
                    String str11 = this.c.f;
                    if (str11 != null) {
                        String[] split2 = str11.split("_");
                        if (split2.length >= 2) {
                            float parseFloat3 = Float.parseFloat(split2[0]);
                            float parseFloat4 = Float.parseFloat(split2[1]);
                            int min3 = Math.min(512, (int) (g0.p * parseFloat3));
                            int min4 = Math.min(512, (int) (g0.p * parseFloat4));
                            if (parseFloat3 > 90.0f || parseFloat4 > 90.0f || this.c.f.contains("nolimit")) {
                                min2 = min4;
                                z61 = false;
                                i30 = min3;
                            } else {
                                int min5 = Math.min(min3, qs.q2);
                                min2 = Math.min(min4, qs.q2);
                                z61 = true;
                                i30 = min5;
                            }
                            boolean z66 = (split2.length >= 3 && "pcache".equals(split2[2])) || this.c.f.contains("pcache") || !(this.c.f.contains("nolimit") || iz.o() == 2);
                            z57 = this.c.f.contains("lastframe");
                            i26 = 4;
                            z63 = this.c.f.contains("lastreactframe");
                            if (z63) {
                                z57 = true;
                            }
                            if (this.c.f.contains("firstframe")) {
                                z62 = true;
                                i27 = i30;
                                z64 = z66;
                            } else {
                                z62 = false;
                                i27 = i30;
                                z64 = z66;
                            }
                        } else {
                            i26 = 4;
                            z61 = false;
                            z62 = false;
                            z63 = false;
                            z64 = false;
                            z57 = false;
                            i27 = min;
                        }
                        if (split2.length >= 3) {
                            i28 = 3;
                            if ("nr".equals(split2[2])) {
                                i22 = 2;
                            } else if ("nrs".equals(split2[2])) {
                                i22 = 3;
                            } else if ("dice".equals(split2[2])) {
                                str9 = split2[3];
                                i22 = 2;
                                if (split2.length >= 5) {
                                    if (!"c1".equals(split2[i26])) {
                                        if ("c2".equals(split2[i26])) {
                                            i21 = i27;
                                            z58 = z61;
                                            i23 = i28;
                                        } else if ("c3".equals(split2[i26])) {
                                            i21 = i27;
                                            z58 = z61;
                                            i23 = i26;
                                        } else if ("c4".equals(split2[i26])) {
                                            i21 = i27;
                                            z58 = z61;
                                            i23 = 5;
                                        } else {
                                            i29 = "c5".equals(split2[i26]) ? 6 : 12;
                                        }
                                        i20 = min2;
                                        str8 = str9;
                                        z55 = z63;
                                        r22 = i27;
                                        z54 = z62;
                                        z56 = z64;
                                    }
                                    z58 = z61;
                                    i23 = i29;
                                    i20 = min2;
                                    i21 = i27;
                                    str8 = str9;
                                    z55 = z63;
                                    r22 = i27;
                                    z54 = z62;
                                    z56 = z64;
                                }
                                i21 = i27;
                                z58 = z61;
                                i23 = 0;
                                i20 = min2;
                                str8 = str9;
                                z55 = z63;
                                r22 = i27;
                                z54 = z62;
                                z56 = z64;
                            }
                            str9 = null;
                            if (split2.length >= 5) {
                            }
                            i21 = i27;
                            z58 = z61;
                            i23 = 0;
                            i20 = min2;
                            str8 = str9;
                            z55 = z63;
                            r22 = i27;
                            z54 = z62;
                            z56 = z64;
                        } else {
                            i28 = 3;
                        }
                        i22 = 1;
                        str9 = null;
                        if (split2.length >= 5) {
                        }
                        i21 = i27;
                        z58 = z61;
                        i23 = 0;
                        i20 = min2;
                        str8 = str9;
                        z55 = z63;
                        r22 = i27;
                        z54 = z62;
                        z56 = z64;
                    } else {
                        i20 = min2;
                        i21 = min;
                        i22 = 1;
                        z54 = false;
                        z55 = false;
                        z56 = false;
                        z57 = false;
                        z58 = false;
                        i23 = 0;
                        str8 = null;
                        r22 = min;
                    }
                    try {
                        if (str8 != null) {
                            zg0Var2 = "🎰".equals(str8) ? new zt0(str8, i21, i20) : new xg0(str8, i21, i20);
                            i24 = i20;
                            i25 = i21;
                        } else {
                            try {
                                randomAccessFile2 = new RandomAccessFile(this.c.p, "r");
                                try {
                                    bArr3 = this.c.m == 1 ? gc.L : gc.K;
                                    randomAccessFile2.readFully(bArr3, 0, 2);
                                } catch (Exception e10) {
                                    e = e10;
                                    a8.g(e, false);
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (Exception e11) {
                                            a8.f(e11);
                                        }
                                    }
                                    z59 = false;
                                    if (!z57) {
                                    }
                                    z56 = false;
                                    if (z56) {
                                    }
                                    fVar2 = new bg.f(0);
                                    if (z57) {
                                    }
                                    fVar2.c = true;
                                    fVar3 = fVar2;
                                    hc hcVar2 = this.c.i;
                                    if (hcVar2 == null) {
                                    }
                                    if (z59) {
                                    }
                                    zg0Var2 = zg0Var;
                                    if (z57) {
                                    }
                                    b(zg0Var2, i24, i25, z57, z55);
                                }
                            } catch (Exception e12) {
                                e = e12;
                                randomAccessFile2 = null;
                            } catch (Throwable th4) {
                                th2 = th4;
                                randomAccessFile = null;
                                if (randomAccessFile == null) {
                                    throw th2;
                                }
                                try {
                                    randomAccessFile.close();
                                    throw th2;
                                } catch (Exception e13) {
                                    a8.f(e13);
                                    throw th2;
                                }
                            }
                            if (bArr3[0] == 31) {
                                if (bArr3[1] == -117) {
                                    z60 = true;
                                    randomAccessFile2.close();
                                    z59 = z60;
                                    if (!z57 || z54) {
                                        z56 = false;
                                    }
                                    if (!z56 || z57 || z54) {
                                        fVar2 = new bg.f(0);
                                        if (!z57 || z54) {
                                            fVar2.c = true;
                                        } else {
                                            String str12 = this.c.f;
                                            if (str12 != null && str12.contains("compress")) {
                                                fVar2.a = 60;
                                            }
                                            String str13 = this.c.f;
                                            if (str13 != null && str13.contains("flbk")) {
                                                fVar2.b = true;
                                            }
                                        }
                                        fVar3 = fVar2;
                                    } else {
                                        fVar3 = null;
                                    }
                                    hc hcVar22 = this.c.i;
                                    boolean z67 = hcVar22 == null && ij.D4(hcVar22.i);
                                    if (z59) {
                                        File file = this.c.p;
                                        i24 = i20;
                                        i25 = i21;
                                        zg0Var = new zg0(file, gc.o(file), i25, i24, fVar3, z58, i23, z67);
                                    } else {
                                        i24 = i20;
                                        i25 = i21;
                                        zg0Var = new zg0(this.c.p, null, i25, i24, fVar3, z58, i23, z67);
                                    }
                                    zg0Var2 = zg0Var;
                                }
                            }
                            z60 = false;
                            randomAccessFile2.close();
                            z59 = z60;
                            if (!z57) {
                            }
                            z56 = false;
                            if (z56) {
                            }
                            fVar2 = new bg.f(0);
                            if (z57) {
                            }
                            fVar2.c = true;
                            fVar3 = fVar2;
                            hc hcVar222 = this.c.i;
                            if (hcVar222 == null) {
                            }
                            if (z59) {
                            }
                            zg0Var2 = zg0Var;
                        }
                        if (!z57 || z54) {
                            b(zg0Var2, i24, i25, z57, z55);
                        } else {
                            zg0Var2.K(i22);
                            c(zg0Var2);
                        }
                    } catch (Throwable th5) {
                        randomAccessFile = r22;
                        th2 = th5;
                    }
                } else {
                    int i35 = 4;
                    if (i31 != 2) {
                        File file2 = ubVar.p;
                        boolean z68 = (ubVar.h == null && (ubVar.r == null || file2 == null || !file2.getAbsolutePath().endsWith(".enc"))) ? false : true;
                        ub ubVar4 = this.c;
                        ew ewVar = ubVar4.h;
                        if (ewVar != null) {
                            fwVar = ewVar.a;
                            TLRPC.TL_secureFile tL_secureFile = ewVar.b;
                            bArr = (tL_secureFile == null || (bArr2 = tL_secureFile.file_hash) == null) ? ewVar.f : bArr2;
                        } else {
                            bArr = null;
                            fwVar = null;
                        }
                        String str14 = ubVar4.i.g;
                        if (str14 != null) {
                            if (str14.startsWith("thumb://")) {
                                int indexOf = str14.indexOf(":", 8);
                                if (indexOf >= 0) {
                                    l10 = Long.valueOf(Long.parseLong(str14.substring(8, indexOf)));
                                    str6 = str14.substring(indexOf + 1);
                                } else {
                                    str6 = null;
                                    l10 = null;
                                }
                                str = str6;
                                z14 = false;
                                z13 = false;
                            } else if (str14.startsWith("vthumb://")) {
                                int indexOf2 = str14.indexOf(":", 9);
                                if (indexOf2 >= 0) {
                                    l12 = Long.valueOf(Long.parseLong(str14.substring(9, indexOf2)));
                                    z45 = true;
                                } else {
                                    z45 = false;
                                    l12 = null;
                                }
                                l10 = l12;
                                z14 = z45;
                                z13 = false;
                                str = null;
                            } else if (!str14.startsWith("http")) {
                                z12 = false;
                                z11 = false;
                                str = null;
                                l10 = null;
                                z14 = z12;
                                z13 = z11;
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 1;
                            z15 = this.e.z;
                            str5 = this.c.f;
                            if (str5 == null) {
                                f10 = 0.0f;
                                try {
                                    String[] split3 = str5.split("_");
                                    if (split3.length >= 2) {
                                        try {
                                            f11 = Float.parseFloat(split3[0]) * g0.p;
                                            try {
                                                f12 = Float.parseFloat(split3[1]) * g0.p;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                z35 = z68;
                                                str2 = str;
                                                l11 = l10;
                                                z36 = false;
                                                f12 = 0.0f;
                                                z37 = z15;
                                                bitmap2 = null;
                                                z23 = z36;
                                                z22 = z37;
                                                z21 = z35;
                                                i7 = 1;
                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                z25 = z23;
                                                r14 = z22;
                                                z24 = z21;
                                                float f15 = f12;
                                                if (this.c.m == i7) {
                                                }
                                                Thread.interrupted();
                                                if (r2.a) {
                                                }
                                                if (bitmap2 != null) {
                                                }
                                                str3 = this.c.f;
                                                if (str3 == null) {
                                                }
                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                return;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z35 = z68;
                                            str2 = str;
                                            l11 = l10;
                                            z36 = false;
                                            f11 = 0.0f;
                                            f12 = 0.0f;
                                            z37 = z15;
                                        }
                                    } else {
                                        f11 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    try {
                                        r83 = this.c.f.contains("b2r") ? 4 : this.c.f.contains("b2") ? 3 : this.c.f.contains("b1") ? 2 : this.c.f.contains("b") ? 1 : 0;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        z19 = z68;
                                        str2 = str;
                                        l11 = l10;
                                        bitmap2 = null;
                                        z17 = z19;
                                        z18 = false;
                                        z20 = z17;
                                        z65 = false;
                                        z23 = z18;
                                        z22 = z15;
                                        z21 = z20;
                                        i7 = 1;
                                        a8.g(th, !(th instanceof FileNotFoundException));
                                        z25 = z23;
                                        r14 = z22;
                                        z24 = z21;
                                        float f152 = f12;
                                        if (this.c.m == i7) {
                                        }
                                        Thread.interrupted();
                                        if (r2.a) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        str3 = this.c.f;
                                        if (str3 == null) {
                                        }
                                        c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                        return;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    z16 = z68;
                                    str2 = str;
                                    l11 = l10;
                                    f11 = f10;
                                    f12 = f11;
                                    z19 = z16;
                                    bitmap2 = null;
                                    z17 = z19;
                                    z18 = false;
                                    z20 = z17;
                                    z65 = false;
                                    z23 = z18;
                                    z22 = z15;
                                    z21 = z20;
                                    i7 = 1;
                                    a8.g(th, !(th instanceof FileNotFoundException));
                                    z25 = z23;
                                    r14 = z22;
                                    z24 = z21;
                                    float f1522 = f12;
                                    if (this.c.m == i7) {
                                    }
                                    Thread.interrupted();
                                    if (r2.a) {
                                    }
                                    if (bitmap2 != null) {
                                    }
                                    str3 = this.c.f;
                                    if (str3 == null) {
                                    }
                                    c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                    return;
                                }
                                try {
                                    z65 = this.c.f.contains("i");
                                    try {
                                        if (this.c.f.contains("f")) {
                                            z15 = true;
                                        } else {
                                            z15 = z15;
                                            if (this.c.f.contains("F")) {
                                                z15 = false;
                                            }
                                        }
                                        if (f11 == 0.0f || f12 == 0.0f) {
                                            z39 = z68;
                                            str2 = str;
                                            l11 = l10;
                                            z40 = r83 == true ? 1 : 0;
                                        } else {
                                            options.inJustDecodeBounds = true;
                                            try {
                                                if (l10 == null || str != null) {
                                                    str2 = str;
                                                    l11 = l10;
                                                    if (fwVar != null) {
                                                        try {
                                                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(file2, "r");
                                                            int length = (int) randomAccessFile3.length();
                                                            ThreadLocal threadLocal = gc.I;
                                                            byte[] bArr4 = (byte[]) threadLocal.get();
                                                            try {
                                                                if (bArr4 != null) {
                                                                    z38 = z68;
                                                                    try {
                                                                        z41 = z38;
                                                                        if (bArr4.length >= length) {
                                                                            z38 = z38;
                                                                            if (bArr4 == null) {
                                                                                bArr4 = new byte[length];
                                                                                threadLocal.set(bArr4);
                                                                            }
                                                                            randomAccessFile3.readFully(bArr4, 0, length);
                                                                            randomAccessFile3.close();
                                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr4, 0, length, fwVar);
                                                                            boolean z69 = r83 == true ? 1 : 0;
                                                                            byte[] o4 = Utilities.o(length, bArr4);
                                                                            if (bArr != null && Arrays.equals(o4, bArr)) {
                                                                                z42 = false;
                                                                                int i36 = bArr4[0] & 255;
                                                                                int i37 = length - i36;
                                                                                z43 = z69;
                                                                                z44 = z38;
                                                                                if (!z42) {
                                                                                    BitmapFactory.decodeByteArray(bArr4, i36, i37, options);
                                                                                    z43 = z69;
                                                                                    z44 = z38;
                                                                                }
                                                                            }
                                                                            z42 = true;
                                                                            int i362 = bArr4[0] & 255;
                                                                            int i372 = length - i362;
                                                                            z43 = z69;
                                                                            z44 = z38;
                                                                            if (!z42) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        z36 = r83;
                                                                        z37 = z15;
                                                                        z35 = z38;
                                                                        bitmap2 = null;
                                                                        z23 = z36;
                                                                        z22 = z37;
                                                                        z21 = z35;
                                                                        i7 = 1;
                                                                        a8.g(th, !(th instanceof FileNotFoundException));
                                                                        z25 = z23;
                                                                        r14 = z22;
                                                                        z24 = z21;
                                                                        float f15222 = f12;
                                                                        if (this.c.m == i7) {
                                                                        }
                                                                        Thread.interrupted();
                                                                        if (r2.a) {
                                                                        }
                                                                        if (bitmap2 != null) {
                                                                        }
                                                                        str3 = this.c.f;
                                                                        if (str3 == null) {
                                                                        }
                                                                        c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                        return;
                                                                    }
                                                                } else {
                                                                    z41 = z68;
                                                                }
                                                                randomAccessFile3.readFully(bArr4, 0, length);
                                                                randomAccessFile3.close();
                                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr4, 0, length, fwVar);
                                                                boolean z692 = r83 == true ? 1 : 0;
                                                                byte[] o42 = Utilities.o(length, bArr4);
                                                                if (bArr != null) {
                                                                    z42 = false;
                                                                    int i3622 = bArr4[0] & 255;
                                                                    int i3722 = length - i3622;
                                                                    z43 = z692;
                                                                    z44 = z38;
                                                                    if (!z42) {
                                                                    }
                                                                }
                                                                z42 = true;
                                                                int i36222 = bArr4[0] & 255;
                                                                int i37222 = length - i36222;
                                                                z43 = z692;
                                                                z44 = z38;
                                                                if (!z42) {
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                boolean z70 = r83 == true ? 1 : 0;
                                                                z36 = r83;
                                                                z37 = z15;
                                                                z35 = z38;
                                                                bitmap2 = null;
                                                                z23 = z36;
                                                                z22 = z37;
                                                                z21 = z35;
                                                                i7 = 1;
                                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                                z25 = z23;
                                                                r14 = z22;
                                                                z24 = z21;
                                                                float f152222 = f12;
                                                                if (this.c.m == i7) {
                                                                }
                                                                Thread.interrupted();
                                                                if (r2.a) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                str3 = this.c.f;
                                                                if (str3 == null) {
                                                                }
                                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                return;
                                                            }
                                                            bArr4 = null;
                                                            z38 = z41;
                                                            if (bArr4 == null) {
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            z38 = z68;
                                                        }
                                                    } else {
                                                        boolean z71 = z68;
                                                        z43 = r83 == true ? 1 : 0;
                                                        FileInputStream encryptedFileInputStream = z71 ? new EncryptedFileInputStream(file2, this.c.r) : new FileInputStream(file2);
                                                        BitmapFactory.decodeStream(encryptedFileInputStream, null, options);
                                                        encryptedFileInputStream.close();
                                                        z44 = z71;
                                                    }
                                                } else {
                                                    try {
                                                        if (z14) {
                                                            try {
                                                                str2 = str;
                                                                l11 = l10;
                                                                MediaStore.Video.Thumbnails.getThumbnail(t0.b.getContentResolver(), l11.longValue(), 1, options);
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                str2 = str;
                                                                l11 = l10;
                                                                z35 = z68;
                                                                z36 = r83;
                                                                z37 = z15;
                                                                bitmap2 = null;
                                                                z23 = z36;
                                                                z22 = z37;
                                                                z21 = z35;
                                                                i7 = 1;
                                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                                z25 = z23;
                                                                r14 = z22;
                                                                z24 = z21;
                                                                float f1522222 = f12;
                                                                if (this.c.m == i7) {
                                                                }
                                                                Thread.interrupted();
                                                                if (r2.a) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                str3 = this.c.f;
                                                                if (str3 == null) {
                                                                }
                                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                return;
                                                            }
                                                        } else {
                                                            str2 = str;
                                                            l11 = l10;
                                                            MediaStore.Images.Thumbnails.getThumbnail(t0.b.getContentResolver(), l11.longValue(), 1, options);
                                                        }
                                                        z44 = z68;
                                                        z68 = r83 == true ? 1 : 0;
                                                        z43 = z68;
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                }
                                                float f16 = options.outWidth;
                                                float f17 = options.outHeight;
                                                float min6 = (f11 < f12 || f16 <= f17) ? Math.min(f16 / f11, f17 / f12) : Math.max(f16 / f11, f17 / f12);
                                                if (min6 < 1.2f) {
                                                    min6 = 1.0f;
                                                }
                                                options.inJustDecodeBounds = false;
                                                if (min6 <= 1.0f || (f16 <= f11 && f17 <= f12)) {
                                                    options.inSampleSize = (int) min6;
                                                    z40 = z43;
                                                    z39 = z44;
                                                } else {
                                                    int i38 = 1;
                                                    while (true) {
                                                        i16 = i38 * 2;
                                                        if (i38 * 4 >= min6) {
                                                            break;
                                                        } else {
                                                            i38 = i16;
                                                        }
                                                    }
                                                    options.inSampleSize = i16;
                                                    z40 = z43;
                                                    z39 = z44;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                z36 = z68;
                                                z37 = z15;
                                            }
                                        }
                                        z32 = z40;
                                        bitmap2 = null;
                                        z34 = z15;
                                        z33 = z39;
                                    } catch (Throwable th16) {
                                        th = th16;
                                        z38 = z68;
                                        str2 = str;
                                        l11 = l10;
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    z20 = z68;
                                    str2 = str;
                                    l11 = l10;
                                    boolean z72 = r83 == true ? 1 : 0;
                                    bitmap2 = null;
                                    z18 = r83;
                                    z65 = false;
                                    z23 = z18;
                                    z22 = z15;
                                    z21 = z20;
                                    i7 = 1;
                                    a8.g(th, !(th instanceof FileNotFoundException));
                                    z25 = z23;
                                    r14 = z22;
                                    z24 = z21;
                                    float f15222222 = f12;
                                    if (this.c.m == i7) {
                                    }
                                    Thread.interrupted();
                                    if (r2.a) {
                                    }
                                    if (bitmap2 != null) {
                                    }
                                    str3 = this.c.f;
                                    if (str3 == null) {
                                    }
                                    c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                    return;
                                }
                            } else {
                                boolean z73 = z68;
                                str2 = str;
                                l11 = l10;
                                f10 = 0.0f;
                                if (str2 != null) {
                                    try {
                                        options.inJustDecodeBounds = true;
                                        options.inPreferredConfig = z15 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                        fileInputStream2 = new FileInputStream(file2);
                                        bitmap2 = BitmapFactory.decodeStream(fileInputStream2, null, options);
                                    } catch (Throwable th18) {
                                        th = th18;
                                        z16 = z73;
                                        f11 = f10;
                                        f12 = f11;
                                        z19 = z16;
                                        bitmap2 = null;
                                        z17 = z19;
                                        z18 = false;
                                        z20 = z17;
                                        z65 = false;
                                        z23 = z18;
                                        z22 = z15;
                                        z21 = z20;
                                        i7 = 1;
                                        a8.g(th, !(th instanceof FileNotFoundException));
                                        z25 = z23;
                                        r14 = z22;
                                        z24 = z21;
                                        float f152222222 = f12;
                                        if (this.c.m == i7) {
                                        }
                                        Thread.interrupted();
                                        if (r2.a) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        str3 = this.c.f;
                                        if (str3 == null) {
                                        }
                                        c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                        return;
                                    }
                                    try {
                                        fileInputStream2.close();
                                        int i39 = options.outWidth;
                                        int i40 = options.outHeight;
                                        options.inJustDecodeBounds = false;
                                        float min7 = (Math.min(i40, i39) / Math.max(66, Math.min(g0.c1().x, g0.c1().y))) * 6.0f;
                                        if (min7 < 1.0f) {
                                            min7 = 1.0f;
                                        }
                                        if (min7 > 1.0f) {
                                            int i41 = 1;
                                            while (true) {
                                                i15 = i41 * 2;
                                                if (i41 * 4 > min7) {
                                                    break;
                                                } else {
                                                    i41 = i15;
                                                }
                                            }
                                            options.inSampleSize = i15;
                                        } else {
                                            options.inSampleSize = (int) min7;
                                        }
                                        f11 = 0.0f;
                                        f12 = 0.0f;
                                    } catch (Throwable th19) {
                                        th = th19;
                                        f11 = 0.0f;
                                        f12 = 0.0f;
                                        z17 = z73;
                                        z18 = false;
                                        z20 = z17;
                                        z65 = false;
                                        z23 = z18;
                                        z22 = z15;
                                        z21 = z20;
                                        i7 = 1;
                                        a8.g(th, !(th instanceof FileNotFoundException));
                                        z25 = z23;
                                        r14 = z22;
                                        z24 = z21;
                                        float f1522222222 = f12;
                                        if (this.c.m == i7) {
                                        }
                                        Thread.interrupted();
                                        if (r2.a) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        str3 = this.c.f;
                                        if (str3 == null) {
                                        }
                                        c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                        return;
                                    }
                                } else {
                                    f11 = 0.0f;
                                    f12 = 0.0f;
                                    bitmap2 = null;
                                }
                                z32 = false;
                                z65 = false;
                                z34 = z15;
                                z33 = z73;
                            }
                            i7 = 1;
                            z25 = z32;
                            r14 = z34;
                            z24 = z33;
                            float f15222222222 = f12;
                            if (this.c.m == i7) {
                                try {
                                    SystemClock.elapsedRealtime();
                                    ThreadLocal threadLocal2 = gc.I;
                                } catch (Throwable th20) {
                                    th = th20;
                                    z26 = false;
                                }
                                synchronized (this.b) {
                                    try {
                                        if (this.d) {
                                            return;
                                        }
                                        if (fwVar != null) {
                                            RandomAccessFile randomAccessFile4 = new RandomAccessFile(file2, "r");
                                            int length2 = (int) randomAccessFile4.length();
                                            ThreadLocal threadLocal3 = gc.J;
                                            byte[] bArr5 = (byte[]) threadLocal3.get();
                                            if (bArr5 == null || bArr5.length < length2) {
                                                bArr5 = null;
                                            }
                                            if (bArr5 == null) {
                                                bArr5 = new byte[length2];
                                                threadLocal3.set(bArr5);
                                            }
                                            randomAccessFile4.readFully(bArr5, 0, length2);
                                            randomAccessFile4.close();
                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr5, 0, length2, fwVar);
                                            boolean z74 = z25;
                                            f13 = 20.0f;
                                            byte[] o10 = Utilities.o(length2, bArr5);
                                            if (bArr != null && Arrays.equals(o10, bArr)) {
                                                z28 = false;
                                                int i42 = bArr5[0] & 255;
                                                int i43 = length2 - i42;
                                                z27 = z74;
                                                if (!z28) {
                                                    bitmap2 = BitmapFactory.decodeByteArray(bArr5, i42, i43, options);
                                                    z27 = z74;
                                                }
                                            }
                                            z28 = true;
                                            int i422 = bArr5[0] & 255;
                                            int i432 = length2 - i422;
                                            z27 = z74;
                                            if (!z28) {
                                            }
                                        } else {
                                            z27 = z25;
                                            f13 = 20.0f;
                                            FileInputStream encryptedFileInputStream2 = z24 ? new EncryptedFileInputStream(file2, this.c.r) : new FileInputStream(file2);
                                            bitmap2 = BitmapFactory.decodeStream(encryptedFileInputStream2, null, options);
                                            encryptedFileInputStream2.close();
                                        }
                                        if (bitmap2 == null) {
                                            if (file2.length() == 0 || this.c.f == null) {
                                                file2.delete();
                                            }
                                            z26 = false;
                                        } else {
                                            if (this.c.f != null) {
                                                float width = bitmap2.getWidth();
                                                float height = bitmap2.getHeight();
                                                if (f11 != f10 && width != f11 && width > f11 + f13 && bitmap2 != (createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, (int) f11, (int) (height / (width / f11)), true))) {
                                                    bitmap2.recycle();
                                                    bitmap2 = createScaledBitmap;
                                                }
                                            }
                                            if (z65) {
                                                z26 = Utilities.needInvert(bitmap2) != 0;
                                            } else {
                                                z26 = false;
                                            }
                                            try {
                                                if (z27 == 1) {
                                                    if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                        Utilities.blurBitmap(bitmap2, 3);
                                                    }
                                                } else if (z27 != 2) {
                                                    if (z27 != 3) {
                                                        c10 = 4;
                                                        if (z27 == 4) {
                                                        }
                                                    } else {
                                                        c10 = 4;
                                                    }
                                                    if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                        if (z27 == c10) {
                                                            Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), bitmap2.getConfig());
                                                            Canvas canvas = new Canvas(createBitmap);
                                                            canvas.save();
                                                            canvas.scale(1.2f, 1.2f, bitmap2.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f);
                                                            float f18 = f10;
                                                            canvas.drawBitmap(bitmap2, f18, f18, (Paint) null);
                                                            canvas.restore();
                                                            Path path = new Path();
                                                            path.addCircle(bitmap2.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f, Math.min(bitmap2.getWidth(), bitmap2.getHeight()) / 2.0f, Path.Direction.CW);
                                                            canvas.clipPath(path);
                                                            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                                                            bitmap2.recycle();
                                                            bitmap2 = createBitmap;
                                                        }
                                                        Utilities.blurBitmap(bitmap2, 7);
                                                        Utilities.blurBitmap(bitmap2, 7);
                                                        Utilities.blurBitmap(bitmap2, 7);
                                                    }
                                                } else if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                    Utilities.blurBitmap(bitmap2, 1);
                                                }
                                            } catch (Throwable th21) {
                                                th = th21;
                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                i10 = 0;
                                                i11 = 0;
                                                Thread.interrupted();
                                                if (r2.a) {
                                                }
                                                if (bitmap2 != null) {
                                                }
                                                str3 = this.c.f;
                                                if (str3 == null) {
                                                }
                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                return;
                                            }
                                        }
                                        i10 = 0;
                                        i11 = 0;
                                    } finally {
                                    }
                                }
                            } else {
                                boolean z75 = z25;
                                try {
                                    SystemClock.elapsedRealtime();
                                    ThreadLocal threadLocal4 = gc.I;
                                } catch (Throwable th22) {
                                    th = th22;
                                }
                                synchronized (this.b) {
                                    try {
                                        if (this.d) {
                                            return;
                                        }
                                        if (r14 == 0) {
                                            ub ubVar5 = this.c;
                                            if (ubVar5.f != null && !z75 && ubVar5.i.g == null) {
                                                options.inPreferredConfig = Bitmap.Config.RGB_565;
                                                options.inDither = false;
                                                if (l11 != null && str2 == null) {
                                                    if (z14) {
                                                        bitmap2 = MediaStore.Images.Thumbnails.getThumbnail(t0.b.getContentResolver(), l11.longValue(), 1, options);
                                                    } else if (l11.longValue() == 0) {
                                                        try {
                                                            org.telegram.ui.Components.v5 v5Var2 = new org.telegram.ui.Components.v5(file2, true, 0L, 0, null, null, null, 0L, 0, true);
                                                            bitmap2 = v5Var2.q(0L, true);
                                                            v5Var2.u();
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                            file2 = file2;
                                                            z26 = false;
                                                            i13 = 0;
                                                            i35 = 0;
                                                            i12 = i13;
                                                            a8.g(th, !(th instanceof FileNotFoundException));
                                                            i10 = i35;
                                                            i11 = i12;
                                                            Thread.interrupted();
                                                            if (r2.a) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            str3 = this.c.f;
                                                            if (str3 == null) {
                                                            }
                                                            c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                            return;
                                                        }
                                                    } else {
                                                        bitmap2 = MediaStore.Video.Thumbnails.getThumbnail(t0.b.getContentResolver(), l11.longValue(), 1, options);
                                                    }
                                                }
                                                if (bitmap2 != null) {
                                                    if (bitmap2 == null) {
                                                        if (fwVar != null) {
                                                            fileInputStream = new EncryptedFileInputStream(file2, fwVar);
                                                        } else if (z24) {
                                                            fileInputStream = new EncryptedFileInputStream(file2, this.c.r);
                                                        } else {
                                                            try {
                                                                fileInputStream = new FileInputStream(file2);
                                                            } catch (Throwable th24) {
                                                                th = th24;
                                                                z26 = false;
                                                                i13 = 0;
                                                                i35 = 0;
                                                                i12 = i13;
                                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                                i10 = i35;
                                                                i11 = i12;
                                                                Thread.interrupted();
                                                                if (r2.a) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                str3 = this.c.f;
                                                                if (str3 == null) {
                                                                }
                                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                return;
                                                            }
                                                        }
                                                        ub ubVar6 = this.c;
                                                        r82 = ubVar6.i.i instanceof TLRPC.TL_document;
                                                        try {
                                                            if (r82 != 0 || ((str4 = ubVar6.f) != null && str4.contains("exif"))) {
                                                                Pair M0 = g0.M0(fileInputStream);
                                                                r82 = ((Integer) M0.first).intValue();
                                                                try {
                                                                    int intValue = ((Integer) M0.second).intValue();
                                                                    try {
                                                                        if (fwVar == null) {
                                                                            try {
                                                                                if (this.c.r == null) {
                                                                                    bitmap4 = bitmap2;
                                                                                    i35 = intValue;
                                                                                    fileInputStream.getChannel().position(0L);
                                                                                    rect = null;
                                                                                    r82 = r82;
                                                                                    r14 = bitmap4;
                                                                                }
                                                                            } catch (Throwable th25) {
                                                                                th = th25;
                                                                                i35 = intValue;
                                                                                z26 = false;
                                                                                i12 = r82;
                                                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                                                i10 = i35;
                                                                                i11 = i12;
                                                                                Thread.interrupted();
                                                                                if (r2.a) {
                                                                                }
                                                                                if (bitmap2 != null) {
                                                                                }
                                                                                str3 = this.c.f;
                                                                                if (str3 == null) {
                                                                                }
                                                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                                return;
                                                                            }
                                                                        }
                                                                        fileInputStream.close();
                                                                        bitmap4 = r14;
                                                                        if (fwVar != null) {
                                                                            fileInputStream = new EncryptedFileInputStream(file2, fwVar);
                                                                            bitmap4 = r14;
                                                                        } else if (z24) {
                                                                            fileInputStream = new EncryptedFileInputStream(file2, this.c.r);
                                                                            bitmap4 = r14;
                                                                        }
                                                                        rect = null;
                                                                        r82 = r82;
                                                                        r14 = bitmap4;
                                                                    } catch (Throwable th26) {
                                                                        th = th26;
                                                                        bitmap2 = r14;
                                                                        z26 = false;
                                                                        i12 = r82;
                                                                        a8.g(th, !(th instanceof FileNotFoundException));
                                                                        i10 = i35;
                                                                        i11 = i12;
                                                                        Thread.interrupted();
                                                                        if (r2.a) {
                                                                        }
                                                                        if (bitmap2 != null) {
                                                                        }
                                                                        str3 = this.c.f;
                                                                        if (str3 == null) {
                                                                        }
                                                                        c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                        return;
                                                                    }
                                                                    r14 = bitmap2;
                                                                    i35 = intValue;
                                                                } catch (Throwable th27) {
                                                                    th = th27;
                                                                    z26 = false;
                                                                    i13 = r82;
                                                                    i35 = 0;
                                                                    i12 = i13;
                                                                    a8.g(th, !(th instanceof FileNotFoundException));
                                                                    i10 = i35;
                                                                    i11 = i12;
                                                                    Thread.interrupted();
                                                                    if (r2.a) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    str3 = this.c.f;
                                                                    if (str3 == null) {
                                                                    }
                                                                    c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                    return;
                                                                }
                                                            } else {
                                                                r14 = bitmap2;
                                                                r82 = 0;
                                                                rect = null;
                                                                i35 = 0;
                                                            }
                                                            bitmap2 = BitmapFactory.decodeStream(fileInputStream, rect, options);
                                                            try {
                                                                fileInputStream.close();
                                                                r82 = r82;
                                                            } catch (Throwable th28) {
                                                                th = th28;
                                                                z26 = false;
                                                                i12 = r82;
                                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                                i10 = i35;
                                                                i11 = i12;
                                                                Thread.interrupted();
                                                                if (r2.a) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                str3 = this.c.f;
                                                                if (str3 == null) {
                                                                }
                                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                return;
                                                            }
                                                        } catch (Throwable th29) {
                                                            th = th29;
                                                        }
                                                    } else {
                                                        r82 = 0;
                                                        i35 = 0;
                                                    }
                                                    if (bitmap2 != null || (fwVar == null && !z24)) {
                                                        bitmap3 = bitmap2;
                                                        z30 = z13;
                                                    } else {
                                                        try {
                                                            RandomAccessFile randomAccessFile5 = new RandomAccessFile(file2, "r");
                                                            z30 = z13;
                                                            try {
                                                                int length3 = (int) randomAccessFile5.length();
                                                                ThreadLocal threadLocal5 = gc.I;
                                                                byte[] bArr6 = (byte[]) threadLocal5.get();
                                                                if (bArr6 == null || bArr6.length < length3) {
                                                                    bArr6 = null;
                                                                }
                                                                if (bArr6 == null) {
                                                                    bArr6 = new byte[length3];
                                                                    threadLocal5.set(bArr6);
                                                                }
                                                                bitmap3 = null;
                                                                randomAccessFile5.readFully(bArr6, 0, length3);
                                                                randomAccessFile5.close();
                                                                try {
                                                                    if (fwVar != null) {
                                                                        EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, fwVar);
                                                                        bitmap3 = bitmap2;
                                                                        byte[] o11 = Utilities.o(length3, bArr6);
                                                                        if (bArr != null && Arrays.equals(o11, bArr)) {
                                                                            z31 = false;
                                                                            i14 = bArr6[0] & 255;
                                                                            length3 -= i14;
                                                                        }
                                                                        z31 = true;
                                                                        i14 = bArr6[0] & 255;
                                                                        length3 -= i14;
                                                                    } else {
                                                                        bitmap3 = bitmap2;
                                                                        if (z24) {
                                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, this.c.r);
                                                                        }
                                                                        z31 = false;
                                                                        i14 = 0;
                                                                    }
                                                                    if (!z31) {
                                                                        bitmap2 = BitmapFactory.decodeByteArray(bArr6, i14, length3, options);
                                                                        i12 = r82;
                                                                        z29 = z30;
                                                                    }
                                                                } catch (Throwable th30) {
                                                                    th = th30;
                                                                    z30 = z30;
                                                                    try {
                                                                        a8.f(th);
                                                                        bitmap2 = bitmap3;
                                                                        i12 = r82;
                                                                        z29 = z30;
                                                                        if (bitmap2 == null) {
                                                                        }
                                                                        z26 = false;
                                                                    } catch (Throwable th31) {
                                                                        th = th31;
                                                                        bitmap2 = bitmap3;
                                                                        z26 = false;
                                                                        i12 = r82;
                                                                        a8.g(th, !(th instanceof FileNotFoundException));
                                                                        i10 = i35;
                                                                        i11 = i12;
                                                                        Thread.interrupted();
                                                                        if (r2.a) {
                                                                        }
                                                                        if (bitmap2 != null) {
                                                                        }
                                                                        str3 = this.c.f;
                                                                        if (str3 == null) {
                                                                        }
                                                                        c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                        return;
                                                                    }
                                                                    i10 = i35;
                                                                    i11 = i12;
                                                                    Thread.interrupted();
                                                                    if (r2.a) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    str3 = this.c.f;
                                                                    if (str3 == null) {
                                                                    }
                                                                    c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                    return;
                                                                }
                                                            } catch (Throwable th32) {
                                                                th = th32;
                                                                bitmap3 = bitmap2;
                                                                z30 = z30;
                                                            }
                                                        } catch (Throwable th33) {
                                                            th = th33;
                                                            bitmap3 = bitmap2;
                                                            z30 = z13;
                                                        }
                                                    }
                                                    bitmap2 = bitmap3;
                                                    i12 = r82;
                                                    z29 = z30;
                                                } else {
                                                    z29 = z13;
                                                    i12 = 0;
                                                    i35 = 0;
                                                }
                                                if (bitmap2 == null) {
                                                    if (z29 && (file2.length() == 0 || this.c.f == null)) {
                                                        file2.delete();
                                                    }
                                                } else if (this.c.f != null) {
                                                    float width2 = bitmap2.getWidth();
                                                    float height2 = bitmap2.getHeight();
                                                    if (f11 != 0.0f && width2 != f11 && width2 > f11 + 20.0f) {
                                                        if (width2 <= height2 || f11 <= f15222222222) {
                                                            float f19 = height2 / f15222222222;
                                                            if (f19 > 1.0f) {
                                                                createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width2 / f19), (int) f15222222222, true);
                                                                if (bitmap2 != createScaledBitmap2) {
                                                                    bitmap2.recycle();
                                                                    bitmap2 = createScaledBitmap2;
                                                                }
                                                            }
                                                            createScaledBitmap2 = bitmap2;
                                                            if (bitmap2 != createScaledBitmap2) {
                                                            }
                                                        } else {
                                                            float f20 = width2 / f11;
                                                            if (f20 > 1.0f) {
                                                                createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) f11, (int) (height2 / f20), true);
                                                                if (bitmap2 != createScaledBitmap2) {
                                                                }
                                                            }
                                                            createScaledBitmap2 = bitmap2;
                                                            if (bitmap2 != createScaledBitmap2) {
                                                            }
                                                        }
                                                    }
                                                    if (bitmap2 != null) {
                                                        if (z65) {
                                                            Bitmap createScaledBitmap3 = bitmap2.getWidth() * bitmap2.getHeight() > 22500 ? Bitmap.createScaledBitmap(bitmap2, 100, 100, false) : bitmap2;
                                                            boolean z76 = Utilities.needInvert(createScaledBitmap3) != 0;
                                                            if (createScaledBitmap3 != bitmap2) {
                                                                try {
                                                                    createScaledBitmap3.recycle();
                                                                } catch (Throwable th34) {
                                                                    th = th34;
                                                                    z26 = z76;
                                                                    i12 = i12;
                                                                    a8.g(th, !(th instanceof FileNotFoundException));
                                                                    i10 = i35;
                                                                    i11 = i12;
                                                                    Thread.interrupted();
                                                                    if (r2.a) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    str3 = this.c.f;
                                                                    if (str3 == null) {
                                                                    }
                                                                    c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                    return;
                                                                }
                                                            }
                                                            z26 = z76;
                                                        } else {
                                                            z26 = false;
                                                        }
                                                        if (z75 && (height2 > 100.0f || width2 > 100.0f)) {
                                                            try {
                                                                height2 = 80.0f;
                                                                bitmap2 = Bitmap.createScaledBitmap(bitmap2, 80, 80, false);
                                                                width2 = 80.0f;
                                                            } catch (Throwable th35) {
                                                                th = th35;
                                                                i12 = i12;
                                                                a8.g(th, !(th instanceof FileNotFoundException));
                                                                i10 = i35;
                                                                i11 = i12;
                                                                Thread.interrupted();
                                                                if (r2.a) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                str3 = this.c.f;
                                                                if (str3 == null) {
                                                                }
                                                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                                                return;
                                                            }
                                                        }
                                                        if (z75 && height2 < 100.0f && width2 < 100.0f && bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                            Utilities.blurBitmap(bitmap2, 3);
                                                        }
                                                        i10 = i35;
                                                        i11 = i12;
                                                    }
                                                }
                                                z26 = false;
                                                i10 = i35;
                                                i11 = i12;
                                            }
                                        }
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        options.inDither = false;
                                        if (l11 != null) {
                                            if (z14) {
                                            }
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        if (bitmap2 == null) {
                                        }
                                        z26 = false;
                                        i10 = i35;
                                        i11 = i12;
                                    } finally {
                                    }
                                }
                            }
                            Thread.interrupted();
                            if (r2.a && z24) {
                                StringBuilder sb2 = new StringBuilder("Image Loader image is empty = ");
                                sb2.append(bitmap2 != null);
                                sb2.append(" ");
                                sb2.append(file2);
                                a8.d(sb2.toString());
                            }
                            if (bitmap2 != null && !TextUtils.isEmpty(this.c.f) && this.c.f.contains("wallpaper")) {
                                obj2 = this.c.j;
                                if (obj2 instanceof TLRPC.WallPaper) {
                                    bitmap2 = a(bitmap2, (TLRPC.WallPaper) obj2);
                                }
                            }
                            str3 = this.c.f;
                            if ((str3 == null && str3.contains("ignoreOrientation")) || (!z26 && i11 == 0 && i10 == 0)) {
                                c(bitmap2 != null ? new BitmapDrawable(bitmap2) : null);
                                return;
                            } else {
                                c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                                return;
                            }
                        }
                        z11 = true;
                        z12 = false;
                        str = null;
                        l10 = null;
                        z14 = z12;
                        z13 = z11;
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = 1;
                        z15 = this.e.z;
                        str5 = this.c.f;
                        if (str5 == null) {
                        }
                        i7 = 1;
                        z25 = z32;
                        r14 = z34;
                        z24 = z33;
                        float f152222222222 = f12;
                        if (this.c.m == i7) {
                        }
                        Thread.interrupted();
                        if (r2.a) {
                            StringBuilder sb22 = new StringBuilder("Image Loader image is empty = ");
                            sb22.append(bitmap2 != null);
                            sb22.append(" ");
                            sb22.append(file2);
                            a8.d(sb22.toString());
                        }
                        if (bitmap2 != null) {
                            obj2 = this.c.j;
                            if (obj2 instanceof TLRPC.WallPaper) {
                            }
                        }
                        str3 = this.c.f;
                        if (str3 == null) {
                        }
                        c(bitmap2 == null ? new o6(bitmap2, i11, i10) : null);
                        return;
                    }
                    long j3 = hcVar.j;
                    String str15 = ubVar.f;
                    if (str15 != null) {
                        String[] split4 = str15.split("_");
                        if (split4.length >= 2) {
                            float parseFloat5 = Float.parseFloat(split4[0]);
                            float parseFloat6 = Float.parseFloat(split4[1]);
                            if (parseFloat5 <= 90.0f && parseFloat6 <= 90.0f && !this.c.f.contains("nolimit")) {
                                z46 = true;
                                i19 = 0;
                                z53 = false;
                                boolean z77 = false;
                                boolean z78 = false;
                                boolean z79 = false;
                                while (i19 < split4.length) {
                                    boolean z80 = z77;
                                    if ("pcache".equals(split4[i19])) {
                                        z80 = true;
                                    }
                                    if ("firstframe".equals(split4[i19])) {
                                        z53 = true;
                                    }
                                    boolean z81 = z79;
                                    if ("nostream".equals(split4[i19])) {
                                        z81 = true;
                                    }
                                    if ("pframe".equals(split4[i19])) {
                                        z78 = true;
                                    }
                                    i19++;
                                    z77 = z80;
                                    z78 = z78;
                                    z79 = z81;
                                }
                                if (z53) {
                                    z79 = true;
                                }
                                z50 = z53;
                                z47 = z77;
                                z48 = z78;
                                z49 = z79;
                            }
                        }
                        z46 = false;
                        i19 = 0;
                        z53 = false;
                        boolean z772 = false;
                        boolean z782 = false;
                        boolean z792 = false;
                        while (i19 < split4.length) {
                        }
                        if (z53) {
                        }
                        z50 = z53;
                        z47 = z772;
                        z48 = z782;
                        z49 = z792;
                    } else {
                        z46 = false;
                        z47 = false;
                        z48 = false;
                        z49 = false;
                        z50 = false;
                    }
                    if (z48) {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(this.c.p.getAbsolutePath());
                            bitmap5 = mediaMetadataRetriever.getFrameAtTime(2L);
                        } catch (Exception e14) {
                            e = e14;
                            bitmap5 = null;
                        }
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e15) {
                            e = e15;
                            e.printStackTrace();
                            Thread.interrupted();
                            if (bitmap5 != null) {
                            }
                        }
                        Thread.interrupted();
                        if (bitmap5 != null) {
                            c(null);
                            return;
                        } else {
                            c(new BitmapDrawable(bitmap5));
                            return;
                        }
                    }
                    if (!z47 || z50) {
                        fVar = null;
                    } else {
                        bg.f fVar4 = new bg.f(0);
                        String str16 = this.c.f;
                        if (str16 != null && str16.contains("compress")) {
                            fVar4.a = 60;
                        }
                        fVar = fVar4;
                    }
                    if (gc.I(this.c.f) || "g".equals(this.c.f) || "gl".equals(this.c.f)) {
                        TLRPC.Document document = this.c.i.i;
                        if (!(document instanceof TLRPC.TL_documentEncrypted) && !z47) {
                            TLRPC.Document document2 = com.google.android.recaptcha.internal.a.u(document) ? this.c.i.i : null;
                            ub ubVar7 = this.c;
                            long j10 = document2 != null ? ubVar7.k : ubVar7.i.r;
                            int i44 = document2 != null ? 1 : 0;
                            int i45 = this.c.n;
                            int i46 = i45 > 1 ? i45 : i44;
                            ub ubVar8 = this.c;
                            org.telegram.ui.Components.v5 v5Var3 = new org.telegram.ui.Components.v5(ubVar8.p, z50, z49 ? 0L : j10, ubVar8.a, z49 ? null : document2, (document2 != null || z49) ? null : ubVar8.i, ubVar8.j, j3, ubVar8.o, false, 0, 0, fVar, i46, !"gl".equals(ubVar8.f));
                            z51 = z50;
                            boolean z82 = (document2 != null && "video/webm".equals(document2.mime_type)) || ij.O4(document2) || gc.I(this.c.f);
                            v5Var3.n0 = z82;
                            if (z82) {
                                v5Var3.b = false;
                                v5Var3.v0 = true;
                            }
                            v5Var = v5Var3;
                            if (!z51) {
                                v5Var.A(z46);
                                Thread.interrupted();
                                c(v5Var);
                                return;
                            }
                            Bitmap q10 = v5Var.q(0L, false);
                            Thread.interrupted();
                            v5Var.u();
                            if (q10 == null) {
                                c(null);
                                return;
                            } else {
                                c(new BitmapDrawable(q10));
                                return;
                            }
                        }
                    }
                    z51 = z50;
                    String str17 = this.c.f;
                    if (str17 != null) {
                        String[] split5 = str17.split("_");
                        if (split5.length >= 2) {
                            float parseFloat7 = Float.parseFloat(split5[0]);
                            float parseFloat8 = Float.parseFloat(split5[1]);
                            float f21 = g0.p;
                            i18 = (int) (parseFloat8 * f21);
                            i17 = (int) (parseFloat7 * f21);
                            boolean z83 = !z51 || ((str7 = this.c.f) != null && ("d".equals(str7) || this.c.f.contains("_d")));
                            int i47 = (!z49 ? null : this.c.i.i) == null ? 1 : 0;
                            int i48 = this.c.n;
                            int i49 = i48 <= 1 ? i48 : i47;
                            ub ubVar9 = this.c;
                            v5Var = new org.telegram.ui.Components.v5(ubVar9.p, z83, 0L, ubVar9.a, !z49 ? null : ubVar9.i.i, null, null, j3, ubVar9.o, false, i17, i18, fVar, i49, true);
                            TLRPC.Document document3 = this.c.i.i;
                            z52 = !(document3 == null && "video/webm".equals(document3.mime_type)) || ij.O4(this.c.i.i) || gc.I(this.c.f);
                            v5Var.n0 = z52;
                            if (z52) {
                                v5Var.b = false;
                                v5Var.v0 = true;
                            }
                            if (!z51) {
                            }
                        }
                    }
                    i17 = 0;
                    i18 = 0;
                    if (z51) {
                    }
                    if ((!z49 ? null : this.c.i.i) == null) {
                    }
                    int i482 = this.c.n;
                    if (i482 <= 1) {
                    }
                    ub ubVar92 = this.c;
                    v5Var = new org.telegram.ui.Components.v5(ubVar92.p, z83, 0L, ubVar92.a, !z49 ? null : ubVar92.i.i, null, null, j3, ubVar92.o, false, i17, i18, fVar, i49, true);
                    TLRPC.Document document32 = this.c.i.i;
                    if (document32 == null && "video/webm".equals(document32.mime_type)) {
                    }
                    v5Var.n0 = z52;
                    if (z52) {
                    }
                    if (!z51) {
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d();
            synchronized (this.b) {
                this.a = null;
            }
            Thread.interrupted();
        } catch (Throwable th2) {
            synchronized (this.b) {
                this.a = null;
                Thread.interrupted();
                throw th2;
            }
        }
    }
}
