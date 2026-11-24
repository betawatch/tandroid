// default package

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class on4 {
    public static final fi6 a = new fi6(2);
    public static final x03 b = new x03((byte) 20);

    public static bo4 a(Context context, List list) {
        bo4 bo4Var;
        yxe.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    bo4Var = new bo4(arrayList);
                    break;
                }
                pn4 pn4Var = (pn4) list.get(i);
                ProviderInfo b2 = b(context.getPackageManager(), pn4Var, context.getResources());
                if (b2 == null) {
                    bo4Var = new bo4();
                    break;
                }
                arrayList.add(c(context, pn4Var, b2.authority));
                i++;
            }
            return bo4Var;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, pn4 pn4Var, Resources resources) {
        x03 x03Var = b;
        fi6 fi6Var = a;
        yxe.a("FontProvider.getProvider");
        try {
            List list = pn4Var.d;
            String str = pn4Var.a;
            String str2 = pn4Var.b;
            if (list == null) {
                list = ake.b(resources, 0);
            }
            nn4 nn4Var = new nn4();
            nn4Var.a = str;
            nn4Var.b = str2;
            nn4Var.c = list;
            ProviderInfo providerInfo = (ProviderInfo) fi6Var.a(nn4Var);
            if (providerInfo == null) {
                providerInfo = packageManager.resolveContentProvider(str, 0);
                if (providerInfo == null) {
                    throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
                }
                if (!providerInfo.packageName.equals(str2)) {
                    throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
                }
                Signature[] signatureArr = packageManager.getPackageInfo(providerInfo.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, x03Var);
                for (int i = 0; i < list.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, x03Var);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                break;
                            }
                        }
                        fi6Var.b(nn4Var, providerInfo);
                    }
                }
                Trace.endSection();
                return null;
            }
            return providerInfo;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static co4[] c(Context context, pn4 pn4Var, String str) {
        mn4 mn4Var;
        yxe.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                mn4Var = new ai4(context, build);
            } else {
                fk3 fk3Var = new fk3();
                fk3Var.a = context.getContentResolver().acquireUnstableContentProviderClient(build);
                mn4Var = fk3Var;
            }
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                yxe.a("ContentQueryWrapper.query");
                try {
                    cursor = mn4Var.M(build, strArr, new String[]{pn4Var.c});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new co4(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                            arrayList2 = arrayList3;
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    mn4Var.close();
                    return (co4[]) arrayList.toArray(new co4[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                mn4Var.close();
                throw th;
            }
        } finally {
        }
    }
}
