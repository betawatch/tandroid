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
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class mn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
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
    
        org.telegram.messenger.a8.g(r0, true);
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
    /* JADX WARN: Type inference failed for: r1v16, types: [android.graphics.drawable.Drawable, org.telegram.ui.Components.qa0] */
    /* JADX WARN: Type inference failed for: r28v18, types: [android.graphics.drawable.Drawable, org.telegram.ui.Components.qa0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v28, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v30, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v31, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v32, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v33, types: [org.telegram.ui.ActionBar.t4] */
    /* JADX WARN: Type inference failed for: r2v34, types: [org.telegram.ui.ActionBar.t4] */
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
        qp qpVar;
        org.telegram.ui.ActionBar.j6 j6Var;
        int i7;
        boolean z9;
        String str;
        String str2;
        String str3;
        String[] strArr;
        SparseIntArray T0;
        int i10;
        Bitmap c10;
        ?? canvas;
        Paint paint;
        int I0;
        int I02;
        int I03;
        int I04;
        int I05;
        int i11;
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
        String[] strArr2;
        int i25;
        int i26;
        int i27;
        String queryParameter;
        int i28;
        ?? mutate;
        ?? mutate2;
        ?? mutate3;
        int i29;
        int i30;
        ?? r37;
        BitmapFactory.Options options;
        int i31;
        boolean z10;
        boolean z11;
        int i32;
        int i33;
        int i34;
        FileInputStream fileInputStream;
        BitmapFactory.Options options2;
        FileInputStream fileInputStream2;
        int i35;
        int i36;
        Bitmap decodeStream;
        int i37;
        ?? bitmapDrawable;
        qp qpVar2 = (qp) this.b;
        String str4 = (String) this.c;
        File file = (File) this.d;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.e;
        org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) this.f;
        String absolutePath = file != null ? file.getAbsolutePath() : null;
        int i38 = org.telegram.ui.ActionBar.k6.a;
        try {
            strArr = new String[1];
            T0 = org.telegram.ui.ActionBar.k6.T0(new File(str4), null, strArr);
            if (h6Var != null) {
                try {
                    org.telegram.ui.ActionBar.k6.H(T0, h6Var.b);
                } catch (Throwable th2) {
                    th = th2;
                    qpVar = qpVar2;
                    j6Var = j6Var2;
                    z9 = true;
                    str = null;
                    a8.g(th, z9);
                    str2 = str;
                    str3 = str2;
                    g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                }
            }
            i10 = org.telegram.ui.ActionBar.k6.hm.get(org.telegram.ui.ActionBar.k6.g5, -1);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            c10 = as.c(560, 678);
            canvas = new Canvas(c10);
            paint = new Paint();
            I0 = org.telegram.ui.ActionBar.k6.I0(T0, org.telegram.ui.ActionBar.k6.s8);
            try {
                I02 = org.telegram.ui.ActionBar.k6.I0(T0, org.telegram.ui.ActionBar.k6.v8);
                int I06 = org.telegram.ui.ActionBar.k6.I0(T0, org.telegram.ui.ActionBar.k6.Ge);
                I03 = org.telegram.ui.ActionBar.k6.I0(T0, org.telegram.ui.ActionBar.k6.Le);
                I04 = org.telegram.ui.ActionBar.k6.I0(T0, org.telegram.ui.ActionBar.k6.ra);
                I05 = org.telegram.ui.ActionBar.k6.I0(T0, org.telegram.ui.ActionBar.k6.ob);
                T0.get(org.telegram.ui.ActionBar.k6.rb);
                i11 = T0.get(org.telegram.ui.ActionBar.k6.Be);
                i12 = T0.get(org.telegram.ui.ActionBar.k6.Ce);
                qpVar = qpVar2;
                try {
                    i7 = T0.get(org.telegram.ui.ActionBar.k6.De);
                    i13 = T0.get(org.telegram.ui.ActionBar.k6.Ee);
                    j6Var = j6Var2;
                    if (h6Var != null) {
                        i14 = I06;
                        i15 = 0;
                        try {
                            i16 = (int) h6Var.j;
                        } catch (Throwable th3) {
                            th = th3;
                            i7 = 0;
                            z9 = true;
                            str = i7;
                            a8.g(th, z9);
                            str2 = str;
                            str3 = str2;
                            g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                        }
                    } else {
                        i14 = I06;
                        i15 = 0;
                        i16 = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j6Var = j6Var2;
                    i7 = 0;
                    z9 = true;
                    str = i7;
                    a8.g(th, z9);
                    str2 = str;
                    str3 = str2;
                    g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                }
            } catch (Throwable th5) {
                th = th5;
                qpVar = qpVar2;
            }
        } catch (Throwable th6) {
            th = th6;
            qpVar = qpVar2;
            j6Var = j6Var2;
            i7 = 0;
        }
        if (i16 != 0 || h6Var == null) {
            i17 = i16;
        } else {
            i17 = i16;
            if (h6Var.j != 0) {
                i11 = i15;
                i18 = h6Var == null ? (int) h6Var.k : i15;
                if (i18 == 0 || h6Var == null) {
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (h6Var.k != 0) {
                        i12 = i15;
                        i20 = h6Var != null ? (int) h6Var.l : i15;
                        if (i20 == 0 || h6Var == null) {
                            i21 = i20;
                        } else {
                            i21 = i20;
                            if (h6Var.l != 0) {
                                i21 = i15;
                                i22 = h6Var == null ? (int) h6Var.m : i15;
                                if (i22 == 0 || h6Var == null) {
                                    i23 = i22;
                                } else {
                                    i23 = i22;
                                    if (h6Var.m != 0) {
                                        i24 = i15;
                                        if (TextUtils.isEmpty(strArr[i15])) {
                                            strArr2 = strArr;
                                            i26 = i12;
                                            i27 = i21;
                                            i25 = i24;
                                        } else {
                                            try {
                                                queryParameter = Uri.parse(strArr[i15]).getQueryParameter("bg_color");
                                            } catch (Exception e10) {
                                                e = e10;
                                                strArr2 = strArr;
                                            }
                                            if (h6Var != null) {
                                                if (!TextUtils.isEmpty(queryParameter)) {
                                                    int i39 = i24;
                                                    strArr2 = strArr;
                                                    try {
                                                        int parseInt = Integer.parseInt(queryParameter.substring(i15, 6), 16) | (-16777216);
                                                        try {
                                                            h6Var.j = parseInt;
                                                            if (queryParameter.length() < 13 || !g0.S1(queryParameter.charAt(6))) {
                                                                i28 = parseInt;
                                                            } else {
                                                                int parseInt2 = Integer.parseInt(queryParameter.substring(7, 13), 16) | (-16777216);
                                                                i28 = parseInt;
                                                                try {
                                                                    h6Var.k = parseInt2;
                                                                    i12 = parseInt2;
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    i12 = parseInt2;
                                                                    i24 = i39;
                                                                    i11 = i28;
                                                                    a8.g(e, true);
                                                                    i25 = i24;
                                                                    i26 = i12;
                                                                    i27 = i21;
                                                                    mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                    org.telegram.ui.ActionBar.k6.C1(I02, mutate);
                                                                    mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
                                                                    Drawable mutate4 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    org.telegram.ui.ActionBar.k6.C1(I03, mutate4);
                                                                    mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
                                                                    i29 = 2;
                                                                    org.telegram.ui.ActionBar.t4[] t4VarArr = new org.telegram.ui.ActionBar.t4[2];
                                                                    i30 = 0;
                                                                    while (i30 < i29) {
                                                                    }
                                                                    r37 = mutate4;
                                                                    ?? r36 = t4VarArr;
                                                                    RectF rectF = new RectF();
                                                                    int i40 = 80;
                                                                    if (absolutePath == null) {
                                                                    }
                                                                    i21 = 120;
                                                                    i34 = 80;
                                                                    z11 = false;
                                                                    if (!z11) {
                                                                    }
                                                                    paint.setColor(I0);
                                                                    canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                    if (mutate != 0) {
                                                                    }
                                                                    if (mutate2 != 0) {
                                                                    }
                                                                    r36[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                                    r36[1].p(0, 560, 522);
                                                                    r36[1].draw(canvas);
                                                                    r36[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                                    r36[1].p(430, 560, 522);
                                                                    r36[1].draw(canvas);
                                                                    r36[0].setBounds(20, qs.u5, 399, 415);
                                                                    r36[0].p(qs.u5, 560, 522);
                                                                    r36[0].draw(canvas);
                                                                    paint.setColor(i14);
                                                                    canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                                    if (r37 != 0) {
                                                                    }
                                                                    if (mutate3 != 0) {
                                                                    }
                                                                    i7 = 0;
                                                                    i7 = 0;
                                                                    str2 = null;
                                                                    canvas.setBitmap(null);
                                                                    File file2 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2));
                                                                    iz.y();
                                                                    str3 = file2.getAbsolutePath();
                                                                    g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                                }
                                                            }
                                                            try {
                                                                if (queryParameter.length() >= 20 && g0.S1(queryParameter.charAt(13))) {
                                                                    int parseInt3 = Integer.parseInt(queryParameter.substring(14, 20), 16) | (-16777216);
                                                                    try {
                                                                        h6Var.l = parseInt3;
                                                                        i21 = parseInt3;
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        i21 = parseInt3;
                                                                        i24 = i39;
                                                                        i11 = i28;
                                                                        a8.g(e, true);
                                                                        i25 = i24;
                                                                        i26 = i12;
                                                                        i27 = i21;
                                                                        mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I02, mutate);
                                                                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
                                                                        Drawable mutate42 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I03, mutate42);
                                                                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
                                                                        i29 = 2;
                                                                        org.telegram.ui.ActionBar.t4[] t4VarArr2 = new org.telegram.ui.ActionBar.t4[2];
                                                                        i30 = 0;
                                                                        while (i30 < i29) {
                                                                        }
                                                                        r37 = mutate42;
                                                                        ?? r362 = t4VarArr2;
                                                                        RectF rectF2 = new RectF();
                                                                        int i402 = 80;
                                                                        if (absolutePath == null) {
                                                                        }
                                                                        i21 = 120;
                                                                        i34 = 80;
                                                                        z11 = false;
                                                                        if (!z11) {
                                                                        }
                                                                        paint.setColor(I0);
                                                                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                        if (mutate != 0) {
                                                                        }
                                                                        if (mutate2 != 0) {
                                                                        }
                                                                        r362[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                                        r362[1].p(0, 560, 522);
                                                                        r362[1].draw(canvas);
                                                                        r362[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                                        r362[1].p(430, 560, 522);
                                                                        r362[1].draw(canvas);
                                                                        r362[0].setBounds(20, qs.u5, 399, 415);
                                                                        r362[0].p(qs.u5, 560, 522);
                                                                        r362[0].draw(canvas);
                                                                        paint.setColor(i14);
                                                                        canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                                        if (r37 != 0) {
                                                                        }
                                                                        if (mutate3 != 0) {
                                                                        }
                                                                        i7 = 0;
                                                                        i7 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file22 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22));
                                                                        iz.y();
                                                                        str3 = file22.getAbsolutePath();
                                                                        g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                                    }
                                                                }
                                                                if (queryParameter.length() == 27 && g0.S1(queryParameter.charAt(20))) {
                                                                    i24 = Integer.parseInt(queryParameter.substring(21), 16) | (-16777216);
                                                                    try {
                                                                        h6Var.m = i24;
                                                                    } catch (Exception e13) {
                                                                        e = e13;
                                                                        i11 = i28;
                                                                        a8.g(e, true);
                                                                        i25 = i24;
                                                                        i26 = i12;
                                                                        i27 = i21;
                                                                        mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I02, mutate);
                                                                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
                                                                        Drawable mutate422 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I03, mutate422);
                                                                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
                                                                        i29 = 2;
                                                                        org.telegram.ui.ActionBar.t4[] t4VarArr22 = new org.telegram.ui.ActionBar.t4[2];
                                                                        i30 = 0;
                                                                        while (i30 < i29) {
                                                                        }
                                                                        r37 = mutate422;
                                                                        ?? r3622 = t4VarArr22;
                                                                        RectF rectF22 = new RectF();
                                                                        int i4022 = 80;
                                                                        if (absolutePath == null) {
                                                                        }
                                                                        i21 = 120;
                                                                        i34 = 80;
                                                                        z11 = false;
                                                                        if (!z11) {
                                                                        }
                                                                        paint.setColor(I0);
                                                                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                        if (mutate != 0) {
                                                                        }
                                                                        if (mutate2 != 0) {
                                                                        }
                                                                        r3622[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                                        r3622[1].p(0, 560, 522);
                                                                        r3622[1].draw(canvas);
                                                                        r3622[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                                        r3622[1].p(430, 560, 522);
                                                                        r3622[1].draw(canvas);
                                                                        r3622[0].setBounds(20, qs.u5, 399, 415);
                                                                        r3622[0].p(qs.u5, 560, 522);
                                                                        r3622[0].draw(canvas);
                                                                        paint.setColor(i14);
                                                                        canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                                        if (r37 != 0) {
                                                                        }
                                                                        if (mutate3 != 0) {
                                                                        }
                                                                        i7 = 0;
                                                                        i7 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222));
                                                                        iz.y();
                                                                        str3 = file222.getAbsolutePath();
                                                                        g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                                    }
                                                                } else {
                                                                    i24 = i39;
                                                                }
                                                                i11 = i28;
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            i28 = parseInt;
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        i24 = i39;
                                                    }
                                                    i25 = i24;
                                                    i26 = i12;
                                                    i27 = i21;
                                                }
                                            }
                                            strArr2 = strArr;
                                            i24 = i24;
                                            i25 = i24;
                                            i26 = i12;
                                            i27 = i21;
                                        }
                                        mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                        org.telegram.ui.ActionBar.k6.C1(I02, mutate);
                                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                        org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
                                        Drawable mutate4222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                        org.telegram.ui.ActionBar.k6.C1(I03, mutate4222);
                                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                        org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
                                        i29 = 2;
                                        org.telegram.ui.ActionBar.t4[] t4VarArr222 = new org.telegram.ui.ActionBar.t4[2];
                                        i30 = 0;
                                        while (i30 < i29) {
                                            int i41 = i29;
                                            org.telegram.ui.ActionBar.t4[] t4VarArr3 = t4VarArr222;
                                            Drawable drawable = mutate4222;
                                            org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(i30 == 1, T0, 0);
                                            t4VarArr3[i30] = q5Var;
                                            org.telegram.ui.ActionBar.k6.C1(i30 == 0 ? I04 : I05, q5Var);
                                            i30++;
                                            i29 = i41;
                                            t4VarArr222 = t4VarArr3;
                                            mutate4222 = drawable;
                                        }
                                        r37 = mutate4222;
                                        ?? r36222 = t4VarArr222;
                                        RectF rectF222 = new RectF();
                                        int i40222 = 80;
                                        if (absolutePath == null) {
                                            try {
                                                options = new BitmapFactory.Options();
                                                options.inJustDecodeBounds = true;
                                                BitmapFactory.decodeFile(absolutePath, options);
                                                i31 = options.outWidth;
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                            if (i31 > 0 && (i32 = options.outHeight) > 0) {
                                                float min = Math.min(i31 / 560.0f, i32 / 560.0f);
                                                options.inSampleSize = 1;
                                                if (min > 1.0f) {
                                                    do {
                                                        i33 = options.inSampleSize * 2;
                                                        options.inSampleSize = i33;
                                                    } while (i33 < min);
                                                }
                                                Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
                                                options.inPreferredConfig = config2;
                                                options.inJustDecodeBounds = false;
                                                Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                                                if (decodeFile != null) {
                                                    if (i27 == 0 || h6Var == null) {
                                                        Paint paint2 = new Paint();
                                                        paint2.setFilterBitmap(true);
                                                        float min2 = Math.min(decodeFile.getWidth() / 560.0f, decodeFile.getHeight() / 560.0f);
                                                        rectF222.set(0.0f, 0.0f, decodeFile.getWidth() / min2, decodeFile.getHeight() / min2);
                                                        rectF222.offset((c10.getWidth() - rectF222.width()) / 2.0f, (c10.getHeight() - rectF222.height()) / 2.0f);
                                                        canvas.drawBitmap(decodeFile, null, rectF222, paint2);
                                                    } else {
                                                        ?? qa0Var = new qa0(true, i11, i26, i27, i25);
                                                        if (c10.getConfig() != config2) {
                                                            Bitmap copy = c10.copy(config2, false);
                                                            try {
                                                                c10.recycle();
                                                                c10 = copy;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                c10 = copy;
                                                                a8.g(th, true);
                                                                i21 = 120;
                                                                i34 = 80;
                                                                z11 = false;
                                                                if (!z11) {
                                                                }
                                                                paint.setColor(I0);
                                                                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                if (mutate != 0) {
                                                                }
                                                                if (mutate2 != 0) {
                                                                }
                                                                r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                                r36222[1].p(0, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                                r36222[1].p(430, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[0].setBounds(20, qs.u5, 399, 415);
                                                                r36222[0].p(qs.u5, 560, 522);
                                                                r36222[0].draw(canvas);
                                                                paint.setColor(i14);
                                                                canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                                if (r37 != 0) {
                                                                }
                                                                if (mutate3 != 0) {
                                                                }
                                                                i7 = 0;
                                                                i7 = 0;
                                                                str2 = null;
                                                                canvas.setBitmap(null);
                                                                File file2222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222));
                                                                iz.y();
                                                                str3 = file2222.getAbsolutePath();
                                                                g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                            }
                                                        }
                                                        qa0Var.s(decodeFile, (int) (h6Var.p * 100.0f));
                                                        qa0Var.setBounds(0, 0, c10.getWidth(), c10.getHeight());
                                                        qa0Var.draw(canvas);
                                                    }
                                                    z10 = true;
                                                    z11 = z10;
                                                    i21 = 120;
                                                    i34 = 80;
                                                    if (!z11) {
                                                        ?? S = org.telegram.ui.ActionBar.k6.S(c10.getWidth(), c10.getHeight() - 120);
                                                        S.setBounds(0, i21, c10.getWidth(), c10.getHeight() - 120);
                                                        S.draw(canvas);
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                        int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
                                                        mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
                                                        mutate.draw(canvas);
                                                    }
                                                    if (mutate2 != 0) {
                                                        int width = (c10.getWidth() - mutate2.getIntrinsicWidth()) - 10;
                                                        int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
                                                        mutate2.setBounds(width, intrinsicHeight2, mutate2.getIntrinsicWidth() + width, mutate2.getIntrinsicHeight() + intrinsicHeight2);
                                                        mutate2.draw(canvas);
                                                    }
                                                    r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                    r36222[1].p(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                    r36222[1].p(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, qs.u5, 399, 415);
                                                    r36222[0].p(qs.u5, 560, 522);
                                                    r36222[0].draw(canvas);
                                                    paint.setColor(i14);
                                                    canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                    if (r37 != 0) {
                                                        int height = (c10.getHeight() - 120) + ((120 - r37.getIntrinsicHeight()) / 2);
                                                        r37.setBounds(22, height, r37.getIntrinsicWidth() + 22, r37.getIntrinsicHeight() + height);
                                                        r37.draw(canvas);
                                                    }
                                                    if (mutate3 != 0) {
                                                        int width2 = (c10.getWidth() - mutate3.getIntrinsicWidth()) - 22;
                                                        int height2 = (c10.getHeight() - 120) + ((120 - mutate3.getIntrinsicHeight()) / 2);
                                                        mutate3.setBounds(width2, height2, mutate3.getIntrinsicWidth() + width2, mutate3.getIntrinsicHeight() + height2);
                                                        mutate3.draw(canvas);
                                                    }
                                                    i7 = 0;
                                                    i7 = 0;
                                                    str2 = null;
                                                    canvas.setBitmap(null);
                                                    File file22222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222));
                                                    iz.y();
                                                    str3 = file22222.getAbsolutePath();
                                                    g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                }
                                            }
                                            z10 = false;
                                            z11 = z10;
                                            i21 = 120;
                                            i34 = 80;
                                            if (!z11) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                            r36222[1].p(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                            r36222[1].p(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, qs.u5, 399, 415);
                                            r36222[0].p(qs.u5, 560, 522);
                                            r36222[0].draw(canvas);
                                            paint.setColor(i14);
                                            canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                            if (r37 != 0) {
                                            }
                                            if (mutate3 != 0) {
                                            }
                                            i7 = 0;
                                            i7 = 0;
                                            str2 = null;
                                            canvas.setBitmap(null);
                                            File file222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                            c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222));
                                            iz.y();
                                            str3 = file222222.getAbsolutePath();
                                            g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                        }
                                        int i42 = i11;
                                        if (i42 != 0) {
                                            if (i26 == 0) {
                                                bitmapDrawable = new ColorDrawable(i42);
                                            } else if (i27 != 0) {
                                                bitmapDrawable = new qa0(true, i42, i26, i27, i25);
                                            } else {
                                                int i43 = T0.get(org.telegram.ui.ActionBar.k6.Fe, -1);
                                                if (i43 == -1) {
                                                    i43 = 45;
                                                }
                                                int[] iArr = {i42, i7};
                                                int width3 = c10.getWidth();
                                                int height3 = c10.getHeight() - 120;
                                                GradientDrawable.Orientation d = org.telegram.ui.Components.k9.d(i43);
                                                Resources resources = t0.b.getResources();
                                                Rect e17 = org.telegram.ui.Components.k9.e(d, width3, height3);
                                                Bitmap createBitmap = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                                                Utilities.drawDitheredGradient(createBitmap, iArr, e17.left, e17.top, e17.right, e17.bottom);
                                                i40222 = 90;
                                                bitmapDrawable = new BitmapDrawable(resources, createBitmap);
                                            }
                                            bitmapDrawable.setBounds(0, 120, c10.getWidth(), c10.getHeight() - 120);
                                            bitmapDrawable.draw(canvas);
                                            i21 = 120;
                                            i34 = i40222;
                                            z11 = true;
                                            if (!z11) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                            r36222[1].p(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                            r36222[1].p(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, qs.u5, 399, 415);
                                            r36222[0].p(qs.u5, 560, 522);
                                            r36222[0].draw(canvas);
                                            paint.setColor(i14);
                                            canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                            if (r37 != 0) {
                                            }
                                            if (mutate3 != 0) {
                                            }
                                            i7 = 0;
                                            i7 = 0;
                                            str2 = null;
                                            canvas.setBitmap(null);
                                            File file2222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                            c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222));
                                            iz.y();
                                            str3 = file2222222.getAbsolutePath();
                                            g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                        }
                                        if (i10 >= 0 || !TextUtils.isEmpty(strArr2[0])) {
                                            try {
                                                options2 = new BitmapFactory.Options();
                                                options2.inJustDecodeBounds = true;
                                                i7 = TextUtils.isEmpty(strArr2[0]);
                                                try {
                                                    if (i7 == 0) {
                                                        File h = t0.h();
                                                        StringBuilder sb2 = new StringBuilder();
                                                        i21 = 120;
                                                        sb2.append(Utilities.a(strArr2[0]));
                                                        sb2.append(".wp");
                                                        i7 = new File(h, sb2.toString());
                                                        BitmapFactory.decodeFile(i7.getAbsolutePath(), options2);
                                                        fileInputStream2 = null;
                                                        i7 = i7;
                                                    } else {
                                                        i21 = 120;
                                                        fileInputStream2 = new FileInputStream(str4);
                                                        try {
                                                            fileInputStream2.getChannel().position(i10);
                                                            BitmapFactory.decodeStream(fileInputStream2, null, options2);
                                                            i7 = 0;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            fileInputStream = fileInputStream2;
                                                            i7 = i7;
                                                            z9 = true;
                                                            try {
                                                                a8.g(th, true);
                                                                if (fileInputStream != null) {
                                                                }
                                                                i34 = 80;
                                                                z11 = false;
                                                                if (!z11) {
                                                                }
                                                                paint.setColor(I0);
                                                                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                if (mutate != 0) {
                                                                }
                                                                if (mutate2 != 0) {
                                                                }
                                                                r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                                r36222[1].p(0, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                                r36222[1].p(430, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[0].setBounds(20, qs.u5, 399, 415);
                                                                r36222[0].p(qs.u5, 560, 522);
                                                                r36222[0].draw(canvas);
                                                                paint.setColor(i14);
                                                                canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                                if (r37 != 0) {
                                                                }
                                                                if (mutate3 != 0) {
                                                                }
                                                                i7 = 0;
                                                                i7 = 0;
                                                                str2 = null;
                                                                canvas.setBitmap(null);
                                                                File file22222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222222));
                                                                iz.y();
                                                                str3 = file22222222.getAbsolutePath();
                                                                g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    i35 = options2.outWidth;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    fileInputStream = null;
                                                    i7 = i7;
                                                    z9 = true;
                                                    a8.g(th, true);
                                                    if (fileInputStream != null) {
                                                        try {
                                                            fileInputStream.close();
                                                        } catch (Exception e18) {
                                                            a8.g(e18, true);
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            str = null;
                                                            a8.g(th, z9);
                                                            str2 = str;
                                                            str3 = str2;
                                                            g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                        }
                                                    }
                                                    i34 = 80;
                                                    z11 = false;
                                                    if (!z11) {
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                    }
                                                    if (mutate2 != 0) {
                                                    }
                                                    r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                    r36222[1].p(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                    r36222[1].p(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, qs.u5, 399, 415);
                                                    r36222[0].p(qs.u5, 560, 522);
                                                    r36222[0].draw(canvas);
                                                    paint.setColor(i14);
                                                    canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                    if (r37 != 0) {
                                                    }
                                                    if (mutate3 != 0) {
                                                    }
                                                    i7 = 0;
                                                    i7 = 0;
                                                    str2 = null;
                                                    canvas.setBitmap(null);
                                                    File file222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222222));
                                                    iz.y();
                                                    str3 = file222222222.getAbsolutePath();
                                                    g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                i21 = 120;
                                            }
                                            if (i35 > 0 && (i36 = options2.outHeight) > 0) {
                                                float min3 = Math.min(i35 / 560.0f, i36 / 560.0f);
                                                options2.inSampleSize = 1;
                                                if (min3 > 1.0f) {
                                                    do {
                                                        i37 = options2.inSampleSize * 2;
                                                        options2.inSampleSize = i37;
                                                    } while (i37 < min3);
                                                }
                                                options2.inJustDecodeBounds = false;
                                                if (i7 != 0) {
                                                    decodeStream = BitmapFactory.decodeFile(i7.getAbsolutePath(), options2);
                                                } else {
                                                    fileInputStream2.getChannel().position(i10);
                                                    decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                                                }
                                                if (decodeStream != null) {
                                                    i7 = new Paint();
                                                    i7.setFilterBitmap(true);
                                                    float min4 = Math.min(decodeStream.getWidth() / 560.0f, decodeStream.getHeight() / 560.0f);
                                                    rectF222.set(0.0f, 0.0f, decodeStream.getWidth() / min4, decodeStream.getHeight() / min4);
                                                    rectF222.offset((c10.getWidth() - rectF222.width()) / 2.0f, (c10.getHeight() - rectF222.height()) / 2.0f);
                                                    canvas.drawBitmap(decodeStream, null, rectF222, i7);
                                                    z11 = true;
                                                    if (fileInputStream2 != null) {
                                                        try {
                                                            fileInputStream2.close();
                                                        } catch (Exception e19) {
                                                            a8.g(e19, true);
                                                        }
                                                    }
                                                    i34 = 80;
                                                    if (!z11) {
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                    }
                                                    if (mutate2 != 0) {
                                                    }
                                                    r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                                    r36222[1].p(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                                    r36222[1].p(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, qs.u5, 399, 415);
                                                    r36222[0].p(qs.u5, 560, 522);
                                                    r36222[0].draw(canvas);
                                                    paint.setColor(i14);
                                                    canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                                    if (r37 != 0) {
                                                    }
                                                    if (mutate3 != 0) {
                                                    }
                                                    i7 = 0;
                                                    i7 = 0;
                                                    str2 = null;
                                                    canvas.setBitmap(null);
                                                    File file2222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222222));
                                                    iz.y();
                                                    str3 = file2222222222.getAbsolutePath();
                                                    g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                                }
                                            }
                                            z11 = false;
                                            if (fileInputStream2 != null) {
                                            }
                                            i34 = 80;
                                            if (!z11) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                            r36222[1].p(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                            r36222[1].p(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, qs.u5, 399, 415);
                                            r36222[0].p(qs.u5, 560, 522);
                                            r36222[0].draw(canvas);
                                            paint.setColor(i14);
                                            canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                            if (r37 != 0) {
                                            }
                                            if (mutate3 != 0) {
                                            }
                                            i7 = 0;
                                            i7 = 0;
                                            str2 = null;
                                            canvas.setBitmap(null);
                                            File file22222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                            c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222222222));
                                            iz.y();
                                            str3 = file22222222222.getAbsolutePath();
                                            g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                        }
                                        i21 = 120;
                                        i34 = 80;
                                        z11 = false;
                                        if (!z11) {
                                        }
                                        paint.setColor(I0);
                                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                        if (mutate != 0) {
                                        }
                                        if (mutate2 != 0) {
                                        }
                                        r36222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                        r36222[1].p(0, 560, 522);
                                        r36222[1].draw(canvas);
                                        r36222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                        r36222[1].p(430, 560, 522);
                                        r36222[1].draw(canvas);
                                        r36222[0].setBounds(20, qs.u5, 399, 415);
                                        r36222[0].p(qs.u5, 560, 522);
                                        r36222[0].draw(canvas);
                                        paint.setColor(i14);
                                        canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                        if (r37 != 0) {
                                        }
                                        if (mutate3 != 0) {
                                        }
                                        i7 = 0;
                                        i7 = 0;
                                        str2 = null;
                                        canvas.setBitmap(null);
                                        File file222222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222222222));
                                        iz.y();
                                        str3 = file222222222222.getAbsolutePath();
                                        g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                                    }
                                }
                                if (i23 != 0) {
                                    i13 = i23;
                                }
                                i24 = i13;
                                if (TextUtils.isEmpty(strArr[i15])) {
                                }
                                mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                org.telegram.ui.ActionBar.k6.C1(I02, mutate);
                                mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
                                Drawable mutate42222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                org.telegram.ui.ActionBar.k6.C1(I03, mutate42222);
                                mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
                                i29 = 2;
                                org.telegram.ui.ActionBar.t4[] t4VarArr2222 = new org.telegram.ui.ActionBar.t4[2];
                                i30 = 0;
                                while (i30 < i29) {
                                }
                                r37 = mutate42222;
                                ?? r362222 = t4VarArr2222;
                                RectF rectF2222 = new RectF();
                                int i402222 = 80;
                                if (absolutePath == null) {
                                }
                                i21 = 120;
                                i34 = 80;
                                z11 = false;
                                if (!z11) {
                                }
                                paint.setColor(I0);
                                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                if (mutate != 0) {
                                }
                                if (mutate2 != 0) {
                                }
                                r362222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                                r362222[1].p(0, 560, 522);
                                r362222[1].draw(canvas);
                                r362222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                                r362222[1].p(430, 560, 522);
                                r362222[1].draw(canvas);
                                r362222[0].setBounds(20, qs.u5, 399, 415);
                                r362222[0].p(qs.u5, 560, 522);
                                r362222[0].draw(canvas);
                                paint.setColor(i14);
                                canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                                if (r37 != 0) {
                                }
                                if (mutate3 != 0) {
                                }
                                i7 = 0;
                                i7 = 0;
                                str2 = null;
                                canvas.setBitmap(null);
                                File file2222222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222222222));
                                iz.y();
                                str3 = file2222222222222.getAbsolutePath();
                                g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                            }
                        }
                        if (i21 == 0) {
                            i21 = i7;
                        }
                        if (h6Var == null) {
                        }
                        if (i22 == 0) {
                        }
                        i23 = i22;
                        if (i23 != 0) {
                        }
                        i24 = i13;
                        if (TextUtils.isEmpty(strArr[i15])) {
                        }
                        mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                        org.telegram.ui.ActionBar.k6.C1(I02, mutate);
                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                        org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
                        Drawable mutate422222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                        org.telegram.ui.ActionBar.k6.C1(I03, mutate422222);
                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                        org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
                        i29 = 2;
                        org.telegram.ui.ActionBar.t4[] t4VarArr22222 = new org.telegram.ui.ActionBar.t4[2];
                        i30 = 0;
                        while (i30 < i29) {
                        }
                        r37 = mutate422222;
                        ?? r3622222 = t4VarArr22222;
                        RectF rectF22222 = new RectF();
                        int i4022222 = 80;
                        if (absolutePath == null) {
                        }
                        i21 = 120;
                        i34 = 80;
                        z11 = false;
                        if (!z11) {
                        }
                        paint.setColor(I0);
                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                        if (mutate != 0) {
                        }
                        if (mutate2 != 0) {
                        }
                        r3622222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                        r3622222[1].p(0, 560, 522);
                        r3622222[1].draw(canvas);
                        r3622222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                        r3622222[1].p(430, 560, 522);
                        r3622222[1].draw(canvas);
                        r3622222[0].setBounds(20, qs.u5, 399, 415);
                        r3622222[0].p(qs.u5, 560, 522);
                        r3622222[0].draw(canvas);
                        paint.setColor(i14);
                        canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                        if (r37 != 0) {
                        }
                        if (mutate3 != 0) {
                        }
                        i7 = 0;
                        i7 = 0;
                        str2 = null;
                        canvas.setBitmap(null);
                        File file22222222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222222222222));
                        iz.y();
                        str3 = file22222222222222.getAbsolutePath();
                        g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
                    }
                }
                if (i19 != 0) {
                    i12 = i19;
                }
                if (h6Var != null) {
                }
                if (i20 == 0) {
                }
                i21 = i20;
                if (i21 == 0) {
                }
                if (h6Var == null) {
                }
                if (i22 == 0) {
                }
                i23 = i22;
                if (i23 != 0) {
                }
                i24 = i13;
                if (TextUtils.isEmpty(strArr[i15])) {
                }
                mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                org.telegram.ui.ActionBar.k6.C1(I02, mutate);
                mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
                Drawable mutate4222222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                org.telegram.ui.ActionBar.k6.C1(I03, mutate4222222);
                mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
                i29 = 2;
                org.telegram.ui.ActionBar.t4[] t4VarArr222222 = new org.telegram.ui.ActionBar.t4[2];
                i30 = 0;
                while (i30 < i29) {
                }
                r37 = mutate4222222;
                ?? r36222222 = t4VarArr222222;
                RectF rectF222222 = new RectF();
                int i40222222 = 80;
                if (absolutePath == null) {
                }
                i21 = 120;
                i34 = 80;
                z11 = false;
                if (!z11) {
                }
                paint.setColor(I0);
                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                if (mutate != 0) {
                }
                if (mutate2 != 0) {
                }
                r36222222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
                r36222222[1].p(0, 560, 522);
                r36222222[1].draw(canvas);
                r36222222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
                r36222222[1].p(430, 560, 522);
                r36222222[1].draw(canvas);
                r36222222[0].setBounds(20, qs.u5, 399, 415);
                r36222222[0].p(qs.u5, 560, 522);
                r36222222[0].draw(canvas);
                paint.setColor(i14);
                canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
                if (r37 != 0) {
                }
                if (mutate3 != 0) {
                }
                i7 = 0;
                i7 = 0;
                str2 = null;
                canvas.setBitmap(null);
                File file222222222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222222222222));
                iz.y();
                str3 = file222222222222222.getAbsolutePath();
                g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
            }
        }
        if (i17 != 0) {
            i11 = i17;
        }
        if (h6Var == null) {
        }
        if (i18 == 0) {
        }
        i19 = i18;
        if (i19 != 0) {
        }
        if (h6Var != null) {
        }
        if (i20 == 0) {
        }
        i21 = i20;
        if (i21 == 0) {
        }
        if (h6Var == null) {
        }
        if (i22 == 0) {
        }
        i23 = i22;
        if (i23 != 0) {
        }
        i24 = i13;
        if (TextUtils.isEmpty(strArr[i15])) {
        }
        mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.k6.C1(I02, mutate);
        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
        Drawable mutate42222222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.k6.C1(I03, mutate42222222);
        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.k6.C1(I03, mutate3);
        i29 = 2;
        org.telegram.ui.ActionBar.t4[] t4VarArr2222222 = new org.telegram.ui.ActionBar.t4[2];
        i30 = 0;
        while (i30 < i29) {
        }
        r37 = mutate42222222;
        ?? r362222222 = t4VarArr2222222;
        RectF rectF2222222 = new RectF();
        int i402222222 = 80;
        if (absolutePath == null) {
        }
        i21 = 120;
        i34 = 80;
        z11 = false;
        if (!z11) {
        }
        paint.setColor(I0);
        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
        if (mutate != 0) {
        }
        if (mutate2 != 0) {
        }
        r362222222[1].setBounds(qs.r2, qs.t3, c10.getWidth() - 20, qs.f5);
        r362222222[1].p(0, 560, 522);
        r362222222[1].draw(canvas);
        r362222222[1].setBounds(qs.r2, 430, c10.getWidth() - 20, 522);
        r362222222[1].p(430, 560, 522);
        r362222222[1].draw(canvas);
        r362222222[0].setBounds(20, qs.u5, 399, 415);
        r362222222[0].p(qs.u5, 560, 522);
        r362222222[0].draw(canvas);
        paint.setColor(i14);
        canvas.drawRect(0.0f, c10.getHeight() - 120, c10.getWidth(), c10.getHeight(), paint);
        if (r37 != 0) {
        }
        if (mutate3 != 0) {
        }
        i7 = 0;
        i7 = 0;
        str2 = null;
        canvas.setBitmap(null);
        File file2222222222222222 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222222222222));
        iz.y();
        str3 = file2222222222222222.getAbsolutePath();
        g0.h3(new mn(qpVar, str3, str4, h6Var, j6Var, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05a0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        boolean z9;
        int i7;
        org.telegram.ui.Components.v5 v5Var;
        boolean z10 = true;
        int i10 = 0;
        switch (this.a) {
            case 0:
                qp qpVar = (qp) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bp bpVar = (bp) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null && Q.getParentActivity() != null) {
                    ug.i0 i0Var = new ug.i0(11, qpVar.currentAccount, Q.getParentActivity(), Q, null);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    i0Var.C1(chat, arrayList, null, null, null);
                    i0Var.show();
                }
                bpVar.a(tL_error);
                break;
            case 1:
                d4 d4Var = (d4) this.b;
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) this.f;
                l2.u1 u1Var = d4Var.f;
                u1Var.e = tl_chatThemes.next_offset;
                u1Var.a = tl_chatThemes.hash;
                u1Var.b = System.currentTimeMillis();
                ArrayList arrayList4 = (ArrayList) u1Var.d;
                if (arrayList4 == null) {
                    u1Var.d = new ArrayList(arrayList2);
                } else {
                    arrayList4.addAll(arrayList2);
                }
                if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
                    u1Var.c = true;
                }
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                    HashMap hashMap = d4Var.e;
                    ig.b bVar = r3Var.c;
                    if (bVar == null) {
                        str = null;
                    } else {
                        str = bVar.b;
                        if (str == null) {
                            str = bVar.a;
                        }
                    }
                    hashMap.put(str, r3Var);
                }
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) obj2;
                    d4Var.t(m5.o(tL_chatThemeUniqueGift.gift.theme_peer), tL_chatThemeUniqueGift.gift.slug);
                }
                soVar.onComplete(null);
                break;
            case 2:
                x6 x6Var = (x6) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_getFactCheck tL_getFactCheck = (TLRPC.TL_getFactCheck) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                ArrayList arrayList6 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList7 = ((Vector) tLObject).objects;
                    for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                        if (arrayList7.get(i13) instanceof TLRPC.TL_factCheck) {
                            arrayList6.add((TLRPC.TL_factCheck) arrayList7.get(i13));
                        }
                    }
                }
                HashMap hashMap3 = new HashMap();
                for (int i14 = 0; i14 < Math.min(tL_getFactCheck.msg_id.size(), arrayList6.size()); i14++) {
                    Integer num = tL_getFactCheck.msg_id.get(i14);
                    num.getClass();
                    hashMap3.put(num, (TLRPC.TL_factCheck) arrayList6.get(i14));
                }
                int i15 = 0;
                for (int i16 = 0; i16 < tL_getFactCheck.msg_id.size(); i16++) {
                    w6 w6Var = (w6) arrayList5.get(i16);
                    Integer num2 = tL_getFactCheck.msg_id.get(i16);
                    num2.getClass();
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap3.get(num2);
                    c20 c20Var = (c20) hashMap2.get(w6Var);
                    if (tL_factCheck != null && !tL_factCheck.need_check && c20Var != null) {
                        c20Var.a(tL_factCheck);
                        i15++;
                        x6Var.d.remove(w6Var);
                    }
                }
                if (i15 > 0) {
                    qs.f(x6Var.a).k(qs.B3, new Object[0]);
                    break;
                }
                break;
            case 3:
                ub ubVar = (ub) this.b;
                Drawable drawable = (Drawable) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                String str2 = (String) this.f;
                if (drawable instanceof org.telegram.ui.Components.v5) {
                    org.telegram.ui.Components.v5 v5Var2 = (org.telegram.ui.Components.v5) drawable;
                    if (!v5Var2.n0) {
                        int i17 = 0;
                        boolean z11 = false;
                        while (i17 < arrayList8.size()) {
                            ImageReceiver imageReceiver = (ImageReceiver) arrayList8.get(i17);
                            if (i17 == 0) {
                                v5Var = v5Var2;
                                z9 = z10;
                                i7 = i10;
                            } else {
                                AnimatedFileDrawableStream animatedFileDrawableStream = v5Var2.u0;
                                if (animatedFileDrawableStream != null) {
                                    File file = v5Var2.G;
                                    long j3 = v5Var2.H;
                                    z9 = z10;
                                    int i18 = v5Var2.I;
                                    i7 = i10;
                                    TLRPC.Document document = animatedFileDrawableStream.c;
                                    hc hcVar = animatedFileDrawableStream.d;
                                    long j10 = v5Var2.M;
                                    int i19 = v5Var2.J;
                                    AnimatedFileDrawableStream animatedFileDrawableStream2 = v5Var2.u0;
                                    v5Var = new org.telegram.ui.Components.v5(file, false, j3, i18, document, hcVar, document, j10, i19, (animatedFileDrawableStream2 == null || !animatedFileDrawableStream2.w) ? i7 : z9 ? 1 : 0);
                                } else {
                                    z9 = z10;
                                    i7 = i10;
                                    v5Var = new org.telegram.ui.Components.v5(v5Var2.G, false, v5Var2.H, v5Var2.I, v5Var2.o0, null, null, v5Var2.M, v5Var2.J, false);
                                }
                                int[] iArr = v5Var.d;
                                int[] iArr2 = v5Var2.d;
                                iArr[i7] = iArr2[i7];
                                iArr[z9 ? 1 : 0] = iArr2[z9 ? 1 : 0];
                            }
                            if (imageReceiver.x0(v5Var, ubVar.d, ubVar.m, false, ((Integer) arrayList9.get(i17)).intValue())) {
                                if (v5Var == v5Var2) {
                                    z11 = z9;
                                }
                            } else if (v5Var != v5Var2) {
                                v5Var.u();
                            }
                            i17++;
                            z10 = z9;
                            i10 = i7;
                        }
                        if (!z11) {
                            v5Var2.u();
                        }
                        if (str2 == null) {
                            ubVar.A.p(str2);
                            break;
                        }
                    }
                }
                for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                    ((ImageReceiver) arrayList8.get(i20)).x0(drawable, ubVar.d, ((Integer) ubVar.z.get(i20)).intValue(), false, ((Integer) arrayList9.get(i20)).intValue());
                }
                if (str2 == null) {
                }
                break;
            case 4:
                fc fcVar = (fc) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                fcVar.a();
                ec ecVar = fcVar.c;
                if (ecVar.b != null) {
                    StringBuilder j11 = rf.b.j(str3, "@");
                    j11.append(ecVar.b);
                    str3 = j11.toString();
                }
                String str4 = str3;
                while (i10 < arrayList10.size()) {
                    ((ImageReceiver) arrayList10.get(i10)).x0(bitmapDrawable, str4, 0, false, ((Integer) arrayList11.get(i10)).intValue());
                    i10++;
                }
                if (!str4.contains("nocache")) {
                    fcVar.d.c.l(str4, bitmapDrawable);
                    break;
                }
                break;
            case 5:
                MediaController mediaController = (MediaController) this.b;
                File file2 = (File) this.c;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.d;
                byte[] bArr = (byte[]) this.e;
                pi piVar = (pi) this.f;
                String[] strArr = MediaController.V1;
                if (!file2.exists()) {
                    boolean z12 = r2.a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.k1 + " writedFrames" + mediaController.l1), true);
                }
                tL_document.date = ConnectionsManager.getInstance(mediaController.h1).getCurrentTime();
                tL_document.size = (int) file2.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                if (bArr == null) {
                    short[] sArr = mediaController.u1;
                    bArr = mediaController.getWaveform2(sArr, sArr.length);
                }
                tL_documentAttributeAudio.waveform = bArr;
                if (bArr != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController.k1 / 1000.0d;
                tL_document.attributes.clear();
                tL_document.attributes.add(tL_documentAttributeAudio);
                qs.f(mediaController.h1).k(qs.o2, new Object[0]);
                qs.f(mediaController.h1).k(qs.s2, Integer.valueOf(mediaController.g1), tL_document, file2.getAbsolutePath(), Boolean.TRUE, Float.valueOf(piVar.h), Float.valueOf(piVar.i));
                break;
            case 6:
                a();
                break;
            case 7:
                qp qpVar2 = (qp) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.e;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f;
                HashMap hashMap4 = qpVar2.P2;
                if (str5 == null) {
                    hashMap4.remove(str6);
                    break;
                } else {
                    hashMap4.put(str5, h6Var != null ? h6Var : j6Var);
                    if (h6Var == null) {
                        j6Var.I = str6;
                        j6Var.H = str5;
                    } else {
                        h6Var.v = str6;
                        h6Var.u = str5;
                    }
                    qpVar2.getFileLoader().i0(false, 67108864, str6, true);
                    qpVar2.getFileLoader().i0(false, 16777216, str5, true);
                    break;
                }
            case 8:
                qp qpVar3 = (qp) this.b;
                TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) this.c;
                a0.h hVar = (a0.h) this.d;
                a0.h hVar2 = (a0.h) this.e;
                a0.h hVar3 = (a0.h) this.f;
                qpVar3.Y3(tL_messages_messageViews.users, false);
                qpVar3.S3(tL_messages_messageViews.chats, false);
                qpVar3.getNotificationCenter().k(77, hVar, hVar2, hVar3, Boolean.FALSE);
                break;
            case 9:
                qp qpVar4 = (qp) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                Long l10 = (Long) this.d;
                c20 c20Var2 = (c20) this.e;
                if (tL_error2 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    qpVar4.Y3(tL_channels_channelParticipants.users, false);
                    qpVar4.S3(tL_channels_channelParticipants.chats, false);
                    qpVar4.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                    yr messagesStorage = qpVar4.getMessagesStorage();
                    messagesStorage.a.c(new lr(messagesStorage, l10.longValue(), tL_channels_channelParticipants.participants, 2));
                    qpVar4.v1.add(l10);
                }
                qpVar4.u1.remove(l10);
                if (c20Var2 != null) {
                    c20Var2.a(tLObject2 instanceof TLRPC.TL_channels_channelParticipants ? (TLRPC.TL_channels_channelParticipants) tLObject2 : null);
                    break;
                }
                break;
            case 10:
                qp qpVar5 = (qp) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                a0.h hVar4 = (a0.h) this.e;
                a0.h hVar5 = (a0.h) this.f;
                qpVar5.getMessagesStorage().m1(updates_difference.users, updates_difference.chats, true, false);
                if (!arrayList12.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i21 = 0; i21 < arrayList12.size(); i21++) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) arrayList12.get(i21);
                        long[] a22 = qpVar5.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.id, a22);
                        }
                    }
                    if (sparseArray.size() != 0) {
                        g0.h3(new dm(qpVar5, sparseArray, i10));
                    }
                }
                Utilities.d.c(new em(qpVar5, updates_difference, hVar4, hVar5, 0));
                break;
            case 11:
                ((yr) this.b).U1(null, (LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (a0.h) this.e, (LongSparseIntArray) this.f);
                break;
            case 12:
                ((z10) this.b).a((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f);
                break;
            case 13:
                yr yrVar = (yr) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                ArrayList arrayList15 = (ArrayList) this.e;
                a0.h hVar6 = (a0.h) this.f;
                yrVar.getMessagesController().Y3(arrayList13, true);
                yrVar.getMessagesController().S3(arrayList14, true);
                yrVar.getMessagesController().V3(arrayList15);
                while (i10 < hVar6.m()) {
                    long j12 = hVar6.j(i10);
                    ur urVar = (ur) hVar6.n(i10);
                    if (yrVar.getMessagesController().t2(j12) || yrVar.u0(8, j12) || yrVar.getMessagesController().z2(j12)) {
                        qp messagesController = yrVar.getMessagesController();
                        yr messagesStorage2 = messagesController.getMessagesStorage();
                        rl rlVar = new rl(messagesController, j12);
                        p5 p5Var = messagesStorage2.a;
                        a4 a4Var = new a4(messagesStorage2, j12, rlVar, 5);
                        j12 = j12;
                        p5Var.c(a4Var);
                    }
                    qp messagesController2 = yrVar.getMessagesController();
                    int i22 = urVar.a;
                    messagesController2.j3(j12, i22, i22, urVar.b, false, 0L, urVar.c, true, 0);
                    i10++;
                }
                break;
            case 14:
                dt.f((dt) this.b, (ArrayList) this.c, (a0.h) this.d, (ArrayList) this.e, (Collection) this.f);
                break;
            case 15:
                gz gzVar = (gz) this.b;
                bz bzVar = (bz) this.c;
                HashMap hashMap5 = (HashMap) this.d;
                String str7 = (String) this.e;
                hv0 hv0Var = (hv0) this.f;
                if (((zy) bzVar.d.get(0)).f != null) {
                    bzVar.b();
                } else {
                    gzVar.E.putAll(hashMap5);
                    gzVar.F.put(str7, bzVar);
                    gz gzVar2 = bzVar.o;
                    gzVar2.getNotificationCenter().k(qs.w1, bzVar.e);
                    bzVar.l = SystemClock.elapsedRealtime();
                    ArrayList arrayList16 = bzVar.d;
                    int size3 = arrayList16.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        gzVar2.getFileLoader().i0(false, 67108864, ((zy) arrayList16.get(i23)).a, true);
                    }
                    gzVar.getNotificationCenter().k(qs.v1, str7);
                    hv0Var.a(str7);
                }
                try {
                    t0.b.startService(new Intent(t0.b, (Class<?>) ImportingService.class));
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 16:
                gz gzVar3 = (gz) this.b;
                sy syVar = (sy) this.c;
                File file3 = (File) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                ij ijVar = (ij) this.f;
                syVar.l = null;
                syVar.m.k.attachPath = file3.toString();
                if (!document2.thumbs.isEmpty()) {
                    TLRPC.PhotoSize photoSize = document2.thumbs.get(0);
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        syVar.g = photoSize;
                        syVar.h = document2;
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                arrayList17.add(ijVar.k);
                gzVar3.getMessagesStorage().j1(arrayList17, false, true, false, 0, false, ijVar.p1 ? 1 : 0, 0L);
                syVar.p = true;
                gzVar3.M(syVar, -1);
                gzVar3.getNotificationCenter().k(48, syVar.m.k);
                break;
            case 17:
                gz gzVar4 = (gz) this.b;
                File file4 = (File) this.c;
                g0.h3(new zj(gzVar4, gzVar4.A(file4.toString(), null, false), (ij) this.d, file4, (sy) this.e, (String) this.f));
                break;
            default:
                f10 f10Var = (f10) this.b;
                ij ijVar2 = (ij) this.c;
                String str8 = (String) this.d;
                f3.s sVar = (f3.s) this.e;
                bi.ya yaVar = (bi.ya) this.f;
                ijVar2.k.originalLanguage = str8;
                f10Var.getMessagesStorage().X1(sVar.a, ijVar2.k);
                f10Var.K.remove(sVar);
                yaVar.a(str8);
                break;
        }
    }

    public /* synthetic */ mn(qp qpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, c20 c20Var) {
        this.a = 9;
        this.b = qpVar;
        this.f = tL_error;
        this.c = tLObject;
        this.d = l10;
        this.e = c20Var;
    }
}
