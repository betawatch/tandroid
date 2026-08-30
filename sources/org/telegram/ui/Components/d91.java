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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d91 extends AsyncTask {
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final /* synthetic */ e91 e;

    public d91(e91 e91Var, String str) {
        this.e = e91Var;
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
        r0 = org.telegram.ui.Components.e91.r0.matcher(r4);
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
        char c3;
        char c10;
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z4;
        boolean z10;
        e91 e91Var = this.e;
        String str5 = "https://www.youtube.com/embed/" + this.a;
        e91Var.getClass();
        HashMap hashMap = null;
        boolean z11 = true;
        String c11 = e91.c(this, str5, null, true);
        if (!isCancelled()) {
            String r10 = android.support.v4.media.a.r(new StringBuilder("video_id="), this.a, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(r10);
                sb.append("&eurl=");
                sb.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.a, "UTF-8"));
                r10 = sb.toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (c11 != null) {
                Matcher matcher = e91.q0.matcher(c11);
                if (matcher.find()) {
                    StringBuilder f10 = vh.v2.f(r10, "&sts=");
                    f10.append(c11.substring(matcher.start() + 6, matcher.end()));
                    r10 = f10.toString();
                } else {
                    r10 = vh.v2.k(r10, "&sts=");
                }
            }
            this.c[1] = "dash";
            String[] strArr = {"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            char c12 = 0;
            String str6 = null;
            boolean z12 = false;
            int i10 = 0;
            while (true) {
                int i11 = 2;
                if (i10 >= 5) {
                    c3 = 0;
                    c10 = 1;
                    break;
                }
                e91 e91Var2 = this.e;
                String str7 = "https://www.youtube.com/get_video_info?" + r10 + strArr[i10];
                e91Var2.getClass();
                String c13 = e91.c(this, str7, hashMap, z11);
                if (isCancelled()) {
                    return hashMap;
                }
                if (c13 != null) {
                    String[] split = c13.split("&");
                    ?? r16 = hashMap;
                    String str8 = str6;
                    int i12 = 0;
                    z4 = false;
                    z10 = false;
                    boolean z13 = z12;
                    ?? r52 = z11;
                    while (i12 < split.length) {
                        if (split[i12].startsWith("dashmpd")) {
                            String[] split2 = split[i12].split("=");
                            if (split2.length == i11) {
                                try {
                                    this.c[c12] = URLDecoder.decode(split2[r52], "UTF-8");
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                }
                            }
                            z10 = true;
                        } else {
                            if (split[i12].startsWith("url_encoded_fmt_stream_map")) {
                                String[] split3 = split[i12].split("=");
                                if (split3.length == i11) {
                                    try {
                                        String[] split4 = URLDecoder.decode(split3[r52], "UTF-8").split("[&,]");
                                        int i13 = 0;
                                        String str9 = null;
                                        boolean z14 = false;
                                        while (true) {
                                            try {
                                                if (i13 < split4.length) {
                                                    String[] split5 = split4[i13].split("=");
                                                    String[] strArr2 = split4;
                                                    int i14 = i13;
                                                    if (split5[0].startsWith(TeXSymbolParser.TYPE_ATTR)) {
                                                        if (URLDecoder.decode(split5[1], "UTF-8").contains("video/mp4")) {
                                                            z14 = true;
                                                        }
                                                    } else if (split5[0].startsWith("url")) {
                                                        str9 = URLDecoder.decode(split5[1], "UTF-8");
                                                    } else if (split5[0].startsWith("itag")) {
                                                        str9 = null;
                                                        z14 = false;
                                                    }
                                                    if (z14 && str9 != null) {
                                                        str8 = str9;
                                                        break;
                                                    }
                                                    i13 = i14 + 1;
                                                    split4 = strArr2;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                FileLog.e(e);
                                                i12++;
                                                r52 = 1;
                                                c12 = 0;
                                                i11 = 2;
                                                r16 = r16;
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                    }
                                }
                            } else if (split[i12].startsWith("use_cipher_signature")) {
                                String[] split6 = split[i12].split("=");
                                if (split6.length == 2 && split6[1].toLowerCase().equals("true")) {
                                    z13 = true;
                                }
                            } else if (split[i12].startsWith("hlsvp")) {
                                String[] split7 = split[i12].split("=");
                                if (split7.length == 2) {
                                    try {
                                        r16 = URLDecoder.decode(split7[1], "UTF-8");
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                }
                            } else if (split[i12].startsWith("livestream")) {
                                String[] split8 = split[i12].split("=");
                                if (split8.length == 2 && split8[1].toLowerCase().equals("1")) {
                                    z4 = true;
                                }
                            }
                            i12++;
                            r52 = 1;
                            c12 = 0;
                            i11 = 2;
                            r16 = r16;
                        }
                        i12++;
                        r52 = 1;
                        c12 = 0;
                        i11 = 2;
                        r16 = r16;
                    }
                    z12 = z13;
                    str6 = str8;
                    str4 = r16;
                } else {
                    str4 = null;
                    z4 = false;
                    z10 = false;
                }
                c3 = 0;
                c10 = 1;
                if (z4) {
                    if (str4 == null || z12 || str4.contains("/s/")) {
                        break;
                    }
                    String[] strArr3 = this.c;
                    strArr3[0] = str4;
                    strArr3[1] = "hls";
                }
                if (z10) {
                    break;
                }
                i10++;
                hashMap = null;
                z11 = true;
                c12 = 0;
            }
        } else {
            return null;
        }
        String str10 = null;
        if (str10 != null) {
            Matcher matcher2 = e91.x0.matcher(str10);
            if (matcher2.find()) {
                str = matcher2.group(1) + matcher2.group(2);
            } else {
                str = null;
            }
            boolean z15 = false;
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
                String c14 = e91.c(this, str10, null, true);
                if (!isCancelled()) {
                    if (c14 != null) {
                        Matcher matcher3 = e91.s0.matcher(c14);
                        if (matcher3.find()) {
                            str3 = matcher3.group(1);
                        } else {
                            Matcher matcher4 = e91.t0.matcher(c14);
                            if (matcher4.find()) {
                                str3 = matcher4.group(1);
                            }
                        }
                        if (str3 != null) {
                            try {
                                str2 = new com.google.firebase.messaging.r(c14).t(str3);
                                if (!TextUtils.isEmpty(str2) && str != null) {
                                    sharedPreferences.edit().putString(str, str2).putString(str + "n", str3).commit();
                                }
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                        }
                    }
                }
                return obj;
            }
            obj = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    AndroidUtilities.runOnUIThread(new k41(7, this, str2 + str3 + "('" + this.d.substring(3) + "');"));
                    this.b.await();
                } catch (Exception e14) {
                    FileLog.e(e14);
                    z15 = true;
                    if (!isCancelled() && !z15) {
                        return this.c;
                    }
                    return obj;
                }
                if (!isCancelled()) {
                    return this.c;
                }
                return obj;
            }
            z15 = true;
            if (!isCancelled()) {
            }
            return obj;
        }
        obj = null;
        z15 = true;
        if (!isCancelled()) {
        }
        return obj;
        if (!TextUtils.isEmpty(str2)) {
        }
        z15 = true;
        if (!isCancelled()) {
        }
        return obj;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        e91 e91Var = this.e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            e91Var.h();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("start play youtube video ");
            sb.append(strArr[1]);
            sb.append(" ");
            org.telegram.ui.yh.w(strArr[0], sb);
        }
        e91Var.w = true;
        e91Var.x = strArr[0];
        String str2 = strArr[1];
        e91Var.y = str2;
        if (str2.equals("hls")) {
            e91Var.E = true;
        }
        if (e91Var.s) {
            e91Var.i();
        }
        e91Var.j(false, true);
        e91Var.c0.d(true, true);
    }
}
