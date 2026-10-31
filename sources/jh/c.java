package jh;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends ih.f {
    public final String b;
    public final Uri c;
    public final String d;
    public final long e;
    public final String f;
    public final Drawable h;
    public final StaticLayout n;

    public c(String str) {
        long j10;
        this.b = str;
        this.c = null;
        File file = new File(str);
        try {
            j10 = file.length();
        } catch (Throwable unused) {
            j10 = 0;
        }
        this.e = j10;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f = str2;
        int m12 = i0.m1(name, false);
        if (m12 != 0) {
            this.h = w0.b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (TextUtils.isEmpty(str2)) {
            this.n = null;
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(i0.L(13.0f));
        textPaint.setTypeface(i0.o());
        textPaint.setColor(t6.x0(null, t6.pj, false));
        this.n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, i0.L(34.0f), TextUtils.TruncateAt.END), textPaint, i0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, jj jjVar) {
        b bVar = new b();
        bVar.a.setColor(t6.x0(null, t6.G6, false));
        bVar.b.setColor(t6.x0(null, t6.y6, false));
        bVar.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.c = radialProgress2;
        radialProgress2.setCircleRadius(i0.L(21.0f));
        bVar.c.g(t6.We, t6.Xe, t6.id, t6.jd);
        if (jj.J3(document)) {
            if (jj.W2(document)) {
                TLRPC.PhotoSize w9 = b8.w(document.thumbs, i0.L(22.0f), true, null, false);
                bVar.c.j(b8.w(document.thumbs, i0.L(44.0f), true, w9, true), w9, document, jjVar);
            } else {
                String t02 = jj.t0(document, true);
                if (TextUtils.isEmpty(t02)) {
                    bVar.c.i(null, null, null);
                } else {
                    bVar.c.h(t02);
                }
            }
            bVar.c.setIcon(0, false, false);
        } else {
            bVar.c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.e = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f = str2;
        bVar.m = -1;
        bVar.g = null;
        bVar.h = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override // ih.f
    public final void c(Canvas canvas, int i10, int i11) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i10 - i0.L(34.0f)) / 2.0f, i0.L(15.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.b = null;
        this.c = uri;
        String A = MediaController.A(uri);
        A = A == null ? "?" : A;
        this.d = A;
        String[] split = A.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f = str;
        this.e = 0L;
        int m12 = i0.m1(A, false);
        if (m12 != 0) {
            this.h = w0.b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(i0.L(13.0f));
            textPaint.setTypeface(i0.o());
            textPaint.setColor(t6.x0(null, t6.pj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str, textPaint, i0.L(34.0f), TextUtils.TruncateAt.END), textPaint, i0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }
}
