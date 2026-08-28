package o0;

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
import f7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n2.p;
import n5.a0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c {
    public static final a0.j a = new a0.j(2);
    public static final j9.a b = new j9.a(4);

    public static h a(Context context, List list) {
        r8.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                d dVar = (d) list.get(i9);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new h();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new h(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        j9.a aVar = b;
        a0.j jVar = a;
        r8.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.a;
            String str2 = dVar.b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            b bVar = new b();
            bVar.a = str;
            bVar.b = str2;
            bVar.c = list;
            ProviderInfo providerInfo = (ProviderInfo) jVar.a(bVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i9 = 0; i9 < list.size(); i9++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i9));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    jVar.b(bVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, d dVar, String str) {
        r8.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a pVar = Build.VERSION.SDK_INT < 24 ? new p(context, build) : new a0(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                r8.a("ContentQueryWrapper.query");
                try {
                    cursor = pVar.s(build, strArr, new String[]{dVar.c});
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
                            int i9 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i9));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    pVar.close();
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                pVar.close();
                throw th;
            }
        } finally {
        }
    }
}
