package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h81 extends AsyncTask {
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final /* synthetic */ i81 e;

    public h81(i81 i81Var, String str) {
        this.e = i81Var;
        this.a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0241, code lost:
    
        r2 = r24.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0245, code lost:
    
        if (r2[r19] != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0247, code lost:
    
        if (r10 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0249, code lost:
    
        r2[r19] = r10;
        r2[r20] = "other";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024f, code lost:
    
        r2 = r2[r19];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0251, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0253, code lost:
    
        if (r0 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0259, code lost:
    
        if (r2.contains("/s/") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025f, code lost:
    
        if (r4 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0261, code lost:
    
        r0 = r24.c[r19].indexOf("/s/");
        r2 = r24.c[r19].indexOf(47, r0 + 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0276, code lost:
    
        if (r0 == (-1)) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0278, code lost:
    
        if (r2 != (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027a, code lost:
    
        r2 = r24.c[r19].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0282, code lost:
    
        r24.d = r24.c[r19].substring(r0, r2);
        r0 = org.telegram.ui.Components.i81.q0.matcher(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0296, code lost:
    
        if (r0.find() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0298, code lost:
    
        r0 = new org.json.JSONTokener(r0.group(1)).nextValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02a8, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02aa, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02ae, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x025c, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03c8, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        char c10;
        char c11;
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        boolean z11;
        i81 i81Var = this.e;
        String str5 = "https://www.youtube.com/embed/" + this.a;
        i81Var.getClass();
        HashMap hashMap = null;
        boolean z12 = true;
        String c12 = i81.c(this, str5, null, true);
        if (!isCancelled()) {
            String p6 = a9.p.p(new StringBuilder("video_id="), this.a, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(p6);
                sb2.append("&eurl=");
                sb2.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.a, "UTF-8"));
                p6 = sb2.toString();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            if (c12 != null) {
                Matcher matcher = i81.p0.matcher(c12);
                if (matcher.find()) {
                    StringBuilder f10 = s3.c.f(p6, "&sts=");
                    f10.append(c12.substring(matcher.start() + 6, matcher.end()));
                    p6 = f10.toString();
                } else {
                    p6 = s3.c.l(p6, "&sts=");
                }
            }
            this.c[1] = "dash";
            String[] strArr = {"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            char c13 = 0;
            String str6 = null;
            boolean z13 = false;
            int i10 = 0;
            while (true) {
                int i11 = 2;
                if (i10 >= 5) {
                    c10 = 0;
                    c11 = 1;
                    break;
                }
                i81 i81Var2 = this.e;
                String str7 = "https://www.youtube.com/get_video_info?" + p6 + strArr[i10];
                i81Var2.getClass();
                String c14 = i81.c(this, str7, hashMap, z12);
                if (isCancelled()) {
                    return hashMap;
                }
                if (c14 != null) {
                    String[] split = c14.split("&");
                    ?? r16 = hashMap;
                    String str8 = str6;
                    int i12 = 0;
                    z10 = false;
                    z11 = false;
                    boolean z14 = z13;
                    ?? r52 = z12;
                    while (i12 < split.length) {
                        if (split[i12].startsWith("dashmpd")) {
                            String[] split2 = split[i12].split("=");
                            if (split2.length == i11) {
                                try {
                                    this.c[c13] = URLDecoder.decode(split2[r52], "UTF-8");
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            z11 = true;
                        } else {
                            if (split[i12].startsWith("url_encoded_fmt_stream_map")) {
                                String[] split3 = split[i12].split("=");
                                if (split3.length == i11) {
                                    try {
                                        String[] split4 = URLDecoder.decode(split3[r52], "UTF-8").split("[&,]");
                                        int i13 = 0;
                                        String str9 = null;
                                        boolean z15 = false;
                                        while (true) {
                                            try {
                                                if (i13 < split4.length) {
                                                    String[] split5 = split4[i13].split("=");
                                                    String[] strArr2 = split4;
                                                    int i14 = i13;
                                                    if (split5[0].startsWith(TeXSymbolParser.TYPE_ATTR)) {
                                                        if (URLDecoder.decode(split5[1], "UTF-8").contains("video/mp4")) {
                                                            z15 = true;
                                                        }
                                                    } else if (split5[0].startsWith("url")) {
                                                        str9 = URLDecoder.decode(split5[1], "UTF-8");
                                                    } else if (split5[0].startsWith("itag")) {
                                                        str9 = null;
                                                        z15 = false;
                                                    }
                                                    if (z15 && str9 != null) {
                                                        str8 = str9;
                                                        break;
                                                    }
                                                    i13 = i14 + 1;
                                                    split4 = strArr2;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                FileLog.e(e);
                                                i12++;
                                                r52 = 1;
                                                c13 = 0;
                                                i11 = 2;
                                                r16 = r16;
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                    }
                                }
                            } else if (split[i12].startsWith("use_cipher_signature")) {
                                String[] split6 = split[i12].split("=");
                                if (split6.length == 2 && split6[1].toLowerCase().equals("true")) {
                                    z14 = true;
                                }
                            } else if (split[i12].startsWith("hlsvp")) {
                                String[] split7 = split[i12].split("=");
                                if (split7.length == 2) {
                                    try {
                                        r16 = URLDecoder.decode(split7[1], "UTF-8");
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                }
                            } else if (split[i12].startsWith("livestream")) {
                                String[] split8 = split[i12].split("=");
                                if (split8.length == 2 && split8[1].toLowerCase().equals("1")) {
                                    z10 = true;
                                }
                            }
                            i12++;
                            r52 = 1;
                            c13 = 0;
                            i11 = 2;
                            r16 = r16;
                        }
                        i12++;
                        r52 = 1;
                        c13 = 0;
                        i11 = 2;
                        r16 = r16;
                    }
                    z13 = z14;
                    str6 = str8;
                    str4 = r16;
                } else {
                    str4 = null;
                    z10 = false;
                    z11 = false;
                }
                c10 = 0;
                c11 = 1;
                if (z10) {
                    if (str4 == null || z13 || str4.contains("/s/")) {
                        break;
                    }
                    String[] strArr3 = this.c;
                    strArr3[0] = str4;
                    strArr3[1] = "hls";
                }
                if (z11) {
                    break;
                }
                i10++;
                hashMap = null;
                z12 = true;
                c13 = 0;
            }
        } else {
            return null;
        }
        String str10 = null;
        if (str10 != null) {
            Matcher matcher2 = i81.w0.matcher(str10);
            if (matcher2.find()) {
                str = matcher2.group(1) + matcher2.group(2);
            } else {
                str = null;
            }
            boolean z16 = false;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("youtubecode", 0);
            str2 = null;
            if (str != null) {
                String string = sharedPreferences.getString(str, null);
                str3 = sharedPreferences.getString(str.concat("n"), null);
                str2 = string;
            } else {
                str3 = null;
            }
            if (str2 == null) {
                if (str10.startsWith("//")) {
                    str10 = "https:".concat(str10);
                } else if (str10.startsWith("/")) {
                    str10 = "https://www.youtube.com".concat(str10);
                }
                this.e.getClass();
                obj = null;
                String c15 = i81.c(this, str10, null, true);
                if (!isCancelled()) {
                    if (c15 != null) {
                        Matcher matcher3 = i81.r0.matcher(c15);
                        if (matcher3.find()) {
                            str3 = matcher3.group(1);
                        } else {
                            Matcher matcher4 = i81.s0.matcher(c15);
                            if (matcher4.find()) {
                                str3 = matcher4.group(1);
                            }
                        }
                        if (str3 != null) {
                            try {
                                str2 = new com.google.firebase.messaging.t(c15).o(str3);
                                if (!TextUtils.isEmpty(str2) && str != null) {
                                    sharedPreferences.edit().putString(str, str2).putString(str + "n", str3).commit();
                                }
                            } catch (Exception e14) {
                                FileLog.e(e14);
                            }
                        }
                    }
                }
                return obj;
            }
            obj = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    AndroidUtilities.runOnUIThread(new r61(1, this, str2 + str3 + "('" + this.d.substring(3) + "');"));
                    this.b.await();
                } catch (Exception e15) {
                    FileLog.e(e15);
                    z16 = true;
                    if (!isCancelled() && !z16) {
                        return this.c;
                    }
                    return obj;
                }
                if (!isCancelled()) {
                    return this.c;
                }
                return obj;
            }
            z16 = true;
            if (!isCancelled()) {
            }
            return obj;
        }
        obj = null;
        z16 = true;
        if (!isCancelled()) {
        }
        return obj;
        if (!TextUtils.isEmpty(str2)) {
        }
        z16 = true;
        if (!isCancelled()) {
        }
        return obj;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        i81 i81Var = this.e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            i81Var.h();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("start play youtube video ");
            sb2.append(strArr[1]);
            sb2.append(" ");
            org.telegram.ui.Cells.pa.v(strArr[0], sb2);
        }
        i81Var.w = true;
        i81Var.x = strArr[0];
        String str2 = strArr[1];
        i81Var.y = str2;
        if (str2.equals("hls")) {
            i81Var.D = true;
        }
        if (i81Var.s) {
            i81Var.i();
        }
        i81Var.j(false, true);
        i81Var.b0.d(true, true);
    }
}
