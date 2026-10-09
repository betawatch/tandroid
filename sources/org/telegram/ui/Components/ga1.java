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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ga1 extends AsyncTask {
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final /* synthetic */ ha1 e;

    public ga1(ha1 ha1Var, String str) {
        this.e = ha1Var;
        this.a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x024d, code lost:
    
        r2 = r24.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0251, code lost:
    
        if (r2[r19] != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0253, code lost:
    
        if (r10 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0255, code lost:
    
        r2[r19] = r10;
        r2[r20] = "other";
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x025b, code lost:
    
        r2 = r2[r19];
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025d, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025f, code lost:
    
        if (r0 != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0265, code lost:
    
        if (r2.contains("/s/") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026b, code lost:
    
        if (r4 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x026d, code lost:
    
        r0 = r24.c[r19].indexOf("/s/");
        r2 = r24.c[r19].indexOf(47, r0 + 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0282, code lost:
    
        if (r0 == (-1)) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0284, code lost:
    
        if (r2 != (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0286, code lost:
    
        r2 = r24.c[r19].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x028e, code lost:
    
        r24.d = r24.c[r19].substring(r0, r2);
        r0 = org.telegram.ui.Components.ha1.u0.matcher(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a2, code lost:
    
        if (r0.find() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02a4, code lost:
    
        r0 = new org.json.JSONTokener(r0.group(r20)).nextValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02b5, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02b7, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02bb, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03d5, code lost:
    
        r9 = r20;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0268, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03da, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        int i10;
        int i11;
        Object obj;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        int i14;
        int i15;
        String str4;
        int i16;
        ?? r20;
        ha1 ha1Var = this.e;
        String str5 = "https://www.youtube.com/embed/" + this.a;
        ha1Var.getClass();
        HashMap hashMap = null;
        boolean z10 = true;
        String c10 = ha1.c(this, str5, null, true);
        if (!isCancelled()) {
            String t10 = a1.g.t(new StringBuilder("video_id="), this.a, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t10);
                sb2.append("&eurl=");
                sb2.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.a, "UTF-8"));
                t10 = sb2.toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            if (c10 != null) {
                Matcher matcher = ha1.t0.matcher(c10);
                if (matcher.find()) {
                    StringBuilder j3 = sc.v.j(t10, "&sts=");
                    j3.append(c10.substring(matcher.start() + 6, matcher.end()));
                    t10 = j3.toString();
                } else {
                    t10 = sc.v.v(t10, "&sts=");
                }
            }
            this.c[1] = "dash";
            String[] strArr = {"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            int i17 = 0;
            String str6 = null;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                int i20 = 2;
                if (i19 >= 5) {
                    i10 = z10 ? 1 : 0;
                    i11 = i17;
                    break;
                }
                ha1 ha1Var2 = this.e;
                String str7 = "https://www.youtube.com/get_video_info?" + t10 + strArr[i19];
                ha1Var2.getClass();
                String c11 = ha1.c(this, str7, hashMap, z10);
                if (isCancelled()) {
                    return hashMap;
                }
                if (c11 != null) {
                    String[] split = c11.split("&");
                    ?? r16 = hashMap;
                    int i21 = i17;
                    i14 = i21;
                    i15 = i14;
                    String str8 = str6;
                    int i22 = i18;
                    while (i21 < split.length) {
                        if (split[i21].startsWith("dashmpd")) {
                            String[] split2 = split[i21].split("=");
                            if (split2.length == i20) {
                                try {
                                    this.c[i17] = URLDecoder.decode(split2[z10 ? 1 : 0], "UTF-8");
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            i15 = z10 ? 1 : 0;
                            r20 = i15;
                            i16 = i17;
                        } else {
                            i16 = i17;
                            if (split[i21].startsWith("url_encoded_fmt_stream_map")) {
                                String[] split3 = split[i21].split("=");
                                if (split3.length == i20) {
                                    try {
                                        String[] split4 = URLDecoder.decode(split3[z10 ? 1 : 0], "UTF-8").split("[&,]");
                                        r20 = z10 ? 1 : 0;
                                        int i23 = i16;
                                        int i24 = i23;
                                        String str9 = null;
                                        while (true) {
                                            try {
                                                if (i23 < split4.length) {
                                                    String[] split5 = split4[i23].split("=");
                                                    String[] strArr2 = split4;
                                                    int i25 = i23;
                                                    if (split5[i16].startsWith(TeXSymbolParser.TYPE_ATTR)) {
                                                        if (URLDecoder.decode(split5[r20], "UTF-8").contains("video/mp4")) {
                                                            i24 = r20;
                                                        }
                                                    } else if (split5[i16].startsWith("url")) {
                                                        str9 = URLDecoder.decode(split5[r20], "UTF-8");
                                                    } else if (split5[i16].startsWith("itag")) {
                                                        i24 = i16;
                                                        str9 = null;
                                                    }
                                                    if (i24 != 0 && str9 != null) {
                                                        str8 = str9;
                                                        break;
                                                    }
                                                    i23 = i25 + 1;
                                                    split4 = strArr2;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                r20 = r20;
                                                FileLog.e(e);
                                                i21++;
                                                i17 = i16;
                                                z10 = r20;
                                                i20 = 2;
                                                r16 = r16;
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        r20 = z10 ? 1 : 0;
                                    }
                                } else {
                                    r20 = z10 ? 1 : 0;
                                }
                            } else {
                                r20 = z10 ? 1 : 0;
                                if (split[i21].startsWith("use_cipher_signature")) {
                                    String[] split6 = split[i21].split("=");
                                    if (split6.length == 2 && split6[r20].toLowerCase().equals("true")) {
                                        i22 = r20;
                                    }
                                } else if (split[i21].startsWith("hlsvp")) {
                                    String[] split7 = split[i21].split("=");
                                    if (split7.length == 2) {
                                        try {
                                            r16 = URLDecoder.decode(split7[r20], "UTF-8");
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                        }
                                    }
                                } else if (split[i21].startsWith("livestream")) {
                                    String[] split8 = split[i21].split("=");
                                    if (split8.length == 2 && split8[r20].toLowerCase().equals("1")) {
                                        i14 = r20;
                                    }
                                }
                            }
                        }
                        i21++;
                        i17 = i16;
                        z10 = r20;
                        i20 = 2;
                        r16 = r16;
                    }
                    i11 = i17;
                    i18 = i22;
                    str6 = str8;
                    str4 = r16;
                } else {
                    i11 = i17;
                    i14 = i11;
                    i15 = i14;
                    str4 = null;
                }
                i10 = z10;
                if (i14 != 0) {
                    if (str4 == null || i18 != 0 || str4.contains("/s/")) {
                        break;
                    }
                    String[] strArr3 = this.c;
                    strArr3[i11] = str4;
                    strArr3[i10] = "hls";
                }
                if (i15 != 0) {
                    break;
                }
                i19++;
                i17 = i11;
                z10 = i10;
                hashMap = null;
            }
        } else {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                AndroidUtilities.runOnUIThread(new ea1(0, this, str2 + str3 + "('" + this.d.substring(3) + "');"));
                this.b.await();
            } catch (Exception e14) {
                FileLog.e(e14);
                i12 = i13;
                if (!isCancelled() && i12 == 0) {
                    return this.c;
                }
                return obj;
            }
            if (!isCancelled()) {
                return this.c;
            }
            return obj;
        }
        i12 = i13;
        if (!isCancelled()) {
        }
        return obj;
        String str10 = null;
        if (str10 != null) {
            Matcher matcher2 = ha1.A0.matcher(str10);
            if (matcher2.find()) {
                str = matcher2.group(1) + matcher2.group(2);
            } else {
                str = null;
            }
            i12 = i11;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("youtubecode", i12);
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
                i13 = 1;
                String c12 = ha1.c(this, str10, null, true);
                if (!isCancelled()) {
                    if (c12 != null) {
                        Matcher matcher3 = ha1.v0.matcher(c12);
                        if (matcher3.find()) {
                            str3 = matcher3.group(1);
                        } else {
                            Matcher matcher4 = ha1.w0.matcher(c12);
                            if (matcher4.find()) {
                                str3 = matcher4.group(1);
                            }
                        }
                        if (str3 != null) {
                            try {
                                str2 = new oi.f(c12).i(str3);
                                if (!TextUtils.isEmpty(str2) && str != null) {
                                    sharedPreferences.edit().putString(str, str2).putString(str + "n", str3).commit();
                                }
                            } catch (Exception e15) {
                                FileLog.e(e15);
                            }
                        }
                    }
                }
                return obj;
            }
            obj = null;
            i13 = 1;
            if (!TextUtils.isEmpty(str2)) {
            }
        } else {
            obj = null;
            i13 = 1;
        }
        i12 = i13;
        if (!isCancelled()) {
        }
        return obj;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        ha1 ha1Var = this.e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            ha1Var.h();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("start play youtube video ");
            sb2.append(strArr[1]);
            sb2.append(" ");
            hg.c.t(strArr[0], sb2);
        }
        ha1Var.w = true;
        ha1Var.x = strArr[0];
        String str2 = strArr[1];
        ha1Var.y = str2;
        if (str2.equals("hls")) {
            ha1Var.H = true;
        }
        if (ha1Var.s) {
            ha1Var.i();
        }
        ha1Var.j(false, true);
        ha1Var.f0.d(true, true);
    }
}
