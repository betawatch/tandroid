// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fx0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ fx0(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x0521, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0223, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        if (r9 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r1 == r3) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0187, code lost:
    
        r0 = org.telegram.messenger.MediaController.Z1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018b, code lost:
    
        gm.r(r0);
        org.telegram.messenger.MediaController.Z1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0190, code lost:
    
        org.telegram.messenger.MediaController.N(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0193, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020c A[Catch: all -> 0x04b9, TRY_ENTER, TryCatch #19 {all -> 0x04b9, blocks: (B:131:0x020c, B:272:0x0245, B:275:0x0256, B:444:0x0213, B:446:0x0219, B:448:0x021f), top: B:129:0x020a }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x050a A[Catch: all -> 0x06a1, TryCatch #4 {all -> 0x06a1, blocks: (B:137:0x0502, B:139:0x050a, B:161:0x0526, B:164:0x053e, B:260:0x0511, B:262:0x0517, B:264:0x051d), top: B:136:0x0502 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06b8 A[LOOP:1: B:147:0x06b2->B:149:0x06b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0692 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0511 A[Catch: all -> 0x06a1, TryCatch #4 {all -> 0x06a1, blocks: (B:137:0x0502, B:139:0x050a, B:161:0x0526, B:164:0x053e, B:260:0x0511, B:262:0x0517, B:264:0x051d), top: B:136:0x0502 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0213 A[Catch: all -> 0x04b9, TryCatch #19 {all -> 0x04b9, blocks: (B:131:0x020c, B:272:0x0245, B:275:0x0256, B:444:0x0213, B:446:0x0219, B:448:0x021f), top: B:129:0x020a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140 A[Catch: all -> 0x017c, TryCatch #21 {all -> 0x017c, blocks: (B:62:0x013a, B:64:0x0140, B:66:0x0146, B:68:0x014c, B:70:0x0158, B:72:0x016e, B:74:0x0174, B:86:0x0152), top: B:61:0x013a }] */
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
        ArrayList arrayList2;
        boolean z;
        yn6 yn6Var;
        yn6 yn6Var2;
        Integer num;
        Cursor cursor;
        yn6 yn6Var3;
        yn6 yn6Var4;
        yn6 yn6Var5;
        byte b;
        int i;
        qu quVar;
        int i2;
        Cursor query;
        Cursor cursor2;
        int i3;
        int i4;
        int i5;
        int i6;
        yn6 yn6Var6;
        yn6 yn6Var7;
        Context context;
        int i7;
        ArrayList arrayList3;
        Cursor query2;
        int i8;
        int i9;
        int i10;
        yn6 yn6Var8;
        yn6 yn6Var9;
        int i11;
        int i12;
        int i13;
        Cursor cursor3;
        Cursor cursor4;
        int i14;
        Context context2;
        int i15;
        File O0;
        cyc cycVar;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                hs6.d0(this.b).G0(false, true, null);
                return;
            case 1:
                ConnectionsManager.lambda$onUpdate$13(this.b);
                return;
            case 2:
                ConnectionsManager.lambda$onSessionCreated$14(this.b);
                return;
            case 3:
                ConnectionsManager.lambda$onLogout$16(this.b);
                return;
            case 4:
                try {
                    cf7.Y(this.b).b.executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 5:
                int i16 = this.b;
                String str10 = LaunchActivity.C1;
                a.F = true;
                a.H = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    oc7.r1(i16).Z3 = false;
                    return;
                }
                return;
            case 6:
                int i17 = this.b;
                String[] strArr = MediaController.W1;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = arrayList4;
                SparseArray sparseArray3 = new SparseArray();
                SparseArray sparseArray4 = new SparseArray();
                try {
                    StringBuilder sb = new StringBuilder();
                    sparseArray = sparseArray4;
                    try {
                        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
                        sb.append("/Camera/");
                        str = sb.toString();
                    } catch (Exception e2) {
                        e = e2;
                        fc4.g(e, true);
                        str = null;
                        context = a.b;
                        i7 = Build.VERSION.SDK_INT;
                        arrayList3 = arrayList5;
                        try {
                            if (i7 >= 33) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            str2 = "_data";
                            str3 = "bucket_display_name";
                            str4 = "_id";
                            str5 = "bucket_id";
                            str6 = "height";
                            str7 = "width";
                            str8 = "orientation";
                            arrayList = arrayList6;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList2 = arrayList3;
                            z = true;
                            yn6Var = null;
                            yn6Var2 = null;
                            num = null;
                            cursor = null;
                            try {
                                fc4.g(th, z);
                                if (cursor != null) {
                                }
                                yn6Var3 = yn6Var;
                                yn6Var4 = yn6Var2;
                                try {
                                    Context context3 = a.b;
                                    i2 = Build.VERSION.SDK_INT;
                                    if (i2 < 33) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } finally {
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    sparseArray = sparseArray4;
                }
                try {
                    context = a.b;
                    i7 = Build.VERSION.SDK_INT;
                    arrayList3 = arrayList5;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = "_data";
                    str3 = "bucket_display_name";
                    str4 = "_id";
                    str5 = "bucket_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList2 = arrayList5;
                }
                if (i7 >= 33) {
                    if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        str2 = "_data";
                        str3 = "bucket_display_name";
                        str4 = "_id";
                        str5 = "bucket_id";
                        str6 = "height";
                        str7 = "width";
                        str8 = "orientation";
                        arrayList = arrayList6;
                        sparseArray2 = sparseArray3;
                        str9 = str;
                        arrayList2 = arrayList3;
                        yn6Var3 = null;
                        yn6Var4 = null;
                        num = null;
                        cursor = null;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e4) {
                                fc4.g(e4, true);
                            }
                        }
                        Context context32 = a.b;
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 < 33) {
                            if (context32.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                yn6Var5 = null;
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Exception e5) {
                                        fc4.g(e5, true);
                                    }
                                }
                                b = 1;
                                yn6 yn6Var10 = yn6Var4;
                                Integer num2 = num;
                                i = 0;
                                while (i < arrayList.size()) {
                                    Collections.sort(((yn6) arrayList.get(i)).e, new tk6(b));
                                    i++;
                                    b = 1;
                                }
                                quVar = MediaController.e2;
                                if (quVar != null) {
                                    gm.r(quVar);
                                }
                                qu quVar2 = new qu(i17, arrayList, arrayList2, num2, yn6Var10, yn6Var3, yn6Var5);
                                MediaController.e2 = quVar2;
                                gm.d3(quVar2, 0L);
                                return;
                            }
                            ContentResolver contentResolver = a.b.getContentResolver();
                            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            String[] strArr2 = MediaController.X1;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i2 <= 28 ? "date_modified" : "datetaken");
                            sb2.append(" DESC");
                            query = MediaStore.Images.Media.query(contentResolver, uri, strArr2, null, null, sb2.toString());
                            if (query != null) {
                                cursor = query;
                                yn6Var5 = null;
                                if (cursor != null) {
                                }
                                b = 1;
                                yn6 yn6Var102 = yn6Var4;
                                Integer num22 = num;
                                i = 0;
                                while (i < arrayList.size()) {
                                }
                                quVar = MediaController.e2;
                                if (quVar != null) {
                                }
                                qu quVar22 = new qu(i17, arrayList, arrayList2, num22, yn6Var102, yn6Var3, yn6Var5);
                                MediaController.e2 = quVar22;
                                gm.d3(quVar22, 0L);
                                return;
                            }
                            try {
                                int columnIndex = query.getColumnIndex(str4);
                                int columnIndex2 = query.getColumnIndex(str5);
                                int columnIndex3 = query.getColumnIndex(str3);
                                int columnIndex4 = query.getColumnIndex(str2);
                                int columnIndex5 = query.getColumnIndex(i2 > 28 ? "date_modified" : "datetaken");
                                int columnIndex6 = query.getColumnIndex("duration");
                                int columnIndex7 = query.getColumnIndex(str7);
                                int columnIndex8 = query.getColumnIndex(str6);
                                int columnIndex9 = query.getColumnIndex("_size");
                                query.getColumnIndex(str8);
                                yn6 yn6Var11 = null;
                                while (query.moveToNext()) {
                                    try {
                                        String string = query.getString(columnIndex4);
                                        if (!TextUtils.isEmpty(string)) {
                                            int i18 = query.getInt(columnIndex);
                                            int i19 = query.getInt(columnIndex2);
                                            String string2 = query.getString(columnIndex3);
                                            int i20 = columnIndex;
                                            int i21 = columnIndex5;
                                            jo6 jo6Var = new jo6(i19, i18, query.getLong(columnIndex5), string, 0, (int) (query.getLong(columnIndex6) / 1000), true, query.getInt(columnIndex7), query.getInt(columnIndex8), query.getLong(columnIndex9));
                                            cursor2 = query;
                                            if (yn6Var11 == null) {
                                                i3 = columnIndex2;
                                                try {
                                                    i4 = columnIndex3;
                                                    i5 = columnIndex4;
                                                    yn6Var7 = new yn6(0, jb6.M0(2131754252, null), jo6Var);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    yn6Var5 = yn6Var11;
                                                    cursor = cursor2;
                                                    b = 1;
                                                    try {
                                                        fc4.g(th, true);
                                                        if (cursor != null) {
                                                            try {
                                                                cursor.close();
                                                            } catch (Exception e6) {
                                                                fc4.g(e6, true);
                                                            }
                                                        }
                                                        yn6 yn6Var1022 = yn6Var4;
                                                        Integer num222 = num;
                                                        i = 0;
                                                        while (i < arrayList.size()) {
                                                        }
                                                        quVar = MediaController.e2;
                                                        if (quVar != null) {
                                                        }
                                                        qu quVar222 = new qu(i17, arrayList, arrayList2, num222, yn6Var1022, yn6Var3, yn6Var5);
                                                        MediaController.e2 = quVar222;
                                                        gm.d3(quVar222, 0L);
                                                        return;
                                                    } finally {
                                                    }
                                                }
                                                try {
                                                    yn6Var7.b = true;
                                                    int i22 = yn6Var4 != null ? 1 : 0;
                                                    if (yn6Var3 != null) {
                                                        i22++;
                                                    }
                                                    arrayList.add(i22, yn6Var7);
                                                    yn6Var11 = yn6Var7;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    yn6Var5 = yn6Var7;
                                                    cursor = cursor2;
                                                    b = 1;
                                                    fc4.g(th, true);
                                                    if (cursor != null) {
                                                    }
                                                    yn6 yn6Var10222 = yn6Var4;
                                                    Integer num2222 = num;
                                                    i = 0;
                                                    while (i < arrayList.size()) {
                                                    }
                                                    quVar = MediaController.e2;
                                                    if (quVar != null) {
                                                    }
                                                    qu quVar2222 = new qu(i17, arrayList, arrayList2, num2222, yn6Var10222, yn6Var3, yn6Var5);
                                                    MediaController.e2 = quVar2222;
                                                    gm.d3(quVar2222, 0L);
                                                    return;
                                                }
                                            } else {
                                                i3 = columnIndex2;
                                                i4 = columnIndex3;
                                                i5 = columnIndex4;
                                            }
                                            if (yn6Var4 == null) {
                                                i6 = columnIndex6;
                                                yn6Var6 = new yn6(0, jb6.M0(2131754264, null), jo6Var);
                                                try {
                                                    arrayList.add(0, yn6Var6);
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    yn6Var4 = yn6Var6;
                                                    yn6Var5 = yn6Var11;
                                                    cursor = cursor2;
                                                    b = 1;
                                                    fc4.g(th, true);
                                                    if (cursor != null) {
                                                    }
                                                    yn6 yn6Var102222 = yn6Var4;
                                                    Integer num22222 = num;
                                                    i = 0;
                                                    while (i < arrayList.size()) {
                                                    }
                                                    quVar = MediaController.e2;
                                                    if (quVar != null) {
                                                    }
                                                    qu quVar22222 = new qu(i17, arrayList, arrayList2, num22222, yn6Var102222, yn6Var3, yn6Var5);
                                                    MediaController.e2 = quVar22222;
                                                    gm.d3(quVar22222, 0L);
                                                    return;
                                                }
                                            } else {
                                                i6 = columnIndex6;
                                                yn6Var6 = yn6Var4;
                                            }
                                            yn6Var11.a(jo6Var);
                                            yn6Var6.a(jo6Var);
                                            yn6 yn6Var12 = (yn6) sparseArray2.get(i19);
                                            if (yn6Var12 == null) {
                                                yn6Var12 = new yn6(i19, string2, jo6Var);
                                                sparseArray2.put(i19, yn6Var12);
                                                if (num != null || str9 == null || string == null || !string.startsWith(str9)) {
                                                    arrayList.add(yn6Var12);
                                                } else {
                                                    arrayList.add(0, yn6Var12);
                                                    num = Integer.valueOf(i19);
                                                }
                                            }
                                            yn6Var12.a(jo6Var);
                                            yn6Var4 = yn6Var6;
                                            query = cursor2;
                                            columnIndex2 = i3;
                                            columnIndex = i20;
                                            columnIndex3 = i4;
                                            columnIndex4 = i5;
                                            columnIndex5 = i21;
                                            columnIndex6 = i6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor2 = query;
                                    }
                                }
                                yn6Var5 = yn6Var11;
                                cursor = query;
                                if (cursor != null) {
                                }
                                b = 1;
                            } catch (Throwable th8) {
                                th = th8;
                                cursor = query;
                                yn6Var5 = null;
                                b = 1;
                                fc4.g(th, true);
                                if (cursor != null) {
                                }
                                yn6 yn6Var1022222 = yn6Var4;
                                Integer num222222 = num;
                                i = 0;
                                while (i < arrayList.size()) {
                                }
                                quVar = MediaController.e2;
                                if (quVar != null) {
                                }
                                qu quVar222222 = new qu(i17, arrayList, arrayList2, num222222, yn6Var1022222, yn6Var3, yn6Var5);
                                MediaController.e2 = quVar222222;
                                gm.d3(quVar222222, 0L);
                                return;
                            }
                            yn6 yn6Var10222222 = yn6Var4;
                            Integer num2222222 = num;
                            i = 0;
                            while (i < arrayList.size()) {
                            }
                            quVar = MediaController.e2;
                            if (quVar != null) {
                            }
                            qu quVar2222222 = new qu(i17, arrayList, arrayList2, num2222222, yn6Var10222222, yn6Var3, yn6Var5);
                            MediaController.e2 = quVar2222222;
                            gm.d3(quVar2222222, 0L);
                            return;
                        }
                        if (context32.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                            if (context32.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                break;
                            }
                        }
                        ContentResolver contentResolver2 = a.b.getContentResolver();
                        Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr22 = MediaController.X1;
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(i2 <= 28 ? "date_modified" : "datetaken");
                        sb22.append(" DESC");
                        query = MediaStore.Images.Media.query(contentResolver2, uri2, strArr22, null, null, sb22.toString());
                        if (query != null) {
                        }
                    }
                    query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.W1, null, null, (i7 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                    if (query2 == null) {
                        try {
                            int columnIndex10 = query2.getColumnIndex("_id");
                            str4 = "_id";
                            try {
                                int columnIndex11 = query2.getColumnIndex("bucket_id");
                                str5 = "bucket_id";
                                try {
                                    int columnIndex12 = query2.getColumnIndex("bucket_display_name");
                                    str3 = "bucket_display_name";
                                    try {
                                        int columnIndex13 = query2.getColumnIndex("_data");
                                        str2 = "_data";
                                        try {
                                            int columnIndex14 = query2.getColumnIndex(i7 > 28 ? "date_modified" : "datetaken");
                                            int columnIndex15 = query2.getColumnIndex("orientation");
                                            str8 = "orientation";
                                            try {
                                                int columnIndex16 = query2.getColumnIndex("width");
                                                str7 = "width";
                                                try {
                                                    int columnIndex17 = query2.getColumnIndex("height");
                                                    str6 = "height";
                                                    try {
                                                        int columnIndex18 = query2.getColumnIndex("_size");
                                                        yn6Var3 = null;
                                                        yn6Var4 = null;
                                                        num = null;
                                                        Integer num3 = null;
                                                        while (query2.moveToNext()) {
                                                            try {
                                                                String string3 = query2.getString(columnIndex13);
                                                                if (!TextUtils.isEmpty(string3)) {
                                                                    int i23 = query2.getInt(columnIndex10);
                                                                    int i24 = query2.getInt(columnIndex11);
                                                                    int i25 = columnIndex10;
                                                                    String string4 = query2.getString(columnIndex12);
                                                                    jo6 jo6Var2 = new jo6(i24, i23, query2.getLong(columnIndex14), string3, query2.getInt(columnIndex15), 0, false, query2.getInt(columnIndex16), query2.getInt(columnIndex17), query2.getLong(columnIndex18));
                                                                    int i26 = columnIndex14;
                                                                    int i27 = columnIndex13;
                                                                    cursor = query2;
                                                                    if (yn6Var3 == null) {
                                                                        i8 = columnIndex11;
                                                                        try {
                                                                            i9 = columnIndex12;
                                                                            i10 = columnIndex15;
                                                                            yn6Var8 = new yn6(0, jb6.M0(2131754257, null), jo6Var2);
                                                                            arrayList2 = arrayList3;
                                                                            try {
                                                                                arrayList2.add(0, yn6Var8);
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                arrayList = arrayList6;
                                                                                sparseArray2 = sparseArray3;
                                                                                yn6Var2 = yn6Var4;
                                                                                z = true;
                                                                                yn6Var = yn6Var8;
                                                                                str9 = str;
                                                                                fc4.g(th, z);
                                                                                if (cursor != null) {
                                                                                }
                                                                                yn6Var3 = yn6Var;
                                                                                yn6Var4 = yn6Var2;
                                                                                Context context322 = a.b;
                                                                                i2 = Build.VERSION.SDK_INT;
                                                                                if (i2 < 33) {
                                                                                }
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            arrayList2 = arrayList3;
                                                                            arrayList = arrayList6;
                                                                            sparseArray2 = sparseArray3;
                                                                            str9 = str;
                                                                            yn6Var = yn6Var3;
                                                                            yn6Var2 = yn6Var4;
                                                                            z = true;
                                                                            fc4.g(th, z);
                                                                            if (cursor != null) {
                                                                            }
                                                                            yn6Var3 = yn6Var;
                                                                            yn6Var4 = yn6Var2;
                                                                            Context context3222 = a.b;
                                                                            i2 = Build.VERSION.SDK_INT;
                                                                            if (i2 < 33) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i8 = columnIndex11;
                                                                        i9 = columnIndex12;
                                                                        i10 = columnIndex15;
                                                                        arrayList2 = arrayList3;
                                                                        yn6Var8 = yn6Var3;
                                                                    }
                                                                    if (yn6Var4 == null) {
                                                                        try {
                                                                            i11 = columnIndex18;
                                                                            i12 = columnIndex17;
                                                                            i13 = columnIndex16;
                                                                            yn6Var9 = new yn6(0, jb6.M0(2131754264, null), jo6Var2);
                                                                            arrayList = arrayList6;
                                                                            try {
                                                                                arrayList.add(0, yn6Var9);
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                yn6Var = yn6Var8;
                                                                                sparseArray2 = sparseArray3;
                                                                                str9 = str;
                                                                                yn6Var2 = yn6Var9;
                                                                                z = true;
                                                                                fc4.g(th, z);
                                                                                if (cursor != null) {
                                                                                    try {
                                                                                        cursor.close();
                                                                                    } catch (Exception e7) {
                                                                                        fc4.g(e7, z);
                                                                                    }
                                                                                }
                                                                                yn6Var3 = yn6Var;
                                                                                yn6Var4 = yn6Var2;
                                                                                Context context32222 = a.b;
                                                                                i2 = Build.VERSION.SDK_INT;
                                                                                if (i2 < 33) {
                                                                                }
                                                                            }
                                                                        } catch (Throwable th12) {
                                                                            th = th12;
                                                                            arrayList = arrayList6;
                                                                            yn6Var = yn6Var8;
                                                                            sparseArray2 = sparseArray3;
                                                                            str9 = str;
                                                                            yn6Var2 = yn6Var4;
                                                                            z = true;
                                                                            fc4.g(th, z);
                                                                            if (cursor != null) {
                                                                            }
                                                                            yn6Var3 = yn6Var;
                                                                            yn6Var4 = yn6Var2;
                                                                            Context context322222 = a.b;
                                                                            i2 = Build.VERSION.SDK_INT;
                                                                            if (i2 < 33) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i11 = columnIndex18;
                                                                        i12 = columnIndex17;
                                                                        i13 = columnIndex16;
                                                                        arrayList = arrayList6;
                                                                        yn6Var9 = yn6Var4;
                                                                    }
                                                                    if (yn6Var8.e.size() < 15) {
                                                                        jo6Var2.d();
                                                                    }
                                                                    yn6Var8.a(jo6Var2);
                                                                    yn6Var9.a(jo6Var2);
                                                                    sparseArray2 = sparseArray3;
                                                                    try {
                                                                        yn6 yn6Var13 = (yn6) sparseArray2.get(i24);
                                                                        if (yn6Var13 == null) {
                                                                            yn6Var13 = new yn6(i24, string4, jo6Var2);
                                                                            sparseArray2.put(i24, yn6Var13);
                                                                            if (num != null || str == null || string3 == null) {
                                                                                yn6Var = yn6Var8;
                                                                                yn6Var2 = yn6Var9;
                                                                                str9 = str;
                                                                            } else {
                                                                                yn6Var = yn6Var8;
                                                                                str9 = str;
                                                                                try {
                                                                                    if (string3.startsWith(str9)) {
                                                                                        yn6Var2 = yn6Var9;
                                                                                        try {
                                                                                            arrayList.add(0, yn6Var13);
                                                                                            num = Integer.valueOf(i24);
                                                                                        } catch (Throwable th13) {
                                                                                            th = th13;
                                                                                            z = true;
                                                                                            fc4.g(th, z);
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            yn6Var3 = yn6Var;
                                                                                            yn6Var4 = yn6Var2;
                                                                                            Context context3222222 = a.b;
                                                                                            i2 = Build.VERSION.SDK_INT;
                                                                                            if (i2 < 33) {
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        yn6Var2 = yn6Var9;
                                                                                    }
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                    yn6Var2 = yn6Var9;
                                                                                    z = true;
                                                                                    fc4.g(th, z);
                                                                                    if (cursor != null) {
                                                                                    }
                                                                                    yn6Var3 = yn6Var;
                                                                                    yn6Var4 = yn6Var2;
                                                                                    Context context32222222 = a.b;
                                                                                    i2 = Build.VERSION.SDK_INT;
                                                                                    if (i2 < 33) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            arrayList.add(yn6Var13);
                                                                        } else {
                                                                            yn6Var = yn6Var8;
                                                                            yn6Var2 = yn6Var9;
                                                                            str9 = str;
                                                                        }
                                                                        yn6Var13.a(jo6Var2);
                                                                        SparseArray sparseArray5 = sparseArray;
                                                                        yn6 yn6Var14 = (yn6) sparseArray5.get(i24);
                                                                        if (yn6Var14 == null) {
                                                                            yn6Var14 = new yn6(i24, string4, jo6Var2);
                                                                            sparseArray5.put(i24, yn6Var14);
                                                                            if (num3 != null || str9 == null || string3 == null || !string3.startsWith(str9)) {
                                                                                arrayList2.add(yn6Var14);
                                                                            } else {
                                                                                arrayList2.add(0, yn6Var14);
                                                                                num3 = Integer.valueOf(i24);
                                                                            }
                                                                        }
                                                                        yn6Var14.a(jo6Var2);
                                                                        str = str9;
                                                                        sparseArray = sparseArray5;
                                                                        yn6Var3 = yn6Var;
                                                                        yn6Var4 = yn6Var2;
                                                                        columnIndex10 = i25;
                                                                        columnIndex14 = i26;
                                                                        columnIndex13 = i27;
                                                                        query2 = cursor;
                                                                        columnIndex11 = i8;
                                                                        columnIndex15 = i10;
                                                                        columnIndex16 = i13;
                                                                        sparseArray3 = sparseArray2;
                                                                        arrayList6 = arrayList;
                                                                        columnIndex18 = i11;
                                                                        columnIndex17 = i12;
                                                                        arrayList3 = arrayList2;
                                                                        columnIndex12 = i9;
                                                                    } catch (Throwable th15) {
                                                                        th = th15;
                                                                        yn6Var = yn6Var8;
                                                                        yn6Var2 = yn6Var9;
                                                                        str9 = str;
                                                                    }
                                                                }
                                                            } catch (Throwable th16) {
                                                                th = th16;
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
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        cursor = query2;
                                                        arrayList = arrayList6;
                                                        sparseArray2 = sparseArray3;
                                                        str9 = str;
                                                        arrayList2 = arrayList3;
                                                        z = true;
                                                        yn6Var = null;
                                                        yn6Var2 = null;
                                                        num = null;
                                                        fc4.g(th, z);
                                                        if (cursor != null) {
                                                        }
                                                        yn6Var3 = yn6Var;
                                                        yn6Var4 = yn6Var2;
                                                        Context context322222222 = a.b;
                                                        i2 = Build.VERSION.SDK_INT;
                                                        if (i2 < 33) {
                                                        }
                                                    }
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    cursor = query2;
                                                    str6 = "height";
                                                }
                                            } catch (Throwable th19) {
                                                th = th19;
                                                cursor = query2;
                                                str6 = "height";
                                                str7 = "width";
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                            cursor = query2;
                                            str6 = "height";
                                            str7 = "width";
                                            str8 = "orientation";
                                            arrayList = arrayList6;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            arrayList2 = arrayList3;
                                            z = true;
                                            yn6Var = null;
                                            yn6Var2 = null;
                                            num = null;
                                            fc4.g(th, z);
                                            if (cursor != null) {
                                            }
                                            yn6Var3 = yn6Var;
                                            yn6Var4 = yn6Var2;
                                            Context context3222222222 = a.b;
                                            i2 = Build.VERSION.SDK_INT;
                                            if (i2 < 33) {
                                            }
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                        cursor = query2;
                                        str2 = "_data";
                                    }
                                } catch (Throwable th22) {
                                    th = th22;
                                    cursor = query2;
                                    str2 = "_data";
                                    str3 = "bucket_display_name";
                                }
                            } catch (Throwable th23) {
                                th = th23;
                                cursor = query2;
                                str2 = "_data";
                                str3 = "bucket_display_name";
                                str5 = "bucket_id";
                                str6 = "height";
                                str7 = "width";
                                str8 = "orientation";
                                arrayList = arrayList6;
                                sparseArray2 = sparseArray3;
                                str9 = str;
                                arrayList2 = arrayList3;
                                z = true;
                                yn6Var = null;
                                yn6Var2 = null;
                                num = null;
                                fc4.g(th, z);
                                if (cursor != null) {
                                }
                                yn6Var3 = yn6Var;
                                yn6Var4 = yn6Var2;
                                Context context32222222222 = a.b;
                                i2 = Build.VERSION.SDK_INT;
                                if (i2 < 33) {
                                }
                            }
                        } catch (Throwable th24) {
                            th = th24;
                            cursor = query2;
                            str2 = "_data";
                            str3 = "bucket_display_name";
                            str4 = "_id";
                        }
                    } else {
                        cursor = query2;
                        str2 = "_data";
                        str3 = "bucket_display_name";
                        str4 = "_id";
                        str5 = "bucket_id";
                        str6 = "height";
                        str7 = "width";
                        str8 = "orientation";
                        arrayList = arrayList6;
                        sparseArray2 = sparseArray3;
                        str9 = str;
                        arrayList2 = arrayList3;
                        yn6Var3 = null;
                        yn6Var4 = null;
                        num = null;
                    }
                    if (cursor != null) {
                    }
                    Context context322222222222 = a.b;
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 < 33) {
                    }
                } else {
                    if (context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        if (context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                            break;
                        }
                    }
                    query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.W1, null, null, (i7 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                    if (query2 == null) {
                    }
                    if (cursor != null) {
                    }
                    Context context3222222222222 = a.b;
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 < 33) {
                    }
                }
            case 7:
                int i28 = this.b;
                String[] strArr3 = MediaController.W1;
                try {
                    context2 = a.b;
                } catch (Throwable th25) {
                    th = th25;
                    cursor3 = null;
                }
                try {
                    if ((Build.VERSION.SDK_INT < 33 || !(context2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 || context2.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || context2.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0)) && context2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        cursor3 = null;
                    } else {
                        cursor3 = MediaStore.Images.Media.query(context2.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                        if (cursor3 != null) {
                            try {
                            } catch (Throwable th26) {
                                th = th26;
                                try {
                                    fc4.g(th, true);
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    cursor4 = cursor3;
                                    i14 = 0;
                                    Context context4 = a.b;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                    }
                                    i14 += cursor4.getInt(0);
                                    break;
                                } finally {
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            }
                            if (cursor3.moveToNext()) {
                                i15 = cursor3.getInt(0);
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                cursor4 = cursor3;
                                i14 = i15;
                                Context context42 = a.b;
                                if (((Build.VERSION.SDK_INT >= 33 && (context42.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 || context42.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || context42.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0)) || context42.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) && (cursor4 = MediaStore.Images.Media.query(context42.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null)) != null && cursor4.moveToNext()) {
                                    i14 += cursor4.getInt(0);
                                }
                            }
                        }
                    }
                    Context context422 = a.b;
                    if (Build.VERSION.SDK_INT >= 33) {
                        i14 += cursor4.getInt(0);
                    }
                    i14 += cursor4.getInt(0);
                } catch (Throwable th27) {
                    try {
                        fc4.g(th27, true);
                        break;
                    } finally {
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                    }
                }
                i15 = 0;
                if (cursor3 != null) {
                }
                cursor4 = cursor3;
                i14 = i15;
                break;
            case 8:
                int i29 = this.b;
                int i30 = NotificationRepeat.a;
                lo7.l0.c(new zn7(lo7.n(i29), b2));
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                return;
            case 10:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                return;
            case 11:
                long j = this.b - 864000;
                try {
                    O0 = gm.O0();
                } catch (Throwable th28) {
                    fc4.g(th28, true);
                }
                if (O0 != null) {
                    Utilities.clearDir(O0.getAbsolutePath(), 0, j, false);
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putInt("lastLogsCheckTime", gda.H);
                    edit.apply();
                    return;
                }
                return;
            case 12:
                hs6.d0(this.b).D(5);
                return;
            case 13:
                String n = aq1.n(this.b, "/");
                wxc.y(n, wxc.b.keySet());
                wxc.y(n, wxc.c.keySet());
                wxc.y(n, wxc.d.keySet());
                return;
            default:
                int i31 = this.b;
                wxc.y(i31 + "/", wxc.b.keySet());
                for (txc txcVar : wxc.a.values()) {
                    if (txcVar.b == i31 && txcVar.x.isEmpty() && (cycVar = txcVar.v) != null) {
                        cycVar.n();
                        cycVar.f = null;
                        cycVar.h = 0;
                        cycVar.j = 0;
                        cycVar.k = false;
                    }
                }
                return;
        }
    }
}
