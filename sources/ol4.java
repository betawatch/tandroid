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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ol4 {
    public static final fg6 a = new fg6(2);
    public static final mz2 b = new mz2(19);

    public static am4 a(Context context, List list) {
        am4 am4Var;
        wve.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    am4Var = new am4(arrayList);
                    break;
                }
                pl4 pl4Var = (pl4) list.get(i);
                ProviderInfo b2 = b(context.getPackageManager(), pl4Var, context.getResources());
                if (b2 == null) {
                    am4Var = new am4();
                    break;
                }
                arrayList.add(c(context, pl4Var, b2.authority));
                i++;
            }
            return am4Var;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, pl4 pl4Var, Resources resources) {
        mz2 mz2Var = b;
        fg6 fg6Var = a;
        wve.a("FontProvider.getProvider");
        try {
            List list = pl4Var.d;
            String str = pl4Var.a;
            String str2 = pl4Var.b;
            if (list == null) {
                list = zhe.b(resources, 0);
            }
            nl4 nl4Var = new nl4();
            nl4Var.a = str;
            nl4Var.b = str2;
            nl4Var.c = list;
            ProviderInfo providerInfo = (ProviderInfo) fg6Var.a(nl4Var);
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
                Collections.sort(arrayList, mz2Var);
                for (int i = 0; i < list.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, mz2Var);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                break;
                            }
                        }
                        fg6Var.b(nl4Var, providerInfo);
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
    public static bm4[] c(Context context, pl4 pl4Var, String str) {
        wve.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ml4 z24Var = Build.VERSION.SDK_INT < 24 ? new z24(context, build) : new s34(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                wve.a("ContentQueryWrapper.query");
                try {
                    cursor = z24Var.G(build, strArr, new String[]{pl4Var.c});
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
                            arrayList2.add(new bm4(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    z24Var.close();
                    return (bm4[]) arrayList.toArray(new bm4[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                z24Var.close();
                throw th;
            }
        } finally {
        }
    }
}
