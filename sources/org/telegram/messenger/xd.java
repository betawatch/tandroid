package org.telegram.messenger;

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
import java.util.regex.Pattern;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ xd(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:144|(3:145|146|147)|(3:148|149|150)|151|152|153|(25:502|503|(1:505)|163|(1:165)(1:499)|166|(28:319|320|321|322|323|324|325|326|327|328|329|330|(1:332)(1:482)|333|334|335|336|337|338|339|340|341|342|343|344|(5:348|(3:461|462|463)(19:350|351|352|(6:354|355|356|357|358|359)(1:460)|(8:435|436|437|438|439|440|441|442)(1:361)|362|363|364|(1:366)|367|368|369|370|(3:372|(1:427)(4:376|377|378|(3:380|381|382)(1:422))|423)(1:428)|383|(2:385|(1:392)(1:391))|393|394|395)|396|345|346)|464|465)(1:168)|(2:314|315)|170|171|172|173|(2:308|309)|(17:196|197|(1:201)|225|(1:227)(1:305)|228|(9:230|231|232|(1:234)(1:300)|235|236|(5:240|(3:290|291|292)(10:242|243|244|(10:246|247|248|249|250|251|(1:253)(1:283)|(1:255)|256|257)(1:289)|(3:259|260|261)(1:282)|262|(2:264|(1:271)(1:270))|272|273|274)|275|237|238)|293|294)(1:303)|295|(2:190|191)|179|180|(2:183|181)|184|185|(1:187)|188|189)|176|177|(0)|179|180|(1:181)|184|185|(0)|188|189)|(20:500|501|(0)|170|171|172|173|(0)|(0)|176|177|(0)|179|180|(1:181)|184|185|(0)|188|189)|163|(0)(0)|166|(0)(0)|(0)|170|171|172|173|(0)|(0)|176|177|(0)|179|180|(1:181)|184|185|(0)|188|189) */
    /* JADX WARN: Can't wrap try/catch for region: R(34:144|145|146|147|148|149|150|151|152|153|(25:502|503|(1:505)|163|(1:165)(1:499)|166|(28:319|320|321|322|323|324|325|326|327|328|329|330|(1:332)(1:482)|333|334|335|336|337|338|339|340|341|342|343|344|(5:348|(3:461|462|463)(19:350|351|352|(6:354|355|356|357|358|359)(1:460)|(8:435|436|437|438|439|440|441|442)(1:361)|362|363|364|(1:366)|367|368|369|370|(3:372|(1:427)(4:376|377|378|(3:380|381|382)(1:422))|423)(1:428)|383|(2:385|(1:392)(1:391))|393|394|395)|396|345|346)|464|465)(1:168)|(2:314|315)|170|171|172|173|(2:308|309)|(17:196|197|(1:201)|225|(1:227)(1:305)|228|(9:230|231|232|(1:234)(1:300)|235|236|(5:240|(3:290|291|292)(10:242|243|244|(10:246|247|248|249|250|251|(1:253)(1:283)|(1:255)|256|257)(1:289)|(3:259|260|261)(1:282)|262|(2:264|(1:271)(1:270))|272|273|274)|275|237|238)|293|294)(1:303)|295|(2:190|191)|179|180|(2:183|181)|184|185|(1:187)|188|189)|176|177|(0)|179|180|(1:181)|184|185|(0)|188|189)|(20:500|501|(0)|170|171|172|173|(0)|(0)|176|177|(0)|179|180|(1:181)|184|185|(0)|188|189)|163|(0)(0)|166|(0)(0)|(0)|170|171|172|173|(0)|(0)|176|177|(0)|179|180|(1:181)|184|185|(0)|188|189) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01da, code lost:
    
        if (r7 == r12) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01dc, code lost:
    
        r0 = org.telegram.messenger.MediaController.X1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01de, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
    
        org.telegram.messenger.i0.r(r0);
        org.telegram.messenger.MediaController.X1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e5, code lost:
    
        org.telegram.messenger.MediaController.O(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ab, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d7, code lost:
    
        if (r13 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0589, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x056f, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0712, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0713, code lost:
    
        r1 = true;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x053a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x053b, code lost:
    
        r28 = "bucket_id";
        r29 = "bucket_display_name";
        r30 = "_data";
        r27 = "_id";
        r33 = "height";
        r32 = "width";
        r10 = r14;
        r31 = "orientation";
        r15 = r22;
        r13 = r23;
        r9 = r24;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0728 A[LOOP:1: B:181:0x0722->B:183:0x0728, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0702 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0579 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x071b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x056b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x052f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0557 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192 A[Catch: all -> 0x01a5, TryCatch #5 {all -> 0x01a5, blocks: (B:85:0x018c, B:87:0x0192, B:89:0x0198, B:91:0x019e, B:94:0x01ad, B:96:0x01c3, B:98:0x01c9, B:110:0x01a7), top: B:84:0x018c }] */
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
        ArrayList arrayList;
        String str8;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str9;
        boolean z10;
        xe xeVar;
        xe xeVar2;
        Integer num;
        Cursor cursor;
        xe xeVar3;
        xe xeVar4;
        boolean z11;
        xe xeVar5;
        int i10;
        ge geVar;
        int i11;
        Cursor cursor2;
        Cursor cursor3;
        int i12;
        int i13;
        int i14;
        int i15;
        xe xeVar6;
        int i16;
        ArrayList arrayList3;
        Cursor query;
        int i17;
        int i18;
        int i19;
        xe xeVar7;
        xe xeVar8;
        int i20;
        int i21;
        StringBuilder sb2;
        Cursor cursor4;
        Cursor cursor5;
        int i22;
        Context context;
        int i23;
        File P0;
        org.telegram.utils.twidget.w wVar;
        switch (this.a) {
            case 0:
                int i24 = this.b;
                String[] strArr = MediaController.U1;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = arrayList4;
                SparseArray sparseArray3 = new SparseArray();
                SparseArray sparseArray4 = new SparseArray();
                try {
                    sb2 = new StringBuilder();
                    sparseArray = sparseArray4;
                } catch (Exception e) {
                    e = e;
                    sparseArray = sparseArray4;
                }
                try {
                    sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
                    sb2.append("/Camera/");
                    str = sb2.toString();
                } catch (Exception e7) {
                    e = e7;
                    f8.g(e, true);
                    str = null;
                    Context context2 = w0.b;
                    i16 = Build.VERSION.SDK_INT;
                    arrayList3 = arrayList5;
                    if (i16 < 33) {
                    }
                    if (i16 >= 33) {
                    }
                    str2 = "bucket_id";
                    str3 = "bucket_display_name";
                    str4 = "_data";
                    str5 = "_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList2 = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList = arrayList3;
                    xeVar3 = null;
                    xeVar4 = null;
                    num = null;
                    cursor = null;
                    if (cursor != null) {
                    }
                    Context context3 = w0.b;
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 < 33) {
                    }
                    if (i11 >= 33) {
                    }
                    xeVar5 = null;
                    if (cursor != null) {
                    }
                    xe xeVar9 = xeVar5;
                    xe xeVar10 = xeVar4;
                    Integer num2 = num;
                    while (i10 < arrayList2.size()) {
                    }
                    geVar = MediaController.c2;
                    if (geVar != null) {
                    }
                    ge geVar2 = new ge(i24, arrayList2, arrayList, num2, xeVar10, xeVar3, xeVar9);
                    MediaController.c2 = geVar2;
                    i0.h3(geVar2, 0);
                    return;
                }
                Context context22 = w0.b;
                i16 = Build.VERSION.SDK_INT;
                arrayList3 = arrayList5;
                if (i16 < 33) {
                    try {
                        if (context22.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        }
                        query = MediaStore.Images.Media.query(context22.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.U1, null, null, (i16 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                        if (query == null) {
                            try {
                                int columnIndex = query.getColumnIndex("_id");
                                str5 = "_id";
                                try {
                                    int columnIndex2 = query.getColumnIndex("bucket_id");
                                    str2 = "bucket_id";
                                    try {
                                        int columnIndex3 = query.getColumnIndex("bucket_display_name");
                                        str3 = "bucket_display_name";
                                        try {
                                            int columnIndex4 = query.getColumnIndex("_data");
                                            str4 = "_data";
                                            try {
                                                int columnIndex5 = query.getColumnIndex(i16 > 28 ? "date_modified" : "datetaken");
                                                int columnIndex6 = query.getColumnIndex("orientation");
                                                str8 = "orientation";
                                                try {
                                                    int columnIndex7 = query.getColumnIndex("width");
                                                    str7 = "width";
                                                    try {
                                                        int columnIndex8 = query.getColumnIndex("height");
                                                        str6 = "height";
                                                        try {
                                                            int columnIndex9 = query.getColumnIndex("_size");
                                                            xeVar3 = null;
                                                            xeVar4 = null;
                                                            num = null;
                                                            Integer num3 = null;
                                                            while (query.moveToNext()) {
                                                                try {
                                                                    String string = query.getString(columnIndex4);
                                                                    if (!TextUtils.isEmpty(string)) {
                                                                        int i25 = query.getInt(columnIndex);
                                                                        int i26 = query.getInt(columnIndex2);
                                                                        int i27 = columnIndex;
                                                                        String string2 = query.getString(columnIndex3);
                                                                        ff ffVar = new ff(i26, i25, query.getLong(columnIndex5), string, query.getInt(columnIndex6), 0, false, query.getInt(columnIndex7), query.getInt(columnIndex8), query.getLong(columnIndex9));
                                                                        int i28 = columnIndex3;
                                                                        int i29 = columnIndex4;
                                                                        int i30 = columnIndex5;
                                                                        if (xeVar3 == null) {
                                                                            i17 = columnIndex6;
                                                                            try {
                                                                                i18 = columnIndex2;
                                                                                i19 = columnIndex9;
                                                                                xeVar7 = new xe(0, dd.L0(2131754292, null), ffVar);
                                                                                arrayList = arrayList3;
                                                                                try {
                                                                                    arrayList.add(0, xeVar7);
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    cursor = query;
                                                                                    arrayList2 = arrayList6;
                                                                                    sparseArray2 = sparseArray3;
                                                                                    xeVar2 = xeVar4;
                                                                                    z10 = true;
                                                                                    xeVar = xeVar7;
                                                                                    str9 = str;
                                                                                    try {
                                                                                        f8.g(th, z10);
                                                                                        if (cursor != null) {
                                                                                        }
                                                                                        xeVar3 = xeVar;
                                                                                        xeVar4 = xeVar2;
                                                                                        Context context32 = w0.b;
                                                                                        i11 = Build.VERSION.SDK_INT;
                                                                                        if (i11 < 33) {
                                                                                        }
                                                                                        if (i11 >= 33) {
                                                                                        }
                                                                                        xeVar5 = null;
                                                                                        if (cursor != null) {
                                                                                        }
                                                                                        xe xeVar92 = xeVar5;
                                                                                        xe xeVar102 = xeVar4;
                                                                                        Integer num22 = num;
                                                                                        while (i10 < arrayList2.size()) {
                                                                                        }
                                                                                        geVar = MediaController.c2;
                                                                                        if (geVar != null) {
                                                                                        }
                                                                                        ge geVar22 = new ge(i24, arrayList2, arrayList, num22, xeVar102, xeVar3, xeVar92);
                                                                                        MediaController.c2 = geVar22;
                                                                                        i0.h3(geVar22, 0);
                                                                                        return;
                                                                                    } finally {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                arrayList = arrayList3;
                                                                                cursor = query;
                                                                                arrayList2 = arrayList6;
                                                                                sparseArray2 = sparseArray3;
                                                                                str9 = str;
                                                                                xeVar = xeVar3;
                                                                                xeVar2 = xeVar4;
                                                                                z10 = true;
                                                                                f8.g(th, z10);
                                                                                if (cursor != null) {
                                                                                }
                                                                                xeVar3 = xeVar;
                                                                                xeVar4 = xeVar2;
                                                                                Context context322 = w0.b;
                                                                                i11 = Build.VERSION.SDK_INT;
                                                                                if (i11 < 33) {
                                                                                }
                                                                                if (i11 >= 33) {
                                                                                }
                                                                                xeVar5 = null;
                                                                                if (cursor != null) {
                                                                                }
                                                                                xe xeVar922 = xeVar5;
                                                                                xe xeVar1022 = xeVar4;
                                                                                Integer num222 = num;
                                                                                while (i10 < arrayList2.size()) {
                                                                                }
                                                                                geVar = MediaController.c2;
                                                                                if (geVar != null) {
                                                                                }
                                                                                ge geVar222 = new ge(i24, arrayList2, arrayList, num222, xeVar1022, xeVar3, xeVar922);
                                                                                MediaController.c2 = geVar222;
                                                                                i0.h3(geVar222, 0);
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            i17 = columnIndex6;
                                                                            i18 = columnIndex2;
                                                                            i19 = columnIndex9;
                                                                            arrayList = arrayList3;
                                                                            xeVar7 = xeVar3;
                                                                        }
                                                                        if (xeVar4 == null) {
                                                                            try {
                                                                                i20 = columnIndex8;
                                                                                cursor = query;
                                                                                i21 = columnIndex7;
                                                                                try {
                                                                                    xeVar8 = new xe(0, dd.L0(2131754299, null), ffVar);
                                                                                    arrayList2 = arrayList6;
                                                                                    try {
                                                                                        arrayList2.add(0, xeVar8);
                                                                                    } catch (Throwable th4) {
                                                                                        th = th4;
                                                                                        xeVar = xeVar7;
                                                                                        sparseArray2 = sparseArray3;
                                                                                        str9 = str;
                                                                                        z10 = true;
                                                                                        xeVar2 = xeVar8;
                                                                                        f8.g(th, z10);
                                                                                        if (cursor != null) {
                                                                                        }
                                                                                        xeVar3 = xeVar;
                                                                                        xeVar4 = xeVar2;
                                                                                        Context context3222 = w0.b;
                                                                                        i11 = Build.VERSION.SDK_INT;
                                                                                        if (i11 < 33) {
                                                                                        }
                                                                                        if (i11 >= 33) {
                                                                                        }
                                                                                        xeVar5 = null;
                                                                                        if (cursor != null) {
                                                                                        }
                                                                                        xe xeVar9222 = xeVar5;
                                                                                        xe xeVar10222 = xeVar4;
                                                                                        Integer num2222 = num;
                                                                                        while (i10 < arrayList2.size()) {
                                                                                        }
                                                                                        geVar = MediaController.c2;
                                                                                        if (geVar != null) {
                                                                                        }
                                                                                        ge geVar2222 = new ge(i24, arrayList2, arrayList, num2222, xeVar10222, xeVar3, xeVar9222);
                                                                                        MediaController.c2 = geVar2222;
                                                                                        i0.h3(geVar2222, 0);
                                                                                        return;
                                                                                    }
                                                                                } catch (Throwable th5) {
                                                                                    th = th5;
                                                                                    arrayList2 = arrayList6;
                                                                                    xeVar = xeVar7;
                                                                                    sparseArray2 = sparseArray3;
                                                                                    str9 = str;
                                                                                    xeVar2 = xeVar4;
                                                                                    z10 = true;
                                                                                    f8.g(th, z10);
                                                                                    if (cursor != null) {
                                                                                    }
                                                                                    xeVar3 = xeVar;
                                                                                    xeVar4 = xeVar2;
                                                                                    Context context32222 = w0.b;
                                                                                    i11 = Build.VERSION.SDK_INT;
                                                                                    if (i11 < 33) {
                                                                                    }
                                                                                    if (i11 >= 33) {
                                                                                    }
                                                                                    xeVar5 = null;
                                                                                    if (cursor != null) {
                                                                                    }
                                                                                    xe xeVar92222 = xeVar5;
                                                                                    xe xeVar102222 = xeVar4;
                                                                                    Integer num22222 = num;
                                                                                    while (i10 < arrayList2.size()) {
                                                                                    }
                                                                                    geVar = MediaController.c2;
                                                                                    if (geVar != null) {
                                                                                    }
                                                                                    ge geVar22222 = new ge(i24, arrayList2, arrayList, num22222, xeVar102222, xeVar3, xeVar92222);
                                                                                    MediaController.c2 = geVar22222;
                                                                                    i0.h3(geVar22222, 0);
                                                                                    return;
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                cursor = query;
                                                                            }
                                                                        } else {
                                                                            i20 = columnIndex8;
                                                                            cursor = query;
                                                                            i21 = columnIndex7;
                                                                            arrayList2 = arrayList6;
                                                                            xeVar8 = xeVar4;
                                                                        }
                                                                        try {
                                                                            if (xeVar7.e.size() < 15) {
                                                                                ffVar.d();
                                                                            }
                                                                            xeVar7.a(ffVar);
                                                                            xeVar8.a(ffVar);
                                                                            sparseArray2 = sparseArray3;
                                                                            try {
                                                                                xe xeVar11 = (xe) sparseArray2.get(i26);
                                                                                if (xeVar11 == null) {
                                                                                    xeVar11 = new xe(i26, string2, ffVar);
                                                                                    sparseArray2.put(i26, xeVar11);
                                                                                    if (num != null || str == null || string == null) {
                                                                                        xeVar = xeVar7;
                                                                                        xeVar2 = xeVar8;
                                                                                        str9 = str;
                                                                                    } else {
                                                                                        xeVar = xeVar7;
                                                                                        str9 = str;
                                                                                        try {
                                                                                            if (string.startsWith(str9)) {
                                                                                                xeVar2 = xeVar8;
                                                                                                try {
                                                                                                    arrayList2.add(0, xeVar11);
                                                                                                    num = Integer.valueOf(i26);
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                    z10 = true;
                                                                                                    f8.g(th, z10);
                                                                                                    if (cursor != null) {
                                                                                                    }
                                                                                                    xeVar3 = xeVar;
                                                                                                    xeVar4 = xeVar2;
                                                                                                    Context context322222 = w0.b;
                                                                                                    i11 = Build.VERSION.SDK_INT;
                                                                                                    if (i11 < 33) {
                                                                                                    }
                                                                                                    if (i11 >= 33) {
                                                                                                    }
                                                                                                    xeVar5 = null;
                                                                                                    if (cursor != null) {
                                                                                                    }
                                                                                                    xe xeVar922222 = xeVar5;
                                                                                                    xe xeVar1022222 = xeVar4;
                                                                                                    Integer num222222 = num;
                                                                                                    while (i10 < arrayList2.size()) {
                                                                                                    }
                                                                                                    geVar = MediaController.c2;
                                                                                                    if (geVar != null) {
                                                                                                    }
                                                                                                    ge geVar222222 = new ge(i24, arrayList2, arrayList, num222222, xeVar1022222, xeVar3, xeVar922222);
                                                                                                    MediaController.c2 = geVar222222;
                                                                                                    i0.h3(geVar222222, 0);
                                                                                                    return;
                                                                                                }
                                                                                            } else {
                                                                                                xeVar2 = xeVar8;
                                                                                            }
                                                                                        } catch (Throwable th8) {
                                                                                            th = th8;
                                                                                            xeVar2 = xeVar8;
                                                                                            z10 = true;
                                                                                            f8.g(th, z10);
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            xeVar3 = xeVar;
                                                                                            xeVar4 = xeVar2;
                                                                                            Context context3222222 = w0.b;
                                                                                            i11 = Build.VERSION.SDK_INT;
                                                                                            if (i11 < 33) {
                                                                                            }
                                                                                            if (i11 >= 33) {
                                                                                            }
                                                                                            xeVar5 = null;
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            xe xeVar9222222 = xeVar5;
                                                                                            xe xeVar10222222 = xeVar4;
                                                                                            Integer num2222222 = num;
                                                                                            while (i10 < arrayList2.size()) {
                                                                                            }
                                                                                            geVar = MediaController.c2;
                                                                                            if (geVar != null) {
                                                                                            }
                                                                                            ge geVar2222222 = new ge(i24, arrayList2, arrayList, num2222222, xeVar10222222, xeVar3, xeVar9222222);
                                                                                            MediaController.c2 = geVar2222222;
                                                                                            i0.h3(geVar2222222, 0);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    arrayList2.add(xeVar11);
                                                                                } else {
                                                                                    xeVar = xeVar7;
                                                                                    xeVar2 = xeVar8;
                                                                                    str9 = str;
                                                                                }
                                                                                xeVar11.a(ffVar);
                                                                                SparseArray sparseArray5 = sparseArray;
                                                                                xe xeVar12 = (xe) sparseArray5.get(i26);
                                                                                if (xeVar12 == null) {
                                                                                    xeVar12 = new xe(i26, string2, ffVar);
                                                                                    sparseArray5.put(i26, xeVar12);
                                                                                    if (num3 != null || str9 == null || string == null || !string.startsWith(str9)) {
                                                                                        arrayList.add(xeVar12);
                                                                                    } else {
                                                                                        arrayList.add(0, xeVar12);
                                                                                        num3 = Integer.valueOf(i26);
                                                                                    }
                                                                                }
                                                                                xeVar12.a(ffVar);
                                                                                str = str9;
                                                                                sparseArray = sparseArray5;
                                                                                xeVar3 = xeVar;
                                                                                xeVar4 = xeVar2;
                                                                                columnIndex = i27;
                                                                                columnIndex3 = i28;
                                                                                columnIndex4 = i29;
                                                                                columnIndex5 = i30;
                                                                                columnIndex6 = i17;
                                                                                columnIndex9 = i19;
                                                                                query = cursor;
                                                                                sparseArray3 = sparseArray2;
                                                                                arrayList6 = arrayList2;
                                                                                columnIndex8 = i20;
                                                                                columnIndex7 = i21;
                                                                                arrayList3 = arrayList;
                                                                                columnIndex2 = i18;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                xeVar = xeVar7;
                                                                                xeVar2 = xeVar8;
                                                                                str9 = str;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            xeVar = xeVar7;
                                                                            sparseArray2 = sparseArray3;
                                                                            str9 = str;
                                                                        }
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    cursor = query;
                                                                    arrayList2 = arrayList6;
                                                                    sparseArray2 = sparseArray3;
                                                                    str9 = str;
                                                                    arrayList = arrayList3;
                                                                }
                                                            }
                                                            cursor = query;
                                                            arrayList2 = arrayList6;
                                                            sparseArray2 = sparseArray3;
                                                            str9 = str;
                                                            arrayList = arrayList3;
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            cursor = query;
                                                            arrayList2 = arrayList6;
                                                            sparseArray2 = sparseArray3;
                                                            str9 = str;
                                                            arrayList = arrayList3;
                                                            z10 = true;
                                                            xeVar = null;
                                                            xeVar2 = null;
                                                            num = null;
                                                            f8.g(th, z10);
                                                            if (cursor != null) {
                                                            }
                                                            xeVar3 = xeVar;
                                                            xeVar4 = xeVar2;
                                                            Context context32222222 = w0.b;
                                                            i11 = Build.VERSION.SDK_INT;
                                                            if (i11 < 33) {
                                                            }
                                                            if (i11 >= 33) {
                                                            }
                                                            xeVar5 = null;
                                                            if (cursor != null) {
                                                            }
                                                            xe xeVar92222222 = xeVar5;
                                                            xe xeVar102222222 = xeVar4;
                                                            Integer num22222222 = num;
                                                            while (i10 < arrayList2.size()) {
                                                            }
                                                            geVar = MediaController.c2;
                                                            if (geVar != null) {
                                                            }
                                                            ge geVar22222222 = new ge(i24, arrayList2, arrayList, num22222222, xeVar102222222, xeVar3, xeVar92222222);
                                                            MediaController.c2 = geVar22222222;
                                                            i0.h3(geVar22222222, 0);
                                                            return;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        str6 = "height";
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    str6 = "height";
                                                    str7 = "width";
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                str6 = "height";
                                                str7 = "width";
                                                cursor = query;
                                                str8 = "orientation";
                                                arrayList2 = arrayList6;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                                arrayList = arrayList3;
                                                z10 = true;
                                                xeVar = null;
                                                xeVar2 = null;
                                                num = null;
                                                f8.g(th, z10);
                                                if (cursor != null) {
                                                    try {
                                                        cursor.close();
                                                    } catch (Exception e10) {
                                                        f8.g(e10, z10);
                                                    }
                                                }
                                                xeVar3 = xeVar;
                                                xeVar4 = xeVar2;
                                                Context context322222222 = w0.b;
                                                i11 = Build.VERSION.SDK_INT;
                                                if (i11 < 33) {
                                                }
                                                if (i11 >= 33) {
                                                }
                                                xeVar5 = null;
                                                if (cursor != null) {
                                                }
                                                xe xeVar922222222 = xeVar5;
                                                xe xeVar1022222222 = xeVar4;
                                                Integer num222222222 = num;
                                                while (i10 < arrayList2.size()) {
                                                }
                                                geVar = MediaController.c2;
                                                if (geVar != null) {
                                                }
                                                ge geVar222222222 = new ge(i24, arrayList2, arrayList, num222222222, xeVar1022222222, xeVar3, xeVar922222222);
                                                MediaController.c2 = geVar222222222;
                                                i0.h3(geVar222222222, 0);
                                                return;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            str4 = "_data";
                                            str6 = "height";
                                            str7 = "width";
                                            cursor = query;
                                            str8 = "orientation";
                                            arrayList2 = arrayList6;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            arrayList = arrayList3;
                                            z10 = true;
                                            xeVar = null;
                                            xeVar2 = null;
                                            num = null;
                                            f8.g(th, z10);
                                            if (cursor != null) {
                                            }
                                            xeVar3 = xeVar;
                                            xeVar4 = xeVar2;
                                            Context context3222222222 = w0.b;
                                            i11 = Build.VERSION.SDK_INT;
                                            if (i11 < 33) {
                                            }
                                            if (i11 >= 33) {
                                            }
                                            xeVar5 = null;
                                            if (cursor != null) {
                                            }
                                            xe xeVar9222222222 = xeVar5;
                                            xe xeVar10222222222 = xeVar4;
                                            Integer num2222222222 = num;
                                            while (i10 < arrayList2.size()) {
                                            }
                                            geVar = MediaController.c2;
                                            if (geVar != null) {
                                            }
                                            ge geVar2222222222 = new ge(i24, arrayList2, arrayList, num2222222222, xeVar10222222222, xeVar3, xeVar9222222222);
                                            MediaController.c2 = geVar2222222222;
                                            i0.h3(geVar2222222222, 0);
                                            return;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        str3 = "bucket_display_name";
                                        str4 = "_data";
                                        str6 = "height";
                                        str7 = "width";
                                        cursor = query;
                                        str8 = "orientation";
                                        arrayList2 = arrayList6;
                                        sparseArray2 = sparseArray3;
                                        str9 = str;
                                        arrayList = arrayList3;
                                        z10 = true;
                                        xeVar = null;
                                        xeVar2 = null;
                                        num = null;
                                        f8.g(th, z10);
                                        if (cursor != null) {
                                        }
                                        xeVar3 = xeVar;
                                        xeVar4 = xeVar2;
                                        Context context32222222222 = w0.b;
                                        i11 = Build.VERSION.SDK_INT;
                                        if (i11 < 33) {
                                        }
                                        if (i11 >= 33) {
                                        }
                                        xeVar5 = null;
                                        if (cursor != null) {
                                        }
                                        xe xeVar92222222222 = xeVar5;
                                        xe xeVar102222222222 = xeVar4;
                                        Integer num22222222222 = num;
                                        while (i10 < arrayList2.size()) {
                                        }
                                        geVar = MediaController.c2;
                                        if (geVar != null) {
                                        }
                                        ge geVar22222222222 = new ge(i24, arrayList2, arrayList, num22222222222, xeVar102222222222, xeVar3, xeVar92222222222);
                                        MediaController.c2 = geVar22222222222;
                                        i0.h3(geVar22222222222, 0);
                                        return;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    str2 = "bucket_id";
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                str2 = "bucket_id";
                                str3 = "bucket_display_name";
                                str4 = "_data";
                                str5 = "_id";
                            }
                        } else {
                            str2 = "bucket_id";
                            str3 = "bucket_display_name";
                            str4 = "_data";
                            str5 = "_id";
                            str6 = "height";
                            str7 = "width";
                            cursor = query;
                            str8 = "orientation";
                            arrayList2 = arrayList6;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList = arrayList3;
                            xeVar3 = null;
                            xeVar4 = null;
                            num = null;
                        }
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e11) {
                                f8.g(e11, true);
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
                        arrayList2 = arrayList6;
                        sparseArray2 = sparseArray3;
                        str9 = str;
                        arrayList = arrayList3;
                        z10 = true;
                        xeVar = null;
                        xeVar2 = null;
                        num = null;
                        cursor = null;
                        f8.g(th, z10);
                        if (cursor != null) {
                        }
                        xeVar3 = xeVar;
                        xeVar4 = xeVar2;
                        Context context322222222222 = w0.b;
                        i11 = Build.VERSION.SDK_INT;
                        if (i11 < 33) {
                        }
                        if (i11 >= 33) {
                        }
                        xeVar5 = null;
                        if (cursor != null) {
                        }
                        xe xeVar922222222222 = xeVar5;
                        xe xeVar1022222222222 = xeVar4;
                        Integer num222222222222 = num;
                        while (i10 < arrayList2.size()) {
                        }
                        geVar = MediaController.c2;
                        if (geVar != null) {
                        }
                        ge geVar222222222222 = new ge(i24, arrayList2, arrayList, num222222222222, xeVar1022222222222, xeVar3, xeVar922222222222);
                        MediaController.c2 = geVar222222222222;
                        i0.h3(geVar222222222222, 0);
                        return;
                    }
                    Context context3222222222222 = w0.b;
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 < 33) {
                        try {
                            break;
                        } catch (Throwable th21) {
                            th = th21;
                            z11 = true;
                            xeVar5 = null;
                            try {
                                f8.g(th, z11);
                                if (cursor != null) {
                                }
                                xe xeVar9222222222222 = xeVar5;
                                xe xeVar10222222222222 = xeVar4;
                                Integer num2222222222222 = num;
                                while (i10 < arrayList2.size()) {
                                }
                                geVar = MediaController.c2;
                                if (geVar != null) {
                                }
                                ge geVar2222222222222 = new ge(i24, arrayList2, arrayList, num2222222222222, xeVar10222222222222, xeVar3, xeVar9222222222222);
                                MediaController.c2 = geVar2222222222222;
                                i0.h3(geVar2222222222222, 0);
                                return;
                            } finally {
                            }
                        }
                    }
                    if (i11 >= 33) {
                        try {
                            if (context3222222222222.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context3222222222222.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                break;
                            }
                            ContentResolver contentResolver = w0.b.getContentResolver();
                            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            String[] strArr2 = MediaController.V1;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i11 > 28 ? "date_modified" : "datetaken");
                            sb3.append(" DESC");
                            Cursor query2 = MediaStore.Images.Media.query(contentResolver, uri, strArr2, null, null, sb3.toString());
                            if (query2 != null) {
                                try {
                                    int columnIndex10 = query2.getColumnIndex(str5);
                                    int columnIndex11 = query2.getColumnIndex(str2);
                                    int columnIndex12 = query2.getColumnIndex(str3);
                                    int columnIndex13 = query2.getColumnIndex(str4);
                                    int columnIndex14 = query2.getColumnIndex(i11 > 28 ? "date_modified" : "datetaken");
                                    int columnIndex15 = query2.getColumnIndex("duration");
                                    int columnIndex16 = query2.getColumnIndex(str7);
                                    int columnIndex17 = query2.getColumnIndex(str6);
                                    int columnIndex18 = query2.getColumnIndex("_size");
                                    query2.getColumnIndex(str8);
                                    xe xeVar13 = null;
                                    while (query2.moveToNext()) {
                                        try {
                                            String string3 = query2.getString(columnIndex13);
                                            if (!TextUtils.isEmpty(string3)) {
                                                int i31 = query2.getInt(columnIndex10);
                                                int i32 = query2.getInt(columnIndex11);
                                                String string4 = query2.getString(columnIndex12);
                                                int i33 = columnIndex10;
                                                int i34 = columnIndex14;
                                                ff ffVar2 = new ff(i32, i31, query2.getLong(columnIndex14), string3, 0, (int) (query2.getLong(columnIndex15) / 1000), true, query2.getInt(columnIndex16), query2.getInt(columnIndex17), query2.getLong(columnIndex18));
                                                cursor3 = query2;
                                                if (xeVar13 == null) {
                                                    i12 = columnIndex11;
                                                    try {
                                                        i13 = columnIndex12;
                                                        i14 = columnIndex13;
                                                        xe xeVar14 = new xe(0, dd.L0(2131754287, null), ffVar2);
                                                        try {
                                                            xeVar14.b = true;
                                                            int i35 = xeVar4 != null ? 1 : 0;
                                                            if (xeVar3 != null) {
                                                                i35++;
                                                            }
                                                            arrayList2.add(i35, xeVar14);
                                                            xeVar13 = xeVar14;
                                                        } catch (Throwable th22) {
                                                            th = th22;
                                                            xeVar5 = xeVar14;
                                                            cursor = cursor3;
                                                            z11 = true;
                                                            f8.g(th, z11);
                                                            if (cursor != null) {
                                                                try {
                                                                    cursor.close();
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    f8.g(e, z11);
                                                                    xe xeVar92222222222222 = xeVar5;
                                                                    xe xeVar102222222222222 = xeVar4;
                                                                    Integer num22222222222222 = num;
                                                                    while (i10 < arrayList2.size()) {
                                                                    }
                                                                    geVar = MediaController.c2;
                                                                    if (geVar != null) {
                                                                    }
                                                                    ge geVar22222222222222 = new ge(i24, arrayList2, arrayList, num22222222222222, xeVar102222222222222, xeVar3, xeVar92222222222222);
                                                                    MediaController.c2 = geVar22222222222222;
                                                                    i0.h3(geVar22222222222222, 0);
                                                                    return;
                                                                }
                                                            }
                                                            xe xeVar922222222222222 = xeVar5;
                                                            xe xeVar1022222222222222 = xeVar4;
                                                            Integer num222222222222222 = num;
                                                            while (i10 < arrayList2.size()) {
                                                            }
                                                            geVar = MediaController.c2;
                                                            if (geVar != null) {
                                                            }
                                                            ge geVar222222222222222 = new ge(i24, arrayList2, arrayList, num222222222222222, xeVar1022222222222222, xeVar3, xeVar922222222222222);
                                                            MediaController.c2 = geVar222222222222222;
                                                            i0.h3(geVar222222222222222, 0);
                                                            return;
                                                        }
                                                    } catch (Throwable th23) {
                                                        th = th23;
                                                        xeVar5 = xeVar13;
                                                        cursor = cursor3;
                                                        z11 = true;
                                                        f8.g(th, z11);
                                                        if (cursor != null) {
                                                        }
                                                        xe xeVar9222222222222222 = xeVar5;
                                                        xe xeVar10222222222222222 = xeVar4;
                                                        Integer num2222222222222222 = num;
                                                        while (i10 < arrayList2.size()) {
                                                        }
                                                        geVar = MediaController.c2;
                                                        if (geVar != null) {
                                                        }
                                                        ge geVar2222222222222222 = new ge(i24, arrayList2, arrayList, num2222222222222222, xeVar10222222222222222, xeVar3, xeVar9222222222222222);
                                                        MediaController.c2 = geVar2222222222222222;
                                                        i0.h3(geVar2222222222222222, 0);
                                                        return;
                                                    }
                                                } else {
                                                    i12 = columnIndex11;
                                                    i13 = columnIndex12;
                                                    i14 = columnIndex13;
                                                }
                                                if (xeVar4 == null) {
                                                    i15 = columnIndex15;
                                                    xeVar6 = new xe(0, dd.L0(2131754299, null), ffVar2);
                                                    try {
                                                        arrayList2.add(0, xeVar6);
                                                    } catch (Throwable th24) {
                                                        th = th24;
                                                        xeVar4 = xeVar6;
                                                        xeVar5 = xeVar13;
                                                        cursor = cursor3;
                                                        z11 = true;
                                                        f8.g(th, z11);
                                                        if (cursor != null) {
                                                        }
                                                        xe xeVar92222222222222222 = xeVar5;
                                                        xe xeVar102222222222222222 = xeVar4;
                                                        Integer num22222222222222222 = num;
                                                        while (i10 < arrayList2.size()) {
                                                        }
                                                        geVar = MediaController.c2;
                                                        if (geVar != null) {
                                                        }
                                                        ge geVar22222222222222222 = new ge(i24, arrayList2, arrayList, num22222222222222222, xeVar102222222222222222, xeVar3, xeVar92222222222222222);
                                                        MediaController.c2 = geVar22222222222222222;
                                                        i0.h3(geVar22222222222222222, 0);
                                                        return;
                                                    }
                                                } else {
                                                    i15 = columnIndex15;
                                                    xeVar6 = xeVar4;
                                                }
                                                xeVar13.a(ffVar2);
                                                xeVar6.a(ffVar2);
                                                xe xeVar15 = (xe) sparseArray2.get(i32);
                                                if (xeVar15 == null) {
                                                    xeVar15 = new xe(i32, string4, ffVar2);
                                                    sparseArray2.put(i32, xeVar15);
                                                    if (num != null || str9 == null || string3 == null || !string3.startsWith(str9)) {
                                                        arrayList2.add(xeVar15);
                                                    } else {
                                                        arrayList2.add(0, xeVar15);
                                                        num = Integer.valueOf(i32);
                                                    }
                                                }
                                                xeVar15.a(ffVar2);
                                                xeVar4 = xeVar6;
                                                columnIndex15 = i15;
                                                columnIndex10 = i33;
                                                query2 = cursor3;
                                                columnIndex11 = i12;
                                                columnIndex12 = i13;
                                                columnIndex13 = i14;
                                                columnIndex14 = i34;
                                            }
                                        } catch (Throwable th25) {
                                            th = th25;
                                            cursor3 = query2;
                                        }
                                    }
                                    cursor2 = query2;
                                    xeVar5 = xeVar13;
                                } catch (Throwable th26) {
                                    th = th26;
                                    cursor3 = query2;
                                    xeVar5 = null;
                                }
                            } else {
                                cursor2 = query2;
                                xeVar5 = null;
                            }
                            cursor = cursor2;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e13) {
                                    e = e13;
                                    z11 = true;
                                    f8.g(e, z11);
                                    xe xeVar922222222222222222 = xeVar5;
                                    xe xeVar1022222222222222222 = xeVar4;
                                    Integer num222222222222222222 = num;
                                    while (i10 < arrayList2.size()) {
                                    }
                                    geVar = MediaController.c2;
                                    if (geVar != null) {
                                    }
                                    ge geVar222222222222222222 = new ge(i24, arrayList2, arrayList, num222222222222222222, xeVar1022222222222222222, xeVar3, xeVar922222222222222222);
                                    MediaController.c2 = geVar222222222222222222;
                                    i0.h3(geVar222222222222222222, 0);
                                    return;
                                }
                            }
                        } catch (Throwable th27) {
                            th = th27;
                            xeVar5 = null;
                            z11 = true;
                            f8.g(th, z11);
                            if (cursor != null) {
                            }
                            xe xeVar9222222222222222222 = xeVar5;
                            xe xeVar10222222222222222222 = xeVar4;
                            Integer num2222222222222222222 = num;
                            while (i10 < arrayList2.size()) {
                            }
                            geVar = MediaController.c2;
                            if (geVar != null) {
                            }
                            ge geVar2222222222222222222 = new ge(i24, arrayList2, arrayList, num2222222222222222222, xeVar10222222222222222222, xeVar3, xeVar9222222222222222222);
                            MediaController.c2 = geVar2222222222222222222;
                            i0.h3(geVar2222222222222222222, 0);
                            return;
                        }
                        xe xeVar92222222222222222222 = xeVar5;
                        xe xeVar102222222222222222222 = xeVar4;
                        Integer num22222222222222222222 = num;
                        for (i10 = 0; i10 < arrayList2.size(); i10++) {
                            Collections.sort(((xe) arrayList2.get(i10)).e, new a4.d(20));
                        }
                        geVar = MediaController.c2;
                        if (geVar != null) {
                            i0.r(geVar);
                        }
                        ge geVar22222222222222222222 = new ge(i24, arrayList2, arrayList, num22222222222222222222, xeVar102222222222222222222, xeVar3, xeVar92222222222222222222);
                        MediaController.c2 = geVar22222222222222222222;
                        i0.h3(geVar22222222222222222222, 0);
                        return;
                    }
                    xeVar5 = null;
                    if (cursor != null) {
                    }
                    xe xeVar922222222222222222222 = xeVar5;
                    xe xeVar1022222222222222222222 = xeVar4;
                    Integer num222222222222222222222 = num;
                    while (i10 < arrayList2.size()) {
                    }
                    geVar = MediaController.c2;
                    if (geVar != null) {
                    }
                    ge geVar222222222222222222222 = new ge(i24, arrayList2, arrayList, num222222222222222222222, xeVar1022222222222222222222, xeVar3, xeVar922222222222222222222);
                    MediaController.c2 = geVar222222222222222222222;
                    i0.h3(geVar222222222222222222222, 0);
                    return;
                }
                if (i16 >= 33 || (context22.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context22.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context22.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0)) {
                    str2 = "bucket_id";
                    str3 = "bucket_display_name";
                    str4 = "_data";
                    str5 = "_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList2 = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList = arrayList3;
                    xeVar3 = null;
                    xeVar4 = null;
                    num = null;
                    cursor = null;
                    if (cursor != null) {
                    }
                    Context context32222222222222 = w0.b;
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 < 33) {
                    }
                    if (i11 >= 33) {
                    }
                    xeVar5 = null;
                    if (cursor != null) {
                    }
                    xe xeVar9222222222222222222222 = xeVar5;
                    xe xeVar10222222222222222222222 = xeVar4;
                    Integer num2222222222222222222222 = num;
                    while (i10 < arrayList2.size()) {
                    }
                    geVar = MediaController.c2;
                    if (geVar != null) {
                    }
                    ge geVar2222222222222222222222 = new ge(i24, arrayList2, arrayList, num2222222222222222222222, xeVar10222222222222222222222, xeVar3, xeVar9222222222222222222222);
                    MediaController.c2 = geVar2222222222222222222222;
                    i0.h3(geVar2222222222222222222222, 0);
                    return;
                }
                query = MediaStore.Images.Media.query(context22.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.U1, null, null, (i16 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                if (query == null) {
                }
                if (cursor != null) {
                }
                Context context322222222222222 = w0.b;
                i11 = Build.VERSION.SDK_INT;
                if (i11 < 33) {
                }
                if (i11 >= 33) {
                }
                xeVar5 = null;
                if (cursor != null) {
                }
                xe xeVar92222222222222222222222 = xeVar5;
                xe xeVar102222222222222222222222 = xeVar4;
                Integer num22222222222222222222222 = num;
                while (i10 < arrayList2.size()) {
                }
                geVar = MediaController.c2;
                if (geVar != null) {
                }
                ge geVar22222222222222222222222 = new ge(i24, arrayList2, arrayList, num22222222222222222222222, xeVar102222222222222222222222, xeVar3, xeVar92222222222222222222222);
                MediaController.c2 = geVar22222222222222222222222;
                i0.h3(geVar22222222222222222222222, 0);
                return;
            case 1:
                int i36 = this.b;
                String[] strArr3 = MediaController.U1;
                try {
                    context = w0.b;
                } catch (Throwable th28) {
                    th = th28;
                    cursor4 = null;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        }
                        cursor4 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                        if (cursor4 != null) {
                            try {
                            } catch (Throwable th29) {
                                th = th29;
                                try {
                                    f8.g(th, true);
                                    cursor5 = cursor4;
                                    i22 = 0;
                                    Context context4 = w0.b;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                    }
                                    break;
                                } finally {
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                }
                            }
                            if (cursor4.moveToNext()) {
                                i23 = cursor4.getInt(0);
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                cursor5 = cursor4;
                                i22 = i23;
                                Context context42 = w0.b;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (context42.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context42.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context42.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                    }
                                    cursor5 = MediaStore.Images.Media.query(context42.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                                    if (cursor5 != null && cursor5.moveToNext()) {
                                        i22 += cursor5.getInt(0);
                                        break;
                                    }
                                }
                            }
                        }
                        i23 = 0;
                        if (cursor4 != null) {
                        }
                        cursor5 = cursor4;
                        i22 = i23;
                        Context context422 = w0.b;
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        cursor4 = null;
                        i23 = 0;
                        if (cursor4 != null) {
                        }
                        cursor5 = cursor4;
                        i22 = i23;
                        Context context4222 = w0.b;
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    Context context42222 = w0.b;
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                } catch (Throwable th30) {
                    try {
                        f8.g(th30, true);
                        break;
                    } finally {
                        if (cursor5 != null) {
                            cursor5.close();
                        }
                    }
                }
                cursor4 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                if (cursor4 != null) {
                }
                i23 = 0;
                if (cursor4 != null) {
                }
                cursor5 = cursor4;
                i22 = i23;
                break;
            case 2:
                int i37 = this.b;
                int i38 = NotificationRepeat.a;
                pt.k0.c(new bt(pt.t(i37), 2));
                return;
            case 3:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                return;
            case 4:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                return;
            case 5:
                long j10 = this.b - 864000;
                try {
                    P0 = i0.P0();
                } catch (Throwable th31) {
                    f8.g(th31, true);
                }
                if (P0 == null) {
                    return;
                }
                Utilities.clearDir(P0.getAbsolutePath(), 0, j10, false);
                SharedPreferences.Editor edit = wp.d1().edit();
                edit.putInt("lastLogsCheckTime", uz.I);
                edit.apply();
                return;
            case 6:
                ConnectionsManager.lambda$onUpdate$13(this.b);
                return;
            case 7:
                ConnectionsManager.lambda$onSessionCreated$14(this.b);
                return;
            case 8:
                ConnectionsManager.lambda$onLogout$16(this.b);
                return;
            case 9:
                vi.b0(this.b).B(5);
                return;
            case 10:
                int i39 = this.b;
                Pattern pattern = LaunchActivity.D1;
                w0.E = true;
                w0.G = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    wp.r1(i39).h7 = false;
                    return;
                }
                return;
            case 11:
                String k10 = a1.g.k(this.b, "/");
                org.telegram.utils.twidget.p.v(k10, org.telegram.utils.twidget.p.b.keySet());
                org.telegram.utils.twidget.p.v(k10, org.telegram.utils.twidget.p.c.keySet());
                org.telegram.utils.twidget.p.v(k10, org.telegram.utils.twidget.p.d.keySet());
                return;
            case 12:
                int i40 = this.b;
                org.telegram.utils.twidget.p.v(i40 + "/", org.telegram.utils.twidget.p.b.keySet());
                for (org.telegram.utils.twidget.m mVar : org.telegram.utils.twidget.p.a.values()) {
                    if (mVar.b == i40 && mVar.w.isEmpty() && (wVar = mVar.u) != null) {
                        wVar.p();
                        wVar.g = null;
                        wVar.i = 0;
                        wVar.k = 0;
                        wVar.l = false;
                    }
                }
                return;
            case 13:
                vi.b0(this.b).E0(false, true, null);
                return;
            default:
                try {
                    is.a0(this.b).b.executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    f8.g(e14, true);
                    return;
                }
        }
    }
}
