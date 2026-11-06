package hi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.dt;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.rs;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.we;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ j2(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:134|(3:135|136|137)|(3:138|139|140)|(3:141|142|143)|(24:484|485|(1:487)|153|(1:155)(1:481)|156|(28:304|305|306|307|308|309|310|311|312|313|314|315|(1:317)(1:462)|318|319|320|321|322|323|324|325|326|327|328|329|(5:333|(3:440|441|442)(19:335|336|337|(6:339|340|341|342|343|344)(1:439)|(5:420|421|422|423|424)(1:346)|347|348|349|(1:351)|352|353|354|355|(3:357|(1:412)(4:361|362|363|(3:365|366|367)(1:407))|408)(1:413)|368|(2:370|(1:377)(1:376))|378|379|380)|381|330|331)|443|444)(1:158)|(2:299|300)|160|161|162|163|(7:292|293|(1:295)|172|(1:174)(1:290)|175|(18:177|178|179|(1:181)(1:283)|182|183|(5:187|(3:268|269|270)(10:189|190|191|(10:193|194|195|196|197|198|(1:200)(1:261)|(1:202)|203|204)(1:267)|(3:206|207|208)(1:260)|209|(2:211|(1:218)(1:217))|219|220|221)|222|184|185)|271|272|(2:274|275)|232|233|(2:236|234)|237|238|(1:240)|241|242)(11:287|291|(0)|232|233|(1:234)|237|238|(0)|241|242))|(6:166|(2:168|(1:170))|172|(0)(0)|175|(0)(0))|291|(0)|232|233|(1:234)|237|238|(0)|241|242)|(19:482|483|(0)|160|161|162|163|(0)|(0)|291|(0)|232|233|(1:234)|237|238|(0)|241|242)|153|(0)(0)|156|(0)(0)|(0)|160|161|162|163|(0)|(0)|291|(0)|232|233|(1:234)|237|238|(0)|241|242) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b1, code lost:
    
        if (r13 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0568, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x06e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06e9, code lost:
    
        r14 = true;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b4, code lost:
    
        if (r7 == r12) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        r0 = org.telegram.messenger.MediaController.Y1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b8, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ba, code lost:
    
        org.telegram.messenger.g0.r(r0);
        org.telegram.messenger.MediaController.Y1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bf, code lost:
    
        org.telegram.messenger.MediaController.O(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0558 A[Catch: all -> 0x0551, TryCatch #33 {all -> 0x0551, blocks: (B:293:0x054a, B:172:0x056a, B:175:0x0582, B:166:0x0558, B:168:0x055e, B:170:0x0564), top: B:292:0x054a }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06fd A[LOOP:2: B:234:0x06f7->B:236:0x06fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x054a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x050d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0536 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c A[Catch: all -> 0x017f, TryCatch #18 {all -> 0x017f, blocks: (B:75:0x0166, B:77:0x016c, B:79:0x0172, B:81:0x0178, B:84:0x0187, B:86:0x019d, B:88:0x01a3, B:100:0x0181), top: B:74:0x0166 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SparseArray sparseArray;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList;
        SparseArray sparseArray2;
        String str9;
        boolean z9;
        ArrayList arrayList2;
        we weVar;
        we weVar2;
        Integer num;
        Cursor cursor;
        we weVar3;
        we weVar4;
        boolean z10;
        we weVar5;
        Exception e10;
        int i7;
        jg.c1 c1Var;
        int i10;
        Cursor query;
        Cursor cursor2;
        int i11;
        int i12;
        int i13;
        int i14;
        we weVar6;
        Context context;
        int i15;
        ArrayList arrayList3;
        Cursor query2;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int columnIndex7;
        int columnIndex8;
        int i16;
        int i17;
        int i18;
        we weVar7;
        we weVar8;
        int i19;
        int i20;
        int i21;
        StringBuilder sb2;
        Cursor cursor3;
        Cursor cursor4;
        int i22;
        Context context2;
        int i23;
        File P0;
        org.telegram.utils.twidget.u uVar;
        int i24 = 1;
        switch (this.a) {
            case 0:
                ui.b0(this.b).E0(false, true, null);
                return;
            case 1:
                try {
                    yr.a0(this.b).b.executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                int i25 = this.b;
                String[] strArr = MediaController.V1;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = arrayList4;
                SparseArray sparseArray3 = new SparseArray();
                SparseArray sparseArray4 = new SparseArray();
                try {
                    sb2 = new StringBuilder();
                    sparseArray = sparseArray4;
                } catch (Exception e12) {
                    e = e12;
                    sparseArray = sparseArray4;
                }
                try {
                    sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
                    sb2.append("/Camera/");
                    str = sb2.toString();
                } catch (Exception e13) {
                    e = e13;
                    a8.g(e, true);
                    str = null;
                    context = org.telegram.messenger.t0.b;
                    i15 = Build.VERSION.SDK_INT;
                    arrayList3 = arrayList5;
                    if (i15 < 33) {
                    }
                    if (i15 >= 33) {
                    }
                    str2 = "bucket_id";
                    str3 = "bucket_display_name";
                    str4 = "_data";
                    str5 = "_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList2 = arrayList3;
                    weVar3 = null;
                    weVar4 = null;
                    num = null;
                    cursor = null;
                    if (cursor != null) {
                    }
                    Context context3 = org.telegram.messenger.t0.b;
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 < 33) {
                    }
                    if (i10 >= 33) {
                    }
                    weVar5 = null;
                    if (cursor != null) {
                    }
                    we weVar9 = weVar5;
                    we weVar10 = weVar4;
                    Integer num2 = num;
                    while (i7 < arrayList.size()) {
                    }
                    c1Var = MediaController.d2;
                    if (c1Var != null) {
                    }
                    jg.c1 c1Var2 = new jg.c1(i25, arrayList, arrayList2, num2, weVar10, weVar3, weVar9);
                    MediaController.d2 = c1Var2;
                    org.telegram.messenger.g0.i3(c1Var2, 0);
                    return;
                }
                try {
                    context = org.telegram.messenger.t0.b;
                    i15 = Build.VERSION.SDK_INT;
                    arrayList3 = arrayList5;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = "bucket_id";
                    str3 = "bucket_display_name";
                    str4 = "_data";
                    str5 = "_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    z9 = true;
                    arrayList2 = arrayList5;
                }
                if (i15 < 33) {
                    try {
                        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        }
                        query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.V1, null, null, (i15 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                        if (query2 == null) {
                            try {
                                columnIndex = query2.getColumnIndex("_id");
                                str5 = "_id";
                                try {
                                    columnIndex2 = query2.getColumnIndex("bucket_id");
                                    str2 = "bucket_id";
                                    try {
                                        columnIndex3 = query2.getColumnIndex("bucket_display_name");
                                        str3 = "bucket_display_name";
                                        try {
                                            columnIndex4 = query2.getColumnIndex("_data");
                                            str4 = "_data";
                                            try {
                                                columnIndex5 = query2.getColumnIndex(i15 > 28 ? "date_modified" : "datetaken");
                                                columnIndex6 = query2.getColumnIndex("orientation");
                                                str8 = "orientation";
                                                try {
                                                    columnIndex7 = query2.getColumnIndex("width");
                                                    str7 = "width";
                                                    try {
                                                        columnIndex8 = query2.getColumnIndex("height");
                                                        str6 = "height";
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        cursor = query2;
                                                        str6 = "height";
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cursor = query2;
                                                    str6 = "height";
                                                    str7 = "width";
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                cursor = query2;
                                                str6 = "height";
                                                str7 = "width";
                                                str8 = "orientation";
                                                arrayList = arrayList6;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                                arrayList2 = arrayList3;
                                                z9 = true;
                                                weVar = null;
                                                weVar2 = null;
                                                num = null;
                                                try {
                                                    a8.g(th, z9);
                                                    if (cursor != null) {
                                                    }
                                                    weVar3 = weVar;
                                                    weVar4 = weVar2;
                                                    Context context32 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    weVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    we weVar92 = weVar5;
                                                    we weVar102 = weVar4;
                                                    Integer num22 = num;
                                                    while (i7 < arrayList.size()) {
                                                    }
                                                    c1Var = MediaController.d2;
                                                    if (c1Var != null) {
                                                    }
                                                    jg.c1 c1Var22 = new jg.c1(i25, arrayList, arrayList2, num22, weVar102, weVar3, weVar92);
                                                    MediaController.d2 = c1Var22;
                                                    org.telegram.messenger.g0.i3(c1Var22, 0);
                                                    return;
                                                } finally {
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            cursor = query2;
                                            str4 = "_data";
                                            str6 = "height";
                                            str7 = "width";
                                            str8 = "orientation";
                                            arrayList = arrayList6;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            arrayList2 = arrayList3;
                                            z9 = true;
                                            weVar = null;
                                            weVar2 = null;
                                            num = null;
                                            a8.g(th, z9);
                                            if (cursor != null) {
                                            }
                                            weVar3 = weVar;
                                            weVar4 = weVar2;
                                            Context context322 = org.telegram.messenger.t0.b;
                                            i10 = Build.VERSION.SDK_INT;
                                            if (i10 < 33) {
                                            }
                                            if (i10 >= 33) {
                                            }
                                            weVar5 = null;
                                            if (cursor != null) {
                                            }
                                            we weVar922 = weVar5;
                                            we weVar1022 = weVar4;
                                            Integer num222 = num;
                                            while (i7 < arrayList.size()) {
                                            }
                                            c1Var = MediaController.d2;
                                            if (c1Var != null) {
                                            }
                                            jg.c1 c1Var222 = new jg.c1(i25, arrayList, arrayList2, num222, weVar1022, weVar3, weVar922);
                                            MediaController.d2 = c1Var222;
                                            org.telegram.messenger.g0.i3(c1Var222, 0);
                                            return;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor = query2;
                                        str3 = "bucket_display_name";
                                        str4 = "_data";
                                        str6 = "height";
                                        str7 = "width";
                                        str8 = "orientation";
                                        arrayList = arrayList6;
                                        sparseArray2 = sparseArray3;
                                        str9 = str;
                                        arrayList2 = arrayList3;
                                        z9 = true;
                                        weVar = null;
                                        weVar2 = null;
                                        num = null;
                                        a8.g(th, z9);
                                        if (cursor != null) {
                                        }
                                        weVar3 = weVar;
                                        weVar4 = weVar2;
                                        Context context3222 = org.telegram.messenger.t0.b;
                                        i10 = Build.VERSION.SDK_INT;
                                        if (i10 < 33) {
                                        }
                                        if (i10 >= 33) {
                                        }
                                        weVar5 = null;
                                        if (cursor != null) {
                                        }
                                        we weVar9222 = weVar5;
                                        we weVar10222 = weVar4;
                                        Integer num2222 = num;
                                        while (i7 < arrayList.size()) {
                                        }
                                        c1Var = MediaController.d2;
                                        if (c1Var != null) {
                                        }
                                        jg.c1 c1Var2222 = new jg.c1(i25, arrayList, arrayList2, num2222, weVar10222, weVar3, weVar9222);
                                        MediaController.d2 = c1Var2222;
                                        org.telegram.messenger.g0.i3(c1Var2222, 0);
                                        return;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    cursor = query2;
                                    str2 = "bucket_id";
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                cursor = query2;
                                str2 = "bucket_id";
                                str3 = "bucket_display_name";
                                str4 = "_data";
                                str5 = "_id";
                            }
                            try {
                                int columnIndex9 = query2.getColumnIndex("_size");
                                weVar3 = null;
                                weVar4 = null;
                                num = null;
                                Integer num3 = null;
                                while (query2.moveToNext()) {
                                    try {
                                        String string = query2.getString(columnIndex4);
                                        if (!TextUtils.isEmpty(string)) {
                                            int i26 = query2.getInt(columnIndex);
                                            int i27 = query2.getInt(columnIndex2);
                                            int i28 = columnIndex;
                                            String string2 = query2.getString(columnIndex3);
                                            gf gfVar = new gf(i27, i26, query2.getLong(columnIndex5), string, query2.getInt(columnIndex6), 0, false, query2.getInt(columnIndex7), query2.getInt(columnIndex8), query2.getLong(columnIndex9));
                                            int i29 = columnIndex3;
                                            int i30 = columnIndex4;
                                            cursor = query2;
                                            if (weVar3 == null) {
                                                i16 = columnIndex5;
                                                try {
                                                    i17 = columnIndex2;
                                                    i18 = columnIndex9;
                                                    weVar7 = new we(0, hd.M0(2131754292, null), gfVar);
                                                    arrayList2 = arrayList3;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    arrayList2 = arrayList3;
                                                    arrayList = arrayList6;
                                                    sparseArray2 = sparseArray3;
                                                    str9 = str;
                                                    weVar = weVar3;
                                                    weVar2 = weVar4;
                                                    z9 = true;
                                                    a8.g(th, z9);
                                                    if (cursor != null) {
                                                        try {
                                                            cursor.close();
                                                        } catch (Exception e14) {
                                                            a8.g(e14, z9);
                                                        }
                                                    }
                                                    weVar3 = weVar;
                                                    weVar4 = weVar2;
                                                    Context context32222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    weVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    we weVar92222 = weVar5;
                                                    we weVar102222 = weVar4;
                                                    Integer num22222 = num;
                                                    while (i7 < arrayList.size()) {
                                                    }
                                                    c1Var = MediaController.d2;
                                                    if (c1Var != null) {
                                                    }
                                                    jg.c1 c1Var22222 = new jg.c1(i25, arrayList, arrayList2, num22222, weVar102222, weVar3, weVar92222);
                                                    MediaController.d2 = c1Var22222;
                                                    org.telegram.messenger.g0.i3(c1Var22222, 0);
                                                    return;
                                                }
                                                try {
                                                    arrayList2.add(0, weVar7);
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    arrayList = arrayList6;
                                                    sparseArray2 = sparseArray3;
                                                    weVar2 = weVar4;
                                                    z9 = true;
                                                    weVar = weVar7;
                                                    str9 = str;
                                                    a8.g(th, z9);
                                                    if (cursor != null) {
                                                    }
                                                    weVar3 = weVar;
                                                    weVar4 = weVar2;
                                                    Context context322222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    weVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    we weVar922222 = weVar5;
                                                    we weVar1022222 = weVar4;
                                                    Integer num222222 = num;
                                                    while (i7 < arrayList.size()) {
                                                    }
                                                    c1Var = MediaController.d2;
                                                    if (c1Var != null) {
                                                    }
                                                    jg.c1 c1Var222222 = new jg.c1(i25, arrayList, arrayList2, num222222, weVar1022222, weVar3, weVar922222);
                                                    MediaController.d2 = c1Var222222;
                                                    org.telegram.messenger.g0.i3(c1Var222222, 0);
                                                    return;
                                                }
                                            } else {
                                                i16 = columnIndex5;
                                                i17 = columnIndex2;
                                                i18 = columnIndex9;
                                                arrayList2 = arrayList3;
                                                weVar7 = weVar3;
                                            }
                                            if (weVar4 == null) {
                                                try {
                                                    i19 = columnIndex8;
                                                    i20 = columnIndex6;
                                                    i21 = columnIndex7;
                                                    weVar8 = new we(0, hd.M0(2131754299, null), gfVar);
                                                    arrayList = arrayList6;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    arrayList = arrayList6;
                                                    weVar = weVar7;
                                                    sparseArray2 = sparseArray3;
                                                    str9 = str;
                                                    weVar2 = weVar4;
                                                    z9 = true;
                                                    a8.g(th, z9);
                                                    if (cursor != null) {
                                                    }
                                                    weVar3 = weVar;
                                                    weVar4 = weVar2;
                                                    Context context3222222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    weVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    we weVar9222222 = weVar5;
                                                    we weVar10222222 = weVar4;
                                                    Integer num2222222 = num;
                                                    while (i7 < arrayList.size()) {
                                                    }
                                                    c1Var = MediaController.d2;
                                                    if (c1Var != null) {
                                                    }
                                                    jg.c1 c1Var2222222 = new jg.c1(i25, arrayList, arrayList2, num2222222, weVar10222222, weVar3, weVar9222222);
                                                    MediaController.d2 = c1Var2222222;
                                                    org.telegram.messenger.g0.i3(c1Var2222222, 0);
                                                    return;
                                                }
                                                try {
                                                    arrayList.add(0, weVar8);
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    weVar = weVar7;
                                                    sparseArray2 = sparseArray3;
                                                    str9 = str;
                                                    z9 = true;
                                                    weVar2 = weVar8;
                                                    a8.g(th, z9);
                                                    if (cursor != null) {
                                                    }
                                                    weVar3 = weVar;
                                                    weVar4 = weVar2;
                                                    Context context32222222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    weVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    we weVar92222222 = weVar5;
                                                    we weVar102222222 = weVar4;
                                                    Integer num22222222 = num;
                                                    while (i7 < arrayList.size()) {
                                                    }
                                                    c1Var = MediaController.d2;
                                                    if (c1Var != null) {
                                                    }
                                                    jg.c1 c1Var22222222 = new jg.c1(i25, arrayList, arrayList2, num22222222, weVar102222222, weVar3, weVar92222222);
                                                    MediaController.d2 = c1Var22222222;
                                                    org.telegram.messenger.g0.i3(c1Var22222222, 0);
                                                    return;
                                                }
                                            } else {
                                                i19 = columnIndex8;
                                                i20 = columnIndex6;
                                                i21 = columnIndex7;
                                                arrayList = arrayList6;
                                                weVar8 = weVar4;
                                            }
                                            try {
                                                if (weVar7.e.size() < 15) {
                                                    gfVar.d();
                                                }
                                                weVar7.a(gfVar);
                                                weVar8.a(gfVar);
                                                sparseArray2 = sparseArray3;
                                                try {
                                                    we weVar11 = (we) sparseArray2.get(i27);
                                                    if (weVar11 == null) {
                                                        weVar11 = new we(i27, string2, gfVar);
                                                        sparseArray2.put(i27, weVar11);
                                                        if (num != null || str == null || string == null) {
                                                            weVar = weVar7;
                                                            weVar2 = weVar8;
                                                            str9 = str;
                                                        } else {
                                                            weVar = weVar7;
                                                            str9 = str;
                                                            try {
                                                                if (string.startsWith(str9)) {
                                                                    weVar2 = weVar8;
                                                                    try {
                                                                        arrayList.add(0, weVar11);
                                                                        num = Integer.valueOf(i27);
                                                                    } catch (Throwable th14) {
                                                                        th = th14;
                                                                        z9 = true;
                                                                        a8.g(th, z9);
                                                                        if (cursor != null) {
                                                                        }
                                                                        weVar3 = weVar;
                                                                        weVar4 = weVar2;
                                                                        Context context322222222 = org.telegram.messenger.t0.b;
                                                                        i10 = Build.VERSION.SDK_INT;
                                                                        if (i10 < 33) {
                                                                        }
                                                                        if (i10 >= 33) {
                                                                        }
                                                                        weVar5 = null;
                                                                        if (cursor != null) {
                                                                        }
                                                                        we weVar922222222 = weVar5;
                                                                        we weVar1022222222 = weVar4;
                                                                        Integer num222222222 = num;
                                                                        while (i7 < arrayList.size()) {
                                                                        }
                                                                        c1Var = MediaController.d2;
                                                                        if (c1Var != null) {
                                                                        }
                                                                        jg.c1 c1Var222222222 = new jg.c1(i25, arrayList, arrayList2, num222222222, weVar1022222222, weVar3, weVar922222222);
                                                                        MediaController.d2 = c1Var222222222;
                                                                        org.telegram.messenger.g0.i3(c1Var222222222, 0);
                                                                        return;
                                                                    }
                                                                } else {
                                                                    weVar2 = weVar8;
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                                weVar2 = weVar8;
                                                                z9 = true;
                                                                a8.g(th, z9);
                                                                if (cursor != null) {
                                                                }
                                                                weVar3 = weVar;
                                                                weVar4 = weVar2;
                                                                Context context3222222222 = org.telegram.messenger.t0.b;
                                                                i10 = Build.VERSION.SDK_INT;
                                                                if (i10 < 33) {
                                                                }
                                                                if (i10 >= 33) {
                                                                }
                                                                weVar5 = null;
                                                                if (cursor != null) {
                                                                }
                                                                we weVar9222222222 = weVar5;
                                                                we weVar10222222222 = weVar4;
                                                                Integer num2222222222 = num;
                                                                while (i7 < arrayList.size()) {
                                                                }
                                                                c1Var = MediaController.d2;
                                                                if (c1Var != null) {
                                                                }
                                                                jg.c1 c1Var2222222222 = new jg.c1(i25, arrayList, arrayList2, num2222222222, weVar10222222222, weVar3, weVar9222222222);
                                                                MediaController.d2 = c1Var2222222222;
                                                                org.telegram.messenger.g0.i3(c1Var2222222222, 0);
                                                                return;
                                                            }
                                                        }
                                                        arrayList.add(weVar11);
                                                    } else {
                                                        weVar = weVar7;
                                                        weVar2 = weVar8;
                                                        str9 = str;
                                                    }
                                                    weVar11.a(gfVar);
                                                    SparseArray sparseArray5 = sparseArray;
                                                    we weVar12 = (we) sparseArray5.get(i27);
                                                    if (weVar12 == null) {
                                                        weVar12 = new we(i27, string2, gfVar);
                                                        sparseArray5.put(i27, weVar12);
                                                        if (num3 != null || str9 == null || string == null || !string.startsWith(str9)) {
                                                            arrayList2.add(weVar12);
                                                        } else {
                                                            arrayList2.add(0, weVar12);
                                                            num3 = Integer.valueOf(i27);
                                                        }
                                                    }
                                                    weVar12.a(gfVar);
                                                    str = str9;
                                                    sparseArray = sparseArray5;
                                                    weVar3 = weVar;
                                                    weVar4 = weVar2;
                                                    columnIndex = i28;
                                                    columnIndex3 = i29;
                                                    columnIndex4 = i30;
                                                    query2 = cursor;
                                                    columnIndex5 = i16;
                                                    columnIndex9 = i18;
                                                    columnIndex6 = i20;
                                                    sparseArray3 = sparseArray2;
                                                    arrayList6 = arrayList;
                                                    columnIndex8 = i19;
                                                    columnIndex7 = i21;
                                                    arrayList3 = arrayList2;
                                                    columnIndex2 = i17;
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                    weVar = weVar7;
                                                    weVar2 = weVar8;
                                                    str9 = str;
                                                }
                                            } catch (Throwable th17) {
                                                th = th17;
                                                weVar = weVar7;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                            }
                                        }
                                    } catch (Throwable th18) {
                                        th = th18;
                                        cursor = query2;
                                        arrayList = arrayList6;
                                        sparseArray2 = sparseArray3;
                                        str9 = str;
                                        arrayList2 = arrayList3;
                                    }
                                }
                                cursor = query2;
                                arrayList = arrayList6;
                                sparseArray2 = sparseArray3;
                                str9 = str;
                                arrayList2 = arrayList3;
                            } catch (Throwable th19) {
                                th = th19;
                                cursor = query2;
                                arrayList = arrayList6;
                                sparseArray2 = sparseArray3;
                                str9 = str;
                                arrayList2 = arrayList3;
                                z9 = true;
                                weVar = null;
                                weVar2 = null;
                                num = null;
                                a8.g(th, z9);
                                if (cursor != null) {
                                }
                                weVar3 = weVar;
                                weVar4 = weVar2;
                                Context context32222222222 = org.telegram.messenger.t0.b;
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 < 33) {
                                }
                                if (i10 >= 33) {
                                }
                                weVar5 = null;
                                if (cursor != null) {
                                }
                                we weVar92222222222 = weVar5;
                                we weVar102222222222 = weVar4;
                                Integer num22222222222 = num;
                                while (i7 < arrayList.size()) {
                                }
                                c1Var = MediaController.d2;
                                if (c1Var != null) {
                                }
                                jg.c1 c1Var22222222222 = new jg.c1(i25, arrayList, arrayList2, num22222222222, weVar102222222222, weVar3, weVar92222222222);
                                MediaController.d2 = c1Var22222222222;
                                org.telegram.messenger.g0.i3(c1Var22222222222, 0);
                                return;
                            }
                        } else {
                            cursor = query2;
                            str2 = "bucket_id";
                            str3 = "bucket_display_name";
                            str4 = "_data";
                            str5 = "_id";
                            str6 = "height";
                            str7 = "width";
                            str8 = "orientation";
                            arrayList = arrayList6;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList2 = arrayList3;
                            weVar3 = null;
                            weVar4 = null;
                            num = null;
                        }
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e15) {
                                a8.g(e15, true);
                            }
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        str2 = "bucket_id";
                        str3 = "bucket_display_name";
                        str4 = "_data";
                        str5 = "_id";
                        str6 = "height";
                        str7 = "width";
                        str8 = "orientation";
                        arrayList = arrayList6;
                        sparseArray2 = sparseArray3;
                        str9 = str;
                        arrayList2 = arrayList3;
                        z9 = true;
                        weVar = null;
                        weVar2 = null;
                        num = null;
                        cursor = null;
                        a8.g(th, z9);
                        if (cursor != null) {
                        }
                        weVar3 = weVar;
                        weVar4 = weVar2;
                        Context context322222222222 = org.telegram.messenger.t0.b;
                        i10 = Build.VERSION.SDK_INT;
                        if (i10 < 33) {
                        }
                        if (i10 >= 33) {
                        }
                        weVar5 = null;
                        if (cursor != null) {
                        }
                        we weVar922222222222 = weVar5;
                        we weVar1022222222222 = weVar4;
                        Integer num222222222222 = num;
                        while (i7 < arrayList.size()) {
                        }
                        c1Var = MediaController.d2;
                        if (c1Var != null) {
                        }
                        jg.c1 c1Var222222222222 = new jg.c1(i25, arrayList, arrayList2, num222222222222, weVar1022222222222, weVar3, weVar922222222222);
                        MediaController.d2 = c1Var222222222222;
                        org.telegram.messenger.g0.i3(c1Var222222222222, 0);
                        return;
                    }
                    Context context3222222222222 = org.telegram.messenger.t0.b;
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 < 33) {
                        try {
                            if (context3222222222222.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            }
                            ContentResolver contentResolver = org.telegram.messenger.t0.b.getContentResolver();
                            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            String[] strArr2 = MediaController.W1;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i10 <= 28 ? "date_modified" : "datetaken");
                            sb3.append(" DESC");
                            query = MediaStore.Images.Media.query(contentResolver, uri, strArr2, null, null, sb3.toString());
                        } catch (Throwable th21) {
                            th = th21;
                            weVar5 = null;
                            z10 = true;
                            try {
                                a8.g(th, z10);
                                if (cursor != null) {
                                }
                                we weVar9222222222222 = weVar5;
                                we weVar10222222222222 = weVar4;
                                Integer num2222222222222 = num;
                                while (i7 < arrayList.size()) {
                                }
                                c1Var = MediaController.d2;
                                if (c1Var != null) {
                                }
                                jg.c1 c1Var2222222222222 = new jg.c1(i25, arrayList, arrayList2, num2222222222222, weVar10222222222222, weVar3, weVar9222222222222);
                                MediaController.d2 = c1Var2222222222222;
                                org.telegram.messenger.g0.i3(c1Var2222222222222, 0);
                                return;
                            } finally {
                            }
                        }
                        if (query != null) {
                            cursor = query;
                            weVar5 = null;
                            if (cursor != null) {
                            }
                            we weVar92222222222222 = weVar5;
                            we weVar102222222222222 = weVar4;
                            Integer num22222222222222 = num;
                            while (i7 < arrayList.size()) {
                            }
                            c1Var = MediaController.d2;
                            if (c1Var != null) {
                            }
                            jg.c1 c1Var22222222222222 = new jg.c1(i25, arrayList, arrayList2, num22222222222222, weVar102222222222222, weVar3, weVar92222222222222);
                            MediaController.d2 = c1Var22222222222222;
                            org.telegram.messenger.g0.i3(c1Var22222222222222, 0);
                            return;
                        }
                        try {
                            int columnIndex10 = query.getColumnIndex(str5);
                            int columnIndex11 = query.getColumnIndex(str2);
                            int columnIndex12 = query.getColumnIndex(str3);
                            int columnIndex13 = query.getColumnIndex(str4);
                            int columnIndex14 = query.getColumnIndex(i10 > 28 ? "date_modified" : "datetaken");
                            int columnIndex15 = query.getColumnIndex("duration");
                            int columnIndex16 = query.getColumnIndex(str7);
                            int columnIndex17 = query.getColumnIndex(str6);
                            int columnIndex18 = query.getColumnIndex("_size");
                            query.getColumnIndex(str8);
                            we weVar13 = null;
                            while (query.moveToNext()) {
                                try {
                                    String string3 = query.getString(columnIndex13);
                                    if (!TextUtils.isEmpty(string3)) {
                                        int i31 = query.getInt(columnIndex10);
                                        int i32 = query.getInt(columnIndex11);
                                        String string4 = query.getString(columnIndex12);
                                        int i33 = columnIndex10;
                                        int i34 = columnIndex14;
                                        gf gfVar2 = new gf(i32, i31, query.getLong(columnIndex14), string3, 0, (int) (query.getLong(columnIndex15) / 1000), true, query.getInt(columnIndex16), query.getInt(columnIndex17), query.getLong(columnIndex18));
                                        cursor2 = query;
                                        if (weVar13 == null) {
                                            i11 = columnIndex11;
                                            try {
                                                i12 = columnIndex12;
                                                i13 = columnIndex13;
                                                we weVar14 = new we(0, hd.M0(2131754287, null), gfVar2);
                                                try {
                                                    weVar14.b = true;
                                                    int i35 = weVar4 != null ? 1 : 0;
                                                    if (weVar3 != null) {
                                                        i35++;
                                                    }
                                                    arrayList.add(i35, weVar14);
                                                    weVar13 = weVar14;
                                                } catch (Throwable th22) {
                                                    th = th22;
                                                    weVar5 = weVar14;
                                                    cursor = cursor2;
                                                    z10 = true;
                                                    a8.g(th, z10);
                                                    if (cursor != null) {
                                                    }
                                                    we weVar922222222222222 = weVar5;
                                                    we weVar1022222222222222 = weVar4;
                                                    Integer num222222222222222 = num;
                                                    while (i7 < arrayList.size()) {
                                                    }
                                                    c1Var = MediaController.d2;
                                                    if (c1Var != null) {
                                                    }
                                                    jg.c1 c1Var222222222222222 = new jg.c1(i25, arrayList, arrayList2, num222222222222222, weVar1022222222222222, weVar3, weVar922222222222222);
                                                    MediaController.d2 = c1Var222222222222222;
                                                    org.telegram.messenger.g0.i3(c1Var222222222222222, 0);
                                                    return;
                                                }
                                            } catch (Throwable th23) {
                                                th = th23;
                                                weVar5 = weVar13;
                                                cursor = cursor2;
                                                z10 = true;
                                                a8.g(th, z10);
                                                if (cursor != null) {
                                                }
                                                we weVar9222222222222222 = weVar5;
                                                we weVar10222222222222222 = weVar4;
                                                Integer num2222222222222222 = num;
                                                while (i7 < arrayList.size()) {
                                                }
                                                c1Var = MediaController.d2;
                                                if (c1Var != null) {
                                                }
                                                jg.c1 c1Var2222222222222222 = new jg.c1(i25, arrayList, arrayList2, num2222222222222222, weVar10222222222222222, weVar3, weVar9222222222222222);
                                                MediaController.d2 = c1Var2222222222222222;
                                                org.telegram.messenger.g0.i3(c1Var2222222222222222, 0);
                                                return;
                                            }
                                        } else {
                                            i11 = columnIndex11;
                                            i12 = columnIndex12;
                                            i13 = columnIndex13;
                                        }
                                        if (weVar4 == null) {
                                            i14 = columnIndex15;
                                            weVar6 = new we(0, hd.M0(2131754299, null), gfVar2);
                                            try {
                                                arrayList.add(0, weVar6);
                                            } catch (Throwable th24) {
                                                th = th24;
                                                weVar4 = weVar6;
                                                weVar5 = weVar13;
                                                cursor = cursor2;
                                                z10 = true;
                                                a8.g(th, z10);
                                                if (cursor != null) {
                                                    try {
                                                        cursor.close();
                                                    } catch (Exception e16) {
                                                        e10 = e16;
                                                        a8.g(e10, z10);
                                                        we weVar92222222222222222 = weVar5;
                                                        we weVar102222222222222222 = weVar4;
                                                        Integer num22222222222222222 = num;
                                                        while (i7 < arrayList.size()) {
                                                        }
                                                        c1Var = MediaController.d2;
                                                        if (c1Var != null) {
                                                        }
                                                        jg.c1 c1Var22222222222222222 = new jg.c1(i25, arrayList, arrayList2, num22222222222222222, weVar102222222222222222, weVar3, weVar92222222222222222);
                                                        MediaController.d2 = c1Var22222222222222222;
                                                        org.telegram.messenger.g0.i3(c1Var22222222222222222, 0);
                                                        return;
                                                    }
                                                }
                                                we weVar922222222222222222 = weVar5;
                                                we weVar1022222222222222222 = weVar4;
                                                Integer num222222222222222222 = num;
                                                while (i7 < arrayList.size()) {
                                                }
                                                c1Var = MediaController.d2;
                                                if (c1Var != null) {
                                                }
                                                jg.c1 c1Var222222222222222222 = new jg.c1(i25, arrayList, arrayList2, num222222222222222222, weVar1022222222222222222, weVar3, weVar922222222222222222);
                                                MediaController.d2 = c1Var222222222222222222;
                                                org.telegram.messenger.g0.i3(c1Var222222222222222222, 0);
                                                return;
                                            }
                                        } else {
                                            i14 = columnIndex15;
                                            weVar6 = weVar4;
                                        }
                                        weVar13.a(gfVar2);
                                        weVar6.a(gfVar2);
                                        we weVar15 = (we) sparseArray2.get(i32);
                                        if (weVar15 == null) {
                                            weVar15 = new we(i32, string4, gfVar2);
                                            sparseArray2.put(i32, weVar15);
                                            if (num != null || str9 == null || string3 == null || !string3.startsWith(str9)) {
                                                arrayList.add(weVar15);
                                            } else {
                                                arrayList.add(0, weVar15);
                                                num = Integer.valueOf(i32);
                                            }
                                        }
                                        weVar15.a(gfVar2);
                                        weVar4 = weVar6;
                                        columnIndex10 = i33;
                                        query = cursor2;
                                        columnIndex11 = i11;
                                        columnIndex12 = i12;
                                        columnIndex13 = i13;
                                        columnIndex14 = i34;
                                        columnIndex15 = i14;
                                    }
                                } catch (Throwable th25) {
                                    th = th25;
                                    cursor2 = query;
                                }
                            }
                            weVar5 = weVar13;
                            cursor = query;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e17) {
                                    e10 = e17;
                                    z10 = true;
                                    a8.g(e10, z10);
                                    we weVar9222222222222222222 = weVar5;
                                    we weVar10222222222222222222 = weVar4;
                                    Integer num2222222222222222222 = num;
                                    while (i7 < arrayList.size()) {
                                    }
                                    c1Var = MediaController.d2;
                                    if (c1Var != null) {
                                    }
                                    jg.c1 c1Var2222222222222222222 = new jg.c1(i25, arrayList, arrayList2, num2222222222222222222, weVar10222222222222222222, weVar3, weVar9222222222222222222);
                                    MediaController.d2 = c1Var2222222222222222222;
                                    org.telegram.messenger.g0.i3(c1Var2222222222222222222, 0);
                                    return;
                                }
                            }
                        } catch (Throwable th26) {
                            th = th26;
                            cursor = query;
                            weVar5 = null;
                            z10 = true;
                            a8.g(th, z10);
                            if (cursor != null) {
                            }
                            we weVar92222222222222222222 = weVar5;
                            we weVar102222222222222222222 = weVar4;
                            Integer num22222222222222222222 = num;
                            while (i7 < arrayList.size()) {
                            }
                            c1Var = MediaController.d2;
                            if (c1Var != null) {
                            }
                            jg.c1 c1Var22222222222222222222 = new jg.c1(i25, arrayList, arrayList2, num22222222222222222222, weVar102222222222222222222, weVar3, weVar92222222222222222222);
                            MediaController.d2 = c1Var22222222222222222222;
                            org.telegram.messenger.g0.i3(c1Var22222222222222222222, 0);
                            return;
                        }
                        we weVar922222222222222222222 = weVar5;
                        we weVar1022222222222222222222 = weVar4;
                        Integer num222222222222222222222 = num;
                        for (i7 = 0; i7 < arrayList.size(); i7++) {
                            Collections.sort(((we) arrayList.get(i7)).e, new jg.x(18));
                        }
                        c1Var = MediaController.d2;
                        if (c1Var != null) {
                            org.telegram.messenger.g0.r(c1Var);
                        }
                        jg.c1 c1Var222222222222222222222 = new jg.c1(i25, arrayList, arrayList2, num222222222222222222222, weVar1022222222222222222222, weVar3, weVar922222222222222222222);
                        MediaController.d2 = c1Var222222222222222222222;
                        org.telegram.messenger.g0.i3(c1Var222222222222222222222, 0);
                        return;
                    }
                    if (i10 >= 33) {
                        if (context3222222222222.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
                            if (context3222222222222.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) {
                                break;
                            }
                        }
                        ContentResolver contentResolver2 = org.telegram.messenger.t0.b.getContentResolver();
                        Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr22 = MediaController.W1;
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(i10 <= 28 ? "date_modified" : "datetaken");
                        sb32.append(" DESC");
                        query = MediaStore.Images.Media.query(contentResolver2, uri2, strArr22, null, null, sb32.toString());
                        if (query != null) {
                        }
                    }
                    weVar5 = null;
                    if (cursor != null) {
                    }
                    we weVar9222222222222222222222 = weVar5;
                    we weVar10222222222222222222222 = weVar4;
                    Integer num2222222222222222222222 = num;
                    while (i7 < arrayList.size()) {
                    }
                    c1Var = MediaController.d2;
                    if (c1Var != null) {
                    }
                    jg.c1 c1Var2222222222222222222222 = new jg.c1(i25, arrayList, arrayList2, num2222222222222222222222, weVar10222222222222222222222, weVar3, weVar9222222222222222222222);
                    MediaController.d2 = c1Var2222222222222222222222;
                    org.telegram.messenger.g0.i3(c1Var2222222222222222222222, 0);
                    return;
                }
                if (i15 >= 33 || (context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0)) {
                    str2 = "bucket_id";
                    str3 = "bucket_display_name";
                    str4 = "_data";
                    str5 = "_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList2 = arrayList3;
                    weVar3 = null;
                    weVar4 = null;
                    num = null;
                    cursor = null;
                    if (cursor != null) {
                    }
                    Context context32222222222222 = org.telegram.messenger.t0.b;
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 < 33) {
                    }
                    if (i10 >= 33) {
                    }
                    weVar5 = null;
                    if (cursor != null) {
                    }
                    we weVar92222222222222222222222 = weVar5;
                    we weVar102222222222222222222222 = weVar4;
                    Integer num22222222222222222222222 = num;
                    while (i7 < arrayList.size()) {
                    }
                    c1Var = MediaController.d2;
                    if (c1Var != null) {
                    }
                    jg.c1 c1Var22222222222222222222222 = new jg.c1(i25, arrayList, arrayList2, num22222222222222222222222, weVar102222222222222222222222, weVar3, weVar92222222222222222222222);
                    MediaController.d2 = c1Var22222222222222222222222;
                    org.telegram.messenger.g0.i3(c1Var22222222222222222222222, 0);
                    return;
                }
                query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.V1, null, null, (i15 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                if (query2 == null) {
                }
                if (cursor != null) {
                }
                Context context322222222222222 = org.telegram.messenger.t0.b;
                i10 = Build.VERSION.SDK_INT;
                if (i10 < 33) {
                }
                if (i10 >= 33) {
                }
                weVar5 = null;
                if (cursor != null) {
                }
                we weVar922222222222222222222222 = weVar5;
                we weVar1022222222222222222222222 = weVar4;
                Integer num222222222222222222222222 = num;
                while (i7 < arrayList.size()) {
                }
                c1Var = MediaController.d2;
                if (c1Var != null) {
                }
                jg.c1 c1Var222222222222222222222222 = new jg.c1(i25, arrayList, arrayList2, num222222222222222222222222, weVar1022222222222222222222222, weVar3, weVar922222222222222222222222);
                MediaController.d2 = c1Var222222222222222222222222;
                org.telegram.messenger.g0.i3(c1Var222222222222222222222222, 0);
                return;
            case 3:
                int i36 = this.b;
                String[] strArr3 = MediaController.V1;
                try {
                    context2 = org.telegram.messenger.t0.b;
                } catch (Throwable th27) {
                    th = th27;
                    cursor3 = null;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (context2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context2.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context2.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        }
                        cursor3 = MediaStore.Images.Media.query(context2.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                        if (cursor3 != null) {
                            try {
                            } catch (Throwable th28) {
                                th = th28;
                                try {
                                    a8.g(th, true);
                                    cursor4 = cursor3;
                                    i22 = 0;
                                    Context context4 = org.telegram.messenger.t0.b;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                    }
                                    break;
                                } finally {
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            }
                            if (cursor3.moveToNext()) {
                                i23 = cursor3.getInt(0);
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                cursor4 = cursor3;
                                i22 = i23;
                                Context context42 = org.telegram.messenger.t0.b;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (context42.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context42.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context42.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                    }
                                    cursor4 = MediaStore.Images.Media.query(context42.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                                    if (cursor4 != null && cursor4.moveToNext()) {
                                        i22 += cursor4.getInt(0);
                                        break;
                                    }
                                }
                            }
                        }
                        i23 = 0;
                        if (cursor3 != null) {
                        }
                        cursor4 = cursor3;
                        i22 = i23;
                        Context context422 = org.telegram.messenger.t0.b;
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    if (context2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        cursor3 = null;
                        i23 = 0;
                        if (cursor3 != null) {
                        }
                        cursor4 = cursor3;
                        i22 = i23;
                        Context context4222 = org.telegram.messenger.t0.b;
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    Context context42222 = org.telegram.messenger.t0.b;
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                } catch (Throwable th29) {
                    try {
                        a8.g(th29, true);
                        break;
                    } finally {
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                    }
                }
                cursor3 = MediaStore.Images.Media.query(context2.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                if (cursor3 != null) {
                }
                i23 = 0;
                if (cursor3 != null) {
                }
                cursor4 = cursor3;
                i22 = i23;
                break;
            case 4:
                int i37 = this.b;
                int i38 = NotificationRepeat.a;
                dt.k0.c(new rs(dt.t(i37), i24));
                return;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                return;
            case 6:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                return;
            case 7:
                long j3 = this.b - 864000;
                try {
                    P0 = org.telegram.messenger.g0.P0();
                } catch (Throwable th30) {
                    a8.g(th30, true);
                }
                if (P0 == null) {
                    return;
                }
                Utilities.clearDir(P0.getAbsolutePath(), 0, j3, false);
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putInt("lastLogsCheckTime", iz.I);
                edit.apply();
                return;
            case 8:
                ConnectionsManager.lambda$onUpdate$13(this.b);
                return;
            case 9:
                ConnectionsManager.lambda$onSessionCreated$14(this.b);
                return;
            case 10:
                ConnectionsManager.lambda$onLogout$16(this.b);
                return;
            case 11:
                ui.b0(this.b).B(5);
                return;
            case 12:
                int i39 = this.b;
                String str10 = LaunchActivity.B1;
                org.telegram.messenger.t0.E = true;
                org.telegram.messenger.t0.G = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    qp.s1(i39).g7 = false;
                    return;
                }
                return;
            case 13:
                int i40 = this.b;
                org.telegram.utils.twidget.p.v(i40 + "/", org.telegram.utils.twidget.p.b.keySet());
                for (org.telegram.utils.twidget.m mVar : org.telegram.utils.twidget.p.a.values()) {
                    if (mVar.b == i40 && mVar.v.isEmpty() && (uVar = mVar.t) != null) {
                        uVar.p();
                        uVar.g = null;
                        uVar.i = 0;
                        uVar.k = 0;
                        uVar.l = false;
                    }
                }
                return;
            default:
                String i41 = com.google.android.recaptcha.internal.a.i(this.b, "/");
                org.telegram.utils.twidget.p.v(i41, org.telegram.utils.twidget.p.b.keySet());
                org.telegram.utils.twidget.p.v(i41, org.telegram.utils.twidget.p.c.keySet());
                org.telegram.utils.twidget.p.v(i41, org.telegram.utils.twidget.p.d.keySet());
                return;
        }
    }
}
