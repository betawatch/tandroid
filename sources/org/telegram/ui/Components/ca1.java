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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ca1 extends AsyncTask {
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final /* synthetic */ da1 e;

    public ca1(da1 da1Var, String str) {
        this.e = da1Var;
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
        r0 = org.telegram.ui.Components.da1.u0.matcher(r4);
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
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03d6, code lost:
    
        r9 = r20;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0268, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03db, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e2 A[ADDED_TO_REGION] */
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
        da1 da1Var = this.e;
        String str5 = "https://www.youtube.com/embed/" + this.a;
        da1Var.getClass();
        HashMap hashMap = null;
        boolean z10 = true;
        String c10 = da1.c(this, str5, null, true);
        if (!isCancelled()) {
            String s10 = a1.g.s(new StringBuilder("video_id="), this.a, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s10);
                sb2.append("&eurl=");
                sb2.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.a, "UTF-8"));
                s10 = sb2.toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (c10 != null) {
                Matcher matcher = da1.t0.matcher(c10);
                if (matcher.find()) {
                    StringBuilder i17 = si.o0.i(s10, "&sts=");
                    i17.append(c10.substring(matcher.start() + 6, matcher.end()));
                    s10 = i17.toString();
                } else {
                    s10 = si.o0.u(s10, "&sts=");
                }
            }
            this.c[1] = "dash";
            String[] strArr = {"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            int i18 = 0;
            String str6 = null;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                int i21 = 2;
                if (i20 >= 5) {
                    i10 = z10 ? 1 : 0;
                    i11 = i18;
                    break;
                }
                da1 da1Var2 = this.e;
                String str7 = "https://www.youtube.com/get_video_info?" + s10 + strArr[i20];
                da1Var2.getClass();
                String c11 = da1.c(this, str7, hashMap, z10);
                if (isCancelled()) {
                    return hashMap;
                }
                if (c11 != null) {
                    String[] split = c11.split("&");
                    ?? r16 = hashMap;
                    int i22 = i18;
                    i14 = i22;
                    i15 = i14;
                    String str8 = str6;
                    int i23 = i19;
                    while (i22 < split.length) {
                        if (split[i22].startsWith("dashmpd")) {
                            String[] split2 = split[i22].split("=");
                            if (split2.length == i21) {
                                try {
                                    this.c[i18] = URLDecoder.decode(split2[z10 ? 1 : 0], "UTF-8");
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                            }
                            i15 = z10 ? 1 : 0;
                            r20 = i15;
                            i16 = i18;
                        } else {
                            i16 = i18;
                            if (split[i22].startsWith("url_encoded_fmt_stream_map")) {
                                String[] split3 = split[i22].split("=");
                                if (split3.length == i21) {
                                    try {
                                        String[] split4 = URLDecoder.decode(split3[z10 ? 1 : 0], "UTF-8").split("[&,]");
                                        r20 = z10 ? 1 : 0;
                                        int i24 = i16;
                                        int i25 = i24;
                                        String str9 = null;
                                        while (true) {
                                            try {
                                                if (i24 < split4.length) {
                                                    String[] split5 = split4[i24].split("=");
                                                    String[] strArr2 = split4;
                                                    int i26 = i24;
                                                    if (split5[i16].startsWith(TeXSymbolParser.TYPE_ATTR)) {
                                                        if (URLDecoder.decode(split5[r20], "UTF-8").contains("video/mp4")) {
                                                            i25 = r20;
                                                        }
                                                    } else if (split5[i16].startsWith("url")) {
                                                        str9 = URLDecoder.decode(split5[r20], "UTF-8");
                                                    } else if (split5[i16].startsWith("itag")) {
                                                        i25 = i16;
                                                        str9 = null;
                                                    }
                                                    if (i25 != 0 && str9 != null) {
                                                        str8 = str9;
                                                        break;
                                                    }
                                                    i24 = i26 + 1;
                                                    split4 = strArr2;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                r20 = r20;
                                                FileLog.e(e);
                                                i22++;
                                                i18 = i16;
                                                z10 = r20;
                                                i21 = 2;
                                                r16 = r16;
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        r20 = z10 ? 1 : 0;
                                    }
                                } else {
                                    r20 = z10 ? 1 : 0;
                                }
                            } else {
                                r20 = z10 ? 1 : 0;
                                if (split[i22].startsWith("use_cipher_signature")) {
                                    String[] split6 = split[i22].split("=");
                                    if (split6.length == 2 && split6[r20].toLowerCase().equals("true")) {
                                        i23 = r20;
                                    }
                                } else if (split[i22].startsWith("hlsvp")) {
                                    String[] split7 = split[i22].split("=");
                                    if (split7.length == 2) {
                                        try {
                                            r16 = URLDecoder.decode(split7[r20], "UTF-8");
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                        }
                                    }
                                } else if (split[i22].startsWith("livestream")) {
                                    String[] split8 = split[i22].split("=");
                                    if (split8.length == 2 && split8[r20].toLowerCase().equals("1")) {
                                        i14 = r20;
                                    }
                                }
                            }
                        }
                        i22++;
                        i18 = i16;
                        z10 = r20;
                        i21 = 2;
                        r16 = r16;
                    }
                    i11 = i18;
                    i19 = i23;
                    str6 = str8;
                    str4 = r16;
                } else {
                    i11 = i18;
                    i14 = i11;
                    i15 = i14;
                    str4 = null;
                }
                i10 = z10;
                if (i14 != 0) {
                    if (str4 == null || i19 != 0 || str4.contains("/s/")) {
                        break;
                    }
                    String[] strArr3 = this.c;
                    strArr3[i11] = str4;
                    strArr3[i10] = "hls";
                }
                if (i15 != 0) {
                    break;
                }
                i20++;
                i18 = i11;
                z10 = i10;
                hashMap = null;
            }
        } else {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                AndroidUtilities.runOnUIThread(new ko0(24, this, str2 + str3 + "('" + this.d.substring(3) + "');"));
                this.b.await();
            } catch (Exception e13) {
                FileLog.e(e13);
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
            Matcher matcher2 = da1.A0.matcher(str10);
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
                String c12 = da1.c(this, str10, null, true);
                if (!isCancelled()) {
                    if (c12 != null) {
                        Matcher matcher3 = da1.v0.matcher(c12);
                        if (matcher3.find()) {
                            str3 = matcher3.group(1);
                        } else {
                            Matcher matcher4 = da1.w0.matcher(c12);
                            if (matcher4.find()) {
                                str3 = matcher4.group(1);
                            }
                        }
                        if (str3 != null) {
                            try {
                                str2 = new qi.e(c12).j(str3);
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
        da1 da1Var = this.e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            da1Var.h();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("start play youtube video ");
            sb2.append(strArr[1]);
            sb2.append(" ");
            i2.o1.w(strArr[0], sb2);
        }
        da1Var.w = true;
        da1Var.x = strArr[0];
        String str2 = strArr[1];
        da1Var.y = str2;
        if (str2.equals("hls")) {
            da1Var.H = true;
        }
        if (da1Var.s) {
            da1Var.i();
        }
        da1Var.j(false, true);
        da1Var.f0.d(true, true);
    }
}
