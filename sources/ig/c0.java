package ig;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jg.e2;
import jg.o2;
import jg.u2;
import jg.v2;
import jg.w2;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.f8;
import org.telegram.messenger.k6;
import org.telegram.messenger.mc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.er0;
import org.telegram.ui.qo0;
import v7.g8;
import vh.l5;
import w7.n6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements f0, fe.e, e2.o, f2.w, s1, u1, l5, OnSuccessListener, mc, a5.b, c0.j, m4.e0, m4.h1, e2.j, m4.f1, d9.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ig.s1
    public void B() {
        er0 er0Var = (er0) this.b;
        TextView textView = er0Var.h1;
        boolean a2 = er0Var.o0.a();
        ImageView imageView = er0Var.f1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // f2.w
    public void a(long j10, e2.x xVar) {
        switch (this.a) {
            case 6:
                c3.b.c(j10, xVar, ((j4.d0) this.b).c);
                break;
            default:
                c3.b.d(j10, xVar, ((j4.d0) this.b).c);
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.n1) obj).c((b2.z0) this.b);
    }

    @Override // d9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 25:
                n4.q qVar = (n4.q) this.b;
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                i9.a aVar = (i9.a) qVar.b;
                if (!aVar.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (aVar.a(height)) {
                    height--;
                }
                if (aVar.a(width)) {
                    width--;
                }
                return e0.f0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                c5.x xVar = (c5.x) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i10 = xVar.b;
                if (width2 > i10 || bitmap2.getHeight() > i10) {
                    float f7 = i10;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f7 / width3, f7 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return e0.f0.e(bitmap2);
        }
    }

    @Override // ig.f0
    public Typeface b() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // a5.b
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        b5.h hVar2;
        ji.k kVar = (ji.k) this.b;
        if (webView == kVar.o && z10 && uri != null && kVar.f.equals(uri.toString()) && kVar.j(webView)) {
            int i10 = aVar.b;
            if (i10 != 0) {
                if (i10 == 1) {
                    synchronized (kVar.a) {
                        if (!kVar.u && (hVar2 = kVar.p) != null && hVar2 == hVar) {
                            aVar.h(1);
                            byte[] bArr = (byte[]) aVar.d;
                            Objects.requireNonNull(bArr);
                            kVar.k.execute(new d1.e(29, kVar, bArr));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            aVar.h(0);
            String str = (String) aVar.c;
            if (kVar.q || str == null || !str.startsWith("tproxy-base64:")) {
                kVar.i(str, hVar);
                return;
            }
            synchronized (kVar.a) {
                if (!kVar.u && kVar.r && kVar.p == hVar) {
                    if (str.length() - 14 > 1398112) {
                        kVar.h();
                    } else {
                        kVar.k.execute(new d1.e(28, kVar, str));
                    }
                }
            }
        }
    }

    @Override // c0.j
    public Object d(c0.i iVar) {
        m4.f0 f0Var = (m4.f0) this.b;
        f0Var.o.post(new k2.u(18, f0Var, iVar));
        return "onPlayRequested";
    }

    @Override // m4.e0
    public void e(m4.v vVar, int i10) {
        vVar.c(i10, (b2.b1) this.b);
    }

    @Override // m4.h1
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 21:
                return f0Var.l(wVar, (e9.n0) obj);
            default:
                m4.f1 f1Var = (m4.f1) obj;
                j9.w wVar2 = j9.w.b;
                if (!f0Var.j()) {
                    f1Var.g(f0Var.t, wVar);
                    m4.j1.R0(f0Var, wVar, i10, new m4.t1(0));
                }
                return j9.w.b;
        }
    }

    @Override // m4.f1
    public void g(m4.n1 n1Var, m4.w wVar) {
        ((e2.j) this.b).accept(n1Var);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        switch (this.a) {
            case 10:
                ((qo0) this.b).run();
                break;
            case 11:
                ((jg.i0) this.b).a.O1.r();
                break;
            case 27:
                ((mg.p1) this.b).run();
                break;
            case 28:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    mg.y0.e1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            default:
                ((mg.n0) this.b).run();
                break;
        }
    }

    @Override // vh.l5
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((j2.b) obj).E((b2.y0) this.b);
                break;
            case 3:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 4:
                ((j2.b) obj).b((i2.d) this.b);
                break;
            default:
                ((j2.b) obj).j((u2.c0) this.b);
                break;
        }
    }

    public bi.d0 k(android.support.v4.media.session.a0 a0Var) {
        j5.b bVar = (j5.b) this.b;
        URL url = (URL) a0Var.b;
        String c10 = n6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) a0Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    a4.l lVar = bVar.a;
                    k5.i iVar = (k5.i) a0Var.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    la.d dVar = (la.d) lVar.b;
                    la.e eVar = new la.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(iVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = n6.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    n6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    n6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new bi.d0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new bi.d0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            bi.d0 d0Var = new bi.d0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return d0Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ja.b e) {
            e = e;
            n6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new bi.d0(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            n6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new bi.d0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            n6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new bi.d0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            n6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new bi.d0(400, null, 0L);
        }
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bi0 B;
        w2 w2Var = (w2) this.b;
        if (!z10 || z11 || (B = imageReceiver.B()) == null) {
            return;
        }
        w2Var.q(B);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 13:
                e2 e2Var = (e2) obj2;
                e2Var.C0 = true;
                e2Var.B0 = false;
                break;
            case 14:
                o2 o2Var = (o2) obj2;
                tb.b bVar = (tb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar.a.size(); i11++) {
                    tb.a aVar = (tb.a) bVar.a.get(i11);
                    u2 u2Var = new u2();
                    u2Var.a = aVar.a;
                    u2Var.b = aVar.d;
                    u2Var.c = aVar.e;
                    u2Var.d = aVar.b;
                    u2Var.e = aVar.c;
                    arrayList.add(u2Var);
                }
                o2Var.a(arrayList);
                break;
            default:
                v2 v2Var = (v2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    f8.b("objimg: no objects");
                    break;
                } else {
                    int i12 = ((qb.a) list.get(0)).c;
                    String str = null;
                    if (g8.a == null) {
                        g8.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i12 >= 0) {
                        String[] strArr = g8.a;
                        if (i12 < strArr.length) {
                            str = strArr[i12];
                        }
                    }
                    v2Var.c0 = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((qb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(v2Var.c0);
                    sb2.append(" ");
                    a1.g.z(((qb.a) list.get(0)).a, sb2);
                    k6.g(v2Var.c0);
                    break;
                }
        }
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ih.d.a((ih.d) this.b);
    }

    public /* synthetic */ c0(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 5;
        this.b = c0Var;
    }

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
    }
}
