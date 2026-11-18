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
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class fn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
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
    /* JADX WARN: Type inference failed for: r1v16, types: [android.graphics.drawable.Drawable, org.telegram.ui.Components.bb0] */
    /* JADX WARN: Type inference failed for: r28v18, types: [android.graphics.drawable.Drawable, org.telegram.ui.Components.bb0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v28, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v30, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v31, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v32, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v33, types: [org.telegram.ui.ActionBar.v4] */
    /* JADX WARN: Type inference failed for: r2v34, types: [org.telegram.ui.ActionBar.v4] */
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
        mp mpVar;
        org.telegram.ui.ActionBar.m6 m6Var;
        int i7;
        boolean z10;
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
        boolean z11;
        boolean z12;
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
        mp mpVar2 = (mp) this.b;
        String str4 = (String) this.c;
        File file = (File) this.d;
        org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.e;
        org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) this.f;
        String absolutePath = file != null ? file.getAbsolutePath() : null;
        int i38 = org.telegram.ui.ActionBar.n6.a;
        try {
            strArr = new String[1];
            T0 = org.telegram.ui.ActionBar.n6.T0(new File(str4), null, strArr);
            if (k6Var != null) {
                try {
                    org.telegram.ui.ActionBar.n6.H(T0, k6Var.b);
                } catch (Throwable th2) {
                    th = th2;
                    mpVar = mpVar2;
                    m6Var = m6Var2;
                    z10 = true;
                    str = null;
                    a8.g(th, z10);
                    str2 = str;
                    str3 = str2;
                    g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                }
            }
            i10 = org.telegram.ui.ActionBar.n6.km.get(org.telegram.ui.ActionBar.n6.g5, -1);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            c10 = vr.c(560, 678);
            canvas = new Canvas(c10);
            paint = new Paint();
            I0 = org.telegram.ui.ActionBar.n6.I0(T0, org.telegram.ui.ActionBar.n6.s8);
            try {
                I02 = org.telegram.ui.ActionBar.n6.I0(T0, org.telegram.ui.ActionBar.n6.v8);
                int I06 = org.telegram.ui.ActionBar.n6.I0(T0, org.telegram.ui.ActionBar.n6.Je);
                I03 = org.telegram.ui.ActionBar.n6.I0(T0, org.telegram.ui.ActionBar.n6.Oe);
                I04 = org.telegram.ui.ActionBar.n6.I0(T0, org.telegram.ui.ActionBar.n6.ra);
                I05 = org.telegram.ui.ActionBar.n6.I0(T0, org.telegram.ui.ActionBar.n6.rb);
                T0.get(org.telegram.ui.ActionBar.n6.ub);
                i11 = T0.get(org.telegram.ui.ActionBar.n6.Ee);
                i12 = T0.get(org.telegram.ui.ActionBar.n6.Fe);
                mpVar = mpVar2;
                try {
                    i7 = T0.get(org.telegram.ui.ActionBar.n6.Ge);
                    i13 = T0.get(org.telegram.ui.ActionBar.n6.He);
                    m6Var = m6Var2;
                    if (k6Var != null) {
                        i14 = I06;
                        i15 = 0;
                        try {
                            i16 = (int) k6Var.j;
                        } catch (Throwable th3) {
                            th = th3;
                            i7 = 0;
                            z10 = true;
                            str = i7;
                            a8.g(th, z10);
                            str2 = str;
                            str3 = str2;
                            g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                        }
                    } else {
                        i14 = I06;
                        i15 = 0;
                        i16 = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    m6Var = m6Var2;
                    i7 = 0;
                    z10 = true;
                    str = i7;
                    a8.g(th, z10);
                    str2 = str;
                    str3 = str2;
                    g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                }
            } catch (Throwable th5) {
                th = th5;
                mpVar = mpVar2;
            }
        } catch (Throwable th6) {
            th = th6;
            mpVar = mpVar2;
            m6Var = m6Var2;
            i7 = 0;
        }
        if (i16 != 0 || k6Var == null) {
            i17 = i16;
        } else {
            i17 = i16;
            if (k6Var.j != 0) {
                i11 = i15;
                i18 = k6Var == null ? (int) k6Var.k : i15;
                if (i18 == 0 || k6Var == null) {
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (k6Var.k != 0) {
                        i12 = i15;
                        i20 = k6Var != null ? (int) k6Var.l : i15;
                        if (i20 == 0 || k6Var == null) {
                            i21 = i20;
                        } else {
                            i21 = i20;
                            if (k6Var.l != 0) {
                                i21 = i15;
                                i22 = k6Var == null ? (int) k6Var.m : i15;
                                if (i22 == 0 || k6Var == null) {
                                    i23 = i22;
                                } else {
                                    i23 = i22;
                                    if (k6Var.m != 0) {
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
                                            if (k6Var != null) {
                                                if (!TextUtils.isEmpty(queryParameter)) {
                                                    int i39 = i24;
                                                    strArr2 = strArr;
                                                    try {
                                                        int parseInt = Integer.parseInt(queryParameter.substring(i15, 6), 16) | (-16777216);
                                                        try {
                                                            k6Var.j = parseInt;
                                                            if (queryParameter.length() < 13 || !g0.S1(queryParameter.charAt(6))) {
                                                                i28 = parseInt;
                                                            } else {
                                                                int parseInt2 = Integer.parseInt(queryParameter.substring(7, 13), 16) | (-16777216);
                                                                i28 = parseInt;
                                                                try {
                                                                    k6Var.k = parseInt2;
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
                                                                    org.telegram.ui.ActionBar.n6.C1(I02, mutate);
                                                                    mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
                                                                    Drawable mutate4 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    org.telegram.ui.ActionBar.n6.C1(I03, mutate4);
                                                                    mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
                                                                    i29 = 2;
                                                                    org.telegram.ui.ActionBar.v4[] v4VarArr = new org.telegram.ui.ActionBar.v4[2];
                                                                    i30 = 0;
                                                                    while (i30 < i29) {
                                                                    }
                                                                    r37 = mutate4;
                                                                    ?? r36 = v4VarArr;
                                                                    RectF rectF = new RectF();
                                                                    int i40 = 80;
                                                                    if (absolutePath == null) {
                                                                    }
                                                                    i21 = 120;
                                                                    i34 = 80;
                                                                    z12 = false;
                                                                    if (!z12) {
                                                                    }
                                                                    paint.setColor(I0);
                                                                    canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                    if (mutate != 0) {
                                                                    }
                                                                    if (mutate2 != 0) {
                                                                    }
                                                                    r36[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                                    r36[1].o(0, 560, 522);
                                                                    r36[1].draw(canvas);
                                                                    r36[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                                    r36[1].o(430, 560, 522);
                                                                    r36[1].draw(canvas);
                                                                    r36[0].setBounds(20, ks.u5, 399, 415);
                                                                    r36[0].o(ks.u5, 560, 522);
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
                                                                    File file2 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2));
                                                                    bz.y();
                                                                    str3 = file2.getAbsolutePath();
                                                                    g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                                                }
                                                            }
                                                            try {
                                                                if (queryParameter.length() >= 20 && g0.S1(queryParameter.charAt(13))) {
                                                                    int parseInt3 = Integer.parseInt(queryParameter.substring(14, 20), 16) | (-16777216);
                                                                    try {
                                                                        k6Var.l = parseInt3;
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
                                                                        org.telegram.ui.ActionBar.n6.C1(I02, mutate);
                                                                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
                                                                        Drawable mutate42 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        org.telegram.ui.ActionBar.n6.C1(I03, mutate42);
                                                                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
                                                                        i29 = 2;
                                                                        org.telegram.ui.ActionBar.v4[] v4VarArr2 = new org.telegram.ui.ActionBar.v4[2];
                                                                        i30 = 0;
                                                                        while (i30 < i29) {
                                                                        }
                                                                        r37 = mutate42;
                                                                        ?? r362 = v4VarArr2;
                                                                        RectF rectF2 = new RectF();
                                                                        int i402 = 80;
                                                                        if (absolutePath == null) {
                                                                        }
                                                                        i21 = 120;
                                                                        i34 = 80;
                                                                        z12 = false;
                                                                        if (!z12) {
                                                                        }
                                                                        paint.setColor(I0);
                                                                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                        if (mutate != 0) {
                                                                        }
                                                                        if (mutate2 != 0) {
                                                                        }
                                                                        r362[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                                        r362[1].o(0, 560, 522);
                                                                        r362[1].draw(canvas);
                                                                        r362[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                                        r362[1].o(430, 560, 522);
                                                                        r362[1].draw(canvas);
                                                                        r362[0].setBounds(20, ks.u5, 399, 415);
                                                                        r362[0].o(ks.u5, 560, 522);
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
                                                                        File file22 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22));
                                                                        bz.y();
                                                                        str3 = file22.getAbsolutePath();
                                                                        g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                                                    }
                                                                }
                                                                if (queryParameter.length() == 27 && g0.S1(queryParameter.charAt(20))) {
                                                                    i24 = Integer.parseInt(queryParameter.substring(21), 16) | (-16777216);
                                                                    try {
                                                                        k6Var.m = i24;
                                                                    } catch (Exception e13) {
                                                                        e = e13;
                                                                        i11 = i28;
                                                                        a8.g(e, true);
                                                                        i25 = i24;
                                                                        i26 = i12;
                                                                        i27 = i21;
                                                                        mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                        org.telegram.ui.ActionBar.n6.C1(I02, mutate);
                                                                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
                                                                        Drawable mutate422 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        org.telegram.ui.ActionBar.n6.C1(I03, mutate422);
                                                                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
                                                                        i29 = 2;
                                                                        org.telegram.ui.ActionBar.v4[] v4VarArr22 = new org.telegram.ui.ActionBar.v4[2];
                                                                        i30 = 0;
                                                                        while (i30 < i29) {
                                                                        }
                                                                        r37 = mutate422;
                                                                        ?? r3622 = v4VarArr22;
                                                                        RectF rectF22 = new RectF();
                                                                        int i4022 = 80;
                                                                        if (absolutePath == null) {
                                                                        }
                                                                        i21 = 120;
                                                                        i34 = 80;
                                                                        z12 = false;
                                                                        if (!z12) {
                                                                        }
                                                                        paint.setColor(I0);
                                                                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                        if (mutate != 0) {
                                                                        }
                                                                        if (mutate2 != 0) {
                                                                        }
                                                                        r3622[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                                        r3622[1].o(0, 560, 522);
                                                                        r3622[1].draw(canvas);
                                                                        r3622[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                                        r3622[1].o(430, 560, 522);
                                                                        r3622[1].draw(canvas);
                                                                        r3622[0].setBounds(20, ks.u5, 399, 415);
                                                                        r3622[0].o(ks.u5, 560, 522);
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
                                                                        File file222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222));
                                                                        bz.y();
                                                                        str3 = file222.getAbsolutePath();
                                                                        g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
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
                                        org.telegram.ui.ActionBar.n6.C1(I02, mutate);
                                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                        org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
                                        Drawable mutate4222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                        org.telegram.ui.ActionBar.n6.C1(I03, mutate4222);
                                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                        org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
                                        i29 = 2;
                                        org.telegram.ui.ActionBar.v4[] v4VarArr222 = new org.telegram.ui.ActionBar.v4[2];
                                        i30 = 0;
                                        while (i30 < i29) {
                                            int i41 = i29;
                                            org.telegram.ui.ActionBar.v4[] v4VarArr3 = v4VarArr222;
                                            Drawable drawable = mutate4222;
                                            org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(i30 == 1, T0, 0);
                                            v4VarArr3[i30] = s5Var;
                                            org.telegram.ui.ActionBar.n6.C1(i30 == 0 ? I04 : I05, s5Var);
                                            i30++;
                                            i29 = i41;
                                            v4VarArr222 = v4VarArr3;
                                            mutate4222 = drawable;
                                        }
                                        r37 = mutate4222;
                                        ?? r36222 = v4VarArr222;
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
                                                    if (i27 == 0 || k6Var == null) {
                                                        Paint paint2 = new Paint();
                                                        paint2.setFilterBitmap(true);
                                                        float min2 = Math.min(decodeFile.getWidth() / 560.0f, decodeFile.getHeight() / 560.0f);
                                                        rectF222.set(0.0f, 0.0f, decodeFile.getWidth() / min2, decodeFile.getHeight() / min2);
                                                        rectF222.offset((c10.getWidth() - rectF222.width()) / 2.0f, (c10.getHeight() - rectF222.height()) / 2.0f);
                                                        canvas.drawBitmap(decodeFile, null, rectF222, paint2);
                                                    } else {
                                                        ?? bb0Var = new bb0(true, i11, i26, i27, i25);
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
                                                                z12 = false;
                                                                if (!z12) {
                                                                }
                                                                paint.setColor(I0);
                                                                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                if (mutate != 0) {
                                                                }
                                                                if (mutate2 != 0) {
                                                                }
                                                                r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                                r36222[1].o(0, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                                r36222[1].o(430, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[0].setBounds(20, ks.u5, 399, 415);
                                                                r36222[0].o(ks.u5, 560, 522);
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
                                                                File file2222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222));
                                                                bz.y();
                                                                str3 = file2222.getAbsolutePath();
                                                                g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                                            }
                                                        }
                                                        bb0Var.s((int) (k6Var.p * 100.0f), decodeFile);
                                                        bb0Var.setBounds(0, 0, c10.getWidth(), c10.getHeight());
                                                        bb0Var.draw(canvas);
                                                    }
                                                    z11 = true;
                                                    z12 = z11;
                                                    i21 = 120;
                                                    i34 = 80;
                                                    if (!z12) {
                                                        ?? S = org.telegram.ui.ActionBar.n6.S(c10.getWidth(), c10.getHeight() - 120);
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
                                                    r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                    r36222[1].o(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                    r36222[1].o(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, ks.u5, 399, 415);
                                                    r36222[0].o(ks.u5, 560, 522);
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
                                                    File file22222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222));
                                                    bz.y();
                                                    str3 = file22222.getAbsolutePath();
                                                    g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                                }
                                            }
                                            z11 = false;
                                            z12 = z11;
                                            i21 = 120;
                                            i34 = 80;
                                            if (!z12) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                            r36222[1].o(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                            r36222[1].o(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, ks.u5, 399, 415);
                                            r36222[0].o(ks.u5, 560, 522);
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
                                            File file222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                            c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222));
                                            bz.y();
                                            str3 = file222222.getAbsolutePath();
                                            g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                        }
                                        int i42 = i11;
                                        if (i42 != 0) {
                                            if (i26 == 0) {
                                                bitmapDrawable = new ColorDrawable(i42);
                                            } else if (i27 != 0) {
                                                bitmapDrawable = new bb0(true, i42, i26, i27, i25);
                                            } else {
                                                int i43 = T0.get(org.telegram.ui.ActionBar.n6.Ie, -1);
                                                if (i43 == -1) {
                                                    i43 = 45;
                                                }
                                                int[] iArr = {i42, i7};
                                                int width3 = c10.getWidth();
                                                int height3 = c10.getHeight() - 120;
                                                GradientDrawable.Orientation d = org.telegram.ui.Components.p9.d(i43);
                                                Resources resources = t0.b.getResources();
                                                Rect e17 = org.telegram.ui.Components.p9.e(d, width3, height3);
                                                Bitmap createBitmap = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                                                Utilities.drawDitheredGradient(createBitmap, iArr, e17.left, e17.top, e17.right, e17.bottom);
                                                i40222 = 90;
                                                bitmapDrawable = new BitmapDrawable(resources, createBitmap);
                                            }
                                            bitmapDrawable.setBounds(0, 120, c10.getWidth(), c10.getHeight() - 120);
                                            bitmapDrawable.draw(canvas);
                                            i21 = 120;
                                            i34 = i40222;
                                            z12 = true;
                                            if (!z12) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                            r36222[1].o(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                            r36222[1].o(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, ks.u5, 399, 415);
                                            r36222[0].o(ks.u5, 560, 522);
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
                                            File file2222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                            c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222));
                                            bz.y();
                                            str3 = file2222222.getAbsolutePath();
                                            g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
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
                                                            z10 = true;
                                                            try {
                                                                a8.g(th, true);
                                                                if (fileInputStream != null) {
                                                                }
                                                                i34 = 80;
                                                                z12 = false;
                                                                if (!z12) {
                                                                }
                                                                paint.setColor(I0);
                                                                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                                if (mutate != 0) {
                                                                }
                                                                if (mutate2 != 0) {
                                                                }
                                                                r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                                r36222[1].o(0, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                                r36222[1].o(430, 560, 522);
                                                                r36222[1].draw(canvas);
                                                                r36222[0].setBounds(20, ks.u5, 399, 415);
                                                                r36222[0].o(ks.u5, 560, 522);
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
                                                                File file22222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222222));
                                                                bz.y();
                                                                str3 = file22222222.getAbsolutePath();
                                                                g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    i35 = options2.outWidth;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    fileInputStream = null;
                                                    i7 = i7;
                                                    z10 = true;
                                                    a8.g(th, true);
                                                    if (fileInputStream != null) {
                                                        try {
                                                            fileInputStream.close();
                                                        } catch (Exception e18) {
                                                            a8.g(e18, true);
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            str = null;
                                                            a8.g(th, z10);
                                                            str2 = str;
                                                            str3 = str2;
                                                            g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                                        }
                                                    }
                                                    i34 = 80;
                                                    z12 = false;
                                                    if (!z12) {
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                    }
                                                    if (mutate2 != 0) {
                                                    }
                                                    r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                    r36222[1].o(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                    r36222[1].o(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, ks.u5, 399, 415);
                                                    r36222[0].o(ks.u5, 560, 522);
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
                                                    File file222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222222));
                                                    bz.y();
                                                    str3 = file222222222.getAbsolutePath();
                                                    g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
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
                                                    z12 = true;
                                                    if (fileInputStream2 != null) {
                                                        try {
                                                            fileInputStream2.close();
                                                        } catch (Exception e19) {
                                                            a8.g(e19, true);
                                                        }
                                                    }
                                                    i34 = 80;
                                                    if (!z12) {
                                                    }
                                                    paint.setColor(I0);
                                                    canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                                    if (mutate != 0) {
                                                    }
                                                    if (mutate2 != 0) {
                                                    }
                                                    r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                                    r36222[1].o(0, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                                    r36222[1].o(430, 560, 522);
                                                    r36222[1].draw(canvas);
                                                    r36222[0].setBounds(20, ks.u5, 399, 415);
                                                    r36222[0].o(ks.u5, 560, 522);
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
                                                    File file2222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                                    c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222222));
                                                    bz.y();
                                                    str3 = file2222222222.getAbsolutePath();
                                                    g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                                }
                                            }
                                            z12 = false;
                                            if (fileInputStream2 != null) {
                                            }
                                            i34 = 80;
                                            if (!z12) {
                                            }
                                            paint.setColor(I0);
                                            canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                            if (mutate != 0) {
                                            }
                                            if (mutate2 != 0) {
                                            }
                                            r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                            r36222[1].o(0, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                            r36222[1].o(430, 560, 522);
                                            r36222[1].draw(canvas);
                                            r36222[0].setBounds(20, ks.u5, 399, 415);
                                            r36222[0].o(ks.u5, 560, 522);
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
                                            File file22222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                            c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222222222));
                                            bz.y();
                                            str3 = file22222222222.getAbsolutePath();
                                            g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                        }
                                        i21 = 120;
                                        i34 = 80;
                                        z12 = false;
                                        if (!z12) {
                                        }
                                        paint.setColor(I0);
                                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                        if (mutate != 0) {
                                        }
                                        if (mutate2 != 0) {
                                        }
                                        r36222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                        r36222[1].o(0, 560, 522);
                                        r36222[1].draw(canvas);
                                        r36222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                        r36222[1].o(430, 560, 522);
                                        r36222[1].draw(canvas);
                                        r36222[0].setBounds(20, ks.u5, 399, 415);
                                        r36222[0].o(ks.u5, 560, 522);
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
                                        File file222222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222222222));
                                        bz.y();
                                        str3 = file222222222222.getAbsolutePath();
                                        g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                                    }
                                }
                                if (i23 != 0) {
                                    i13 = i23;
                                }
                                i24 = i13;
                                if (TextUtils.isEmpty(strArr[i15])) {
                                }
                                mutate = t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                org.telegram.ui.ActionBar.n6.C1(I02, mutate);
                                mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
                                Drawable mutate42222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                org.telegram.ui.ActionBar.n6.C1(I03, mutate42222);
                                mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
                                i29 = 2;
                                org.telegram.ui.ActionBar.v4[] v4VarArr2222 = new org.telegram.ui.ActionBar.v4[2];
                                i30 = 0;
                                while (i30 < i29) {
                                }
                                r37 = mutate42222;
                                ?? r362222 = v4VarArr2222;
                                RectF rectF2222 = new RectF();
                                int i402222 = 80;
                                if (absolutePath == null) {
                                }
                                i21 = 120;
                                i34 = 80;
                                z12 = false;
                                if (!z12) {
                                }
                                paint.setColor(I0);
                                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                                if (mutate != 0) {
                                }
                                if (mutate2 != 0) {
                                }
                                r362222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                                r362222[1].o(0, 560, 522);
                                r362222[1].draw(canvas);
                                r362222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                                r362222[1].o(430, 560, 522);
                                r362222[1].draw(canvas);
                                r362222[0].setBounds(20, ks.u5, 399, 415);
                                r362222[0].o(ks.u5, 560, 522);
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
                                File file2222222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222222222));
                                bz.y();
                                str3 = file2222222222222.getAbsolutePath();
                                g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                            }
                        }
                        if (i21 == 0) {
                            i21 = i7;
                        }
                        if (k6Var == null) {
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
                        org.telegram.ui.ActionBar.n6.C1(I02, mutate);
                        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                        org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
                        Drawable mutate422222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                        org.telegram.ui.ActionBar.n6.C1(I03, mutate422222);
                        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                        org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
                        i29 = 2;
                        org.telegram.ui.ActionBar.v4[] v4VarArr22222 = new org.telegram.ui.ActionBar.v4[2];
                        i30 = 0;
                        while (i30 < i29) {
                        }
                        r37 = mutate422222;
                        ?? r3622222 = v4VarArr22222;
                        RectF rectF22222 = new RectF();
                        int i4022222 = 80;
                        if (absolutePath == null) {
                        }
                        i21 = 120;
                        i34 = 80;
                        z12 = false;
                        if (!z12) {
                        }
                        paint.setColor(I0);
                        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                        if (mutate != 0) {
                        }
                        if (mutate2 != 0) {
                        }
                        r3622222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                        r3622222[1].o(0, 560, 522);
                        r3622222[1].draw(canvas);
                        r3622222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                        r3622222[1].o(430, 560, 522);
                        r3622222[1].draw(canvas);
                        r3622222[0].setBounds(20, ks.u5, 399, 415);
                        r3622222[0].o(ks.u5, 560, 522);
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
                        File file22222222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file22222222222222));
                        bz.y();
                        str3 = file22222222222222.getAbsolutePath();
                        g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
                    }
                }
                if (i19 != 0) {
                    i12 = i19;
                }
                if (k6Var != null) {
                }
                if (i20 == 0) {
                }
                i21 = i20;
                if (i21 == 0) {
                }
                if (k6Var == null) {
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
                org.telegram.ui.ActionBar.n6.C1(I02, mutate);
                mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
                Drawable mutate4222222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                org.telegram.ui.ActionBar.n6.C1(I03, mutate4222222);
                mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
                i29 = 2;
                org.telegram.ui.ActionBar.v4[] v4VarArr222222 = new org.telegram.ui.ActionBar.v4[2];
                i30 = 0;
                while (i30 < i29) {
                }
                r37 = mutate4222222;
                ?? r36222222 = v4VarArr222222;
                RectF rectF222222 = new RectF();
                int i40222222 = 80;
                if (absolutePath == null) {
                }
                i21 = 120;
                i34 = 80;
                z12 = false;
                if (!z12) {
                }
                paint.setColor(I0);
                canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
                if (mutate != 0) {
                }
                if (mutate2 != 0) {
                }
                r36222222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
                r36222222[1].o(0, 560, 522);
                r36222222[1].draw(canvas);
                r36222222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
                r36222222[1].o(430, 560, 522);
                r36222222[1].draw(canvas);
                r36222222[0].setBounds(20, ks.u5, 399, 415);
                r36222222[0].o(ks.u5, 560, 522);
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
                File file222222222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
                c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file222222222222222));
                bz.y();
                str3 = file222222222222222.getAbsolutePath();
                g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
            }
        }
        if (i17 != 0) {
            i11 = i17;
        }
        if (k6Var == null) {
        }
        if (i18 == 0) {
        }
        i19 = i18;
        if (i19 != 0) {
        }
        if (k6Var != null) {
        }
        if (i20 == 0) {
        }
        i21 = i20;
        if (i21 == 0) {
        }
        if (k6Var == null) {
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
        org.telegram.ui.ActionBar.n6.C1(I02, mutate);
        mutate2 = t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.n6.C1(I02, mutate2);
        Drawable mutate42222222 = t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.n6.C1(I03, mutate42222222);
        mutate3 = t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.n6.C1(I03, mutate3);
        i29 = 2;
        org.telegram.ui.ActionBar.v4[] v4VarArr2222222 = new org.telegram.ui.ActionBar.v4[2];
        i30 = 0;
        while (i30 < i29) {
        }
        r37 = mutate42222222;
        ?? r362222222 = v4VarArr2222222;
        RectF rectF2222222 = new RectF();
        int i402222222 = 80;
        if (absolutePath == null) {
        }
        i21 = 120;
        i34 = 80;
        z12 = false;
        if (!z12) {
        }
        paint.setColor(I0);
        canvas.drawRect(0.0f, 0.0f, c10.getWidth(), 120.0f, paint);
        if (mutate != 0) {
        }
        if (mutate2 != 0) {
        }
        r362222222[1].setBounds(ks.r2, ks.t3, c10.getWidth() - 20, ks.f5);
        r362222222[1].o(0, 560, 522);
        r362222222[1].draw(canvas);
        r362222222[1].setBounds(ks.r2, 430, c10.getWidth() - 20, 522);
        r362222222[1].o(430, 560, 522);
        r362222222[1].draw(canvas);
        r362222222[0].setBounds(20, ks.u5, 399, 415);
        r362222222[0].o(ks.u5, 560, 522);
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
        File file2222222222222222 = new File(w7.z(4), "-2147483648_" + bz.p() + ".jpg");
        c10.compress(Bitmap.CompressFormat.JPEG, i34, new FileOutputStream(file2222222222222222));
        bz.y();
        str3 = file2222222222222222.getAbsolutePath();
        g0.g3(new fn(mpVar, str3, str4, k6Var, m6Var, 7));
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
        int i7;
        org.telegram.ui.Components.b6 b6Var;
        boolean z11 = true;
        int i10 = 0;
        switch (this.a) {
            case 0:
                mp mpVar = (mp) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                xo xoVar = (xo) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null && Q.getParentActivity() != null) {
                    ug.l0 l0Var = new ug.l0(11, mpVar.currentAccount, Q.getParentActivity(), Q, null);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    l0Var.D1(chat, arrayList, null, null, null);
                    l0Var.show();
                }
                xoVar.e(tL_error);
                break;
            case 1:
                f4 f4Var = (f4) this.b;
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.ip ipVar = (org.telegram.ui.Components.ip) this.f;
                l2.q1 q1Var = f4Var.f;
                q1Var.e = tl_chatThemes.next_offset;
                q1Var.a = tl_chatThemes.hash;
                q1Var.b = System.currentTimeMillis();
                ArrayList arrayList4 = (ArrayList) q1Var.d;
                if (arrayList4 == null) {
                    q1Var.d = new ArrayList(arrayList2);
                } else {
                    arrayList4.addAll(arrayList2);
                }
                if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
                    q1Var.c = true;
                }
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj;
                    HashMap hashMap = f4Var.e;
                    ig.b bVar = t3Var.c;
                    if (bVar == null) {
                        str = null;
                    } else {
                        str = bVar.b;
                        if (str == null) {
                            str = bVar.a;
                        }
                    }
                    hashMap.put(str, t3Var);
                }
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) obj2;
                    f4Var.t(n5.o(tL_chatThemeUniqueGift.gift.theme_peer), tL_chatThemeUniqueGift.gift.slug);
                }
                ipVar.onComplete(null);
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
                    x10 x10Var = (x10) hashMap2.get(w6Var);
                    if (tL_factCheck != null && !tL_factCheck.need_check && x10Var != null) {
                        x10Var.a(tL_factCheck);
                        i15++;
                        x6Var.d.remove(w6Var);
                    }
                }
                if (i15 > 0) {
                    ks.f(x6Var.a).k(ks.D3, new Object[0]);
                    break;
                }
                break;
            case 3:
                sb sbVar = (sb) this.b;
                Drawable drawable = (Drawable) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                String str2 = (String) this.f;
                if (drawable instanceof org.telegram.ui.Components.b6) {
                    org.telegram.ui.Components.b6 b6Var2 = (org.telegram.ui.Components.b6) drawable;
                    if (!b6Var2.o0) {
                        int i17 = 0;
                        boolean z12 = false;
                        while (i17 < arrayList8.size()) {
                            ImageReceiver imageReceiver = (ImageReceiver) arrayList8.get(i17);
                            if (i17 == 0) {
                                b6Var = b6Var2;
                                z10 = z11;
                                i7 = i10;
                            } else {
                                AnimatedFileDrawableStream animatedFileDrawableStream = b6Var2.v0;
                                if (animatedFileDrawableStream != null) {
                                    File file = b6Var2.H;
                                    long j3 = b6Var2.I;
                                    z10 = z11;
                                    int i18 = b6Var2.J;
                                    i7 = i10;
                                    TLRPC.Document document = animatedFileDrawableStream.c;
                                    fc fcVar = animatedFileDrawableStream.d;
                                    long j10 = b6Var2.N;
                                    int i19 = b6Var2.K;
                                    AnimatedFileDrawableStream animatedFileDrawableStream2 = b6Var2.v0;
                                    b6Var = new org.telegram.ui.Components.b6(file, false, j3, i18, document, fcVar, document, j10, i19, (animatedFileDrawableStream2 == null || !animatedFileDrawableStream2.w) ? i7 : z10 ? 1 : 0);
                                } else {
                                    z10 = z11;
                                    i7 = i10;
                                    b6Var = new org.telegram.ui.Components.b6(b6Var2.H, false, b6Var2.I, b6Var2.J, b6Var2.p0, null, null, b6Var2.N, b6Var2.K, false);
                                }
                                int[] iArr = b6Var.d;
                                int[] iArr2 = b6Var2.d;
                                iArr[i7] = iArr2[i7];
                                iArr[z10 ? 1 : 0] = iArr2[z10 ? 1 : 0];
                            }
                            if (imageReceiver.x0(b6Var, sbVar.d, sbVar.m, false, ((Integer) arrayList9.get(i17)).intValue())) {
                                if (b6Var == b6Var2) {
                                    z12 = z10;
                                }
                            } else if (b6Var != b6Var2) {
                                b6Var.u();
                            }
                            i17++;
                            z11 = z10;
                            i10 = i7;
                        }
                        if (!z12) {
                            b6Var2.u();
                        }
                        if (str2 == null) {
                            sbVar.A.p(str2);
                            break;
                        }
                    }
                }
                for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                    ((ImageReceiver) arrayList8.get(i20)).x0(drawable, sbVar.d, ((Integer) sbVar.z.get(i20)).intValue(), false, ((Integer) arrayList9.get(i20)).intValue());
                }
                if (str2 == null) {
                }
                break;
            case 4:
                dc dcVar = (dc) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                dcVar.a();
                cc ccVar = dcVar.c;
                if (ccVar.b != null) {
                    StringBuilder n10 = p5.c.n(str3, "@");
                    n10.append(ccVar.b);
                    str3 = n10.toString();
                }
                String str4 = str3;
                while (i10 < arrayList10.size()) {
                    ((ImageReceiver) arrayList10.get(i10)).x0(bitmapDrawable, str4, 0, false, ((Integer) arrayList11.get(i10)).intValue());
                    i10++;
                }
                if (!str4.contains("nocache")) {
                    dcVar.d.c.l(str4, bitmapDrawable);
                    break;
                }
                break;
            case 5:
                MediaController mediaController = (MediaController) this.b;
                File file2 = (File) this.c;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.d;
                byte[] bArr = (byte[]) this.e;
                mi miVar = (mi) this.f;
                String[] strArr = MediaController.W1;
                if (!file2.exists()) {
                    boolean z13 = s2.a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1), true);
                }
                tL_document.date = ConnectionsManager.getInstance(mediaController.i1).getCurrentTime();
                tL_document.size = (int) file2.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                if (bArr == null) {
                    short[] sArr = mediaController.v1;
                    bArr = mediaController.getWaveform2(sArr, sArr.length);
                }
                tL_documentAttributeAudio.waveform = bArr;
                if (bArr != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController.l1 / 1000.0d;
                tL_document.attributes.clear();
                tL_document.attributes.add(tL_documentAttributeAudio);
                ks.f(mediaController.i1).k(ks.o2, new Object[0]);
                ks.f(mediaController.i1).k(ks.s2, Integer.valueOf(mediaController.h1), tL_document, file2.getAbsolutePath(), Boolean.TRUE, Float.valueOf(miVar.h), Float.valueOf(miVar.i));
                break;
            case 6:
                a();
                break;
            case 7:
                mp mpVar2 = (mp) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.e;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.f;
                HashMap hashMap4 = mpVar2.S2;
                if (str5 == null) {
                    hashMap4.remove(str6);
                    break;
                } else {
                    hashMap4.put(str5, k6Var != null ? k6Var : m6Var);
                    if (k6Var == null) {
                        m6Var.J = str6;
                        m6Var.I = str5;
                    } else {
                        k6Var.v = str6;
                        k6Var.u = str5;
                    }
                    mpVar2.getFileLoader().h0(false, 67108864, str6, true);
                    mpVar2.getFileLoader().h0(false, 16777216, str5, true);
                    break;
                }
            case 8:
                mp mpVar3 = (mp) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.e;
                a0.h hVar2 = (a0.h) this.f;
                mpVar3.getMessagesStorage().m1(updates_difference.users, updates_difference.chats, true, false);
                if (!arrayList12.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i21 = 0; i21 < arrayList12.size(); i21++) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) arrayList12.get(i21);
                        long[] a22 = mpVar3.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.id, a22);
                        }
                    }
                    if (sparseArray.size() != 0) {
                        g0.g3(new sl(mpVar3, sparseArray, i10));
                    }
                }
                Utilities.d.c(new tl(mpVar3, updates_difference, hVar, hVar2, 0));
                break;
            case 9:
                mp mpVar4 = (mp) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                Long l10 = (Long) this.d;
                x10 x10Var2 = (x10) this.e;
                if (tL_error2 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    mpVar4.f4(tL_channels_channelParticipants.users, false);
                    mpVar4.Z3(tL_channels_channelParticipants.chats, false);
                    mpVar4.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                    tr messagesStorage = mpVar4.getMessagesStorage();
                    messagesStorage.a.c(new gr(messagesStorage, l10.longValue(), tL_channels_channelParticipants.participants, 3));
                    mpVar4.y1.add(l10);
                }
                mpVar4.x1.remove(l10);
                if (x10Var2 != null) {
                    x10Var2.a(tLObject2 instanceof TLRPC.TL_channels_channelParticipants ? (TLRPC.TL_channels_channelParticipants) tLObject2 : null);
                    break;
                }
                break;
            case 10:
                mp mpVar5 = (mp) this.b;
                TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                a0.h hVar5 = (a0.h) this.f;
                mpVar5.f4(tL_messages_messageViews.users, false);
                mpVar5.Z3(tL_messages_messageViews.chats, false);
                mpVar5.getNotificationCenter().k(77, hVar3, hVar4, hVar5, Boolean.FALSE);
                break;
            case 11:
                ((tr) this.b).U1(null, (LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (a0.h) this.e, (LongSparseIntArray) this.f);
                break;
            case 12:
                ((u10) this.b).a((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f);
                break;
            case 13:
                tr trVar = (tr) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                ArrayList arrayList15 = (ArrayList) this.e;
                a0.h hVar6 = (a0.h) this.f;
                trVar.getMessagesController().f4(arrayList13, true);
                trVar.getMessagesController().Z3(arrayList14, true);
                trVar.getMessagesController().c4(arrayList15);
                while (i10 < hVar6.m()) {
                    long j11 = hVar6.j(i10);
                    pr prVar = (pr) hVar6.n(i10);
                    if (trVar.getMessagesController().y2(j11) || trVar.u0(8, j11) || trVar.getMessagesController().F2(j11)) {
                        mp messagesController = trVar.getMessagesController();
                        tr messagesStorage2 = messagesController.getMessagesStorage();
                        kl klVar = new kl(messagesController, j11);
                        q5 q5Var = messagesStorage2.a;
                        d4 d4Var = new d4(messagesStorage2, j11, klVar, 5);
                        j11 = j11;
                        q5Var.c(d4Var);
                    }
                    mp messagesController2 = trVar.getMessagesController();
                    int i22 = prVar.a;
                    messagesController2.q3(j11, i22, i22, prVar.b, false, 0L, prVar.c, true, 0);
                    i10++;
                }
                break;
            case 14:
                xs.f((xs) this.b, (ArrayList) this.c, (a0.h) this.d, (ArrayList) this.e, (Collection) this.f);
                break;
            case 15:
                zy zyVar = (zy) this.b;
                uy uyVar = (uy) this.c;
                HashMap hashMap5 = (HashMap) this.d;
                String str7 = (String) this.e;
                rv0 rv0Var = (rv0) this.f;
                if (((sy) uyVar.d.get(0)).f != null) {
                    uyVar.b();
                } else {
                    zyVar.F.putAll(hashMap5);
                    zyVar.G.put(str7, uyVar);
                    zy zyVar2 = uyVar.o;
                    zyVar2.getNotificationCenter().k(ks.w1, uyVar.e);
                    uyVar.l = SystemClock.elapsedRealtime();
                    ArrayList arrayList16 = uyVar.d;
                    int size3 = arrayList16.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        zyVar2.getFileLoader().h0(false, 67108864, ((sy) arrayList16.get(i23)).a, true);
                    }
                    zyVar.getNotificationCenter().k(ks.v1, str7);
                    rv0Var.a(str7);
                }
                try {
                    t0.b.startService(new Intent(t0.b, (Class<?>) ImportingService.class));
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 16:
                zy zyVar3 = (zy) this.b;
                ly lyVar = (ly) this.c;
                File file3 = (File) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                fj fjVar = (fj) this.f;
                lyVar.l = null;
                lyVar.m.k.attachPath = file3.toString();
                if (!document2.thumbs.isEmpty()) {
                    TLRPC.PhotoSize photoSize = document2.thumbs.get(0);
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        lyVar.g = photoSize;
                        lyVar.h = document2;
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                arrayList17.add(fjVar.k);
                zyVar3.getMessagesStorage().j1(arrayList17, false, true, false, 0, false, fjVar.r1 ? 1 : 0, 0L);
                lyVar.p = true;
                zyVar3.M(lyVar, -1);
                zyVar3.getNotificationCenter().k(48, lyVar.m.k);
                break;
            case 17:
                zy zyVar4 = (zy) this.b;
                File file4 = (File) this.c;
                g0.g3(new tj(zyVar4, zyVar4.A(file4.toString(), null, false), (fj) this.d, file4, (ly) this.e, (String) this.f));
                break;
            default:
                z00 z00Var = (z00) this.b;
                fj fjVar2 = (fj) this.c;
                String str8 = (String) this.d;
                f3.s sVar = (f3.s) this.e;
                di.o9 o9Var = (di.o9) this.f;
                fjVar2.k.originalLanguage = str8;
                z00Var.getMessagesStorage().X1(sVar.a, fjVar2.k);
                z00Var.L.remove(sVar);
                o9Var.a(str8);
                break;
        }
    }

    public /* synthetic */ fn(mp mpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, x10 x10Var) {
        this.a = 9;
        this.b = mpVar;
        this.f = tL_error;
        this.c = tLObject;
        this.d = l10;
        this.e = x10Var;
    }
}
