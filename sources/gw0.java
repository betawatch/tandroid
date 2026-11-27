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
import org.telegram.messenger.voip.OpusDred;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class gw0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ gw0(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0539, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x023b, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
    
        if (r9 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (r1 == r3) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        r0 = org.telegram.messenger.MediaController.Z1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a3, code lost:
    
        hl.r(r0);
        org.telegram.messenger.MediaController.Z1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a8, code lost:
    
        org.telegram.messenger.MediaController.R(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ab, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224 A[Catch: all -> 0x04d1, TRY_ENTER, TryCatch #30 {all -> 0x04d1, blocks: (B:139:0x0224, B:278:0x025d, B:281:0x026e, B:450:0x022b, B:452:0x0231, B:454:0x0237), top: B:137:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0522 A[Catch: all -> 0x06b1, TryCatch #8 {all -> 0x06b1, blocks: (B:145:0x051a, B:147:0x0522, B:168:0x053e, B:171:0x0556, B:266:0x0529, B:268:0x052f, B:270:0x0535), top: B:144:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06cb A[LOOP:1: B:153:0x06c5->B:155:0x06cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0529 A[Catch: all -> 0x06b1, TryCatch #8 {all -> 0x06b1, blocks: (B:145:0x051a, B:147:0x0522, B:168:0x053e, B:171:0x0556, B:266:0x0529, B:268:0x052f, B:270:0x0535), top: B:144:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x050e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x022b A[Catch: all -> 0x04d1, TryCatch #30 {all -> 0x04d1, blocks: (B:139:0x0224, B:278:0x025d, B:281:0x026e, B:450:0x022b, B:452:0x0231, B:454:0x0237), top: B:137:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158 A[Catch: all -> 0x0194, TryCatch #33 {all -> 0x0194, blocks: (B:70:0x0152, B:72:0x0158, B:74:0x015e, B:76:0x0164, B:78:0x0170, B:80:0x0186, B:82:0x018c, B:94:0x016a), top: B:69:0x0152 }] */
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
        do6 do6Var;
        do6 do6Var2;
        Integer num;
        Cursor cursor;
        do6 do6Var3;
        do6 do6Var4;
        do6 do6Var5;
        boolean z2;
        int i;
        st stVar;
        int i2;
        Cursor query;
        Cursor cursor2;
        int i3;
        int i4;
        int i5;
        int i6;
        do6 do6Var6;
        do6 do6Var7;
        Context context;
        int i7;
        ArrayList arrayList3;
        Cursor query2;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int columnIndex7;
        int i8;
        int i9;
        int i10;
        do6 do6Var8;
        do6 do6Var9;
        int i11;
        int i12;
        int i13;
        Cursor cursor3;
        Cursor cursor4;
        int i14;
        Context context2;
        int i15;
        File O0;
        q0d q0dVar;
        byte b = 1;
        switch (this.a) {
            case 0:
                ls6.d0(this.b).G0(false, true, null);
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
                    jf7.Y(this.b).b.executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 5:
                int i16 = this.b;
                String str10 = LaunchActivity.C1;
                a.F = true;
                a.H = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    uc7.s1(i16).Z3 = false;
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
                        cc4.g(e, true);
                        str = null;
                        context = a.b;
                        i7 = Build.VERSION.SDK_INT;
                        arrayList3 = arrayList5;
                        if (i7 < 33) {
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
                    arrayList2 = arrayList5;
                }
                try {
                } catch (Throwable th2) {
                    th = th2;
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
                    do6Var = null;
                    do6Var2 = null;
                    num = null;
                    cursor = null;
                    try {
                        cc4.g(th, z);
                        if (cursor != null) {
                        }
                        do6Var3 = do6Var;
                        do6Var4 = do6Var2;
                        try {
                            Context context3 = a.b;
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 < 33) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        do6 do6Var10 = do6Var4;
                        Integer num2 = num;
                        while (i < arrayList.size()) {
                        }
                        stVar = MediaController.e2;
                        if (stVar != null) {
                        }
                        st stVar2 = new st(i17, arrayList, arrayList2, num2, do6Var10, do6Var3, do6Var5);
                        MediaController.e2 = stVar2;
                        hl.d3(stVar2, 0L);
                        return;
                    } finally {
                    }
                }
                if (i7 < 33) {
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
                    Context context32 = a.b;
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 < 33) {
                    }
                    do6 do6Var102 = do6Var4;
                    Integer num22 = num;
                    while (i < arrayList.size()) {
                    }
                    stVar = MediaController.e2;
                    if (stVar != null) {
                    }
                    st stVar22 = new st(i17, arrayList, arrayList2, num22, do6Var102, do6Var3, do6Var5);
                    MediaController.e2 = stVar22;
                    hl.d3(stVar22, 0L);
                    return;
                }
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
                    do6Var3 = null;
                    do6Var4 = null;
                    num = null;
                    cursor = null;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e4) {
                            cc4.g(e4, true);
                        }
                    }
                    Context context322 = a.b;
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 < 33) {
                        if (context322.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            do6Var5 = null;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e5) {
                                    e = e5;
                                    z2 = true;
                                    cc4.g(e, z2);
                                    do6 do6Var1022 = do6Var4;
                                    Integer num222 = num;
                                    while (i < arrayList.size()) {
                                    }
                                    stVar = MediaController.e2;
                                    if (stVar != null) {
                                    }
                                    st stVar222 = new st(i17, arrayList, arrayList2, num222, do6Var1022, do6Var3, do6Var5);
                                    MediaController.e2 = stVar222;
                                    hl.d3(stVar222, 0L);
                                    return;
                                }
                            }
                        }
                        ContentResolver contentResolver = a.b.getContentResolver();
                        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr2 = MediaController.X1;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i2 <= 28 ? "date_modified" : "datetaken");
                        sb2.append(" DESC");
                        query = MediaStore.Images.Media.query(contentResolver, uri, strArr2, null, null, sb2.toString());
                        if (query == null) {
                            try {
                                int columnIndex8 = query.getColumnIndex(str4);
                                int columnIndex9 = query.getColumnIndex(str5);
                                int columnIndex10 = query.getColumnIndex(str3);
                                int columnIndex11 = query.getColumnIndex(str2);
                                int columnIndex12 = query.getColumnIndex(i2 > 28 ? "date_modified" : "datetaken");
                                int columnIndex13 = query.getColumnIndex("duration");
                                int columnIndex14 = query.getColumnIndex(str7);
                                int columnIndex15 = query.getColumnIndex(str6);
                                int columnIndex16 = query.getColumnIndex("_size");
                                query.getColumnIndex(str8);
                                do6 do6Var11 = null;
                                while (query.moveToNext()) {
                                    try {
                                        String string = query.getString(columnIndex11);
                                        if (!TextUtils.isEmpty(string)) {
                                            int i18 = query.getInt(columnIndex8);
                                            int i19 = query.getInt(columnIndex9);
                                            String string2 = query.getString(columnIndex10);
                                            int i20 = columnIndex8;
                                            int i21 = columnIndex12;
                                            no6 no6Var = new no6(i19, i18, query.getLong(columnIndex12), string, 0, (int) (query.getLong(columnIndex13) / 1000), true, query.getInt(columnIndex14), query.getInt(columnIndex15), query.getLong(columnIndex16));
                                            cursor2 = query;
                                            if (do6Var11 == null) {
                                                i3 = columnIndex9;
                                                try {
                                                    i4 = columnIndex10;
                                                    i5 = columnIndex11;
                                                    do6Var7 = new do6(0, ob6.M0(2131754280, null), no6Var);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    do6Var5 = do6Var11;
                                                    cursor = cursor2;
                                                    z2 = true;
                                                    try {
                                                        cc4.g(th, true);
                                                        if (cursor != null) {
                                                            try {
                                                                cursor.close();
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                cc4.g(e, z2);
                                                                do6 do6Var10222 = do6Var4;
                                                                Integer num2222 = num;
                                                                while (i < arrayList.size()) {
                                                                }
                                                                stVar = MediaController.e2;
                                                                if (stVar != null) {
                                                                }
                                                                st stVar2222 = new st(i17, arrayList, arrayList2, num2222, do6Var10222, do6Var3, do6Var5);
                                                                MediaController.e2 = stVar2222;
                                                                hl.d3(stVar2222, 0L);
                                                                return;
                                                            }
                                                        }
                                                        do6 do6Var102222 = do6Var4;
                                                        Integer num22222 = num;
                                                        while (i < arrayList.size()) {
                                                        }
                                                        stVar = MediaController.e2;
                                                        if (stVar != null) {
                                                        }
                                                        st stVar22222 = new st(i17, arrayList, arrayList2, num22222, do6Var102222, do6Var3, do6Var5);
                                                        MediaController.e2 = stVar22222;
                                                        hl.d3(stVar22222, 0L);
                                                        return;
                                                    } finally {
                                                    }
                                                }
                                                try {
                                                    do6Var7.b = true;
                                                    int i22 = do6Var4 != null ? 1 : 0;
                                                    if (do6Var3 != null) {
                                                        i22++;
                                                    }
                                                    arrayList.add(i22, do6Var7);
                                                    do6Var11 = do6Var7;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    do6Var5 = do6Var7;
                                                    cursor = cursor2;
                                                    z2 = true;
                                                    cc4.g(th, true);
                                                    if (cursor != null) {
                                                    }
                                                    do6 do6Var1022222 = do6Var4;
                                                    Integer num222222 = num;
                                                    while (i < arrayList.size()) {
                                                    }
                                                    stVar = MediaController.e2;
                                                    if (stVar != null) {
                                                    }
                                                    st stVar222222 = new st(i17, arrayList, arrayList2, num222222, do6Var1022222, do6Var3, do6Var5);
                                                    MediaController.e2 = stVar222222;
                                                    hl.d3(stVar222222, 0L);
                                                    return;
                                                }
                                            } else {
                                                i3 = columnIndex9;
                                                i4 = columnIndex10;
                                                i5 = columnIndex11;
                                            }
                                            if (do6Var4 == null) {
                                                i6 = columnIndex13;
                                                do6Var6 = new do6(0, ob6.M0(2131754292, null), no6Var);
                                                try {
                                                    arrayList.add(0, do6Var6);
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    do6Var4 = do6Var6;
                                                    do6Var5 = do6Var11;
                                                    cursor = cursor2;
                                                    z2 = true;
                                                    cc4.g(th, true);
                                                    if (cursor != null) {
                                                    }
                                                    do6 do6Var10222222 = do6Var4;
                                                    Integer num2222222 = num;
                                                    while (i < arrayList.size()) {
                                                    }
                                                    stVar = MediaController.e2;
                                                    if (stVar != null) {
                                                    }
                                                    st stVar2222222 = new st(i17, arrayList, arrayList2, num2222222, do6Var10222222, do6Var3, do6Var5);
                                                    MediaController.e2 = stVar2222222;
                                                    hl.d3(stVar2222222, 0L);
                                                    return;
                                                }
                                            } else {
                                                i6 = columnIndex13;
                                                do6Var6 = do6Var4;
                                            }
                                            do6Var11.a(no6Var);
                                            do6Var6.a(no6Var);
                                            do6 do6Var12 = (do6) sparseArray2.get(i19);
                                            if (do6Var12 == null) {
                                                do6Var12 = new do6(i19, string2, no6Var);
                                                sparseArray2.put(i19, do6Var12);
                                                if (num != null || str9 == null || string == null || !string.startsWith(str9)) {
                                                    arrayList.add(do6Var12);
                                                } else {
                                                    arrayList.add(0, do6Var12);
                                                    num = Integer.valueOf(i19);
                                                }
                                            }
                                            do6Var12.a(no6Var);
                                            do6Var4 = do6Var6;
                                            query = cursor2;
                                            columnIndex9 = i3;
                                            columnIndex8 = i20;
                                            columnIndex10 = i4;
                                            columnIndex11 = i5;
                                            columnIndex12 = i21;
                                            columnIndex13 = i6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor2 = query;
                                    }
                                }
                                do6Var5 = do6Var11;
                                cursor = query;
                                if (cursor != null) {
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                cursor = query;
                                do6Var5 = null;
                                z2 = true;
                                cc4.g(th, true);
                                if (cursor != null) {
                                }
                                do6 do6Var102222222 = do6Var4;
                                Integer num22222222 = num;
                                while (i < arrayList.size()) {
                                }
                                stVar = MediaController.e2;
                                if (stVar != null) {
                                }
                                st stVar22222222 = new st(i17, arrayList, arrayList2, num22222222, do6Var102222222, do6Var3, do6Var5);
                                MediaController.e2 = stVar22222222;
                                hl.d3(stVar22222222, 0L);
                                return;
                            }
                        } else {
                            cursor = query;
                            do6Var5 = null;
                            if (cursor != null) {
                            }
                        }
                    } else {
                        if (context322.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                            if (context322.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
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
                        if (query == null) {
                        }
                    }
                    do6 do6Var1022222222 = do6Var4;
                    Integer num222222222 = num;
                    for (i = 0; i < arrayList.size(); i++) {
                        Collections.sort(((do6) arrayList.get(i)).e, new vk6((byte) 2));
                    }
                    stVar = MediaController.e2;
                    if (stVar != null) {
                        hl.r(stVar);
                    }
                    st stVar222222222 = new st(i17, arrayList, arrayList2, num222222222, do6Var1022222222, do6Var3, do6Var5);
                    MediaController.e2 = stVar222222222;
                    hl.d3(stVar222222222, 0L);
                    return;
                }
                query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.W1, null, null, (i7 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                if (query2 == null) {
                    try {
                        int columnIndex17 = query2.getColumnIndex("_id");
                        str4 = "_id";
                        try {
                            columnIndex = query2.getColumnIndex("bucket_id");
                            str5 = "bucket_id";
                            try {
                                columnIndex2 = query2.getColumnIndex("bucket_display_name");
                                str3 = "bucket_display_name";
                                try {
                                    columnIndex3 = query2.getColumnIndex("_data");
                                    str2 = "_data";
                                    try {
                                        columnIndex4 = query2.getColumnIndex(i7 > 28 ? "date_modified" : "datetaken");
                                        columnIndex5 = query2.getColumnIndex("orientation");
                                        str8 = "orientation";
                                        try {
                                            columnIndex6 = query2.getColumnIndex("width");
                                            str7 = "width";
                                            try {
                                                columnIndex7 = query2.getColumnIndex("height");
                                                str6 = "height";
                                            } catch (Throwable th9) {
                                                th = th9;
                                                cursor = query2;
                                                str6 = "height";
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            cursor = query2;
                                            str6 = "height";
                                            str7 = "width";
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        cursor = query2;
                                        str6 = "height";
                                        str7 = "width";
                                        str8 = "orientation";
                                        arrayList = arrayList6;
                                        sparseArray2 = sparseArray3;
                                        str9 = str;
                                        arrayList2 = arrayList3;
                                        z = true;
                                        do6Var = null;
                                        do6Var2 = null;
                                        num = null;
                                        cc4.g(th, z);
                                        if (cursor != null) {
                                        }
                                        do6Var3 = do6Var;
                                        do6Var4 = do6Var2;
                                        Context context3222 = a.b;
                                        i2 = Build.VERSION.SDK_INT;
                                        if (i2 < 33) {
                                        }
                                        do6 do6Var10222222222 = do6Var4;
                                        Integer num2222222222 = num;
                                        while (i < arrayList.size()) {
                                        }
                                        stVar = MediaController.e2;
                                        if (stVar != null) {
                                        }
                                        st stVar2222222222 = new st(i17, arrayList, arrayList2, num2222222222, do6Var10222222222, do6Var3, do6Var5);
                                        MediaController.e2 = stVar2222222222;
                                        hl.d3(stVar2222222222, 0L);
                                        return;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    cursor = query2;
                                    str2 = "_data";
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                cursor = query2;
                                str2 = "_data";
                                str3 = "bucket_display_name";
                            }
                        } catch (Throwable th14) {
                            th = th14;
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
                            do6Var = null;
                            do6Var2 = null;
                            num = null;
                            cc4.g(th, z);
                            if (cursor != null) {
                            }
                            do6Var3 = do6Var;
                            do6Var4 = do6Var2;
                            Context context32222 = a.b;
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 < 33) {
                            }
                            do6 do6Var102222222222 = do6Var4;
                            Integer num22222222222 = num;
                            while (i < arrayList.size()) {
                            }
                            stVar = MediaController.e2;
                            if (stVar != null) {
                            }
                            st stVar22222222222 = new st(i17, arrayList, arrayList2, num22222222222, do6Var102222222222, do6Var3, do6Var5);
                            MediaController.e2 = stVar22222222222;
                            hl.d3(stVar22222222222, 0L);
                            return;
                        }
                        try {
                            int columnIndex18 = query2.getColumnIndex("_size");
                            do6Var3 = null;
                            do6Var4 = null;
                            num = null;
                            Integer num3 = null;
                            while (query2.moveToNext()) {
                                try {
                                    String string3 = query2.getString(columnIndex3);
                                    if (!TextUtils.isEmpty(string3)) {
                                        int i23 = query2.getInt(columnIndex17);
                                        int i24 = query2.getInt(columnIndex);
                                        int i25 = columnIndex17;
                                        String string4 = query2.getString(columnIndex2);
                                        no6 no6Var2 = new no6(i24, i23, query2.getLong(columnIndex4), string3, query2.getInt(columnIndex5), 0, false, query2.getInt(columnIndex6), query2.getInt(columnIndex7), query2.getLong(columnIndex18));
                                        int i26 = columnIndex4;
                                        int i27 = columnIndex3;
                                        cursor = query2;
                                        if (do6Var3 == null) {
                                            i8 = columnIndex;
                                            try {
                                                i9 = columnIndex2;
                                                i10 = columnIndex5;
                                                do6Var8 = new do6(0, ob6.M0(2131754285, null), no6Var2);
                                                arrayList2 = arrayList3;
                                                try {
                                                    arrayList2.add(0, do6Var8);
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    arrayList = arrayList6;
                                                    sparseArray2 = sparseArray3;
                                                    do6Var2 = do6Var4;
                                                    z = true;
                                                    do6Var = do6Var8;
                                                    str9 = str;
                                                    cc4.g(th, z);
                                                    if (cursor != null) {
                                                        try {
                                                            cursor.close();
                                                        } catch (Exception e7) {
                                                            cc4.g(e7, z);
                                                        }
                                                    }
                                                    do6Var3 = do6Var;
                                                    do6Var4 = do6Var2;
                                                    Context context322222 = a.b;
                                                    i2 = Build.VERSION.SDK_INT;
                                                    if (i2 < 33) {
                                                    }
                                                    do6 do6Var1022222222222 = do6Var4;
                                                    Integer num222222222222 = num;
                                                    while (i < arrayList.size()) {
                                                    }
                                                    stVar = MediaController.e2;
                                                    if (stVar != null) {
                                                    }
                                                    st stVar222222222222 = new st(i17, arrayList, arrayList2, num222222222222, do6Var1022222222222, do6Var3, do6Var5);
                                                    MediaController.e2 = stVar222222222222;
                                                    hl.d3(stVar222222222222, 0L);
                                                    return;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                arrayList2 = arrayList3;
                                                arrayList = arrayList6;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                                do6Var = do6Var3;
                                                do6Var2 = do6Var4;
                                                z = true;
                                                cc4.g(th, z);
                                                if (cursor != null) {
                                                }
                                                do6Var3 = do6Var;
                                                do6Var4 = do6Var2;
                                                Context context3222222 = a.b;
                                                i2 = Build.VERSION.SDK_INT;
                                                if (i2 < 33) {
                                                }
                                                do6 do6Var10222222222222 = do6Var4;
                                                Integer num2222222222222 = num;
                                                while (i < arrayList.size()) {
                                                }
                                                stVar = MediaController.e2;
                                                if (stVar != null) {
                                                }
                                                st stVar2222222222222 = new st(i17, arrayList, arrayList2, num2222222222222, do6Var10222222222222, do6Var3, do6Var5);
                                                MediaController.e2 = stVar2222222222222;
                                                hl.d3(stVar2222222222222, 0L);
                                                return;
                                            }
                                        } else {
                                            i8 = columnIndex;
                                            i9 = columnIndex2;
                                            i10 = columnIndex5;
                                            arrayList2 = arrayList3;
                                            do6Var8 = do6Var3;
                                        }
                                        if (do6Var4 == null) {
                                            try {
                                                i11 = columnIndex18;
                                                i12 = columnIndex7;
                                                i13 = columnIndex6;
                                                do6Var9 = new do6(0, ob6.M0(2131754292, null), no6Var2);
                                                arrayList = arrayList6;
                                            } catch (Throwable th17) {
                                                th = th17;
                                                arrayList = arrayList6;
                                                do6Var = do6Var8;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                                do6Var2 = do6Var4;
                                                z = true;
                                                cc4.g(th, z);
                                                if (cursor != null) {
                                                }
                                                do6Var3 = do6Var;
                                                do6Var4 = do6Var2;
                                                Context context32222222 = a.b;
                                                i2 = Build.VERSION.SDK_INT;
                                                if (i2 < 33) {
                                                }
                                                do6 do6Var102222222222222 = do6Var4;
                                                Integer num22222222222222 = num;
                                                while (i < arrayList.size()) {
                                                }
                                                stVar = MediaController.e2;
                                                if (stVar != null) {
                                                }
                                                st stVar22222222222222 = new st(i17, arrayList, arrayList2, num22222222222222, do6Var102222222222222, do6Var3, do6Var5);
                                                MediaController.e2 = stVar22222222222222;
                                                hl.d3(stVar22222222222222, 0L);
                                                return;
                                            }
                                            try {
                                                arrayList.add(0, do6Var9);
                                            } catch (Throwable th18) {
                                                th = th18;
                                                do6Var = do6Var8;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                                do6Var2 = do6Var9;
                                                z = true;
                                                cc4.g(th, z);
                                                if (cursor != null) {
                                                }
                                                do6Var3 = do6Var;
                                                do6Var4 = do6Var2;
                                                Context context322222222 = a.b;
                                                i2 = Build.VERSION.SDK_INT;
                                                if (i2 < 33) {
                                                }
                                                do6 do6Var1022222222222222 = do6Var4;
                                                Integer num222222222222222 = num;
                                                while (i < arrayList.size()) {
                                                }
                                                stVar = MediaController.e2;
                                                if (stVar != null) {
                                                }
                                                st stVar222222222222222 = new st(i17, arrayList, arrayList2, num222222222222222, do6Var1022222222222222, do6Var3, do6Var5);
                                                MediaController.e2 = stVar222222222222222;
                                                hl.d3(stVar222222222222222, 0L);
                                                return;
                                            }
                                        } else {
                                            i11 = columnIndex18;
                                            i12 = columnIndex7;
                                            i13 = columnIndex6;
                                            arrayList = arrayList6;
                                            do6Var9 = do6Var4;
                                        }
                                        if (do6Var8.e.size() < 15) {
                                            no6Var2.d();
                                        }
                                        do6Var8.a(no6Var2);
                                        do6Var9.a(no6Var2);
                                        sparseArray2 = sparseArray3;
                                        try {
                                            do6 do6Var13 = (do6) sparseArray2.get(i24);
                                            if (do6Var13 == null) {
                                                do6Var13 = new do6(i24, string4, no6Var2);
                                                sparseArray2.put(i24, do6Var13);
                                                if (num != null || str == null || string3 == null) {
                                                    do6Var = do6Var8;
                                                    do6Var2 = do6Var9;
                                                    str9 = str;
                                                } else {
                                                    do6Var = do6Var8;
                                                    str9 = str;
                                                    try {
                                                        if (string3.startsWith(str9)) {
                                                            do6Var2 = do6Var9;
                                                            try {
                                                                arrayList.add(0, do6Var13);
                                                                num = Integer.valueOf(i24);
                                                            } catch (Throwable th19) {
                                                                th = th19;
                                                                z = true;
                                                                cc4.g(th, z);
                                                                if (cursor != null) {
                                                                }
                                                                do6Var3 = do6Var;
                                                                do6Var4 = do6Var2;
                                                                Context context3222222222 = a.b;
                                                                i2 = Build.VERSION.SDK_INT;
                                                                if (i2 < 33) {
                                                                }
                                                                do6 do6Var10222222222222222 = do6Var4;
                                                                Integer num2222222222222222 = num;
                                                                while (i < arrayList.size()) {
                                                                }
                                                                stVar = MediaController.e2;
                                                                if (stVar != null) {
                                                                }
                                                                st stVar2222222222222222 = new st(i17, arrayList, arrayList2, num2222222222222222, do6Var10222222222222222, do6Var3, do6Var5);
                                                                MediaController.e2 = stVar2222222222222222;
                                                                hl.d3(stVar2222222222222222, 0L);
                                                                return;
                                                            }
                                                        } else {
                                                            do6Var2 = do6Var9;
                                                        }
                                                    } catch (Throwable th20) {
                                                        th = th20;
                                                        do6Var2 = do6Var9;
                                                        z = true;
                                                        cc4.g(th, z);
                                                        if (cursor != null) {
                                                        }
                                                        do6Var3 = do6Var;
                                                        do6Var4 = do6Var2;
                                                        Context context32222222222 = a.b;
                                                        i2 = Build.VERSION.SDK_INT;
                                                        if (i2 < 33) {
                                                        }
                                                        do6 do6Var102222222222222222 = do6Var4;
                                                        Integer num22222222222222222 = num;
                                                        while (i < arrayList.size()) {
                                                        }
                                                        stVar = MediaController.e2;
                                                        if (stVar != null) {
                                                        }
                                                        st stVar22222222222222222 = new st(i17, arrayList, arrayList2, num22222222222222222, do6Var102222222222222222, do6Var3, do6Var5);
                                                        MediaController.e2 = stVar22222222222222222;
                                                        hl.d3(stVar22222222222222222, 0L);
                                                        return;
                                                    }
                                                }
                                                arrayList.add(do6Var13);
                                            } else {
                                                do6Var = do6Var8;
                                                do6Var2 = do6Var9;
                                                str9 = str;
                                            }
                                            do6Var13.a(no6Var2);
                                            SparseArray sparseArray5 = sparseArray;
                                            do6 do6Var14 = (do6) sparseArray5.get(i24);
                                            if (do6Var14 == null) {
                                                do6Var14 = new do6(i24, string4, no6Var2);
                                                sparseArray5.put(i24, do6Var14);
                                                if (num3 != null || str9 == null || string3 == null || !string3.startsWith(str9)) {
                                                    arrayList2.add(do6Var14);
                                                } else {
                                                    arrayList2.add(0, do6Var14);
                                                    num3 = Integer.valueOf(i24);
                                                }
                                            }
                                            do6Var14.a(no6Var2);
                                            str = str9;
                                            sparseArray = sparseArray5;
                                            do6Var3 = do6Var;
                                            do6Var4 = do6Var2;
                                            columnIndex17 = i25;
                                            columnIndex4 = i26;
                                            columnIndex3 = i27;
                                            query2 = cursor;
                                            columnIndex = i8;
                                            columnIndex5 = i10;
                                            columnIndex6 = i13;
                                            sparseArray3 = sparseArray2;
                                            arrayList6 = arrayList;
                                            columnIndex18 = i11;
                                            columnIndex7 = i12;
                                            arrayList3 = arrayList2;
                                            columnIndex2 = i9;
                                        } catch (Throwable th21) {
                                            th = th21;
                                            do6Var = do6Var8;
                                            do6Var2 = do6Var9;
                                            str9 = str;
                                        }
                                    }
                                } catch (Throwable th22) {
                                    th = th22;
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
                        } catch (Throwable th23) {
                            th = th23;
                            cursor = query2;
                            arrayList = arrayList6;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList2 = arrayList3;
                            z = true;
                            do6Var = null;
                            do6Var2 = null;
                            num = null;
                            cc4.g(th, z);
                            if (cursor != null) {
                            }
                            do6Var3 = do6Var;
                            do6Var4 = do6Var2;
                            Context context322222222222 = a.b;
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 < 33) {
                            }
                            do6 do6Var1022222222222222222 = do6Var4;
                            Integer num222222222222222222 = num;
                            while (i < arrayList.size()) {
                            }
                            stVar = MediaController.e2;
                            if (stVar != null) {
                            }
                            st stVar222222222222222222 = new st(i17, arrayList, arrayList2, num222222222222222222, do6Var1022222222222222222, do6Var3, do6Var5);
                            MediaController.e2 = stVar222222222222222222;
                            hl.d3(stVar222222222222222222, 0L);
                            return;
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
                    do6Var3 = null;
                    do6Var4 = null;
                    num = null;
                }
                if (cursor != null) {
                }
                Context context3222222222222 = a.b;
                i2 = Build.VERSION.SDK_INT;
                if (i2 < 33) {
                }
                do6 do6Var10222222222222222222 = do6Var4;
                Integer num2222222222222222222 = num;
                while (i < arrayList.size()) {
                }
                stVar = MediaController.e2;
                if (stVar != null) {
                }
                st stVar2222222222222222222 = new st(i17, arrayList, arrayList2, num2222222222222222222, do6Var10222222222222222222, do6Var3, do6Var5);
                MediaController.e2 = stVar2222222222222222222;
                hl.d3(stVar2222222222222222222, 0L);
                return;
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
                                    cc4.g(th, true);
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
                        cc4.g(th27, true);
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
                ip7.l0.c(new vo7(ip7.n(i29), b));
                return;
            case 9:
                OpusDred.lambda$prefetch$5(this.b);
                return;
            case 10:
                OpusDred.lambda$prefetch$6(this.b);
                return;
            case 11:
                OpusDred.download(this.b);
                return;
            case 12:
                OpusDred.lambda$prefetch$3(this.b);
                return;
            case 13:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                return;
            case 14:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                return;
            case 15:
                long j = this.b - 864000;
                try {
                    O0 = hl.O0();
                } catch (Throwable th28) {
                    cc4.g(th28, true);
                }
                if (O0 != null) {
                    Utilities.clearDir(O0.getAbsolutePath(), 0, j, false);
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putInt("lastLogsCheckTime", xea.H);
                    edit.apply();
                    return;
                }
                return;
            case 16:
                ls6.d0(this.b).D(5);
                return;
            case 17:
                String n = bp1.n(this.b, "/");
                k0d.y(n, k0d.b.keySet());
                k0d.y(n, k0d.c.keySet());
                k0d.y(n, k0d.d.keySet());
                return;
            default:
                int i31 = this.b;
                k0d.y(i31 + "/", k0d.b.keySet());
                for (h0d h0dVar : k0d.a.values()) {
                    if (h0dVar.b == i31 && h0dVar.x.isEmpty() && (q0dVar = h0dVar.v) != null) {
                        q0dVar.n();
                        q0dVar.f = null;
                        q0dVar.h = 0;
                        q0dVar.j = 0;
                        q0dVar.k = false;
                    }
                }
                return;
        }
    }
}
