package ii;

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
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.is;
import org.telegram.messenger.li;
import org.telegram.messenger.pe;
import org.telegram.messenger.qr;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ i2(int i3, int i10) {
        this.a = i10;
        this.b = i3;
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
    
        r0 = org.telegram.messenger.MediaController.Z1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b8, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ba, code lost:
    
        org.telegram.messenger.g0.r(r0);
        org.telegram.messenger.MediaController.Z1 = null;
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
        boolean z10;
        ArrayList arrayList2;
        pe peVar;
        pe peVar2;
        Integer num;
        Cursor cursor;
        pe peVar3;
        pe peVar4;
        boolean z11;
        pe peVar5;
        Exception e10;
        int i3;
        ai.d3 d3Var;
        int i10;
        Cursor query;
        Cursor cursor2;
        int i11;
        int i12;
        int i13;
        int i14;
        pe peVar6;
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
        pe peVar7;
        pe peVar8;
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
                li.b0(this.b).E0(false, true, null);
                return;
            case 1:
                try {
                    qr.a0(this.b).b.executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                int i25 = this.b;
                String[] strArr = MediaController.W1;
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
                    peVar3 = null;
                    peVar4 = null;
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
                    peVar5 = null;
                    if (cursor != null) {
                    }
                    pe peVar9 = peVar5;
                    pe peVar10 = peVar4;
                    Integer num2 = num;
                    while (i3 < arrayList.size()) {
                    }
                    d3Var = MediaController.e2;
                    if (d3Var != null) {
                    }
                    ai.d3 d3Var2 = new ai.d3(i25, arrayList, arrayList2, num2, peVar10, peVar3, peVar9);
                    MediaController.e2 = d3Var2;
                    org.telegram.messenger.g0.i3(d3Var2, 0);
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
                    z10 = true;
                    arrayList2 = arrayList5;
                }
                if (i15 < 33) {
                    try {
                        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        }
                        query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.W1, null, null, (i15 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
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
                                                z10 = true;
                                                peVar = null;
                                                peVar2 = null;
                                                num = null;
                                                try {
                                                    a8.g(th, z10);
                                                    if (cursor != null) {
                                                    }
                                                    peVar3 = peVar;
                                                    peVar4 = peVar2;
                                                    Context context32 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    peVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    pe peVar92 = peVar5;
                                                    pe peVar102 = peVar4;
                                                    Integer num22 = num;
                                                    while (i3 < arrayList.size()) {
                                                    }
                                                    d3Var = MediaController.e2;
                                                    if (d3Var != null) {
                                                    }
                                                    ai.d3 d3Var22 = new ai.d3(i25, arrayList, arrayList2, num22, peVar102, peVar3, peVar92);
                                                    MediaController.e2 = d3Var22;
                                                    org.telegram.messenger.g0.i3(d3Var22, 0);
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
                                            z10 = true;
                                            peVar = null;
                                            peVar2 = null;
                                            num = null;
                                            a8.g(th, z10);
                                            if (cursor != null) {
                                            }
                                            peVar3 = peVar;
                                            peVar4 = peVar2;
                                            Context context322 = org.telegram.messenger.t0.b;
                                            i10 = Build.VERSION.SDK_INT;
                                            if (i10 < 33) {
                                            }
                                            if (i10 >= 33) {
                                            }
                                            peVar5 = null;
                                            if (cursor != null) {
                                            }
                                            pe peVar922 = peVar5;
                                            pe peVar1022 = peVar4;
                                            Integer num222 = num;
                                            while (i3 < arrayList.size()) {
                                            }
                                            d3Var = MediaController.e2;
                                            if (d3Var != null) {
                                            }
                                            ai.d3 d3Var222 = new ai.d3(i25, arrayList, arrayList2, num222, peVar1022, peVar3, peVar922);
                                            MediaController.e2 = d3Var222;
                                            org.telegram.messenger.g0.i3(d3Var222, 0);
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
                                        z10 = true;
                                        peVar = null;
                                        peVar2 = null;
                                        num = null;
                                        a8.g(th, z10);
                                        if (cursor != null) {
                                        }
                                        peVar3 = peVar;
                                        peVar4 = peVar2;
                                        Context context3222 = org.telegram.messenger.t0.b;
                                        i10 = Build.VERSION.SDK_INT;
                                        if (i10 < 33) {
                                        }
                                        if (i10 >= 33) {
                                        }
                                        peVar5 = null;
                                        if (cursor != null) {
                                        }
                                        pe peVar9222 = peVar5;
                                        pe peVar10222 = peVar4;
                                        Integer num2222 = num;
                                        while (i3 < arrayList.size()) {
                                        }
                                        d3Var = MediaController.e2;
                                        if (d3Var != null) {
                                        }
                                        ai.d3 d3Var2222 = new ai.d3(i25, arrayList, arrayList2, num2222, peVar10222, peVar3, peVar9222);
                                        MediaController.e2 = d3Var2222;
                                        org.telegram.messenger.g0.i3(d3Var2222, 0);
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
                                peVar3 = null;
                                peVar4 = null;
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
                                            ye yeVar = new ye(i27, i26, query2.getLong(columnIndex5), string, query2.getInt(columnIndex6), 0, false, query2.getInt(columnIndex7), query2.getInt(columnIndex8), query2.getLong(columnIndex9));
                                            int i29 = columnIndex3;
                                            int i30 = columnIndex4;
                                            cursor = query2;
                                            if (peVar3 == null) {
                                                i16 = columnIndex5;
                                                try {
                                                    i17 = columnIndex2;
                                                    i18 = columnIndex9;
                                                    peVar7 = new pe(0, bd.M0(2131754292, null), yeVar);
                                                    arrayList2 = arrayList3;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    arrayList2 = arrayList3;
                                                    arrayList = arrayList6;
                                                    sparseArray2 = sparseArray3;
                                                    str9 = str;
                                                    peVar = peVar3;
                                                    peVar2 = peVar4;
                                                    z10 = true;
                                                    a8.g(th, z10);
                                                    if (cursor != null) {
                                                        try {
                                                            cursor.close();
                                                        } catch (Exception e14) {
                                                            a8.g(e14, z10);
                                                        }
                                                    }
                                                    peVar3 = peVar;
                                                    peVar4 = peVar2;
                                                    Context context32222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    peVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    pe peVar92222 = peVar5;
                                                    pe peVar102222 = peVar4;
                                                    Integer num22222 = num;
                                                    while (i3 < arrayList.size()) {
                                                    }
                                                    d3Var = MediaController.e2;
                                                    if (d3Var != null) {
                                                    }
                                                    ai.d3 d3Var22222 = new ai.d3(i25, arrayList, arrayList2, num22222, peVar102222, peVar3, peVar92222);
                                                    MediaController.e2 = d3Var22222;
                                                    org.telegram.messenger.g0.i3(d3Var22222, 0);
                                                    return;
                                                }
                                                try {
                                                    arrayList2.add(0, peVar7);
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    arrayList = arrayList6;
                                                    sparseArray2 = sparseArray3;
                                                    peVar2 = peVar4;
                                                    z10 = true;
                                                    peVar = peVar7;
                                                    str9 = str;
                                                    a8.g(th, z10);
                                                    if (cursor != null) {
                                                    }
                                                    peVar3 = peVar;
                                                    peVar4 = peVar2;
                                                    Context context322222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    peVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    pe peVar922222 = peVar5;
                                                    pe peVar1022222 = peVar4;
                                                    Integer num222222 = num;
                                                    while (i3 < arrayList.size()) {
                                                    }
                                                    d3Var = MediaController.e2;
                                                    if (d3Var != null) {
                                                    }
                                                    ai.d3 d3Var222222 = new ai.d3(i25, arrayList, arrayList2, num222222, peVar1022222, peVar3, peVar922222);
                                                    MediaController.e2 = d3Var222222;
                                                    org.telegram.messenger.g0.i3(d3Var222222, 0);
                                                    return;
                                                }
                                            } else {
                                                i16 = columnIndex5;
                                                i17 = columnIndex2;
                                                i18 = columnIndex9;
                                                arrayList2 = arrayList3;
                                                peVar7 = peVar3;
                                            }
                                            if (peVar4 == null) {
                                                try {
                                                    i19 = columnIndex8;
                                                    i20 = columnIndex6;
                                                    i21 = columnIndex7;
                                                    peVar8 = new pe(0, bd.M0(2131754299, null), yeVar);
                                                    arrayList = arrayList6;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    arrayList = arrayList6;
                                                    peVar = peVar7;
                                                    sparseArray2 = sparseArray3;
                                                    str9 = str;
                                                    peVar2 = peVar4;
                                                    z10 = true;
                                                    a8.g(th, z10);
                                                    if (cursor != null) {
                                                    }
                                                    peVar3 = peVar;
                                                    peVar4 = peVar2;
                                                    Context context3222222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    peVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    pe peVar9222222 = peVar5;
                                                    pe peVar10222222 = peVar4;
                                                    Integer num2222222 = num;
                                                    while (i3 < arrayList.size()) {
                                                    }
                                                    d3Var = MediaController.e2;
                                                    if (d3Var != null) {
                                                    }
                                                    ai.d3 d3Var2222222 = new ai.d3(i25, arrayList, arrayList2, num2222222, peVar10222222, peVar3, peVar9222222);
                                                    MediaController.e2 = d3Var2222222;
                                                    org.telegram.messenger.g0.i3(d3Var2222222, 0);
                                                    return;
                                                }
                                                try {
                                                    arrayList.add(0, peVar8);
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    peVar = peVar7;
                                                    sparseArray2 = sparseArray3;
                                                    str9 = str;
                                                    z10 = true;
                                                    peVar2 = peVar8;
                                                    a8.g(th, z10);
                                                    if (cursor != null) {
                                                    }
                                                    peVar3 = peVar;
                                                    peVar4 = peVar2;
                                                    Context context32222222 = org.telegram.messenger.t0.b;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 < 33) {
                                                    }
                                                    if (i10 >= 33) {
                                                    }
                                                    peVar5 = null;
                                                    if (cursor != null) {
                                                    }
                                                    pe peVar92222222 = peVar5;
                                                    pe peVar102222222 = peVar4;
                                                    Integer num22222222 = num;
                                                    while (i3 < arrayList.size()) {
                                                    }
                                                    d3Var = MediaController.e2;
                                                    if (d3Var != null) {
                                                    }
                                                    ai.d3 d3Var22222222 = new ai.d3(i25, arrayList, arrayList2, num22222222, peVar102222222, peVar3, peVar92222222);
                                                    MediaController.e2 = d3Var22222222;
                                                    org.telegram.messenger.g0.i3(d3Var22222222, 0);
                                                    return;
                                                }
                                            } else {
                                                i19 = columnIndex8;
                                                i20 = columnIndex6;
                                                i21 = columnIndex7;
                                                arrayList = arrayList6;
                                                peVar8 = peVar4;
                                            }
                                            try {
                                                if (peVar7.e.size() < 15) {
                                                    yeVar.d();
                                                }
                                                peVar7.a(yeVar);
                                                peVar8.a(yeVar);
                                                sparseArray2 = sparseArray3;
                                                try {
                                                    pe peVar11 = (pe) sparseArray2.get(i27);
                                                    if (peVar11 == null) {
                                                        peVar11 = new pe(i27, string2, yeVar);
                                                        sparseArray2.put(i27, peVar11);
                                                        if (num != null || str == null || string == null) {
                                                            peVar = peVar7;
                                                            peVar2 = peVar8;
                                                            str9 = str;
                                                        } else {
                                                            peVar = peVar7;
                                                            str9 = str;
                                                            try {
                                                                if (string.startsWith(str9)) {
                                                                    peVar2 = peVar8;
                                                                    try {
                                                                        arrayList.add(0, peVar11);
                                                                        num = Integer.valueOf(i27);
                                                                    } catch (Throwable th14) {
                                                                        th = th14;
                                                                        z10 = true;
                                                                        a8.g(th, z10);
                                                                        if (cursor != null) {
                                                                        }
                                                                        peVar3 = peVar;
                                                                        peVar4 = peVar2;
                                                                        Context context322222222 = org.telegram.messenger.t0.b;
                                                                        i10 = Build.VERSION.SDK_INT;
                                                                        if (i10 < 33) {
                                                                        }
                                                                        if (i10 >= 33) {
                                                                        }
                                                                        peVar5 = null;
                                                                        if (cursor != null) {
                                                                        }
                                                                        pe peVar922222222 = peVar5;
                                                                        pe peVar1022222222 = peVar4;
                                                                        Integer num222222222 = num;
                                                                        while (i3 < arrayList.size()) {
                                                                        }
                                                                        d3Var = MediaController.e2;
                                                                        if (d3Var != null) {
                                                                        }
                                                                        ai.d3 d3Var222222222 = new ai.d3(i25, arrayList, arrayList2, num222222222, peVar1022222222, peVar3, peVar922222222);
                                                                        MediaController.e2 = d3Var222222222;
                                                                        org.telegram.messenger.g0.i3(d3Var222222222, 0);
                                                                        return;
                                                                    }
                                                                } else {
                                                                    peVar2 = peVar8;
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                                peVar2 = peVar8;
                                                                z10 = true;
                                                                a8.g(th, z10);
                                                                if (cursor != null) {
                                                                }
                                                                peVar3 = peVar;
                                                                peVar4 = peVar2;
                                                                Context context3222222222 = org.telegram.messenger.t0.b;
                                                                i10 = Build.VERSION.SDK_INT;
                                                                if (i10 < 33) {
                                                                }
                                                                if (i10 >= 33) {
                                                                }
                                                                peVar5 = null;
                                                                if (cursor != null) {
                                                                }
                                                                pe peVar9222222222 = peVar5;
                                                                pe peVar10222222222 = peVar4;
                                                                Integer num2222222222 = num;
                                                                while (i3 < arrayList.size()) {
                                                                }
                                                                d3Var = MediaController.e2;
                                                                if (d3Var != null) {
                                                                }
                                                                ai.d3 d3Var2222222222 = new ai.d3(i25, arrayList, arrayList2, num2222222222, peVar10222222222, peVar3, peVar9222222222);
                                                                MediaController.e2 = d3Var2222222222;
                                                                org.telegram.messenger.g0.i3(d3Var2222222222, 0);
                                                                return;
                                                            }
                                                        }
                                                        arrayList.add(peVar11);
                                                    } else {
                                                        peVar = peVar7;
                                                        peVar2 = peVar8;
                                                        str9 = str;
                                                    }
                                                    peVar11.a(yeVar);
                                                    SparseArray sparseArray5 = sparseArray;
                                                    pe peVar12 = (pe) sparseArray5.get(i27);
                                                    if (peVar12 == null) {
                                                        peVar12 = new pe(i27, string2, yeVar);
                                                        sparseArray5.put(i27, peVar12);
                                                        if (num3 != null || str9 == null || string == null || !string.startsWith(str9)) {
                                                            arrayList2.add(peVar12);
                                                        } else {
                                                            arrayList2.add(0, peVar12);
                                                            num3 = Integer.valueOf(i27);
                                                        }
                                                    }
                                                    peVar12.a(yeVar);
                                                    str = str9;
                                                    sparseArray = sparseArray5;
                                                    peVar3 = peVar;
                                                    peVar4 = peVar2;
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
                                                    peVar = peVar7;
                                                    peVar2 = peVar8;
                                                    str9 = str;
                                                }
                                            } catch (Throwable th17) {
                                                th = th17;
                                                peVar = peVar7;
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
                                z10 = true;
                                peVar = null;
                                peVar2 = null;
                                num = null;
                                a8.g(th, z10);
                                if (cursor != null) {
                                }
                                peVar3 = peVar;
                                peVar4 = peVar2;
                                Context context32222222222 = org.telegram.messenger.t0.b;
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 < 33) {
                                }
                                if (i10 >= 33) {
                                }
                                peVar5 = null;
                                if (cursor != null) {
                                }
                                pe peVar92222222222 = peVar5;
                                pe peVar102222222222 = peVar4;
                                Integer num22222222222 = num;
                                while (i3 < arrayList.size()) {
                                }
                                d3Var = MediaController.e2;
                                if (d3Var != null) {
                                }
                                ai.d3 d3Var22222222222 = new ai.d3(i25, arrayList, arrayList2, num22222222222, peVar102222222222, peVar3, peVar92222222222);
                                MediaController.e2 = d3Var22222222222;
                                org.telegram.messenger.g0.i3(d3Var22222222222, 0);
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
                            peVar3 = null;
                            peVar4 = null;
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
                        z10 = true;
                        peVar = null;
                        peVar2 = null;
                        num = null;
                        cursor = null;
                        a8.g(th, z10);
                        if (cursor != null) {
                        }
                        peVar3 = peVar;
                        peVar4 = peVar2;
                        Context context322222222222 = org.telegram.messenger.t0.b;
                        i10 = Build.VERSION.SDK_INT;
                        if (i10 < 33) {
                        }
                        if (i10 >= 33) {
                        }
                        peVar5 = null;
                        if (cursor != null) {
                        }
                        pe peVar922222222222 = peVar5;
                        pe peVar1022222222222 = peVar4;
                        Integer num222222222222 = num;
                        while (i3 < arrayList.size()) {
                        }
                        d3Var = MediaController.e2;
                        if (d3Var != null) {
                        }
                        ai.d3 d3Var222222222222 = new ai.d3(i25, arrayList, arrayList2, num222222222222, peVar1022222222222, peVar3, peVar922222222222);
                        MediaController.e2 = d3Var222222222222;
                        org.telegram.messenger.g0.i3(d3Var222222222222, 0);
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
                            String[] strArr2 = MediaController.X1;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i10 <= 28 ? "date_modified" : "datetaken");
                            sb3.append(" DESC");
                            query = MediaStore.Images.Media.query(contentResolver, uri, strArr2, null, null, sb3.toString());
                        } catch (Throwable th21) {
                            th = th21;
                            peVar5 = null;
                            z11 = true;
                            try {
                                a8.g(th, z11);
                                if (cursor != null) {
                                }
                                pe peVar9222222222222 = peVar5;
                                pe peVar10222222222222 = peVar4;
                                Integer num2222222222222 = num;
                                while (i3 < arrayList.size()) {
                                }
                                d3Var = MediaController.e2;
                                if (d3Var != null) {
                                }
                                ai.d3 d3Var2222222222222 = new ai.d3(i25, arrayList, arrayList2, num2222222222222, peVar10222222222222, peVar3, peVar9222222222222);
                                MediaController.e2 = d3Var2222222222222;
                                org.telegram.messenger.g0.i3(d3Var2222222222222, 0);
                                return;
                            } finally {
                            }
                        }
                        if (query != null) {
                            cursor = query;
                            peVar5 = null;
                            if (cursor != null) {
                            }
                            pe peVar92222222222222 = peVar5;
                            pe peVar102222222222222 = peVar4;
                            Integer num22222222222222 = num;
                            while (i3 < arrayList.size()) {
                            }
                            d3Var = MediaController.e2;
                            if (d3Var != null) {
                            }
                            ai.d3 d3Var22222222222222 = new ai.d3(i25, arrayList, arrayList2, num22222222222222, peVar102222222222222, peVar3, peVar92222222222222);
                            MediaController.e2 = d3Var22222222222222;
                            org.telegram.messenger.g0.i3(d3Var22222222222222, 0);
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
                            pe peVar13 = null;
                            while (query.moveToNext()) {
                                try {
                                    String string3 = query.getString(columnIndex13);
                                    if (!TextUtils.isEmpty(string3)) {
                                        int i31 = query.getInt(columnIndex10);
                                        int i32 = query.getInt(columnIndex11);
                                        String string4 = query.getString(columnIndex12);
                                        int i33 = columnIndex10;
                                        int i34 = columnIndex14;
                                        ye yeVar2 = new ye(i32, i31, query.getLong(columnIndex14), string3, 0, (int) (query.getLong(columnIndex15) / 1000), true, query.getInt(columnIndex16), query.getInt(columnIndex17), query.getLong(columnIndex18));
                                        cursor2 = query;
                                        if (peVar13 == null) {
                                            i11 = columnIndex11;
                                            try {
                                                i12 = columnIndex12;
                                                i13 = columnIndex13;
                                                pe peVar14 = new pe(0, bd.M0(2131754287, null), yeVar2);
                                                try {
                                                    peVar14.b = true;
                                                    int i35 = peVar4 != null ? 1 : 0;
                                                    if (peVar3 != null) {
                                                        i35++;
                                                    }
                                                    arrayList.add(i35, peVar14);
                                                    peVar13 = peVar14;
                                                } catch (Throwable th22) {
                                                    th = th22;
                                                    peVar5 = peVar14;
                                                    cursor = cursor2;
                                                    z11 = true;
                                                    a8.g(th, z11);
                                                    if (cursor != null) {
                                                    }
                                                    pe peVar922222222222222 = peVar5;
                                                    pe peVar1022222222222222 = peVar4;
                                                    Integer num222222222222222 = num;
                                                    while (i3 < arrayList.size()) {
                                                    }
                                                    d3Var = MediaController.e2;
                                                    if (d3Var != null) {
                                                    }
                                                    ai.d3 d3Var222222222222222 = new ai.d3(i25, arrayList, arrayList2, num222222222222222, peVar1022222222222222, peVar3, peVar922222222222222);
                                                    MediaController.e2 = d3Var222222222222222;
                                                    org.telegram.messenger.g0.i3(d3Var222222222222222, 0);
                                                    return;
                                                }
                                            } catch (Throwable th23) {
                                                th = th23;
                                                peVar5 = peVar13;
                                                cursor = cursor2;
                                                z11 = true;
                                                a8.g(th, z11);
                                                if (cursor != null) {
                                                }
                                                pe peVar9222222222222222 = peVar5;
                                                pe peVar10222222222222222 = peVar4;
                                                Integer num2222222222222222 = num;
                                                while (i3 < arrayList.size()) {
                                                }
                                                d3Var = MediaController.e2;
                                                if (d3Var != null) {
                                                }
                                                ai.d3 d3Var2222222222222222 = new ai.d3(i25, arrayList, arrayList2, num2222222222222222, peVar10222222222222222, peVar3, peVar9222222222222222);
                                                MediaController.e2 = d3Var2222222222222222;
                                                org.telegram.messenger.g0.i3(d3Var2222222222222222, 0);
                                                return;
                                            }
                                        } else {
                                            i11 = columnIndex11;
                                            i12 = columnIndex12;
                                            i13 = columnIndex13;
                                        }
                                        if (peVar4 == null) {
                                            i14 = columnIndex15;
                                            peVar6 = new pe(0, bd.M0(2131754299, null), yeVar2);
                                            try {
                                                arrayList.add(0, peVar6);
                                            } catch (Throwable th24) {
                                                th = th24;
                                                peVar4 = peVar6;
                                                peVar5 = peVar13;
                                                cursor = cursor2;
                                                z11 = true;
                                                a8.g(th, z11);
                                                if (cursor != null) {
                                                    try {
                                                        cursor.close();
                                                    } catch (Exception e16) {
                                                        e10 = e16;
                                                        a8.g(e10, z11);
                                                        pe peVar92222222222222222 = peVar5;
                                                        pe peVar102222222222222222 = peVar4;
                                                        Integer num22222222222222222 = num;
                                                        while (i3 < arrayList.size()) {
                                                        }
                                                        d3Var = MediaController.e2;
                                                        if (d3Var != null) {
                                                        }
                                                        ai.d3 d3Var22222222222222222 = new ai.d3(i25, arrayList, arrayList2, num22222222222222222, peVar102222222222222222, peVar3, peVar92222222222222222);
                                                        MediaController.e2 = d3Var22222222222222222;
                                                        org.telegram.messenger.g0.i3(d3Var22222222222222222, 0);
                                                        return;
                                                    }
                                                }
                                                pe peVar922222222222222222 = peVar5;
                                                pe peVar1022222222222222222 = peVar4;
                                                Integer num222222222222222222 = num;
                                                while (i3 < arrayList.size()) {
                                                }
                                                d3Var = MediaController.e2;
                                                if (d3Var != null) {
                                                }
                                                ai.d3 d3Var222222222222222222 = new ai.d3(i25, arrayList, arrayList2, num222222222222222222, peVar1022222222222222222, peVar3, peVar922222222222222222);
                                                MediaController.e2 = d3Var222222222222222222;
                                                org.telegram.messenger.g0.i3(d3Var222222222222222222, 0);
                                                return;
                                            }
                                        } else {
                                            i14 = columnIndex15;
                                            peVar6 = peVar4;
                                        }
                                        peVar13.a(yeVar2);
                                        peVar6.a(yeVar2);
                                        pe peVar15 = (pe) sparseArray2.get(i32);
                                        if (peVar15 == null) {
                                            peVar15 = new pe(i32, string4, yeVar2);
                                            sparseArray2.put(i32, peVar15);
                                            if (num != null || str9 == null || string3 == null || !string3.startsWith(str9)) {
                                                arrayList.add(peVar15);
                                            } else {
                                                arrayList.add(0, peVar15);
                                                num = Integer.valueOf(i32);
                                            }
                                        }
                                        peVar15.a(yeVar2);
                                        peVar4 = peVar6;
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
                            peVar5 = peVar13;
                            cursor = query;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e17) {
                                    e10 = e17;
                                    z11 = true;
                                    a8.g(e10, z11);
                                    pe peVar9222222222222222222 = peVar5;
                                    pe peVar10222222222222222222 = peVar4;
                                    Integer num2222222222222222222 = num;
                                    while (i3 < arrayList.size()) {
                                    }
                                    d3Var = MediaController.e2;
                                    if (d3Var != null) {
                                    }
                                    ai.d3 d3Var2222222222222222222 = new ai.d3(i25, arrayList, arrayList2, num2222222222222222222, peVar10222222222222222222, peVar3, peVar9222222222222222222);
                                    MediaController.e2 = d3Var2222222222222222222;
                                    org.telegram.messenger.g0.i3(d3Var2222222222222222222, 0);
                                    return;
                                }
                            }
                        } catch (Throwable th26) {
                            th = th26;
                            cursor = query;
                            peVar5 = null;
                            z11 = true;
                            a8.g(th, z11);
                            if (cursor != null) {
                            }
                            pe peVar92222222222222222222 = peVar5;
                            pe peVar102222222222222222222 = peVar4;
                            Integer num22222222222222222222 = num;
                            while (i3 < arrayList.size()) {
                            }
                            d3Var = MediaController.e2;
                            if (d3Var != null) {
                            }
                            ai.d3 d3Var22222222222222222222 = new ai.d3(i25, arrayList, arrayList2, num22222222222222222222, peVar102222222222222222222, peVar3, peVar92222222222222222222);
                            MediaController.e2 = d3Var22222222222222222222;
                            org.telegram.messenger.g0.i3(d3Var22222222222222222222, 0);
                            return;
                        }
                        pe peVar922222222222222222222 = peVar5;
                        pe peVar1022222222222222222222 = peVar4;
                        Integer num222222222222222222222 = num;
                        for (i3 = 0; i3 < arrayList.size(); i3++) {
                            Collections.sort(((pe) arrayList.get(i3)).e, new o0.a(8));
                        }
                        d3Var = MediaController.e2;
                        if (d3Var != null) {
                            org.telegram.messenger.g0.r(d3Var);
                        }
                        ai.d3 d3Var222222222222222222222 = new ai.d3(i25, arrayList, arrayList2, num222222222222222222222, peVar1022222222222222222222, peVar3, peVar922222222222222222222);
                        MediaController.e2 = d3Var222222222222222222222;
                        org.telegram.messenger.g0.i3(d3Var222222222222222222222, 0);
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
                        String[] strArr22 = MediaController.X1;
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(i10 <= 28 ? "date_modified" : "datetaken");
                        sb32.append(" DESC");
                        query = MediaStore.Images.Media.query(contentResolver2, uri2, strArr22, null, null, sb32.toString());
                        if (query != null) {
                        }
                    }
                    peVar5 = null;
                    if (cursor != null) {
                    }
                    pe peVar9222222222222222222222 = peVar5;
                    pe peVar10222222222222222222222 = peVar4;
                    Integer num2222222222222222222222 = num;
                    while (i3 < arrayList.size()) {
                    }
                    d3Var = MediaController.e2;
                    if (d3Var != null) {
                    }
                    ai.d3 d3Var2222222222222222222222 = new ai.d3(i25, arrayList, arrayList2, num2222222222222222222222, peVar10222222222222222222222, peVar3, peVar9222222222222222222222);
                    MediaController.e2 = d3Var2222222222222222222222;
                    org.telegram.messenger.g0.i3(d3Var2222222222222222222222, 0);
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
                    peVar3 = null;
                    peVar4 = null;
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
                    peVar5 = null;
                    if (cursor != null) {
                    }
                    pe peVar92222222222222222222222 = peVar5;
                    pe peVar102222222222222222222222 = peVar4;
                    Integer num22222222222222222222222 = num;
                    while (i3 < arrayList.size()) {
                    }
                    d3Var = MediaController.e2;
                    if (d3Var != null) {
                    }
                    ai.d3 d3Var22222222222222222222222 = new ai.d3(i25, arrayList, arrayList2, num22222222222222222222222, peVar102222222222222222222222, peVar3, peVar92222222222222222222222);
                    MediaController.e2 = d3Var22222222222222222222222;
                    org.telegram.messenger.g0.i3(d3Var22222222222222222222222, 0);
                    return;
                }
                query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.W1, null, null, (i15 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
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
                peVar5 = null;
                if (cursor != null) {
                }
                pe peVar922222222222222222222222 = peVar5;
                pe peVar1022222222222222222222222 = peVar4;
                Integer num222222222222222222222222 = num;
                while (i3 < arrayList.size()) {
                }
                d3Var = MediaController.e2;
                if (d3Var != null) {
                }
                ai.d3 d3Var222222222222222222222222 = new ai.d3(i25, arrayList, arrayList2, num222222222222222222222222, peVar1022222222222222222222222, peVar3, peVar922222222222222222222222);
                MediaController.e2 = d3Var222222222222222222222222;
                org.telegram.messenger.g0.i3(d3Var222222222222222222222222, 0);
                return;
            case 3:
                int i36 = this.b;
                String[] strArr3 = MediaController.W1;
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
                us.l0.c(new is(us.t(i37), i24));
                return;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                return;
            case 6:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                return;
            case 7:
                long j10 = this.b - 864000;
                try {
                    P0 = org.telegram.messenger.g0.P0();
                } catch (Throwable th30) {
                    a8.g(th30, true);
                }
                if (P0 == null) {
                    return;
                }
                Utilities.clearDir(P0.getAbsolutePath(), 0, j10, false);
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.putInt("lastLogsCheckTime", az.I);
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
                li.b0(this.b).B(5);
                return;
            case 12:
                int i39 = this.b;
                String str10 = LaunchActivity.E1;
                org.telegram.messenger.t0.F = true;
                org.telegram.messenger.t0.H = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    hp.s1(i39).g7 = false;
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
                String h = com.google.android.recaptcha.internal.a.h(this.b, "/");
                org.telegram.utils.twidget.p.v(h, org.telegram.utils.twidget.p.b.keySet());
                org.telegram.utils.twidget.p.v(h, org.telegram.utils.twidget.p.c.keySet());
                org.telegram.utils.twidget.p.v(h, org.telegram.utils.twidget.p.d.keySet());
                return;
        }
    }
}
