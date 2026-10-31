package org.telegram.messenger;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class cn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:0|1|(1:3)(1:316)|4|(12:5|6|(2:309|310)|8|9|10|11|12|13|14|(3:16|17|18)(1:301)|19)|(1:298)(2:22|(38:24|(1:26)(1:295)|(1:294)(2:29|(34:31|(1:33)(1:291)|(1:290)(2:36|(30:38|(1:40)(1:286)|(1:285)(2:43|(26:45|46|(6:216|217|(2:219|(14:221|222|223|224|225|226|(1:271)(5:230|231|232|233|234)|235|236|(5:240|241|242|243|244)|253|(1:265)(4:257|258|259|260)|261|252))|278|279|252)(1:48)|49|(6:51|(1:53)(1:62)|54|55|(2:57|58)(2:60|61)|59)|63|64|65|66|(20:181|182|(4:186|(1:(1:188))|193|(18:(1:211)(3:197|(4:199|200|201|202)|208)|209|210|135|(1:74)|75|(1:77)|(1:79)|80|(1:82)|(1:84)|86|87|88|89|90|91|92))|212|210|135|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92)(2:68|(16:(1:71)(1:(1:100)(3:101|(1:103)|104))|72|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92)(1:(23:110|111|112|(3:114|115|116)(3:174|175|176)|117|(6:121|(1:(1:123))|127|128|(1:130)(1:170)|(18:132|133|(2:136|137)|135|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|171|(0)|135|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92)))|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:283)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:288)(1:289)|(0)(0)|(0)|285|(0)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:293)|(0)(0)|(0)|290|(0)(0)|(0)(0)|(0)|285|(0)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:297)|(0)(0)|(0)|294|(0)|(0)(0)|(0)|290|(0)(0)|(0)(0)|(0)|285|(0)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(57:0|1|(1:3)(1:316)|4|5|6|(2:309|310)|8|9|10|11|12|13|14|(3:16|17|18)(1:301)|19|(1:298)(2:22|(38:24|(1:26)(1:295)|(1:294)(2:29|(34:31|(1:33)(1:291)|(1:290)(2:36|(30:38|(1:40)(1:286)|(1:285)(2:43|(26:45|46|(6:216|217|(2:219|(14:221|222|223|224|225|226|(1:271)(5:230|231|232|233|234)|235|236|(5:240|241|242|243|244)|253|(1:265)(4:257|258|259|260)|261|252))|278|279|252)(1:48)|49|(6:51|(1:53)(1:62)|54|55|(2:57|58)(2:60|61)|59)|63|64|65|66|(20:181|182|(4:186|(1:(1:188))|193|(18:(1:211)(3:197|(4:199|200|201|202)|208)|209|210|135|(1:74)|75|(1:77)|(1:79)|80|(1:82)|(1:84)|86|87|88|89|90|91|92))|212|210|135|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92)(2:68|(16:(1:71)(1:(1:100)(3:101|(1:103)|104))|72|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92)(1:(23:110|111|112|(3:114|115|116)(3:174|175|176)|117|(6:121|(1:(1:123))|127|128|(1:130)(1:170)|(18:132|133|(2:136|137)|135|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|171|(0)|135|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92)))|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:283)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:288)(1:289)|(0)(0)|(0)|285|(0)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:293)|(0)(0)|(0)|290|(0)(0)|(0)(0)|(0)|285|(0)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92))|(1:297)|(0)(0)|(0)|294|(0)|(0)(0)|(0)|290|(0)(0)|(0)(0)|(0)|285|(0)|284|46|(0)(0)|49|(0)|63|64|65|66|(0)(0)|108|109|(0)|75|(0)|(0)|80|(0)|(0)|86|87|88|89|90|91|92|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x06b9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x06b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x06b5, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0504 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0515 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7 A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4 A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112 A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0273 A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0526 A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0560 A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x057e A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0626 A[Catch: all -> 0x00b3, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x064b A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #13 {all -> 0x00b3, blocks: (B:18:0x00af, B:22:0x00c4, B:26:0x00d7, B:29:0x00e1, B:33:0x00f4, B:36:0x00fe, B:40:0x0112, B:43:0x011c, B:46:0x012e, B:217:0x0136, B:219:0x0144, B:223:0x0151, B:226:0x0160, B:228:0x016a, B:230:0x0175, B:233:0x0185, B:236:0x019a, B:238:0x01a2, B:240:0x01ae, B:243:0x01bd, B:251:0x020d, B:49:0x021b, B:51:0x0273, B:55:0x0283, B:59:0x028f, B:64:0x029b, B:207:0x0382, B:74:0x0526, B:75:0x0547, B:77:0x0560, B:79:0x057e, B:80:0x05a3, B:82:0x0626, B:84:0x064b, B:71:0x0394, B:72:0x03f1, B:100:0x039c, B:101:0x03a8, B:104:0x03b3, B:106:0x040a, B:137:0x0504, B:141:0x050b, B:153:0x051f, B:253:0x01c8, B:255:0x01d0, B:257:0x01dc, B:260:0x01eb, B:150:0x0515), top: B:17:0x00af, inners: #3, #24 }] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.graphics.drawable.Drawable, org.telegram.ui.Components.jb0] */
    /* JADX WARN: Type inference failed for: r28v18, types: [android.graphics.drawable.Drawable, org.telegram.ui.Components.jb0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v28, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v30, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v31, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v32, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v33, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r2v34, types: [org.telegram.ui.ActionBar.c5] */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r37v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v54, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v45, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.graphics.drawable.Drawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        vp vpVar;
        org.telegram.ui.ActionBar.s6 s6Var;
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        String[] strArr;
        SparseIntArray T0;
        int i11;
        Bitmap b10;
        ?? canvas;
        Paint paint;
        int I0;
        int I02;
        int I03;
        int I04;
        int I05;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        String[] strArr2;
        int i26;
        int i27;
        int i28;
        String queryParameter;
        int i29;
        ?? mutate;
        ?? mutate2;
        ?? mutate3;
        int i30;
        int i31;
        ?? r37;
        BitmapFactory.Options options;
        int i32;
        boolean z11;
        boolean z12;
        int i33;
        int i34;
        int i35;
        FileInputStream fileInputStream;
        BitmapFactory.Options options2;
        FileInputStream fileInputStream2;
        int i36;
        int i37;
        Bitmap decodeStream;
        int i38;
        ?? bitmapDrawable;
        vp vpVar2 = (vp) this.b;
        String str4 = (String) this.c;
        File file = (File) this.d;
        org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) this.e;
        org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) this.f;
        String absolutePath = file != null ? file.getAbsolutePath() : null;
        int i39 = org.telegram.ui.ActionBar.t6.a;
        try {
            strArr = new String[1];
            T0 = org.telegram.ui.ActionBar.t6.T0(new File(str4), null, strArr);
            if (r6Var != null) {
                try {
                    org.telegram.ui.ActionBar.t6.H(T0, r6Var.b);
                } catch (Throwable th2) {
                    th = th2;
                    vpVar = vpVar2;
                    s6Var = s6Var2;
                    z10 = true;
                    str = null;
                    f8.g(th, z10);
                    str2 = str;
                    str3 = str2;
                    i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                }
            }
            i11 = org.telegram.ui.ActionBar.t6.hm.get(org.telegram.ui.ActionBar.t6.g5, -1);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            b10 = js.b(560, 678);
            canvas = new Canvas(b10);
            paint = new Paint();
            I0 = org.telegram.ui.ActionBar.t6.I0(T0, org.telegram.ui.ActionBar.t6.s8);
            try {
                I02 = org.telegram.ui.ActionBar.t6.I0(T0, org.telegram.ui.ActionBar.t6.v8);
                int I06 = org.telegram.ui.ActionBar.t6.I0(T0, org.telegram.ui.ActionBar.t6.Ge);
                I03 = org.telegram.ui.ActionBar.t6.I0(T0, org.telegram.ui.ActionBar.t6.Le);
                I04 = org.telegram.ui.ActionBar.t6.I0(T0, org.telegram.ui.ActionBar.t6.ra);
                I05 = org.telegram.ui.ActionBar.t6.I0(T0, org.telegram.ui.ActionBar.t6.ob);
                T0.get(org.telegram.ui.ActionBar.t6.rb);
                i12 = T0.get(org.telegram.ui.ActionBar.t6.Be);
                i13 = T0.get(org.telegram.ui.ActionBar.t6.Ce);
                vpVar = vpVar2;
                try {
                    i10 = T0.get(org.telegram.ui.ActionBar.t6.De);
                    i14 = T0.get(org.telegram.ui.ActionBar.t6.Ee);
                    s6Var = s6Var2;
                    if (r6Var != null) {
                        i15 = I06;
                        i16 = 0;
                        try {
                            i17 = (int) r6Var.j;
                        } catch (Throwable th3) {
                            th = th3;
                            i10 = 0;
                            z10 = true;
                            str = i10;
                            f8.g(th, z10);
                            str2 = str;
                            str3 = str2;
                            i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                        }
                    } else {
                        i15 = I06;
                        i16 = 0;
                        i17 = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    s6Var = s6Var2;
                    i10 = 0;
                    z10 = true;
                    str = i10;
                    f8.g(th, z10);
                    str2 = str;
                    str3 = str2;
                    i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                }
            } catch (Throwable th5) {
                th = th5;
                vpVar = vpVar2;
            }
        } catch (Throwable th6) {
            th = th6;
            vpVar = vpVar2;
            s6Var = s6Var2;
            i10 = 0;
        }
        if (i17 != 0 || r6Var == null) {
            i18 = i17;
        } else {
            i18 = i17;
            if (r6Var.j != 0) {
                i12 = i16;
                i19 = r6Var == null ? (int) r6Var.k : i16;
                if (i19 == 0 || r6Var == null) {
                    i20 = i19;
                } else {
                    i20 = i19;
                    if (r6Var.k != 0) {
                        i13 = i16;
                        i21 = r6Var != null ? (int) r6Var.l : i16;
                        if (i21 == 0 || r6Var == null) {
                            i22 = i21;
                        } else {
                            i22 = i21;
                            if (r6Var.l != 0) {
                                i22 = i16;
                                i23 = r6Var == null ? (int) r6Var.m : i16;
                                if (i23 == 0 || r6Var == null) {
                                    i24 = i23;
                                } else {
                                    i24 = i23;
                                    if (r6Var.m != 0) {
                                        i25 = i16;
                                        if (TextUtils.isEmpty(strArr[i16])) {
                                            strArr2 = strArr;
                                            i27 = i13;
                                            i28 = i22;
                                            i26 = i25;
                                        } else {
                                            try {
                                                queryParameter = Uri.parse(strArr[i16]).getQueryParameter("bg_color");
                                            } catch (Exception e) {
                                                e = e;
                                                strArr2 = strArr;
                                            }
                                            if (r6Var != null) {
                                                if (!TextUtils.isEmpty(queryParameter)) {
                                                    int i40 = i25;
                                                    strArr2 = strArr;
                                                    try {
                                                        int parseInt = Integer.parseInt(queryParameter.substring(i16, 6), 16) | (-16777216);
                                                        try {
                                                            r6Var.j = parseInt;
                                                            if (queryParameter.length() < 13 || !i0.S1(queryParameter.charAt(6))) {
                                                                i29 = parseInt;
                                                            } else {
                                                                int parseInt2 = Integer.parseInt(queryParameter.substring(7, 13), 16) | (-16777216);
                                                                i29 = parseInt;
                                                                try {
                                                                    r6Var.k = parseInt2;
                                                                    i13 = parseInt2;
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                    i13 = parseInt2;
                                                                    i25 = i40;
                                                                    i12 = i29;
                                                                    f8.g(e, true);
                                                                    i26 = i25;
                                                                    i27 = i13;
                                                                    i28 = i22;
                                                                    mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                    org.telegram.ui.ActionBar.t6.C1(I02, mutate);
                                                                    mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
                                                                    Drawable mutate4 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    org.telegram.ui.ActionBar.t6.C1(I03, mutate4);
                                                                    mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
                                                                    i30 = 2;
                                                                    org.telegram.ui.ActionBar.c5[] c5VarArr = new org.telegram.ui.ActionBar.c5[2];
                                                                    i31 = 0;
                                                                    while (i31 < i30) {
                                                                    }
                                                                    r37 = mutate4;
                                                                    ?? r36 = c5VarArr;
                                                                    RectF rectF = new RectF();
                                                                    int i41 = 80;
                                                                    if (absolutePath == null) {
                                                                    }
                                                                    i22 = 120;
                                                                    i35 = 80;
                                                                    z12 = false;
                                                                    if (!z12) {
                                                                    }
                                                                    paint.setColor(I0);
                                                                    canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                                    if (mutate != 0) {
                                                                    }
                                                                    if (mutate2 != 0) {
                                                                    }
                                                                    r36[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                                    r36[1].p(0, 560, 522);
                                                                    r36[1].draw(canvas);
                                                                    r36[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                                    r36[1].p(430, 560, 522);
                                                                    r36[1].draw(canvas);
                                                                    r36[0].setBounds(20, zs.u5, 399, 415);
                                                                    r36[0].p(zs.u5, 560, 522);
                                                                    r36[0].draw(canvas);
                                                                    paint.setColor(i15);
                                                                    canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                                    if (r37 != 0) {
                                                                    }
                                                                    if (mutate3 != 0) {
                                                                    }
                                                                    i10 = 0;
                                                                    i10 = 0;
                                                                    str2 = null;
                                                                    canvas.setBitmap(null);
                                                                    File file2 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                                    b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file2));
                                                                    tz.y();
                                                                    str3 = file2.getAbsolutePath();
                                                                    i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                                }
                                                            }
                                                            try {
                                                                if (queryParameter.length() >= 20 && i0.S1(queryParameter.charAt(13))) {
                                                                    int parseInt3 = Integer.parseInt(queryParameter.substring(14, 20), 16) | (-16777216);
                                                                    try {
                                                                        r6Var.l = parseInt3;
                                                                        i22 = parseInt3;
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        i22 = parseInt3;
                                                                        i25 = i40;
                                                                        i12 = i29;
                                                                        f8.g(e, true);
                                                                        i26 = i25;
                                                                        i27 = i13;
                                                                        i28 = i22;
                                                                        mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I02, mutate);
                                                                        mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
                                                                        Drawable mutate42 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I03, mutate42);
                                                                        mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
                                                                        i30 = 2;
                                                                        org.telegram.ui.ActionBar.c5[] c5VarArr2 = new org.telegram.ui.ActionBar.c5[2];
                                                                        i31 = 0;
                                                                        while (i31 < i30) {
                                                                        }
                                                                        r37 = mutate42;
                                                                        ?? r362 = c5VarArr2;
                                                                        RectF rectF2 = new RectF();
                                                                        int i412 = 80;
                                                                        if (absolutePath == null) {
                                                                        }
                                                                        i22 = 120;
                                                                        i35 = 80;
                                                                        z12 = false;
                                                                        if (!z12) {
                                                                        }
                                                                        paint.setColor(I0);
                                                                        canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                                        if (mutate != 0) {
                                                                        }
                                                                        if (mutate2 != 0) {
                                                                        }
                                                                        r362[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                                        r362[1].p(0, 560, 522);
                                                                        r362[1].draw(canvas);
                                                                        r362[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                                        r362[1].p(430, 560, 522);
                                                                        r362[1].draw(canvas);
                                                                        r362[0].setBounds(20, zs.u5, 399, 415);
                                                                        r362[0].p(zs.u5, 560, 522);
                                                                        r362[0].draw(canvas);
                                                                        paint.setColor(i15);
                                                                        canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                                        if (r37 != 0) {
                                                                        }
                                                                        if (mutate3 != 0) {
                                                                        }
                                                                        i10 = 0;
                                                                        i10 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file22 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                                        b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file22));
                                                                        tz.y();
                                                                        str3 = file22.getAbsolutePath();
                                                                        i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                                    }
                                                                }
                                                                if (queryParameter.length() == 27 && i0.S1(queryParameter.charAt(20))) {
                                                                    i25 = Integer.parseInt(queryParameter.substring(21), 16) | (-16777216);
                                                                    try {
                                                                        r6Var.m = i25;
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        i12 = i29;
                                                                        f8.g(e, true);
                                                                        i26 = i25;
                                                                        i27 = i13;
                                                                        i28 = i22;
                                                                        mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I02, mutate);
                                                                        mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
                                                                        Drawable mutate422 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I03, mutate422);
                                                                        mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
                                                                        i30 = 2;
                                                                        org.telegram.ui.ActionBar.c5[] c5VarArr22 = new org.telegram.ui.ActionBar.c5[2];
                                                                        i31 = 0;
                                                                        while (i31 < i30) {
                                                                        }
                                                                        r37 = mutate422;
                                                                        ?? r3622 = c5VarArr22;
                                                                        RectF rectF22 = new RectF();
                                                                        int i4122 = 80;
                                                                        if (absolutePath == null) {
                                                                        }
                                                                        i22 = 120;
                                                                        i35 = 80;
                                                                        z12 = false;
                                                                        if (!z12) {
                                                                        }
                                                                        paint.setColor(I0);
                                                                        canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                                        if (mutate != 0) {
                                                                        }
                                                                        if (mutate2 != 0) {
                                                                        }
                                                                        r3622[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                                        r3622[1].p(0, 560, 522);
                                                                        r3622[1].draw(canvas);
                                                                        r3622[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                                        r3622[1].p(430, 560, 522);
                                                                        r3622[1].draw(canvas);
                                                                        r3622[0].setBounds(20, zs.u5, 399, 415);
                                                                        r3622[0].p(zs.u5, 560, 522);
                                                                        r3622[0].draw(canvas);
                                                                        paint.setColor(i15);
                                                                        canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                                        if (r37 != 0) {
                                                                        }
                                                                        if (mutate3 != 0) {
                                                                        }
                                                                        i10 = 0;
                                                                        i10 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                                        b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file222));
                                                                        tz.y();
                                                                        str3 = file222.getAbsolutePath();
                                                                        i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                                    }
                                                                } else {
                                                                    i25 = i40;
                                                                }
                                                                i12 = i29;
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            i29 = parseInt;
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        i25 = i40;
                                                    }
                                                    i26 = i25;
                                                    i27 = i13;
                                                    i28 = i22;
                                                }
                                            }
                                            strArr2 = strArr;
                                            i25 = i25;
                                            i26 = i25;
                                            i27 = i13;
                                            i28 = i22;
                                        }
                                        mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                        org.telegram.ui.ActionBar.t6.C1(I02, mutate);
                                        mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                        org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
                                        Drawable mutate4222 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                        org.telegram.ui.ActionBar.t6.C1(I03, mutate4222);
                                        mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                        org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
                                        i30 = 2;
                                        org.telegram.ui.ActionBar.c5[] c5VarArr222 = new org.telegram.ui.ActionBar.c5[2];
                                        i31 = 0;
                                        while (i31 < i30) {
                                            int i42 = i30;
                                            org.telegram.ui.ActionBar.c5[] c5VarArr3 = c5VarArr222;
                                            Drawable drawable = mutate4222;
                                            org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(i31 == 1, T0, 0);
                                            c5VarArr3[i31] = a6Var;
                                            org.telegram.ui.ActionBar.t6.C1(i31 == 0 ? I04 : I05, a6Var);
                                            i31++;
                                            i30 = i42;
                                            c5VarArr222 = c5VarArr3;
                                            mutate4222 = drawable;
                                        }
                                        r37 = mutate4222;
                                        ?? r36222 = c5VarArr222;
                                        RectF rectF222 = new RectF();
                                        int i41222 = 80;
                                        if (absolutePath == null) {
                                            try {
                                                options = new BitmapFactory.Options();
                                                options.inJustDecodeBounds = true;
                                                BitmapFactory.decodeFile(absolutePath, options);
                                                i32 = options.outWidth;
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                            if (i32 > 0 && (i33 = options.outHeight) > 0) {
                                                float min = Math.min(i32 / 560.0f, i33 / 560.0f);
                                                options.inSampleSize = 1;
                                                if (min > 1.0f) {
                                                    do {
                                                        i34 = options.inSampleSize * 2;
                                                        options.inSampleSize = i34;
                                                    } while (i34 < min);
                                                }
                                                Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
                                                options.inPreferredConfig = config2;
                                                options.inJustDecodeBounds = false;
                                                Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                                                if (decodeFile != null) {
                                                    if (i28 == 0 || r6Var == null) {
                                                        Paint paint2 = new Paint();
                                                        paint2.setFilterBitmap(true);
                                                        float min2 = Math.min(decodeFile.getWidth() / 560.0f, decodeFile.getHeight() / 560.0f);
                                                        rectF222.set(0.0f, 0.0f, decodeFile.getWidth() / min2, decodeFile.getHeight() / min2);
                                                        rectF222.offset((b10.getWidth() - rectF222.width()) / 2.0f, (b10.getHeight() - rectF222.height()) / 2.0f);
                                                        canvas.drawBitmap(decodeFile, null, rectF222, paint2);
                                                    } else {
                                                        ?? jb0Var = new jb0(true, i12, i27, i28, i26);
                                                        if (b10.getConfig() != config2) {
                                                            Bitmap copy = b10.copy(config2, false);
                                                            try {
                                                                b10.recycle();
                                                                b10 = copy;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                b10 = copy;
                                                                f8.g(th, true);
                                                                i22 = 120;
                                                                i35 = 80;
                                                                z12 = false;
                                                                if (!z12) {
                                                                }
                                                                paint.setColor(I0);
                                                                canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                                if (mutate != 0) {
                                                                }
                                                                if (mutate2 != 0) {
                                                                }
                                                                r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                                r36222[1].p(0, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                                r36222[1].p(430, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[0].setBounds(20, zs.u5, 399, 415);
                                                                r36222[0].p(zs.u5, 560, 522);
                                                                r36222[0].draw(canvas);
                                                                paint.setColor(i15);
                                                                canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                                if (r37 != 0) {
                                                                }
                                                                if (mutate3 != 0) {
                                                                }
                                                                i10 = 0;
                                                                i10 = 0;
                                                                str2 = null;
                                                                canvas.setBitmap(null);
                                                                File file2222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                                b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file2222));
                                                                tz.y();
                                                                str3 = file2222.getAbsolutePath();
                                                                i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                            }
                                                        }
                                                        jb0Var.s(decodeFile, (int) (r6Var.p * 100.0f));
                                                        jb0Var.setBounds(0, 0, b10.getWidth(), b10.getHeight());
                                                        jb0Var.draw(canvas);
                                                    }
                                                    z11 = true;
                                                    z12 = z11;
                                                    i22 = 120;
                                                    i35 = 80;
                                                    if (!z12) {
                                                        ?? S = org.telegram.ui.ActionBar.t6.S(b10.getWidth(), b10.getHeight() - 120);
                                                        S.setBounds(0, i22, b10.getWidth(), b10.getHeight() - 120);
                                                        S.draw(canvas);
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                        int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
                                                        mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
                                                        mutate.draw(canvas);
                                                    }
                                                    if (mutate2 != 0) {
                                                        int width = (b10.getWidth() - mutate2.getIntrinsicWidth()) - 10;
                                                        int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
                                                        mutate2.setBounds(width, intrinsicHeight2, mutate2.getIntrinsicWidth() + width, mutate2.getIntrinsicHeight() + intrinsicHeight2);
                                                        mutate2.draw(canvas);
                                                    }
                                                    r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                    r36222[1].p(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                    r36222[1].p(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, zs.u5, 399, 415);
                                                    r36222[0].p(zs.u5, 560, 522);
                                                    r36222[0].draw(canvas);
                                                    paint.setColor(i15);
                                                    canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                    if (r37 != 0) {
                                                        int height = (b10.getHeight() - 120) + ((120 - r37.getIntrinsicHeight()) / 2);
                                                        r37.setBounds(22, height, r37.getIntrinsicWidth() + 22, r37.getIntrinsicHeight() + height);
                                                        r37.draw(canvas);
                                                    }
                                                    if (mutate3 != 0) {
                                                        int width2 = (b10.getWidth() - mutate3.getIntrinsicWidth()) - 22;
                                                        int height2 = (b10.getHeight() - 120) + ((120 - mutate3.getIntrinsicHeight()) / 2);
                                                        mutate3.setBounds(width2, height2, mutate3.getIntrinsicWidth() + width2, mutate3.getIntrinsicHeight() + height2);
                                                        mutate3.draw(canvas);
                                                    }
                                                    i10 = 0;
                                                    i10 = 0;
                                                    str2 = null;
                                                    canvas.setBitmap(null);
                                                    File file22222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                    b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file22222));
                                                    tz.y();
                                                    str3 = file22222.getAbsolutePath();
                                                    i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                }
                                            }
                                            z11 = false;
                                            z12 = z11;
                                            i22 = 120;
                                            i35 = 80;
                                            if (!z12) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                            r36222[1].p(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                            r36222[1].p(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, zs.u5, 399, 415);
                                            r36222[0].p(zs.u5, 560, 522);
                                            r36222[0].draw(canvas);
                                            paint.setColor(i15);
                                            canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                            if (r37 != 0) {
                                            }
                                            if (mutate3 != 0) {
                                            }
                                            i10 = 0;
                                            i10 = 0;
                                            str2 = null;
                                            canvas.setBitmap(null);
                                            File file222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                            b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file222222));
                                            tz.y();
                                            str3 = file222222.getAbsolutePath();
                                            i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                        }
                                        int i43 = i12;
                                        if (i43 != 0) {
                                            if (i27 == 0) {
                                                bitmapDrawable = new ColorDrawable(i43);
                                            } else if (i28 != 0) {
                                                bitmapDrawable = new jb0(true, i43, i27, i28, i26);
                                            } else {
                                                int i44 = T0.get(org.telegram.ui.ActionBar.t6.Fe, -1);
                                                if (i44 == -1) {
                                                    i44 = 45;
                                                }
                                                int[] iArr = {i43, i10};
                                                int width3 = b10.getWidth();
                                                int height3 = b10.getHeight() - 120;
                                                GradientDrawable.Orientation d = org.telegram.ui.Components.f9.d(i44);
                                                Resources resources = w0.b.getResources();
                                                Rect e15 = org.telegram.ui.Components.f9.e(d, width3, height3);
                                                Bitmap createBitmap = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                                                Utilities.drawDitheredGradient(createBitmap, iArr, e15.left, e15.top, e15.right, e15.bottom);
                                                i41222 = 90;
                                                bitmapDrawable = new BitmapDrawable(resources, createBitmap);
                                            }
                                            bitmapDrawable.setBounds(0, 120, b10.getWidth(), b10.getHeight() - 120);
                                            bitmapDrawable.draw(canvas);
                                            i22 = 120;
                                            i35 = i41222;
                                            z12 = true;
                                            if (!z12) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                            r36222[1].p(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                            r36222[1].p(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, zs.u5, 399, 415);
                                            r36222[0].p(zs.u5, 560, 522);
                                            r36222[0].draw(canvas);
                                            paint.setColor(i15);
                                            canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                            if (r37 != 0) {
                                            }
                                            if (mutate3 != 0) {
                                            }
                                            i10 = 0;
                                            i10 = 0;
                                            str2 = null;
                                            canvas.setBitmap(null);
                                            File file2222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                            b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file2222222));
                                            tz.y();
                                            str3 = file2222222.getAbsolutePath();
                                            i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                        }
                                        if (i11 >= 0 || !TextUtils.isEmpty(strArr2[0])) {
                                            try {
                                                options2 = new BitmapFactory.Options();
                                                options2.inJustDecodeBounds = true;
                                                i10 = TextUtils.isEmpty(strArr2[0]);
                                                try {
                                                    if (i10 == 0) {
                                                        File h = w0.h();
                                                        StringBuilder sb2 = new StringBuilder();
                                                        i22 = 120;
                                                        sb2.append(Utilities.a(strArr2[0]));
                                                        sb2.append(".wp");
                                                        i10 = new File(h, sb2.toString());
                                                        BitmapFactory.decodeFile(i10.getAbsolutePath(), options2);
                                                        fileInputStream2 = null;
                                                        i10 = i10;
                                                    } else {
                                                        i22 = 120;
                                                        fileInputStream2 = new FileInputStream(str4);
                                                        try {
                                                            fileInputStream2.getChannel().position(i11);
                                                            BitmapFactory.decodeStream(fileInputStream2, null, options2);
                                                            i10 = 0;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            fileInputStream = fileInputStream2;
                                                            i10 = i10;
                                                            z10 = true;
                                                            try {
                                                                f8.g(th, true);
                                                                if (fileInputStream != null) {
                                                                }
                                                                i35 = 80;
                                                                z12 = false;
                                                                if (!z12) {
                                                                }
                                                                paint.setColor(I0);
                                                                canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                                if (mutate != 0) {
                                                                }
                                                                if (mutate2 != 0) {
                                                                }
                                                                r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                                r36222[1].p(0, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                                r36222[1].p(430, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[0].setBounds(20, zs.u5, 399, 415);
                                                                r36222[0].p(zs.u5, 560, 522);
                                                                r36222[0].draw(canvas);
                                                                paint.setColor(i15);
                                                                canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                                if (r37 != 0) {
                                                                }
                                                                if (mutate3 != 0) {
                                                                }
                                                                i10 = 0;
                                                                i10 = 0;
                                                                str2 = null;
                                                                canvas.setBitmap(null);
                                                                File file22222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                                b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file22222222));
                                                                tz.y();
                                                                str3 = file22222222.getAbsolutePath();
                                                                i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    i36 = options2.outWidth;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    fileInputStream = null;
                                                    i10 = i10;
                                                    z10 = true;
                                                    f8.g(th, true);
                                                    if (fileInputStream != null) {
                                                        try {
                                                            fileInputStream.close();
                                                        } catch (Exception e16) {
                                                            f8.g(e16, true);
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            str = null;
                                                            f8.g(th, z10);
                                                            str2 = str;
                                                            str3 = str2;
                                                            i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                        }
                                                    }
                                                    i35 = 80;
                                                    z12 = false;
                                                    if (!z12) {
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                    }
                                                    if (mutate2 != 0) {
                                                    }
                                                    r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                    r36222[1].p(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                    r36222[1].p(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, zs.u5, 399, 415);
                                                    r36222[0].p(zs.u5, 560, 522);
                                                    r36222[0].draw(canvas);
                                                    paint.setColor(i15);
                                                    canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                    if (r37 != 0) {
                                                    }
                                                    if (mutate3 != 0) {
                                                    }
                                                    i10 = 0;
                                                    i10 = 0;
                                                    str2 = null;
                                                    canvas.setBitmap(null);
                                                    File file222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                    b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file222222222));
                                                    tz.y();
                                                    str3 = file222222222.getAbsolutePath();
                                                    i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                i22 = 120;
                                            }
                                            if (i36 > 0 && (i37 = options2.outHeight) > 0) {
                                                float min3 = Math.min(i36 / 560.0f, i37 / 560.0f);
                                                options2.inSampleSize = 1;
                                                if (min3 > 1.0f) {
                                                    do {
                                                        i38 = options2.inSampleSize * 2;
                                                        options2.inSampleSize = i38;
                                                    } while (i38 < min3);
                                                }
                                                options2.inJustDecodeBounds = false;
                                                if (i10 != 0) {
                                                    decodeStream = BitmapFactory.decodeFile(i10.getAbsolutePath(), options2);
                                                } else {
                                                    fileInputStream2.getChannel().position(i11);
                                                    decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                                                }
                                                if (decodeStream != null) {
                                                    i10 = new Paint();
                                                    i10.setFilterBitmap(true);
                                                    float min4 = Math.min(decodeStream.getWidth() / 560.0f, decodeStream.getHeight() / 560.0f);
                                                    rectF222.set(0.0f, 0.0f, decodeStream.getWidth() / min4, decodeStream.getHeight() / min4);
                                                    rectF222.offset((b10.getWidth() - rectF222.width()) / 2.0f, (b10.getHeight() - rectF222.height()) / 2.0f);
                                                    canvas.drawBitmap(decodeStream, null, rectF222, i10);
                                                    z12 = true;
                                                    if (fileInputStream2 != null) {
                                                        try {
                                                            fileInputStream2.close();
                                                        } catch (Exception e17) {
                                                            f8.g(e17, true);
                                                        }
                                                    }
                                                    i35 = 80;
                                                    if (!z12) {
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                    }
                                                    if (mutate2 != 0) {
                                                    }
                                                    r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                                    r36222[1].p(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                                    r36222[1].p(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, zs.u5, 399, 415);
                                                    r36222[0].p(zs.u5, 560, 522);
                                                    r36222[0].draw(canvas);
                                                    paint.setColor(i15);
                                                    canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                                    if (r37 != 0) {
                                                    }
                                                    if (mutate3 != 0) {
                                                    }
                                                    i10 = 0;
                                                    i10 = 0;
                                                    str2 = null;
                                                    canvas.setBitmap(null);
                                                    File file2222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                                    b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file2222222222));
                                                    tz.y();
                                                    str3 = file2222222222.getAbsolutePath();
                                                    i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                                }
                                            }
                                            z12 = false;
                                            if (fileInputStream2 != null) {
                                            }
                                            i35 = 80;
                                            if (!z12) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                            r36222[1].p(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                            r36222[1].p(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, zs.u5, 399, 415);
                                            r36222[0].p(zs.u5, 560, 522);
                                            r36222[0].draw(canvas);
                                            paint.setColor(i15);
                                            canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                            if (r37 != 0) {
                                            }
                                            if (mutate3 != 0) {
                                            }
                                            i10 = 0;
                                            i10 = 0;
                                            str2 = null;
                                            canvas.setBitmap(null);
                                            File file22222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                            b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file22222222222));
                                            tz.y();
                                            str3 = file22222222222.getAbsolutePath();
                                            i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                        }
                                        i22 = 120;
                                        i35 = 80;
                                        z12 = false;
                                        if (!z12) {
                                        }
                                        paint.setColor(I0);
                                        canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                        if (mutate != 0) {
                                        }
                                        if (mutate2 != 0) {
                                        }
                                        r36222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                        r36222[1].p(0, 560, 522);
                                        r36222[1].draw(canvas);
                                        r36222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                        r36222[1].p(430, 560, 522);
                                        r36222[1].draw(canvas);
                                        r36222[0].setBounds(20, zs.u5, 399, 415);
                                        r36222[0].p(zs.u5, 560, 522);
                                        r36222[0].draw(canvas);
                                        paint.setColor(i15);
                                        canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                        if (r37 != 0) {
                                        }
                                        if (mutate3 != 0) {
                                        }
                                        i10 = 0;
                                        i10 = 0;
                                        str2 = null;
                                        canvas.setBitmap(null);
                                        File file222222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                        b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file222222222222));
                                        tz.y();
                                        str3 = file222222222222.getAbsolutePath();
                                        i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                                    }
                                }
                                if (i24 != 0) {
                                    i14 = i24;
                                }
                                i25 = i14;
                                if (TextUtils.isEmpty(strArr[i16])) {
                                }
                                mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                org.telegram.ui.ActionBar.t6.C1(I02, mutate);
                                mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
                                Drawable mutate42222 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                org.telegram.ui.ActionBar.t6.C1(I03, mutate42222);
                                mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
                                i30 = 2;
                                org.telegram.ui.ActionBar.c5[] c5VarArr2222 = new org.telegram.ui.ActionBar.c5[2];
                                i31 = 0;
                                while (i31 < i30) {
                                }
                                r37 = mutate42222;
                                ?? r362222 = c5VarArr2222;
                                RectF rectF2222 = new RectF();
                                int i412222 = 80;
                                if (absolutePath == null) {
                                }
                                i22 = 120;
                                i35 = 80;
                                z12 = false;
                                if (!z12) {
                                }
                                paint.setColor(I0);
                                canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                                if (mutate != 0) {
                                }
                                if (mutate2 != 0) {
                                }
                                r362222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                                r362222[1].p(0, 560, 522);
                                r362222[1].draw(canvas);
                                r362222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                                r362222[1].p(430, 560, 522);
                                r362222[1].draw(canvas);
                                r362222[0].setBounds(20, zs.u5, 399, 415);
                                r362222[0].p(zs.u5, 560, 522);
                                r362222[0].draw(canvas);
                                paint.setColor(i15);
                                canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                                if (r37 != 0) {
                                }
                                if (mutate3 != 0) {
                                }
                                i10 = 0;
                                i10 = 0;
                                str2 = null;
                                canvas.setBitmap(null);
                                File file2222222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                                b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file2222222222222));
                                tz.y();
                                str3 = file2222222222222.getAbsolutePath();
                                i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                            }
                        }
                        if (i22 == 0) {
                            i22 = i10;
                        }
                        if (r6Var == null) {
                        }
                        if (i23 == 0) {
                        }
                        i24 = i23;
                        if (i24 != 0) {
                        }
                        i25 = i14;
                        if (TextUtils.isEmpty(strArr[i16])) {
                        }
                        mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                        org.telegram.ui.ActionBar.t6.C1(I02, mutate);
                        mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                        org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
                        Drawable mutate422222 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                        org.telegram.ui.ActionBar.t6.C1(I03, mutate422222);
                        mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                        org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
                        i30 = 2;
                        org.telegram.ui.ActionBar.c5[] c5VarArr22222 = new org.telegram.ui.ActionBar.c5[2];
                        i31 = 0;
                        while (i31 < i30) {
                        }
                        r37 = mutate422222;
                        ?? r3622222 = c5VarArr22222;
                        RectF rectF22222 = new RectF();
                        int i4122222 = 80;
                        if (absolutePath == null) {
                        }
                        i22 = 120;
                        i35 = 80;
                        z12 = false;
                        if (!z12) {
                        }
                        paint.setColor(I0);
                        canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                        if (mutate != 0) {
                        }
                        if (mutate2 != 0) {
                        }
                        r3622222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                        r3622222[1].p(0, 560, 522);
                        r3622222[1].draw(canvas);
                        r3622222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                        r3622222[1].p(430, 560, 522);
                        r3622222[1].draw(canvas);
                        r3622222[0].setBounds(20, zs.u5, 399, 415);
                        r3622222[0].p(zs.u5, 560, 522);
                        r3622222[0].draw(canvas);
                        paint.setColor(i15);
                        canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                        if (r37 != 0) {
                        }
                        if (mutate3 != 0) {
                        }
                        i10 = 0;
                        i10 = 0;
                        str2 = null;
                        canvas.setBitmap(null);
                        File file22222222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                        b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file22222222222222));
                        tz.y();
                        str3 = file22222222222222.getAbsolutePath();
                        i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
                    }
                }
                if (i20 != 0) {
                    i13 = i20;
                }
                if (r6Var != null) {
                }
                if (i21 == 0) {
                }
                i22 = i21;
                if (i22 == 0) {
                }
                if (r6Var == null) {
                }
                if (i23 == 0) {
                }
                i24 = i23;
                if (i24 != 0) {
                }
                i25 = i14;
                if (TextUtils.isEmpty(strArr[i16])) {
                }
                mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                org.telegram.ui.ActionBar.t6.C1(I02, mutate);
                mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
                Drawable mutate4222222 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                org.telegram.ui.ActionBar.t6.C1(I03, mutate4222222);
                mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
                i30 = 2;
                org.telegram.ui.ActionBar.c5[] c5VarArr222222 = new org.telegram.ui.ActionBar.c5[2];
                i31 = 0;
                while (i31 < i30) {
                }
                r37 = mutate4222222;
                ?? r36222222 = c5VarArr222222;
                RectF rectF222222 = new RectF();
                int i41222222 = 80;
                if (absolutePath == null) {
                }
                i22 = 120;
                i35 = 80;
                z12 = false;
                if (!z12) {
                }
                paint.setColor(I0);
                canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
                if (mutate != 0) {
                }
                if (mutate2 != 0) {
                }
                r36222222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
                r36222222[1].p(0, 560, 522);
                r36222222[1].draw(canvas);
                r36222222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
                r36222222[1].p(430, 560, 522);
                r36222222[1].draw(canvas);
                r36222222[0].setBounds(20, zs.u5, 399, 415);
                r36222222[0].p(zs.u5, 560, 522);
                r36222222[0].draw(canvas);
                paint.setColor(i15);
                canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
                if (r37 != 0) {
                }
                if (mutate3 != 0) {
                }
                i10 = 0;
                i10 = 0;
                str2 = null;
                canvas.setBitmap(null);
                File file222222222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
                b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file222222222222222));
                tz.y();
                str3 = file222222222222222.getAbsolutePath();
                i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
            }
        }
        if (i18 != 0) {
            i12 = i18;
        }
        if (r6Var == null) {
        }
        if (i19 == 0) {
        }
        i20 = i19;
        if (i20 != 0) {
        }
        if (r6Var != null) {
        }
        if (i21 == 0) {
        }
        i22 = i21;
        if (i22 == 0) {
        }
        if (r6Var == null) {
        }
        if (i23 == 0) {
        }
        i24 = i23;
        if (i24 != 0) {
        }
        i25 = i14;
        if (TextUtils.isEmpty(strArr[i16])) {
        }
        mutate = w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.t6.C1(I02, mutate);
        mutate2 = w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
        Drawable mutate42222222 = w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.t6.C1(I03, mutate42222222);
        mutate3 = w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.t6.C1(I03, mutate3);
        i30 = 2;
        org.telegram.ui.ActionBar.c5[] c5VarArr2222222 = new org.telegram.ui.ActionBar.c5[2];
        i31 = 0;
        while (i31 < i30) {
        }
        r37 = mutate42222222;
        ?? r362222222 = c5VarArr2222222;
        RectF rectF2222222 = new RectF();
        int i412222222 = 80;
        if (absolutePath == null) {
        }
        i22 = 120;
        i35 = 80;
        z12 = false;
        if (!z12) {
        }
        paint.setColor(I0);
        canvas.drawRect(0.0f, 0.0f, b10.getWidth(), 120.0f, paint);
        if (mutate != 0) {
        }
        if (mutate2 != 0) {
        }
        r362222222[1].setBounds(zs.r2, zs.t3, b10.getWidth() - 20, zs.f5);
        r362222222[1].p(0, 560, 522);
        r362222222[1].draw(canvas);
        r362222222[1].setBounds(zs.r2, 430, b10.getWidth() - 20, 522);
        r362222222[1].p(430, 560, 522);
        r362222222[1].draw(canvas);
        r362222222[0].setBounds(20, zs.u5, 399, 415);
        r362222222[0].p(zs.u5, 560, 522);
        r362222222[0].draw(canvas);
        paint.setColor(i15);
        canvas.drawRect(0.0f, b10.getHeight() - 120, b10.getWidth(), b10.getHeight(), paint);
        if (r37 != 0) {
        }
        if (mutate3 != 0) {
        }
        i10 = 0;
        i10 = 0;
        str2 = null;
        canvas.setBitmap(null);
        File file2222222222222222 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpg");
        b10.compress(Bitmap.CompressFormat.JPEG, i35, new FileOutputStream(file2222222222222222));
        tz.y();
        str3 = file2222222222222222.getAbsolutePath();
        i0.g3(new cn(vpVar, str3, str4, r6Var, s6Var, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05a0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        boolean z10;
        int i10;
        org.telegram.ui.Components.s5 s5Var;
        boolean z11 = true;
        int i11 = 0;
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                gp gpVar = (gp) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null && Q.getParentActivity() != null) {
                    kg.q0 q0Var = new kg.q0(11, vpVar.currentAccount, Q.getParentActivity(), Q, null);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    q0Var.C1(chat, arrayList, null, null, null);
                    q0Var.show();
                }
                gpVar.a(tL_error);
                break;
            case 1:
                g4 g4Var = (g4) this.b;
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.ap apVar = (org.telegram.ui.Components.ap) this.f;
                i2.w1 w1Var = g4Var.f;
                w1Var.e = tl_chatThemes.next_offset;
                w1Var.a = tl_chatThemes.hash;
                w1Var.b = System.currentTimeMillis();
                ArrayList arrayList4 = (ArrayList) w1Var.d;
                if (arrayList4 == null) {
                    w1Var.d = new ArrayList(arrayList2);
                } else {
                    arrayList4.addAll(arrayList2);
                }
                if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
                    w1Var.c = true;
                }
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
                    HashMap hashMap = g4Var.e;
                    yf.b bVar = y3Var.c;
                    if (bVar == null) {
                        str = null;
                    } else {
                        str = bVar.b;
                        if (str == null) {
                            str = bVar.a;
                        }
                    }
                    hashMap.put(str, y3Var);
                }
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) obj2;
                    g4Var.t(o5.o(tL_chatThemeUniqueGift.gift.theme_peer), tL_chatThemeUniqueGift.gift.slug);
                }
                apVar.onComplete(null);
                break;
            case 2:
                a7 a7Var = (a7) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_getFactCheck tL_getFactCheck = (TLRPC.TL_getFactCheck) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                ArrayList arrayList6 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList7 = ((Vector) tLObject).objects;
                    for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                        if (arrayList7.get(i14) instanceof TLRPC.TL_factCheck) {
                            arrayList6.add((TLRPC.TL_factCheck) arrayList7.get(i14));
                        }
                    }
                }
                HashMap hashMap3 = new HashMap();
                for (int i15 = 0; i15 < Math.min(tL_getFactCheck.msg_id.size(), arrayList6.size()); i15++) {
                    Integer num = tL_getFactCheck.msg_id.get(i15);
                    num.getClass();
                    hashMap3.put(num, (TLRPC.TL_factCheck) arrayList6.get(i15));
                }
                int i16 = 0;
                for (int i17 = 0; i17 < tL_getFactCheck.msg_id.size(); i17++) {
                    z6 z6Var = (z6) arrayList5.get(i17);
                    Integer num2 = tL_getFactCheck.msg_id.get(i17);
                    num2.getClass();
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap3.get(num2);
                    q20 q20Var = (q20) hashMap2.get(z6Var);
                    if (tL_factCheck != null && !tL_factCheck.need_check && q20Var != null) {
                        q20Var.a(tL_factCheck);
                        i16++;
                        a7Var.d.remove(z6Var);
                    }
                }
                if (i16 > 0) {
                    zs.f(a7Var.a).k(zs.B3, new Object[0]);
                    break;
                }
                break;
            case 3:
                vb vbVar = (vb) this.b;
                Drawable drawable = (Drawable) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                String str2 = (String) this.f;
                if (drawable instanceof org.telegram.ui.Components.s5) {
                    org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) drawable;
                    if (!s5Var2.n0) {
                        int i18 = 0;
                        boolean z12 = false;
                        while (i18 < arrayList8.size()) {
                            ImageReceiver imageReceiver = (ImageReceiver) arrayList8.get(i18);
                            if (i18 == 0) {
                                s5Var = s5Var2;
                                z10 = z11;
                                i10 = i11;
                            } else {
                                AnimatedFileDrawableStream animatedFileDrawableStream = s5Var2.u0;
                                if (animatedFileDrawableStream != null) {
                                    File file = s5Var2.G;
                                    long j10 = s5Var2.H;
                                    z10 = z11;
                                    int i19 = s5Var2.I;
                                    i10 = i11;
                                    TLRPC.Document document = animatedFileDrawableStream.c;
                                    ic icVar = animatedFileDrawableStream.d;
                                    long j11 = s5Var2.M;
                                    int i20 = s5Var2.J;
                                    AnimatedFileDrawableStream animatedFileDrawableStream2 = s5Var2.u0;
                                    s5Var = new org.telegram.ui.Components.s5(file, false, j10, i19, document, icVar, document, j11, i20, (animatedFileDrawableStream2 == null || !animatedFileDrawableStream2.w) ? i10 : z10 ? 1 : 0);
                                } else {
                                    z10 = z11;
                                    i10 = i11;
                                    s5Var = new org.telegram.ui.Components.s5(s5Var2.G, false, s5Var2.H, s5Var2.I, s5Var2.o0, null, null, s5Var2.M, s5Var2.J, false);
                                }
                                int[] iArr = s5Var.d;
                                int[] iArr2 = s5Var2.d;
                                iArr[i10] = iArr2[i10];
                                iArr[z10 ? 1 : 0] = iArr2[z10 ? 1 : 0];
                            }
                            if (imageReceiver.x0(s5Var, vbVar.d, vbVar.m, false, ((Integer) arrayList9.get(i18)).intValue())) {
                                if (s5Var == s5Var2) {
                                    z12 = z10;
                                }
                            } else if (s5Var != s5Var2) {
                                s5Var.u();
                            }
                            i18++;
                            z11 = z10;
                            i11 = i10;
                        }
                        if (!z12) {
                            s5Var2.u();
                        }
                        if (str2 == null) {
                            vbVar.A.p(str2);
                            break;
                        }
                    }
                }
                for (int i21 = 0; i21 < arrayList8.size(); i21++) {
                    ((ImageReceiver) arrayList8.get(i21)).x0(drawable, vbVar.d, ((Integer) vbVar.z.get(i21)).intValue(), false, ((Integer) arrayList9.get(i21)).intValue());
                }
                if (str2 == null) {
                }
                break;
            case 4:
                gc gcVar = (gc) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                gcVar.a();
                fc fcVar = gcVar.c;
                if (fcVar.b != null) {
                    StringBuilder i22 = sc.e.i(str3, "@");
                    i22.append(fcVar.b);
                    str3 = i22.toString();
                }
                String str4 = str3;
                while (i11 < arrayList10.size()) {
                    ((ImageReceiver) arrayList10.get(i11)).x0(bitmapDrawable, str4, 0, false, ((Integer) arrayList11.get(i11)).intValue());
                    i11++;
                }
                if (!str4.contains("nocache")) {
                    gcVar.d.c.l(str4, bitmapDrawable);
                    break;
                }
                break;
            case 5:
                MediaController mediaController = (MediaController) this.b;
                File file2 = (File) this.c;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.d;
                byte[] bArr = (byte[]) this.e;
                pi piVar = (pi) this.f;
                String[] strArr = MediaController.U1;
                if (!file2.exists()) {
                    boolean z13 = v2.a;
                    f8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.j1 + " writedFrames" + mediaController.k1), true);
                }
                tL_document.date = ConnectionsManager.getInstance(mediaController.g1).getCurrentTime();
                tL_document.size = (int) file2.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                if (bArr == null) {
                    short[] sArr = mediaController.t1;
                    bArr = mediaController.getWaveform2(sArr, sArr.length);
                }
                tL_documentAttributeAudio.waveform = bArr;
                if (bArr != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController.j1 / 1000.0d;
                tL_document.attributes.clear();
                tL_document.attributes.add(tL_documentAttributeAudio);
                zs.f(mediaController.g1).k(zs.o2, new Object[0]);
                zs.f(mediaController.g1).k(zs.s2, Integer.valueOf(mediaController.f1), tL_document, file2.getAbsolutePath(), Boolean.TRUE, Float.valueOf(piVar.h), Float.valueOf(piVar.i));
                break;
            case 6:
                vp vpVar2 = (vp) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) this.e;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.f;
                HashMap hashMap4 = vpVar2.P2;
                if (str5 == null) {
                    hashMap4.remove(str6);
                    break;
                } else {
                    hashMap4.put(str5, r6Var != null ? r6Var : s6Var);
                    if (r6Var == null) {
                        s6Var.I = str6;
                        s6Var.H = str5;
                    } else {
                        r6Var.v = str6;
                        r6Var.u = str5;
                    }
                    vpVar2.getFileLoader().i0(false, 67108864, str6, true);
                    vpVar2.getFileLoader().i0(false, 16777216, str5, true);
                    break;
                }
            case 7:
                vp vpVar3 = (vp) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.e;
                a0.h hVar2 = (a0.h) this.f;
                vpVar3.getMessagesStorage().m1(updates_difference.users, updates_difference.chats, true, false);
                if (!arrayList12.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i23 = 0; i23 < arrayList12.size(); i23++) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) arrayList12.get(i23);
                        long[] a2 = vpVar3.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                        if (a2 != null) {
                            sparseArray.put(tL_updateMessageID.id, a2);
                        }
                    }
                    if (sparseArray.size() != 0) {
                        i0.g3(new tl(vpVar3, sparseArray, i11));
                    }
                }
                Utilities.d.c(new ul(vpVar3, updates_difference, hVar, hVar2, 0));
                break;
            case 8:
                vp vpVar4 = (vp) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                Long l4 = (Long) this.d;
                q20 q20Var2 = (q20) this.e;
                if (tL_error2 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    vpVar4.V3(tL_channels_channelParticipants.users, false);
                    vpVar4.P3(tL_channels_channelParticipants.chats, false);
                    vpVar4.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                    hs messagesStorage = vpVar4.getMessagesStorage();
                    messagesStorage.a.c(new tr(messagesStorage, l4.longValue(), tL_channels_channelParticipants.participants, 2));
                    vpVar4.v1.add(l4);
                }
                vpVar4.u1.remove(l4);
                if (q20Var2 != null) {
                    q20Var2.a(tLObject2 instanceof TLRPC.TL_channels_channelParticipants ? (TLRPC.TL_channels_channelParticipants) tLObject2 : null);
                    break;
                }
                break;
            case 9:
                vp vpVar5 = (vp) this.b;
                TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                a0.h hVar5 = (a0.h) this.f;
                vpVar5.V3(tL_messages_messageViews.users, false);
                vpVar5.P3(tL_messages_messageViews.chats, false);
                vpVar5.getNotificationCenter().k(77, hVar3, hVar4, hVar5, Boolean.FALSE);
                break;
            case 10:
                a();
                break;
            case 11:
                ((hs) this.b).U1(null, (LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (a0.h) this.e, (LongSparseIntArray) this.f);
                break;
            case 12:
                ((n20) this.b).a((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f);
                break;
            case 13:
                hs hsVar = (hs) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                ArrayList arrayList15 = (ArrayList) this.e;
                a0.h hVar6 = (a0.h) this.f;
                hsVar.getMessagesController().V3(arrayList13, true);
                hsVar.getMessagesController().P3(arrayList14, true);
                hsVar.getMessagesController().S3(arrayList15);
                while (i11 < hVar6.m()) {
                    long j12 = hVar6.j(i11);
                    ds dsVar = (ds) hVar6.n(i11);
                    if (hsVar.getMessagesController().s2(j12) || hsVar.u0(8, j12) || hsVar.getMessagesController().y2(j12)) {
                        vp messagesController = hsVar.getMessagesController();
                        hs messagesStorage2 = messagesController.getMessagesStorage();
                        vl vlVar = new vl(messagesController, j12);
                        r5 r5Var = messagesStorage2.a;
                        d4 d4Var = new d4(messagesStorage2, j12, vlVar, 5);
                        j12 = j12;
                        r5Var.c(d4Var);
                    }
                    vp messagesController2 = hsVar.getMessagesController();
                    int i24 = dsVar.a;
                    messagesController2.h3(j12, i24, i24, dsVar.b, false, 0L, dsVar.c, true, 0);
                    i11++;
                }
                break;
            case 14:
                ot.f((ot) this.b, (ArrayList) this.c, (a0.h) this.d, (ArrayList) this.e, (Collection) this.f);
                break;
            case 15:
                qz qzVar = (qz) this.b;
                lz lzVar = (lz) this.c;
                HashMap hashMap5 = (HashMap) this.d;
                String str7 = (String) this.e;
                lw0 lw0Var = (lw0) this.f;
                if (((jz) lzVar.d.get(0)).f != null) {
                    lzVar.b();
                } else {
                    qzVar.E.putAll(hashMap5);
                    qzVar.F.put(str7, lzVar);
                    qz qzVar2 = lzVar.o;
                    qzVar2.getNotificationCenter().k(zs.w1, lzVar.e);
                    lzVar.l = SystemClock.elapsedRealtime();
                    ArrayList arrayList16 = lzVar.d;
                    int size3 = arrayList16.size();
                    for (int i25 = 0; i25 < size3; i25++) {
                        qzVar2.getFileLoader().i0(false, 67108864, ((jz) arrayList16.get(i25)).a, true);
                    }
                    qzVar.getNotificationCenter().k(zs.v1, str7);
                    lw0Var.a(str7);
                }
                try {
                    w0.b.startService(new Intent(w0.b, (Class<?>) ImportingService.class));
                    break;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
            case 16:
                qz qzVar3 = (qz) this.b;
                cz czVar = (cz) this.c;
                File file3 = (File) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                jj jjVar = (jj) this.f;
                czVar.l = null;
                czVar.m.k.attachPath = file3.toString();
                if (!document2.thumbs.isEmpty()) {
                    TLRPC.PhotoSize photoSize = document2.thumbs.get(0);
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        czVar.g = photoSize;
                        czVar.h = document2;
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                arrayList17.add(jjVar.k);
                qzVar3.getMessagesStorage().j1(arrayList17, false, true, false, 0, false, jjVar.p1 ? 1 : 0, 0L);
                czVar.p = true;
                qzVar3.M(czVar, -1);
                qzVar3.getNotificationCenter().k(48, czVar.m.k);
                break;
            case 17:
                qz qzVar4 = (qz) this.b;
                File file4 = (File) this.c;
                i0.g3(new ek(qzVar4, qzVar4.A(file4.toString(), null, false), (jj) this.d, file4, (cz) this.e, (String) this.f));
                break;
            default:
                t10 t10Var = (t10) this.b;
                jj jjVar2 = (jj) this.c;
                String str8 = (String) this.d;
                c3.s sVar = (c3.s) this.e;
                bi.i6 i6Var = (bi.i6) this.f;
                jjVar2.k.originalLanguage = str8;
                t10Var.getMessagesStorage().X1(sVar.a, jjVar2.k);
                t10Var.K.remove(sVar);
                i6Var.a(str8);
                break;
        }
    }

    public /* synthetic */ cn(vp vpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l4, q20 q20Var) {
        this.a = 8;
        this.b = vpVar;
        this.f = tL_error;
        this.c = tLObject;
        this.d = l4;
        this.e = q20Var;
    }
}
