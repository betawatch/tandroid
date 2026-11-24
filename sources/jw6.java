// default package

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jw6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jw6(sm7 sm7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 13;
        this.b = sm7Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.c = arrayList3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:0|1|2|3|(2:273|274)|5|7|8|9|(3:11|12|13)(1:269)|14|(1:266)(2:17|(38:19|(1:21)(1:263)|(1:262)(2:24|(34:26|(1:28)(1:258)|(1:257)(2:31|(30:33|(1:35)(1:254)|(1:253)(2:38|(25:40|41|(5:184|185|(2:187|(14:189|190|191|192|193|194|(1:240)(4:198|199|200|201)|202|(1:236)(5:206|207|208|209|210)|211|212|(5:216|217|218|219|220)|230|228))|247|228)(1:43)|44|45|46|(9:47|(7:49|50|(1:52)(1:61)|53|54|(2:56|57)(2:59|60)|58)(1:70)|62|63|64|65|66|67|68)|71|(1:182)(1:77)|78|(2:(2:107|(1:109))(1:82)|83)(2:(7:115|116|(1:118)(6:171|172|173|174|175|176)|119|(5:123|(2:125|(1:126))|130|(1:132)(1:169)|(3:134|135|(2:137|138)))|170|(0))(1:113)|114)|(1:85)|86|(1:88)|(1:90)|91|(1:93)|(1:95)|97|98|99|100|101|67|68))|(1:251)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(1:73)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68))|(1:256)|(0)(0)|(0)|253|(0)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(0)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68))|(1:260)(1:261)|(0)(0)|(0)|257|(0)|(0)(0)|(0)|253|(0)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(0)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68))|(1:265)|(0)(0)|(0)|262|(0)(0)|(0)(0)|(0)|257|(0)|(0)(0)|(0)|253|(0)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(0)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x059f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05a1, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0408 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[Catch: all -> 0x05ba, TryCatch #16 {all -> 0x05ba, blocks: (B:13:0x00a0, B:17:0x00b0, B:21:0x00c3, B:24:0x00cd, B:28:0x00e3, B:31:0x00f1, B:35:0x0104, B:38:0x010e, B:41:0x0120, B:185:0x0128, B:187:0x0136, B:191:0x0143, B:194:0x0152, B:196:0x015c, B:198:0x0167, B:201:0x0177, B:202:0x017e, B:204:0x0186, B:206:0x0192, B:209:0x01a4, B:212:0x01b5, B:214:0x01bd, B:216:0x01c9, B:219:0x01d8, B:227:0x0202, B:45:0x021a), top: B:12:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: all -> 0x05ba, TryCatch #16 {all -> 0x05ba, blocks: (B:13:0x00a0, B:17:0x00b0, B:21:0x00c3, B:24:0x00cd, B:28:0x00e3, B:31:0x00f1, B:35:0x0104, B:38:0x010e, B:41:0x0120, B:185:0x0128, B:187:0x0136, B:191:0x0143, B:194:0x0152, B:196:0x015c, B:198:0x0167, B:201:0x0177, B:202:0x017e, B:204:0x0186, B:206:0x0192, B:209:0x01a4, B:212:0x01b5, B:214:0x01bd, B:216:0x01c9, B:219:0x01d8, B:227:0x0202, B:45:0x021a), top: B:12:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104 A[Catch: all -> 0x05ba, TryCatch #16 {all -> 0x05ba, blocks: (B:13:0x00a0, B:17:0x00b0, B:21:0x00c3, B:24:0x00cd, B:28:0x00e3, B:31:0x00f1, B:35:0x0104, B:38:0x010e, B:41:0x0120, B:185:0x0128, B:187:0x0136, B:191:0x0143, B:194:0x0152, B:196:0x015c, B:198:0x0167, B:201:0x0177, B:202:0x017e, B:204:0x0186, B:206:0x0192, B:209:0x01a4, B:212:0x01b5, B:214:0x01bd, B:216:0x01c9, B:219:0x01d8, B:227:0x0202, B:45:0x021a), top: B:12:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029a A[EDGE_INSN: B:70:0x029a->B:71:0x029a BREAK  A[LOOP:0: B:47:0x0272->B:58:0x0290], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a3 A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0417 A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x044f A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046d A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0512 A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0535 A[Catch: all -> 0x05b7, TRY_LEAVE, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r7v18, types: [ye7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ?? r10;
        na7 na7Var;
        akb akbVar;
        String str;
        String str2;
        boolean z;
        String str3;
        String[] strArr;
        SparseIntArray R0;
        int i;
        Bitmap a;
        Canvas canvas;
        Paint paint;
        int G0;
        int G02;
        int G03;
        int G04;
        int G05;
        int G06;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String[] strArr2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String queryParameter;
        int i24;
        Drawable mutate;
        Drawable mutate2;
        Drawable mutate3;
        Drawable mutate4;
        int i25;
        m17[] m17VarArr;
        int i26;
        int i27;
        Bitmap bitmap;
        FileInputStream fileInputStream;
        File file;
        boolean z2;
        int i28;
        Bitmap decodeStream;
        int i29;
        ColorDrawable colorDrawable;
        mqc d;
        na7 na7Var2 = (na7) this.b;
        String str4 = (String) this.c;
        zjb zjbVar = (zjb) this.d;
        akb akbVar2 = (akb) this.e;
        int i30 = bkb.a;
        try {
            strArr = new String[1];
            R0 = bkb.R0(new File(str4), null, strArr);
            if (zjbVar != null) {
                try {
                    bkb.G(R0, zjbVar.b);
                } catch (Throwable th) {
                    th = th;
                    str3 = null;
                    z = true;
                    na7Var = na7Var2;
                    akbVar = akbVar2;
                }
            }
            i = bkb.jm.get(bkb.f5, -1);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            a = dc1.a(560, 678);
            canvas = new Canvas(a);
            paint = new Paint();
            G0 = bkb.G0(R0, bkb.r8);
            G02 = bkb.G0(R0, bkb.u8);
            try {
                G03 = bkb.G0(R0, bkb.Ie);
                G04 = bkb.G0(R0, bkb.Ne);
                G05 = bkb.G0(R0, bkb.qa);
                G06 = bkb.G0(R0, bkb.qb);
                R0.get(bkb.tb);
                int i31 = R0.get(bkb.De);
                i2 = R0.get(bkb.Ee);
                i3 = i31;
                i4 = R0.get(bkb.Fe);
                i5 = R0.get(bkb.Ge);
                if (zjbVar != null) {
                    na7Var = na7Var2;
                    i6 = 0;
                    try {
                        i7 = (int) zjbVar.j;
                    } catch (Throwable th2) {
                        th = th2;
                        akbVar = akbVar2;
                        r10 = 0;
                        z = true;
                        str3 = r10;
                        fa4.g(th, z);
                        str2 = str3;
                        str = str2;
                        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                    }
                } else {
                    na7Var = na7Var2;
                    i6 = 0;
                    i7 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                na7Var = na7Var2;
            }
        } catch (Throwable th4) {
            th = th4;
            r10 = 0;
            na7Var = na7Var2;
            akbVar = akbVar2;
        }
        if (i7 != 0 || zjbVar == null) {
            i8 = i7;
        } else {
            i8 = i7;
            if (zjbVar.j != 0) {
                i3 = i6;
                i9 = zjbVar == null ? (int) zjbVar.k : i6;
                if (i9 == 0 || zjbVar == null) {
                    i10 = i9;
                } else {
                    i10 = i9;
                    if (zjbVar.k != 0) {
                        i11 = i6;
                        if (zjbVar != null) {
                            i12 = i11;
                            i13 = (int) zjbVar.l;
                        } else {
                            i12 = i11;
                            i13 = i6;
                        }
                        if (i13 == 0 || zjbVar == null) {
                            i14 = i13;
                        } else {
                            i14 = i13;
                            if (zjbVar.l != 0) {
                                i4 = i6;
                                i15 = zjbVar == null ? (int) zjbVar.m : i6;
                                if (i15 == 0 || zjbVar == null) {
                                    i16 = i15;
                                } else {
                                    i16 = i15;
                                    if (zjbVar.m != 0) {
                                        i17 = i6;
                                        if (TextUtils.isEmpty(strArr[i6])) {
                                            i18 = i17;
                                            strArr2 = strArr;
                                            i19 = G03;
                                            i22 = i3;
                                            i23 = i4;
                                            i21 = i12;
                                        } else {
                                            try {
                                                queryParameter = Uri.parse(strArr[i6]).getQueryParameter("bg_color");
                                            } catch (Exception e) {
                                                e = e;
                                                i18 = i17;
                                                strArr2 = strArr;
                                            }
                                            if (zjbVar != null) {
                                                if (!TextUtils.isEmpty(queryParameter)) {
                                                    i18 = i17;
                                                    strArr2 = strArr;
                                                    try {
                                                        int parseInt = Integer.parseInt(queryParameter.substring(i6, 6), 16) | (-16777216);
                                                        try {
                                                            zjbVar.j = parseInt;
                                                            if (queryParameter.length() < 13 || !gl.Q1(queryParameter.charAt(6))) {
                                                                i24 = parseInt;
                                                                i20 = i12;
                                                            } else {
                                                                i20 = Integer.parseInt(queryParameter.substring(7, 13), 16) | (-16777216);
                                                                i24 = parseInt;
                                                                try {
                                                                    zjbVar.k = i20;
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    i19 = G03;
                                                                    i3 = i24;
                                                                    fa4.g(e, true);
                                                                    i21 = i20;
                                                                    i22 = i3;
                                                                    i23 = i4;
                                                                    int i32 = i18;
                                                                    mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                    bkb.A1(G02, mutate);
                                                                    mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    bkb.A1(G02, mutate2);
                                                                    mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    bkb.A1(G04, mutate3);
                                                                    int i33 = i19;
                                                                    mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    bkb.A1(G04, mutate4);
                                                                    i25 = 2;
                                                                    m17VarArr = new m17[2];
                                                                    akbVar = akbVar2;
                                                                    i26 = 0;
                                                                    while (true) {
                                                                        int i34 = i25;
                                                                        if (i26 >= i25) {
                                                                        }
                                                                        th = th;
                                                                        r10 = 0;
                                                                        z = true;
                                                                        str3 = r10;
                                                                        fa4.g(th, z);
                                                                        str2 = str3;
                                                                        str = str2;
                                                                        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                                        bkb.A1(r27 == 0 ? G05 : G06, r10);
                                                                        i26 = r27 + 1;
                                                                        i25 = i34;
                                                                        m17VarArr = r34;
                                                                    }
                                                                    m17[] m17VarArr2 = m17VarArr;
                                                                    RectF rectF = new RectF();
                                                                    if (zjbVar != null) {
                                                                    }
                                                                    if (i22 != 0) {
                                                                    }
                                                                    if (!z2) {
                                                                    }
                                                                    paint.setColor(G0);
                                                                    canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                    if (mutate != null) {
                                                                    }
                                                                    if (mutate2 != null) {
                                                                    }
                                                                    m17VarArr2[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                                                    m17VarArr2[1].o(0, 560, 522);
                                                                    m17VarArr2[1].draw(canvas);
                                                                    m17VarArr2[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                    m17VarArr2[1].o(430, 560, 522);
                                                                    m17VarArr2[1].draw(canvas);
                                                                    m17VarArr2[0].setBounds(20, kk7.t5, 399, 415);
                                                                    m17VarArr2[0].o(kk7.t5, 560, 522);
                                                                    m17VarArr2[0].draw(canvas);
                                                                    paint.setColor(i33);
                                                                    canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                    if (mutate3 != null) {
                                                                    }
                                                                    if (mutate4 != null) {
                                                                    }
                                                                    r10 = 0;
                                                                    r10 = 0;
                                                                    str2 = null;
                                                                    canvas.setBitmap(null);
                                                                    File file2 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2));
                                                                    gba.x();
                                                                    str = file2.getAbsolutePath();
                                                                    gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                                }
                                                            }
                                                            if (queryParameter.length() < 20 || !gl.Q1(queryParameter.charAt(13))) {
                                                                i19 = G03;
                                                                i12 = i20;
                                                            } else {
                                                                int parseInt2 = Integer.parseInt(queryParameter.substring(14, 20), 16) | (-16777216);
                                                                i19 = G03;
                                                                i12 = i20;
                                                                try {
                                                                    zjbVar.l = parseInt2;
                                                                    i4 = parseInt2;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    i4 = parseInt2;
                                                                    i20 = i12;
                                                                    i3 = i24;
                                                                    fa4.g(e, true);
                                                                    i21 = i20;
                                                                    i22 = i3;
                                                                    i23 = i4;
                                                                    int i322 = i18;
                                                                    mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                    bkb.A1(G02, mutate);
                                                                    mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    bkb.A1(G02, mutate2);
                                                                    mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    bkb.A1(G04, mutate3);
                                                                    int i332 = i19;
                                                                    mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    bkb.A1(G04, mutate4);
                                                                    i25 = 2;
                                                                    m17VarArr = new m17[2];
                                                                    akbVar = akbVar2;
                                                                    i26 = 0;
                                                                    while (true) {
                                                                        int i342 = i25;
                                                                        if (i26 >= i25) {
                                                                        }
                                                                        th = th;
                                                                        r10 = 0;
                                                                        z = true;
                                                                        str3 = r10;
                                                                        fa4.g(th, z);
                                                                        str2 = str3;
                                                                        str = str2;
                                                                        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                                        bkb.A1(r27 == 0 ? G05 : G06, r10);
                                                                        i26 = r27 + 1;
                                                                        i25 = i342;
                                                                        m17VarArr = r34;
                                                                    }
                                                                    m17[] m17VarArr22 = m17VarArr;
                                                                    RectF rectF2 = new RectF();
                                                                    if (zjbVar != null) {
                                                                    }
                                                                    if (i22 != 0) {
                                                                    }
                                                                    if (!z2) {
                                                                    }
                                                                    paint.setColor(G0);
                                                                    canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                    if (mutate != null) {
                                                                    }
                                                                    if (mutate2 != null) {
                                                                    }
                                                                    m17VarArr22[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                                                    m17VarArr22[1].o(0, 560, 522);
                                                                    m17VarArr22[1].draw(canvas);
                                                                    m17VarArr22[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                    m17VarArr22[1].o(430, 560, 522);
                                                                    m17VarArr22[1].draw(canvas);
                                                                    m17VarArr22[0].setBounds(20, kk7.t5, 399, 415);
                                                                    m17VarArr22[0].o(kk7.t5, 560, 522);
                                                                    m17VarArr22[0].draw(canvas);
                                                                    paint.setColor(i332);
                                                                    canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                    if (mutate3 != null) {
                                                                    }
                                                                    if (mutate4 != null) {
                                                                    }
                                                                    r10 = 0;
                                                                    r10 = 0;
                                                                    str2 = null;
                                                                    canvas.setBitmap(null);
                                                                    File file22 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22));
                                                                    gba.x();
                                                                    str = file22.getAbsolutePath();
                                                                    gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                                }
                                                            }
                                                            try {
                                                                if (queryParameter.length() == 27 && gl.Q1(queryParameter.charAt(20))) {
                                                                    int parseInt3 = Integer.parseInt(queryParameter.substring(21), 16) | (-16777216);
                                                                    try {
                                                                        zjbVar.m = parseInt3;
                                                                        i18 = parseInt3;
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        i18 = parseInt3;
                                                                        i20 = i12;
                                                                        i3 = i24;
                                                                        fa4.g(e, true);
                                                                        i21 = i20;
                                                                        i22 = i3;
                                                                        i23 = i4;
                                                                        int i3222 = i18;
                                                                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                        bkb.A1(G02, mutate);
                                                                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        bkb.A1(G02, mutate2);
                                                                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        bkb.A1(G04, mutate3);
                                                                        int i3322 = i19;
                                                                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        bkb.A1(G04, mutate4);
                                                                        i25 = 2;
                                                                        m17VarArr = new m17[2];
                                                                        akbVar = akbVar2;
                                                                        i26 = 0;
                                                                        while (true) {
                                                                            int i3422 = i25;
                                                                            if (i26 >= i25) {
                                                                            }
                                                                            th = th;
                                                                            r10 = 0;
                                                                            z = true;
                                                                            str3 = r10;
                                                                            fa4.g(th, z);
                                                                            str2 = str3;
                                                                            str = str2;
                                                                            gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                                            bkb.A1(r27 == 0 ? G05 : G06, r10);
                                                                            i26 = r27 + 1;
                                                                            i25 = i3422;
                                                                            m17VarArr = r34;
                                                                        }
                                                                        m17[] m17VarArr222 = m17VarArr;
                                                                        RectF rectF22 = new RectF();
                                                                        if (zjbVar != null) {
                                                                        }
                                                                        if (i22 != 0) {
                                                                        }
                                                                        if (!z2) {
                                                                        }
                                                                        paint.setColor(G0);
                                                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                        if (mutate != null) {
                                                                        }
                                                                        if (mutate2 != null) {
                                                                        }
                                                                        m17VarArr222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                                                        m17VarArr222[1].o(0, 560, 522);
                                                                        m17VarArr222[1].draw(canvas);
                                                                        m17VarArr222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                        m17VarArr222[1].o(430, 560, 522);
                                                                        m17VarArr222[1].draw(canvas);
                                                                        m17VarArr222[0].setBounds(20, kk7.t5, 399, 415);
                                                                        m17VarArr222[0].o(kk7.t5, 560, 522);
                                                                        m17VarArr222[0].draw(canvas);
                                                                        paint.setColor(i3322);
                                                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                        if (mutate3 != null) {
                                                                        }
                                                                        if (mutate4 != null) {
                                                                        }
                                                                        r10 = 0;
                                                                        r10 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222));
                                                                        gba.x();
                                                                        str = file222.getAbsolutePath();
                                                                        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                                    }
                                                                }
                                                                i20 = i12;
                                                                i3 = i24;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            i24 = parseInt;
                                                            i19 = G03;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        i19 = G03;
                                                        i20 = i12;
                                                        fa4.g(e, true);
                                                        i21 = i20;
                                                        i22 = i3;
                                                        i23 = i4;
                                                        int i32222 = i18;
                                                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                        bkb.A1(G02, mutate);
                                                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                        bkb.A1(G02, mutate2);
                                                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                        bkb.A1(G04, mutate3);
                                                        int i33222 = i19;
                                                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                        bkb.A1(G04, mutate4);
                                                        i25 = 2;
                                                        m17VarArr = new m17[2];
                                                        akbVar = akbVar2;
                                                        i26 = 0;
                                                        while (true) {
                                                            int i34222 = i25;
                                                            if (i26 >= i25) {
                                                            }
                                                            th = th;
                                                            r10 = 0;
                                                            z = true;
                                                            str3 = r10;
                                                            fa4.g(th, z);
                                                            str2 = str3;
                                                            str = str2;
                                                            gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                            bkb.A1(r27 == 0 ? G05 : G06, r10);
                                                            i26 = r27 + 1;
                                                            i25 = i34222;
                                                            m17VarArr = r34;
                                                        }
                                                        m17[] m17VarArr2222 = m17VarArr;
                                                        RectF rectF222 = new RectF();
                                                        if (zjbVar != null) {
                                                        }
                                                        if (i22 != 0) {
                                                        }
                                                        if (!z2) {
                                                        }
                                                        paint.setColor(G0);
                                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                        if (mutate != null) {
                                                        }
                                                        if (mutate2 != null) {
                                                        }
                                                        m17VarArr2222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                                        m17VarArr2222[1].o(0, 560, 522);
                                                        m17VarArr2222[1].draw(canvas);
                                                        m17VarArr2222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                                        m17VarArr2222[1].o(430, 560, 522);
                                                        m17VarArr2222[1].draw(canvas);
                                                        m17VarArr2222[0].setBounds(20, kk7.t5, 399, 415);
                                                        m17VarArr2222[0].o(kk7.t5, 560, 522);
                                                        m17VarArr2222[0].draw(canvas);
                                                        paint.setColor(i33222);
                                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                        if (mutate3 != null) {
                                                        }
                                                        if (mutate4 != null) {
                                                        }
                                                        r10 = 0;
                                                        r10 = 0;
                                                        str2 = null;
                                                        canvas.setBitmap(null);
                                                        File file2222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222));
                                                        gba.x();
                                                        str = file2222.getAbsolutePath();
                                                        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                    }
                                                    i21 = i20;
                                                    i22 = i3;
                                                    i23 = i4;
                                                }
                                            }
                                            i18 = i17;
                                            strArr2 = strArr;
                                            i19 = G03;
                                            i20 = i12;
                                            i21 = i20;
                                            i22 = i3;
                                            i23 = i4;
                                        }
                                        int i322222 = i18;
                                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                        bkb.A1(G02, mutate);
                                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                        bkb.A1(G02, mutate2);
                                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                        bkb.A1(G04, mutate3);
                                        int i332222 = i19;
                                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                        bkb.A1(G04, mutate4);
                                        i25 = 2;
                                        m17VarArr = new m17[2];
                                        akbVar = akbVar2;
                                        i26 = 0;
                                        while (true) {
                                            int i342222 = i25;
                                            if (i26 >= i25) {
                                                break;
                                            }
                                            try {
                                                m17[] m17VarArr3 = m17VarArr;
                                                int i35 = i26;
                                                njb njbVar = new njb(i26 == 1, R0, (byte) 0);
                                                m17VarArr3[i35] = njbVar;
                                                bkb.A1(i35 == 0 ? G05 : G06, njbVar);
                                                i26 = i35 + 1;
                                                i25 = i342222;
                                                m17VarArr = m17VarArr3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                            th = th5;
                                            r10 = 0;
                                            z = true;
                                            str3 = r10;
                                            fa4.g(th, z);
                                            str2 = str3;
                                            str = str2;
                                            gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                        }
                                        m17[] m17VarArr22222 = m17VarArr;
                                        RectF rectF2222 = new RectF();
                                        r10 = (zjbVar != null || TextUtils.isEmpty(zjbVar.o) || (d = zqc.d(zjbVar.o)) == null) ? 0 : d.a;
                                        if (i22 != 0) {
                                            if (i21 == 0 && r10 == 0) {
                                                colorDrawable = new ColorDrawable(i22);
                                            } else {
                                                R0.get(bkb.He, -1);
                                                ?? ye7Var = new ye7(i22, i21, i23, i322222, true, false);
                                                colorDrawable = ye7Var;
                                                if (r10 != 0) {
                                                    ye7Var.r((int) (zjbVar.p * 100.0f), r10);
                                                    ye7Var.s(ye7Var.f());
                                                    colorDrawable = ye7Var;
                                                }
                                            }
                                            colorDrawable.setBounds(0, 120, a.getWidth(), a.getHeight() - 120);
                                            colorDrawable.draw(canvas);
                                            i27 = 120;
                                            bitmap = a;
                                            z2 = true;
                                        } else {
                                            if (i >= 0 || !TextUtils.isEmpty(strArr2[0])) {
                                                try {
                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                    options.inJustDecodeBounds = true;
                                                    if (TextUtils.isEmpty(strArr2[0])) {
                                                        fileInputStream = new FileInputStream(str4);
                                                        try {
                                                            r10 = fileInputStream.getChannel();
                                                            i27 = 120;
                                                            bitmap = a;
                                                            try {
                                                                r10.position(i);
                                                                BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                file = null;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                z = true;
                                                                try {
                                                                    try {
                                                                        fa4.g(th, true);
                                                                        if (fileInputStream != null) {
                                                                            try {
                                                                                fileInputStream.close();
                                                                            } catch (Exception e8) {
                                                                                fa4.g(e8, true);
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                str3 = null;
                                                                            }
                                                                        }
                                                                        z2 = false;
                                                                        if (!z2) {
                                                                        }
                                                                        paint.setColor(G0);
                                                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                        if (mutate != null) {
                                                                        }
                                                                        if (mutate2 != null) {
                                                                        }
                                                                        m17VarArr22222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                                                        m17VarArr22222[1].o(0, 560, 522);
                                                                        m17VarArr22222[1].draw(canvas);
                                                                        m17VarArr22222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                        m17VarArr22222[1].o(430, 560, 522);
                                                                        m17VarArr22222[1].draw(canvas);
                                                                        m17VarArr22222[0].setBounds(20, kk7.t5, 399, 415);
                                                                        m17VarArr22222[0].o(kk7.t5, 560, 522);
                                                                        m17VarArr22222[0].draw(canvas);
                                                                        paint.setColor(i332222);
                                                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                        if (mutate3 != null) {
                                                                        }
                                                                        if (mutate4 != null) {
                                                                        }
                                                                        r10 = 0;
                                                                        r10 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file22222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222));
                                                                        gba.x();
                                                                        str = file22222.getAbsolutePath();
                                                                    } finally {
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                }
                                                                gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            i27 = 120;
                                                            bitmap = a;
                                                            z = true;
                                                            fa4.g(th, true);
                                                            if (fileInputStream != null) {
                                                            }
                                                            z2 = false;
                                                            if (!z2) {
                                                            }
                                                            paint.setColor(G0);
                                                            canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                            if (mutate != null) {
                                                            }
                                                            if (mutate2 != null) {
                                                            }
                                                            m17VarArr22222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                                            m17VarArr22222[1].o(0, 560, 522);
                                                            m17VarArr22222[1].draw(canvas);
                                                            m17VarArr22222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                                            m17VarArr22222[1].o(430, 560, 522);
                                                            m17VarArr22222[1].draw(canvas);
                                                            m17VarArr22222[0].setBounds(20, kk7.t5, 399, 415);
                                                            m17VarArr22222[0].o(kk7.t5, 560, 522);
                                                            m17VarArr22222[0].draw(canvas);
                                                            paint.setColor(i332222);
                                                            canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                            if (mutate3 != null) {
                                                            }
                                                            if (mutate4 != null) {
                                                            }
                                                            r10 = 0;
                                                            r10 = 0;
                                                            str2 = null;
                                                            canvas.setBitmap(null);
                                                            File file222222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                                            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222222));
                                                            gba.x();
                                                            str = file222222.getAbsolutePath();
                                                            gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                                        }
                                                    } else {
                                                        File d2 = sqc.d(strArr2[0]);
                                                        BitmapFactory.decodeFile(d2.getAbsolutePath(), options);
                                                        file = d2;
                                                        i27 = 120;
                                                        bitmap = a;
                                                        fileInputStream = null;
                                                    }
                                                    int i36 = options.outWidth;
                                                    if (i36 > 0 && (i28 = options.outHeight) > 0) {
                                                        float min = Math.min(i36 / 560.0f, i28 / 560.0f);
                                                        options.inSampleSize = 1;
                                                        if (min > 1.0f) {
                                                            do {
                                                                i29 = options.inSampleSize << 1;
                                                                options.inSampleSize = i29;
                                                            } while (i29 < min);
                                                        }
                                                        options.inJustDecodeBounds = false;
                                                        if (file != null) {
                                                            decodeStream = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                        } else {
                                                            fileInputStream.getChannel().position(i);
                                                            decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                                                        }
                                                        if (decodeStream != null) {
                                                            Paint paint2 = new Paint();
                                                            paint2.setFilterBitmap(true);
                                                            float min2 = Math.min(decodeStream.getWidth() / 560.0f, decodeStream.getHeight() / 560.0f);
                                                            rectF2222.set(0.0f, 0.0f, decodeStream.getWidth() / min2, decodeStream.getHeight() / min2);
                                                            rectF2222.offset((bitmap.getWidth() - rectF2222.width()) / 2.0f, (bitmap.getHeight() - rectF2222.height()) / 2.0f);
                                                            r10 = 0;
                                                            canvas.drawBitmap(decodeStream, (Rect) null, rectF2222, paint2);
                                                            z2 = true;
                                                            if (fileInputStream != null) {
                                                                try {
                                                                    fileInputStream.close();
                                                                } catch (Exception e9) {
                                                                    fa4.g(e9, true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (fileInputStream != null) {
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    i27 = 120;
                                                    bitmap = a;
                                                    fileInputStream = null;
                                                }
                                            } else {
                                                i27 = 120;
                                                bitmap = a;
                                            }
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            ye7 R = bkb.R(bitmap.getWidth(), bitmap.getHeight() - 120);
                                            R.setBounds(0, i27, bitmap.getWidth(), bitmap.getHeight() - 120);
                                            R.draw(canvas);
                                        }
                                        paint.setColor(G0);
                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                        if (mutate != null) {
                                            int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
                                            mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
                                            mutate.draw(canvas);
                                        }
                                        if (mutate2 != null) {
                                            int width = (bitmap.getWidth() - mutate2.getIntrinsicWidth()) - 10;
                                            int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
                                            mutate2.setBounds(width, intrinsicHeight2, mutate2.getIntrinsicWidth() + width, mutate2.getIntrinsicHeight() + intrinsicHeight2);
                                            mutate2.draw(canvas);
                                        }
                                        m17VarArr22222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                        m17VarArr22222[1].o(0, 560, 522);
                                        m17VarArr22222[1].draw(canvas);
                                        m17VarArr22222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                        m17VarArr22222[1].o(430, 560, 522);
                                        m17VarArr22222[1].draw(canvas);
                                        m17VarArr22222[0].setBounds(20, kk7.t5, 399, 415);
                                        m17VarArr22222[0].o(kk7.t5, 560, 522);
                                        m17VarArr22222[0].draw(canvas);
                                        paint.setColor(i332222);
                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                        if (mutate3 != null) {
                                            int height = (bitmap.getHeight() - 120) + ((120 - mutate3.getIntrinsicHeight()) / 2);
                                            mutate3.setBounds(22, height, mutate3.getIntrinsicWidth() + 22, mutate3.getIntrinsicHeight() + height);
                                            mutate3.draw(canvas);
                                        }
                                        if (mutate4 != null) {
                                            int width2 = (bitmap.getWidth() - mutate4.getIntrinsicWidth()) - 22;
                                            int height2 = (bitmap.getHeight() - 120) + ((120 - mutate4.getIntrinsicHeight()) / 2);
                                            mutate4.setBounds(width2, height2, mutate4.getIntrinsicWidth() + width2, mutate4.getIntrinsicHeight() + height2);
                                            mutate4.draw(canvas);
                                        }
                                        r10 = 0;
                                        r10 = 0;
                                        str2 = null;
                                        canvas.setBitmap(null);
                                        File file2222222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222222));
                                        gba.x();
                                        str = file2222222.getAbsolutePath();
                                        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                    }
                                }
                                if (i16 != 0) {
                                    i5 = i16;
                                }
                                i17 = i5;
                                if (TextUtils.isEmpty(strArr[i6])) {
                                }
                                int i3222222 = i18;
                                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                bkb.A1(G02, mutate);
                                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                bkb.A1(G02, mutate2);
                                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                bkb.A1(G04, mutate3);
                                int i3322222 = i19;
                                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                bkb.A1(G04, mutate4);
                                i25 = 2;
                                m17VarArr = new m17[2];
                                akbVar = akbVar2;
                                i26 = 0;
                                while (true) {
                                    int i3422222 = i25;
                                    if (i26 >= i25) {
                                    }
                                    th = th5;
                                    r10 = 0;
                                    z = true;
                                    str3 = r10;
                                    fa4.g(th, z);
                                    str2 = str3;
                                    str = str2;
                                    gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                                    bkb.A1(i35 == 0 ? G05 : G06, njbVar);
                                    i26 = i35 + 1;
                                    i25 = i3422222;
                                    m17VarArr = m17VarArr3;
                                }
                                m17[] m17VarArr222222 = m17VarArr;
                                RectF rectF22222 = new RectF();
                                if (zjbVar != null) {
                                }
                                if (i22 != 0) {
                                }
                                if (!z2) {
                                }
                                paint.setColor(G0);
                                canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                if (mutate != null) {
                                }
                                if (mutate2 != null) {
                                }
                                m17VarArr222222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                                m17VarArr222222[1].o(0, 560, 522);
                                m17VarArr222222[1].draw(canvas);
                                m17VarArr222222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                                m17VarArr222222[1].o(430, 560, 522);
                                m17VarArr222222[1].draw(canvas);
                                m17VarArr222222[0].setBounds(20, kk7.t5, 399, 415);
                                m17VarArr222222[0].o(kk7.t5, 560, 522);
                                m17VarArr222222[0].draw(canvas);
                                paint.setColor(i3322222);
                                canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                if (mutate3 != null) {
                                }
                                if (mutate4 != null) {
                                }
                                r10 = 0;
                                r10 = 0;
                                str2 = null;
                                canvas.setBitmap(null);
                                File file22222222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222222));
                                gba.x();
                                str = file22222222.getAbsolutePath();
                                gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                            }
                        }
                        if (i14 != 0) {
                            i4 = i14;
                        }
                        if (zjbVar == null) {
                        }
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        if (i16 != 0) {
                        }
                        i17 = i5;
                        if (TextUtils.isEmpty(strArr[i6])) {
                        }
                        int i32222222 = i18;
                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                        bkb.A1(G02, mutate);
                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                        bkb.A1(G02, mutate2);
                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                        bkb.A1(G04, mutate3);
                        int i33222222 = i19;
                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                        bkb.A1(G04, mutate4);
                        i25 = 2;
                        m17VarArr = new m17[2];
                        akbVar = akbVar2;
                        i26 = 0;
                        while (true) {
                            int i34222222 = i25;
                            if (i26 >= i25) {
                            }
                            th = th5;
                            r10 = 0;
                            z = true;
                            str3 = r10;
                            fa4.g(th, z);
                            str2 = str3;
                            str = str2;
                            gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                            bkb.A1(i35 == 0 ? G05 : G06, njbVar);
                            i26 = i35 + 1;
                            i25 = i34222222;
                            m17VarArr = m17VarArr3;
                        }
                        m17[] m17VarArr2222222 = m17VarArr;
                        RectF rectF222222 = new RectF();
                        if (zjbVar != null) {
                        }
                        if (i22 != 0) {
                        }
                        if (!z2) {
                        }
                        paint.setColor(G0);
                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                        if (mutate != null) {
                        }
                        if (mutate2 != null) {
                        }
                        m17VarArr2222222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                        m17VarArr2222222[1].o(0, 560, 522);
                        m17VarArr2222222[1].draw(canvas);
                        m17VarArr2222222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                        m17VarArr2222222[1].o(430, 560, 522);
                        m17VarArr2222222[1].draw(canvas);
                        m17VarArr2222222[0].setBounds(20, kk7.t5, 399, 415);
                        m17VarArr2222222[0].o(kk7.t5, 560, 522);
                        m17VarArr2222222[0].draw(canvas);
                        paint.setColor(i33222222);
                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                        if (mutate3 != null) {
                        }
                        if (mutate4 != null) {
                        }
                        r10 = 0;
                        r10 = 0;
                        str2 = null;
                        canvas.setBitmap(null);
                        File file222222222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222222222));
                        gba.x();
                        str = file222222222.getAbsolutePath();
                        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                    }
                }
                i11 = i10 == 0 ? i10 : i2;
                if (zjbVar != null) {
                }
                if (i13 == 0) {
                }
                i14 = i13;
                if (i14 != 0) {
                }
                if (zjbVar == null) {
                }
                if (i15 == 0) {
                }
                i16 = i15;
                if (i16 != 0) {
                }
                i17 = i5;
                if (TextUtils.isEmpty(strArr[i6])) {
                }
                int i322222222 = i18;
                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                bkb.A1(G02, mutate);
                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                bkb.A1(G02, mutate2);
                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                bkb.A1(G04, mutate3);
                int i332222222 = i19;
                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                bkb.A1(G04, mutate4);
                i25 = 2;
                m17VarArr = new m17[2];
                akbVar = akbVar2;
                i26 = 0;
                while (true) {
                    int i342222222 = i25;
                    if (i26 >= i25) {
                    }
                    th = th5;
                    r10 = 0;
                    z = true;
                    str3 = r10;
                    fa4.g(th, z);
                    str2 = str3;
                    str = str2;
                    gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
                    bkb.A1(i35 == 0 ? G05 : G06, njbVar);
                    i26 = i35 + 1;
                    i25 = i342222222;
                    m17VarArr = m17VarArr3;
                }
                m17[] m17VarArr22222222 = m17VarArr;
                RectF rectF2222222 = new RectF();
                if (zjbVar != null) {
                }
                if (i22 != 0) {
                }
                if (!z2) {
                }
                paint.setColor(G0);
                canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                if (mutate != null) {
                }
                if (mutate2 != null) {
                }
                m17VarArr22222222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
                m17VarArr22222222[1].o(0, 560, 522);
                m17VarArr22222222[1].draw(canvas);
                m17VarArr22222222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
                m17VarArr22222222[1].o(430, 560, 522);
                m17VarArr22222222[1].draw(canvas);
                m17VarArr22222222[0].setBounds(20, kk7.t5, 399, 415);
                m17VarArr22222222[0].o(kk7.t5, 560, 522);
                m17VarArr22222222[0].draw(canvas);
                paint.setColor(i332222222);
                canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                if (mutate3 != null) {
                }
                if (mutate4 != null) {
                }
                r10 = 0;
                r10 = 0;
                str2 = null;
                canvas.setBitmap(null);
                File file2222222222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222222222));
                gba.x();
                str = file2222222222.getAbsolutePath();
                gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
            }
        }
        if (i8 != 0) {
            i3 = i8;
        }
        if (zjbVar == null) {
        }
        if (i9 == 0) {
        }
        i10 = i9;
        if (i10 == 0) {
        }
        if (zjbVar != null) {
        }
        if (i13 == 0) {
        }
        i14 = i13;
        if (i14 != 0) {
        }
        if (zjbVar == null) {
        }
        if (i15 == 0) {
        }
        i16 = i15;
        if (i16 != 0) {
        }
        i17 = i5;
        if (TextUtils.isEmpty(strArr[i6])) {
        }
        int i3222222222 = i18;
        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        bkb.A1(G02, mutate);
        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        bkb.A1(G02, mutate2);
        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        bkb.A1(G04, mutate3);
        int i3322222222 = i19;
        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        bkb.A1(G04, mutate4);
        i25 = 2;
        m17VarArr = new m17[2];
        akbVar = akbVar2;
        i26 = 0;
        while (true) {
            int i3422222222 = i25;
            if (i26 >= i25) {
            }
            th = th5;
            r10 = 0;
            z = true;
            str3 = r10;
            fa4.g(th, z);
            str2 = str3;
            str = str2;
            gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
            bkb.A1(i35 == 0 ? G05 : G06, njbVar);
            i26 = i35 + 1;
            i25 = i3422222222;
            m17VarArr = m17VarArr3;
        }
        m17[] m17VarArr222222222 = m17VarArr;
        RectF rectF22222222 = new RectF();
        if (zjbVar != null) {
        }
        if (i22 != 0) {
        }
        if (!z2) {
        }
        paint.setColor(G0);
        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
        if (mutate != null) {
        }
        if (mutate2 != null) {
        }
        m17VarArr222222222[1].setBounds(kk7.q2, kk7.s3, bitmap.getWidth() - 20, kk7.e5);
        m17VarArr222222222[1].o(0, 560, 522);
        m17VarArr222222222[1].draw(canvas);
        m17VarArr222222222[1].setBounds(kk7.q2, 430, bitmap.getWidth() - 20, 522);
        m17VarArr222222222[1].o(430, 560, 522);
        m17VarArr222222222[1].draw(canvas);
        m17VarArr222222222[0].setBounds(20, kk7.t5, 399, 415);
        m17VarArr222222222[0].o(kk7.t5, 560, 522);
        m17VarArr222222222[0].draw(canvas);
        paint.setColor(i3322222222);
        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
        if (mutate3 != null) {
        }
        if (mutate4 != null) {
        }
        r10 = 0;
        r10 = 0;
        str2 = null;
        canvas.setBitmap(null);
        File file22222222222 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222222222));
        gba.x();
        str = file22222222222.getAbsolutePath();
        gl.d3(new vz4((Object) na7Var, str, (Serializable) str4, (Object) zjbVar, (Object) akbVar, (byte) 23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x001b, code lost:
    
        if (r6.length < 16) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        SQLitePreparedStatement sQLitePreparedStatement;
        int length;
        SQLitePreparedStatement executeFast;
        ad7 ad7Var = (ad7) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.e;
        boolean z = true;
        try {
            try {
                byte[] bArr = encryptedChat.key_hash;
                if (bArr != null) {
                    try {
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = null;
                        try {
                            ad7Var.n(e, z);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                }
                byte[] bArr2 = encryptedChat.auth_key;
                if (bArr2 != null) {
                    Typeface typeface = gl.a;
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                    encryptedChat.key_hash = bArr3;
                }
                SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    try {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                        byte[] bArr4 = encryptedChat.a_or_b;
                        if (bArr4 != null) {
                            try {
                                length = bArr4.length;
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast2;
                                ad7Var.n(e, z);
                                if (sQLitePreparedStatement != null) {
                                }
                            }
                        } else {
                            length = 1;
                        }
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length);
                        byte[] bArr5 = encryptedChat.auth_key;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(bArr5 != null ? bArr5.length : 1);
                        byte[] bArr6 = encryptedChat.future_auth_key;
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(bArr6 != null ? bArr6.length : 1);
                        byte[] bArr7 = encryptedChat.key_hash;
                        NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(bArr7 != null ? bArr7.length : 1);
                        encryptedChat.serializeToStream(nativeByteBuffer);
                        executeFast2.bindInteger(1, encryptedChat.id);
                        executeFast2.bindLong(2, user.id);
                        executeFast2.bindString(3, ad7.J(user));
                        executeFast2.bindByteBuffer(4, nativeByteBuffer);
                        byte[] bArr8 = encryptedChat.a_or_b;
                        if (bArr8 != null) {
                            nativeByteBuffer2.writeBytes(bArr8);
                        }
                        byte[] bArr9 = encryptedChat.auth_key;
                        if (bArr9 != null) {
                            nativeByteBuffer3.writeBytes(bArr9);
                        }
                        byte[] bArr10 = encryptedChat.future_auth_key;
                        if (bArr10 != null) {
                            nativeByteBuffer4.writeBytes(bArr10);
                        }
                        byte[] bArr11 = encryptedChat.key_hash;
                        if (bArr11 != null) {
                            nativeByteBuffer5.writeBytes(bArr11);
                        }
                        executeFast2.bindByteBuffer(5, nativeByteBuffer2);
                        executeFast2.bindByteBuffer(6, nativeByteBuffer3);
                        executeFast2.bindInteger(7, encryptedChat.ttl);
                        executeFast2.bindInteger(8, encryptedChat.layer);
                        executeFast2.bindInteger(9, encryptedChat.seq_in);
                        executeFast2.bindInteger(10, encryptedChat.seq_out);
                        executeFast2.bindInteger(11, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                        executeFast2.bindLong(12, encryptedChat.exchange_id);
                        executeFast2.bindInteger(13, encryptedChat.key_create_date);
                        executeFast2.bindLong(14, encryptedChat.future_key_fingerprint);
                        executeFast2.bindByteBuffer(15, nativeByteBuffer4);
                        executeFast2.bindByteBuffer(16, nativeByteBuffer5);
                        executeFast2.bindInteger(17, encryptedChat.in_seq_no);
                        executeFast2.bindLong(18, encryptedChat.admin_id);
                        executeFast2.bindInteger(19, encryptedChat.mtproto_seq);
                        executeFast2.step();
                        executeFast2.dispose();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        nativeByteBuffer3.reuse();
                        nativeByteBuffer4.reuse();
                        nativeByteBuffer5.reuse();
                        executeFast = ad7Var.b.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLitePreparedStatement = executeFast2;
                }
            } catch (Exception e4) {
                e = e4;
                z = true;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = null;
        }
        try {
            executeFast.bindLong(1, tL_dialog.id);
            executeFast.bindInteger(2, tL_dialog.last_message_date);
            executeFast.bindInteger(3, tL_dialog.unread_count);
            executeFast.bindInteger(4, tL_dialog.top_message);
            executeFast.bindInteger(5, tL_dialog.read_inbox_max_id);
            executeFast.bindInteger(6, tL_dialog.read_outbox_max_id);
            executeFast.bindInteger(7, 0);
            executeFast.bindInteger(8, tL_dialog.unread_mentions_count);
            executeFast.bindInteger(9, tL_dialog.pts);
            executeFast.bindInteger(10, 0);
            executeFast.bindInteger(11, tL_dialog.pinnedNum);
            executeFast.bindInteger(12, tL_dialog.flags);
            executeFast.bindInteger(13, tL_dialog.folder_id);
            executeFast.bindNull(14);
            executeFast.bindInteger(15, tL_dialog.unread_reactions_count);
            executeFast.bindInteger(16, 0);
            executeFast.bindInteger(17, tL_dialog.ttl_period);
            executeFast.bindInteger(18, tL_dialog.unread_poll_votes_count);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e5) {
            e = e5;
            sQLitePreparedStatement = executeFast;
            z = true;
            ad7Var.n(e, z);
            if (sQLitePreparedStatement != null) {
            }
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
            }
            throw th;
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jm6 jm6Var = (jm6) this.c;
        jm6 jm6Var2 = (jm6) this.d;
        String str = (String) this.e;
        Drawable[] drawableArr = PhotoViewer.f9;
        Bitmap decodeFile = BitmapFactory.decodeFile(jm6Var.I);
        if (decodeFile == null) {
            gl.d3(new l68(photoViewer, (byte) 5));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(jm6Var2.I, iArr, 0L);
        int max = Math.max(iArr[1], jm6Var2.F);
        int max2 = Math.max(iArr[2], jm6Var2.G);
        if ((iArr[8] / 90) % 2 == 1) {
            max2 = max;
            max = max2;
        }
        float f = max;
        float f2 = max2;
        float max3 = Math.max(decodeFile.getWidth() / f, decodeFile.getHeight() / f2);
        int i = (int) (f * max3);
        int i2 = (int) (f2 * max3);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
        canvas.scale(max4, max4);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap createBitmap2 = Bitmap.createBitmap(gl.L(26.0f), gl.L(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            gl.d3(new jw6(photoViewer, jm6Var2, str, createBitmap2, (byte) 20));
        } catch (Exception e) {
            fa4.g(e, true);
            gl.d3(new l68(photoViewer, (byte) 6));
        }
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jm6 jm6Var = (jm6) this.c;
        String str = (String) this.d;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.f9;
        if (jm6Var.g != null) {
            try {
                new File(jm6Var.g).delete();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        jm6Var.d = -1L;
        jm6Var.g = str;
        jm6Var.e = null;
        jm6Var.f = null;
        photoViewer.q5.b.setLoading(false);
        o98 o98Var = photoViewer.d;
        if (o98Var != null) {
            o98Var.X(photoViewer.P4);
        }
        w78 w78Var = photoViewer.h1;
        if (w78Var != null) {
            w78Var.setImage(bitmap);
        }
        photoViewer.n2(0);
        CheckBox checkBox = photoViewer.O0;
        if (checkBox.y) {
            return;
        }
        checkBox.callOnClick();
    }

    private final void e() {
        p78 p78Var = (p78) this.b;
        TLObject tLObject = (TLObject) this.c;
        y6c y6cVar = (y6c) this.d;
        TLRPC.Photo photo = (TLRPC.Photo) this.e;
        PhotoViewer photoViewer = p78Var.b;
        if (tLObject instanceof TLRPC.TL_photos_photo) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            int i = photoViewer.U;
            ArrayList arrayList = photoViewer.f7;
            na7.q1(i).a4(tL_photos_photo.users, false);
            TLRPC.User V1 = na7.q1(photoViewer.U).V1(Long.valueOf(y6cVar.n));
            if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                int indexOf = arrayList.indexOf(photo);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_photos_photo.photo);
                }
                if (V1 != null) {
                    V1.photo.photo_id = tL_photos_photo.photo.id;
                    y6cVar.v(V1);
                    y6cVar.u(true);
                }
            }
        }
    }

    private final void f() {
        ((uf8) this.b).b0((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.e);
    }

    private final void g() {
        zi8 zi8Var = (zi8) this.b;
        Bitmap[] bitmapArr = (Bitmap[]) this.c;
        f4b f4bVar = (f4b) this.d;
        boolean[] zArr = (boolean[]) this.e;
        sl0 sl0Var = zi8Var.H;
        Bitmap bitmap = zi8Var.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            zi8Var.a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        zi8Var.a = bitmap2;
        if (f4bVar != null && !f4bVar.c && f4bVar.K && bitmap2 != null) {
            f4bVar.k0 = bitmap2.getWidth();
            f4bVar.l0 = zi8Var.a.getHeight();
            f4bVar.z();
        }
        if (zArr[0] && f4bVar != null && sl0Var != null && zi8Var.a != null) {
            sl0Var.e();
            sl0Var.f(f4bVar.b(0.2f, zi8Var.a), false);
            d6b d6bVar = zi8Var.w;
            if (d6bVar != null) {
                d6bVar.run();
            }
        }
        zi8Var.r();
        zi8Var.invalidate();
    }

    private final void h() {
        ((PrivacyControlActivity) this.b).C0((TLRPC.TL_error) this.c, (TLObject) this.d, (boolean[]) this.e);
    }

    private final void i() {
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
        hd hdVar = (hd) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
        privacySettingsActivity.getClass();
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            privacySettingsActivity.R = true;
            privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
            privacySettingsActivity.a.f();
        }
    }

    private final void j() {
        Uri fromFile;
        hd hdVar = (hd) this.b;
        boolean[] zArr = (boolean[]) this.c;
        Activity activity = (Activity) this.d;
        File file = (File) this.e;
        RectF rectF = ProfileActivity.Z6;
        try {
            hdVar.dismiss();
        } catch (Exception unused) {
        }
        if (!zArr[0]) {
            if (activity != null) {
                Toast.makeText(activity, k96.M0(2131751093, null), 0).show();
                return;
            }
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            a.d();
            fromFile = FileProvider.c(activity, "org.telegram.messenger.beta.provider", file);
        } else {
            fromFile = Uri.fromFile(file);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (i >= 24) {
            intent.addFlags(1);
        }
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", "");
        intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + k96.D0().y0().format(System.currentTimeMillis()));
        intent.putExtra("android.intent.extra.STREAM", fromFile);
        if (activity != null) {
            try {
                activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    private final void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        int[] iArr = (int[]) this.e;
        RectF rectF = ProfileActivity.Z6;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            profileActivity.getClass();
            u21.b0(profileActivity).g0(tL_error, false);
        }
        if (profileActivity.r4 == iArr[0]) {
            profileActivity.r4 = 0;
        }
    }

    private final void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.A2(tL_error, tLObject, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        Bundle bundle;
        mm5 mm5Var;
        boolean z;
        boolean z2;
        jr6 jr6Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        byte b;
        CharSequence charSequence3;
        int i;
        na7 na7Var;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        vf6 vf6Var;
        vf6 vf6Var2;
        vf6 vf6Var3;
        ArrayList arrayList;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        boolean z4;
        TLRPC.Chat K0;
        String str;
        String M0;
        int i2;
        String str2;
        String a0;
        m21 I;
        tz7 tz7Var;
        tz7 tz7Var2;
        f4b f4bVar;
        File file;
        int i3;
        int i4;
        l8b l8bVar;
        byte b2 = 5;
        byte b3 = 6;
        long j = 0;
        byte b4 = 2;
        int i5 = 0;
        switch (this.a) {
            case 0:
                Bitmap bitmap2 = null;
                spc spcVar = (spc) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                if (atomicInteger.incrementAndGet() == arrayList2.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    int i6 = 0;
                    while (i6 < arrayList3.size()) {
                        t56 t56Var = (t56) arrayList3.get(i6);
                        if (t56Var != null) {
                            try {
                                bitmap = (Bitmap) jie.a(t56Var);
                            } catch (CancellationException | ExecutionException e) {
                                synchronized (lad.a) {
                                    Log.d("MediaSessionLegacyStub", lad.a("Failed to get bitmap", e));
                                }
                            }
                            br6 br6Var = (br6) arrayList2.get(i6);
                            int i7 = j06.a;
                            String str3 = !br6Var.a.equals("") ? bitmap2 : br6Var.a;
                            jr6 jr6Var2 = br6Var.d;
                            Bitmap bitmap3 = bitmap == null ? bitmap : bitmap2;
                            bundle = jr6Var2.K;
                            CharSequence charSequence4 = jr6Var2.a;
                            CharSequence charSequence5 = jr6Var2.g;
                            CharSequence charSequence6 = jr6Var2.f;
                            mm5Var = jr6Var2.L;
                            Integer num = jr6Var2.J;
                            Integer num2 = jr6Var2.q;
                            byte b5 = b4;
                            if (bundle != null) {
                                bundle = new Bundle(bundle);
                            }
                            z = num2 == null && num2.intValue() != -1;
                            z2 = num == null;
                            if (!z || z2) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                if (z) {
                                    jr6Var = jr6Var2;
                                } else {
                                    num2.getClass();
                                    jr6Var = jr6Var2;
                                    bundle.putLong("android.media.extra.BT_FOLDER_TYPE", j06.a(num2.intValue()));
                                }
                                if (z2) {
                                    num.getClass();
                                    bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                                }
                            } else {
                                jr6Var = jr6Var2;
                            }
                            if (!mm5Var.isEmpty()) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(mm5Var));
                            }
                            jr6 jr6Var3 = jr6Var;
                            charSequence = jr6Var3.e;
                            if (charSequence == null) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence4);
                                charSequence2 = charSequence6;
                            } else {
                                CharSequence[] charSequenceArr = new CharSequence[3];
                                int i8 = 0;
                                int i9 = 0;
                                for (int i10 = 3; i8 < i10; i10 = 3) {
                                    String[] strArr = kr6.d;
                                    if (i9 < strArr.length) {
                                        int i11 = i9 + 1;
                                        String str4 = strArr[i9];
                                        str4.getClass();
                                        switch (str4.hashCode()) {
                                            case -1853648227:
                                                if (str4.equals("android.media.metadata.ARTIST")) {
                                                    b = 0;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case -1850878751:
                                                if (str4.equals("android.media.metadata.AUTHOR")) {
                                                    b = 1;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case -1224124471:
                                                if (str4.equals("android.media.metadata.WRITER")) {
                                                    b = b5;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case 194702059:
                                                if (str4.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                    b = 3;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case 1058837545:
                                                if (str4.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                    b = 4;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case 1684534006:
                                                if (str4.equals("android.media.metadata.COMPOSER")) {
                                                    b = 5;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case 1879671865:
                                                if (str4.equals("android.media.metadata.ALBUM")) {
                                                    b = 6;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case 1897146402:
                                                if (str4.equals("android.media.metadata.TITLE")) {
                                                    b = 7;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            case 1965214221:
                                                if (str4.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                    b = 8;
                                                    break;
                                                }
                                                b = -1;
                                                break;
                                            default:
                                                b = -1;
                                                break;
                                        }
                                        switch (b) {
                                            case 0:
                                                charSequence3 = jr6Var3.b;
                                                break;
                                            case 1:
                                            default:
                                                charSequence3 = null;
                                                break;
                                            case 2:
                                                charSequence3 = jr6Var3.A;
                                                break;
                                            case 3:
                                                charSequence3 = charSequence6;
                                                break;
                                            case 4:
                                                charSequence3 = charSequence5;
                                                break;
                                            case 5:
                                                charSequence3 = jr6Var3.B;
                                                break;
                                            case 6:
                                                charSequence3 = jr6Var3.c;
                                                break;
                                            case 7:
                                                charSequence3 = charSequence4;
                                                break;
                                            case 8:
                                                charSequence3 = jr6Var3.d;
                                                break;
                                        }
                                        if (!TextUtils.isEmpty(charSequence3)) {
                                            charSequenceArr[i8] = charSequence3;
                                            i8++;
                                        }
                                        i9 = i11;
                                    } else {
                                        charSequence = charSequenceArr[0];
                                        CharSequence charSequence7 = charSequenceArr[1];
                                        charSequence5 = charSequenceArr[b5];
                                        charSequence2 = charSequence7;
                                    }
                                }
                                charSequence = charSequenceArr[0];
                                CharSequence charSequence72 = charSequenceArr[1];
                                charSequence5 = charSequenceArr[b5];
                                charSequence2 = charSequence72;
                            }
                            arrayList4.add(new jv6(new kq6(str3, charSequence, charSequence2, charSequence5, bitmap3, jr6Var3.n, bundle, br6Var.f.a), i6 != -1 ? -1L : i6));
                            i6++;
                            b4 = b5;
                            bitmap2 = null;
                        }
                        bitmap = bitmap2;
                        br6 br6Var2 = (br6) arrayList2.get(i6);
                        int i72 = j06.a;
                        if (!br6Var2.a.equals("")) {
                        }
                        jr6 jr6Var22 = br6Var2.d;
                        if (bitmap == null) {
                        }
                        bundle = jr6Var22.K;
                        CharSequence charSequence42 = jr6Var22.a;
                        CharSequence charSequence52 = jr6Var22.g;
                        CharSequence charSequence62 = jr6Var22.f;
                        mm5Var = jr6Var22.L;
                        Integer num3 = jr6Var22.J;
                        Integer num22 = jr6Var22.q;
                        byte b52 = b4;
                        if (bundle != null) {
                        }
                        if (num22 == null) {
                        }
                        if (num3 == null) {
                        }
                        if (z) {
                        }
                        if (bundle == null) {
                        }
                        if (z) {
                        }
                        if (z2) {
                        }
                        if (!mm5Var.isEmpty()) {
                        }
                        jr6 jr6Var32 = jr6Var;
                        charSequence = jr6Var32.e;
                        if (charSequence == null) {
                        }
                        arrayList4.add(new jv6(new kq6(str3, charSequence, charSequence2, charSequence52, bitmap3, jr6Var32.n, bundle, br6Var2.f.a), i6 != -1 ? -1L : i6));
                        i6++;
                        b4 = b52;
                        bitmap2 = null;
                    }
                    ((lw6) spcVar.e).p.M(arrayList4);
                    return;
                }
                return;
            case 1:
                tv6 tv6Var = (tv6) this.b;
                jx6 jx6Var = (jx6) this.c;
                su6 su6Var = (su6) this.d;
                List list = (List) this.e;
                if (tv6Var.i()) {
                    return;
                }
                tv6Var.t();
                jx6Var.b(tv6Var.t, su6Var, list);
                return;
            case 2:
                ox6 ox6Var = (ox6) this.b;
                tv6 tv6Var2 = (tv6) this.c;
                su6 su6Var2 = (su6) this.d;
                ei5 ei5Var = (ei5) this.e;
                if (tv6Var2.i()) {
                    ox6Var.c.remove(su6Var2);
                    wte.a(ei5Var);
                    return;
                }
                t56 l = tv6Var2.l(su6Var2);
                wtc wtcVar = new wtc();
                wtcVar.d = ox6Var;
                wtcVar.a = su6Var2;
                wtcVar.b = tv6Var2;
                wtcVar.c = ei5Var;
                l.b(new tq4((Object) l, (Object) wtcVar, (byte) 0), new ge2(ox6Var, b2));
                return;
            case 3:
                tv6 tv6Var3 = (tv6) this.b;
                p7a p7aVar = (p7a) this.c;
                us2 us2Var = (us2) this.d;
                t56 t56Var2 = (t56) this.e;
                if (tv6Var3.i()) {
                    p7aVar.l(null);
                    return;
                }
                try {
                    us2Var.accept(t56Var2);
                    p7aVar.l(null);
                    return;
                } catch (Throwable th) {
                    p7aVar.m(th);
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                u41 u41Var = (u41) this.c;
                i61 i61Var = (i61) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error != null) {
                    u21.Y().g0(tL_error, false);
                    return;
                }
                u41Var.setLoading(false);
                i61Var.dismiss();
                ir2.v(null, 2131746852, u21.Y(), R.raw.chats_infotip, 36);
                runnable.run();
                return;
            case 5:
                p47 p47Var = (p47) this.b;
                fk1 fk1Var = (fk1) this.c;
                String str5 = (String) this.d;
                txa txaVar = (txa) this.e;
                s47 s47Var = p47Var.w.d;
                if (fk1Var != null) {
                    s47Var.w.l(str5, fk1Var);
                    if (!txaVar.b && (i = txaVar.a) >= 0) {
                        View m = s47Var.h.m(i);
                        if (m instanceof dxa) {
                            p47Var.r.e = fk1Var;
                            dxa dxaVar = (dxa) m;
                            dxaVar.b.u0.d(false, false);
                            dxaVar.g(false);
                        }
                    }
                }
                p47Var.f();
                return;
            case 6:
                a();
                return;
            case 7:
                na7 na7Var2 = (na7) this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                vf6 vf6Var4 = (vf6) this.e;
                if (!arrayList5.isEmpty()) {
                    gl.d3(new lo6((Object) na7Var2, (Object) arrayList5, (Object) updates_difference, (byte) 20));
                }
                na7Var2.getMessagesStorage().g1(updates_difference.new_messages, true, false, false, na7Var2.getDownloadController().l(), false, 0, 0L);
                for (int i12 = 0; i12 < vf6Var4.m(); i12++) {
                    long j2 = vf6Var4.j(i12);
                    ArrayList arrayList6 = (ArrayList) vf6Var4.n(i12);
                    na7Var2.getMediaDataController().Y0(arrayList6, j2, 0, 0L, new m57(na7Var2, j2, arrayList6, (byte) 3), 0, null);
                }
                return;
            case 8:
                na7 na7Var3 = (na7) this.b;
                TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
                vf6 vf6Var5 = (vf6) this.d;
                vf6 vf6Var6 = (vf6) this.e;
                SparseBooleanArray sparseBooleanArray3 = na7Var3.V1;
                SparseBooleanArray sparseBooleanArray4 = na7Var3.U1;
                vf6 vf6Var7 = na7Var3.T;
                SparseArray sparseArray = na7Var3.V;
                vf6 vf6Var8 = na7Var3.S;
                vf6 vf6Var9 = na7Var3.R;
                ArrayList arrayList7 = na7Var3.y;
                na7Var3.e2 = false;
                na7Var3.n(messages_dialogs.dialogs);
                hq6 mediaDataController = na7Var3.getMediaDataController();
                mediaDataController.G(false);
                mediaDataController.L0();
                na7Var3.a4(messages_dialogs.users, false);
                na7Var3.U3(messages_dialogs.chats, false);
                int i13 = 0;
                while (i13 < arrayList7.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i13);
                    vf6 vf6Var10 = vf6Var7;
                    if (cf3.B(dialog.id)) {
                        vf6Var = vf6Var10;
                        vf6Var2 = vf6Var9;
                    } else {
                        vf6Var9.l(dialog.id);
                        ArrayList arrayList8 = (ArrayList) vf6Var8.f(dialog.id);
                        vf6Var2 = vf6Var9;
                        vf6Var8.l(dialog.id);
                        if (arrayList8 != null) {
                            int i14 = 0;
                            while (i14 < arrayList8.size()) {
                                k27 k27Var = (k27) arrayList8.get(i14);
                                if (k27Var != null) {
                                    arrayList = arrayList8;
                                    if (k27Var.k.peer_id.channel_id == 0) {
                                        sparseArray.remove(k27Var.e1());
                                    }
                                    long j3 = k27Var.k.random_id;
                                    if (j3 != 0) {
                                        vf6Var3 = vf6Var10;
                                        vf6Var3.l(j3);
                                    } else {
                                        vf6Var3 = vf6Var10;
                                    }
                                } else {
                                    vf6Var3 = vf6Var10;
                                    arrayList = arrayList8;
                                }
                                i14++;
                                vf6Var10 = vf6Var3;
                                arrayList8 = arrayList;
                            }
                        }
                        vf6Var = vf6Var10;
                    }
                    i13++;
                    vf6Var9 = vf6Var2;
                    vf6Var7 = vf6Var;
                }
                vf6 vf6Var11 = vf6Var7;
                vf6 vf6Var12 = vf6Var9;
                int i15 = 0;
                while (i15 < vf6Var5.m()) {
                    long j4 = vf6Var5.j(i15);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var5.n(i15);
                    hq6 hq6Var = mediaDataController;
                    vf6 vf6Var13 = vf6Var5;
                    int i16 = i15;
                    hq6Var.B1(dialog2.id, 0L, dialog2.draft);
                    TLRPC.DraftMessage draftMessage = dialog2.draft;
                    if (draftMessage instanceof TLRPC.TL_draftMessage) {
                        hq6Var.U1(dialog2.id, 0L, draftMessage, null, false);
                    }
                    vf6Var12.k(dialog2, j4);
                    ArrayList arrayList9 = (ArrayList) vf6Var6.f(dialog2.id);
                    vf6Var8.k(arrayList9, j4);
                    if (arrayList9 != null) {
                        int i17 = 0;
                        while (i17 < arrayList9.size()) {
                            k27 k27Var2 = (k27) arrayList9.get(i17);
                            if (k27Var2 != null) {
                                sparseBooleanArray = sparseBooleanArray3;
                                sparseBooleanArray2 = sparseBooleanArray4;
                                if (k27Var2.k.peer_id.channel_id == 0) {
                                    sparseArray.put(k27Var2.e1(), k27Var2);
                                    na7Var3.O = Math.min(na7Var3.O, k27Var2.k.date);
                                    long j5 = k27Var2.k.random_id;
                                    if (j5 != 0) {
                                        vf6Var11.k(k27Var2, j5);
                                    }
                                }
                            } else {
                                sparseBooleanArray = sparseBooleanArray3;
                                sparseBooleanArray2 = sparseBooleanArray4;
                            }
                            i17++;
                            sparseBooleanArray3 = sparseBooleanArray;
                            sparseBooleanArray4 = sparseBooleanArray2;
                        }
                    }
                    na7Var3.i4.c(j4);
                    i15 = i16 + 1;
                    vf6Var5 = vf6Var13;
                    mediaDataController = hq6Var;
                    sparseBooleanArray3 = sparseBooleanArray3;
                    sparseBooleanArray4 = sparseBooleanArray4;
                }
                SparseBooleanArray sparseBooleanArray5 = sparseBooleanArray3;
                SparseBooleanArray sparseBooleanArray6 = sparseBooleanArray4;
                arrayList7.clear();
                int m2 = vf6Var12.m();
                for (int i18 = 0; i18 < m2; i18++) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) vf6Var12.n(i18);
                    if (na7Var3.u0.h(dialog3.id) < 0) {
                        arrayList7.add(dialog3);
                    }
                }
                na7Var3.Y4(null);
                sparseBooleanArray6.put(0, true);
                sparseBooleanArray5.put(0, false);
                sparseBooleanArray6.put(1, true);
                sparseBooleanArray5.put(1, false);
                int m3 = na7Var3.getUserConfig().m(0);
                long[] g = na7Var3.getUserConfig().g(0);
                if (m3 < 400) {
                    long j6 = g[0];
                    if (j6 != -1 && j6 != 2147483647L) {
                        na7Var = na7Var3;
                        na7Var.W2(0, 0, 100, false, null);
                        na7Var.getNotificationCenter().k(3, new Object[0]);
                        return;
                    }
                }
                na7Var = na7Var3;
                na7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 9:
                ad7 ad7Var = (ad7) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                SparseIntArray sparseIntArray = (SparseIntArray) this.e;
                ad7Var.getClass();
                try {
                    if (!ad7.q0(longSparseIntArray)) {
                        SQLitePreparedStatement executeFast = ad7Var.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                        for (int i19 = 0; i19 < longSparseIntArray.size(); i19++) {
                            try {
                                long keyAt = longSparseIntArray.keyAt(i19);
                                int i20 = longSparseIntArray.get(keyAt);
                                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt + " AND mid > 0 AND mid <= " + i20 + " AND read_state IN(0,2) AND out = 0").stepThis().dispose();
                                executeFast.requery();
                                executeFast.bindLong(1, keyAt);
                                executeFast.bindInteger(2, i20);
                                executeFast.step();
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast;
                                z3 = true;
                                try {
                                    ad7Var.n(e, z3);
                                    if (sQLitePreparedStatement == null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = executeFast;
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast.dispose();
                    }
                    if (!ad7.q0(longSparseIntArray2)) {
                        for (int i21 = 0; i21 < longSparseIntArray2.size(); i21++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i21);
                            int i22 = longSparseIntArray2.get(keyAt2);
                            SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt2 + " AND mid > 0 AND mid <= " + i22 + " AND read_state IN(0,2) AND out = 1").stepThis().dispose();
                        }
                    }
                    if (sparseIntArray != null) {
                        if (sparseIntArray.size() == 0) {
                            return;
                        }
                        while (i5 < sparseIntArray.size()) {
                            long E = cf3.E(sparseIntArray.keyAt(i5));
                            int valueAt = sparseIntArray.valueAt(i5);
                            SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, E);
                                executeFast2.bindInteger(2, valueAt);
                                executeFast2.step();
                                executeFast2.dispose();
                                i5++;
                            } catch (Exception e3) {
                                e = e3;
                                sQLitePreparedStatement = executeFast2;
                                z3 = true;
                                ad7Var.n(e, z3);
                                if (sQLitePreparedStatement == null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = executeFast2;
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    e = e4;
                    z3 = true;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
            case 10:
                b();
                return;
            case 11:
                ad7 ad7Var2 = (ad7) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                String str6 = (String) this.d;
                String str7 = (String) this.e;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = ad7Var2.b;
                        try {
                            if (document != null) {
                                sQLitePreparedStatement2 = sQLiteDatabase3.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                                sQLitePreparedStatement2.requery();
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                                document.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement2.bindString(2, str6);
                                sQLitePreparedStatement2.step();
                                sQLitePreparedStatement2.dispose();
                                nativeByteBuffer.reuse();
                            } else {
                                sQLitePreparedStatement2 = sQLiteDatabase3.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindString(1, str7);
                                sQLitePreparedStatement2.bindString(2, str6);
                                sQLitePreparedStatement2.step();
                                sQLitePreparedStatement2.dispose();
                            }
                        } catch (Exception e5) {
                            e = e5;
                            z4 = true;
                            ad7Var2.n(e, z4);
                            if (sQLitePreparedStatement2 == null) {
                                return;
                            }
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    z4 = true;
                    sQLitePreparedStatement2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement2 = null;
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 12:
                ((NativeInstance) this.b).lambda$onAudioLevelsUpdated$1((int[]) this.c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 13:
                sm7 sm7Var = (sm7) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                ArrayList arrayList12 = (ArrayList) this.c;
                zr9 zr9Var = sm7Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = sm7Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    sm7Var.f = null;
                    sm7Var.d = arrayList10;
                    sm7Var.e = arrayList11;
                    zr9Var.f(arrayList12, null);
                    if (notificationsCustomSettingsActivity.f && !zr9Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    sm7Var.f();
                    return;
                }
                return;
            case 14:
                p pVar = (p) this.b;
                ui5 ui5Var = (ui5) this.c;
                Activity activity = (Activity) this.d;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str8 = "";
                pVar.b1 = true;
                pVar.g1 = 1;
                pVar.A0(ui5Var, activity);
                TLRPC.InputInvoice inputInvoice = pVar.c1;
                boolean z5 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z6 = z5 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z7 = z5 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z5 && (tz7Var2 = pVar.a1) != null) {
                    tz7Var2.c(pVar.g1);
                }
                pVar.h0();
                if (z5 && (tz7Var = pVar.a1) != null) {
                    tz7Var.c(pVar.g1);
                }
                long e0 = pVar.e0();
                if (e0 > 0) {
                    str8 = l7c.l(pVar.getMessagesController().V1(Long.valueOf(e0)));
                } else if (e0 < 0 && (K0 = pVar.getMessagesController().K0(Long.valueOf(-e0))) != null) {
                    str8 = K0.title;
                }
                long d0 = pVar.d0();
                int i23 = z5 ? (z6 || z7) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z5) {
                    if (z7) {
                        i2 = 2131744855;
                        str = null;
                    } else {
                        str = null;
                        if (z6) {
                            i2 = 2131744863;
                        } else {
                            M0 = k96.M0(2131744922, null);
                        }
                    }
                    M0 = k96.M0(i2, str);
                } else {
                    M0 = null;
                }
                if (z5) {
                    a0 = z7 ? k96.H(',', "StarsGiveawaySentPopupInfo", (int) d0) : k96.K(z6 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) d0, ',', str8);
                    str2 = null;
                } else {
                    str2 = null;
                    a0 = k96.a0(null, null, 2131747208, pVar.S0[0], pVar.r0);
                }
                SpannableStringBuilder T2 = gl.T2(a0);
                d S = LaunchActivity.S();
                if (S != null) {
                    u21 b0 = u21.b0(S);
                    if (e0 == 0 || M0 == null || z7) {
                        String str9 = M0;
                        I = str9 != null ? b0.I(i23, str9, T2) : b0.Q(i23, 36, T2);
                    } else {
                        I = b0.L(i23, M0, T2, k96.M0(2131743310, str2), new px6(b4, e0));
                    }
                    I.r = false;
                    I.j = 5000;
                    if (message != null) {
                        l63 l63Var = new l63(pVar, I, z6, message, (byte) 3);
                        q11 q11Var = I.e;
                        if (q11Var != null) {
                            q11Var.setOnClickListener(l63Var);
                        }
                    }
                    I.k(z7);
                    return;
                }
                return;
            case 15:
                ((p) this.b).k0((TLObject) this.c, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.e);
                return;
            case 16:
                s28 s28Var = (s28) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                p8c p8cVar = (p8c) this.e;
                y28 y28Var = s28Var.x;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    na7.q1(y28Var.s2).a4(tL_stories_stories.users, false);
                    na7.q1(y28Var.s2).U3(tL_stories_stories.chats, false);
                    while (i5 < tL_stories_stories.stories.size()) {
                        if (tL_stories_stories.stories.get(i5).id == storyItem.id) {
                            p8cVar.a(tL_stories_stories.stories.get(i5).media.document);
                            return;
                        }
                        i5++;
                    }
                }
                p8cVar.a(null);
                return;
            case 17:
                s28 s28Var2 = (s28) this.b;
                Activity activity2 = (Activity) this.c;
                m8b m8bVar = (m8b) this.d;
                w28 w28Var = (w28) this.e;
                t7b C = t7b.C(activity2, s28Var2.x.s2);
                c30 c30Var = s28Var2.x.C2;
                if (c30Var != null && (l8bVar = (l8b) c30Var.c) != null) {
                    j = l8bVar.currentPosition;
                }
                jq3 jq3Var = na7.q1(s28Var2.x.s2).M1().w;
                TL_stories.StoryItem storyItem2 = s28Var2.x.E1.a;
                long j7 = storyItem2.dialogId;
                ArrayList arrayList13 = jq3Var.b;
                int size = arrayList13.size();
                while (i5 < size) {
                    Object obj = arrayList13.get(i5);
                    int i24 = i5 + 1;
                    f4b f4bVar2 = (f4b) obj;
                    if (f4bVar2.g && storyItem2.id == f4bVar2.f) {
                        i4 = i24;
                        if (j7 == f4bVar2.e) {
                            TLRPC.MessageMedia messageMedia = storyItem2.media;
                            TLRPC.Document document2 = messageMedia.document;
                            if (document2 != null) {
                                i3 = size;
                                if (document2.id != f4bVar2.H) {
                                    continue;
                                }
                            } else {
                                i3 = size;
                            }
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo == null || photo.id == f4bVar2.I) {
                                f4bVar2.h = true;
                                f4bVar = f4bVar2;
                                if (f4bVar != null || f4bVar.u || (file = f4bVar.L) == null || !file.exists()) {
                                    f4bVar = f4b.n(s28Var2.x.E1.f(), s28Var2.x.E1.a);
                                    f4bVar.e = s28Var2.x.r1;
                                }
                                f4b g2 = f4bVar.g();
                                if (s28Var2.x.A0()) {
                                    y28 y28Var2 = s28Var2.x;
                                    g2.J0 = y28Var2.r1;
                                    g2.L0 = na7.e5(y28Var2.E1.a.media);
                                    y1b y1bVar = m8bVar.O0;
                                    if (y1bVar instanceof s1b) {
                                        g2.K0 = ((s1b) y1bVar).E;
                                    }
                                }
                                C.R(o7b.d(m8bVar), g2, j);
                                C.R = new m28(s28Var2, (byte) 3);
                                C.S = new o28(s28Var2, w28Var, (byte) 1);
                                return;
                            }
                        } else {
                            i3 = size;
                        }
                    } else {
                        i3 = size;
                        i4 = i24;
                    }
                    i5 = i4;
                    size = i3;
                }
                f4bVar = null;
                if (f4bVar != null) {
                }
                f4bVar = f4b.n(s28Var2.x.E1.f(), s28Var2.x.E1.a);
                f4bVar.e = s28Var2.x.r1;
                f4b g22 = f4bVar.g();
                if (s28Var2.x.A0()) {
                }
                C.R(o7b.d(m8bVar), g22, j);
                C.R = new m28(s28Var2, (byte) 3);
                C.S = new o28(s28Var2, w28Var, (byte) 1);
                return;
            case 18:
                c();
                return;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                boolean[] zArr = (boolean[]) this.d;
                h68 h68Var = (h68) this.e;
                Drawable[] drawableArr = PhotoViewer.f9;
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap4);
                    photoViewer.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    h68Var.run();
                    return;
                }
                return;
            case 20:
                d();
                return;
            case 21:
                e();
                return;
            case 22:
                f();
                return;
            case 23:
                g();
                return;
            case 24:
                h();
                return;
            case 25:
                i();
                return;
            case 26:
                j();
                return;
            case 27:
                k();
                return;
            case 28:
                l();
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String[] strArr2 = (String[]) this.c;
                String str10 = (String) this.d;
                String str11 = (String) this.e;
                RectF rectF = ProfileActivity.Z6;
                if (gl.C1(profileActivity.getParentActivity())) {
                    rzb.Q0(profileActivity.getParentActivity(), profileActivity, strArr2[0], str10, str11, new z02(profileActivity, b3), null);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jw6(na7 na7Var, ArrayList arrayList, TLRPC.updates_Difference updates_difference, vf6 vf6Var) {
        this.a = (byte) 7;
        this.b = na7Var;
        this.d = arrayList;
        this.c = updates_difference;
        this.e = vf6Var;
    }

    public /* synthetic */ jw6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
