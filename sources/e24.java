// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e24 extends q59 {
    public boolean E;
    public boolean F;
    public final /* synthetic */ e34 G;
    public final z14 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public d24 y;

    public e24(e34 e34Var, Context context) {
        this.G = e34Var;
        z14 z14Var = new z14(context, e34Var.d1, new h92(this, (byte) 25), new yu3(this, (byte) 4), e34Var.a2);
        this.c = z14Var;
        z14Var.setPadding(gm.L(10.0f), 0, gm.L(10.0f), gm.L(5.0f));
        z14Var.setClipToPadding(false);
        z14Var.g3.r = false;
        z14Var.setNestedScrollingEnabled(false);
        z14Var.setDrawSelection(false);
        z14Var.setOnTouchListener(new a24(this, (byte) 0));
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 0 || i == 4;
    }

    public final void E(String str, boolean z) {
        e34 e34Var = this.G;
        r14 r14Var = e34Var.Q;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            y59 adapter = r14Var.getAdapter();
            o14 o14Var = e34Var.S;
            if (adapter != o14Var) {
                r14Var.setAdapter(o14Var);
                this.E = false;
            }
            this.d = 0L;
            e34Var.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        d24 d24Var = this.y;
        if (d24Var != null) {
            gm.r(d24Var);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.F = false;
        e34Var.W.d(true);
        d24 d24Var2 = new d24(this);
        this.y = d24Var2;
        gm.d3(d24Var2, z ? 300L : 0L);
    }

    public final void F(Runnable runnable, ArrayList arrayList, boolean z) {
        e34 e34Var = this.G;
        String[] strArr = e34Var.X0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = this.w;
        if (str2 == null) {
            return;
        }
        hs6.d0(e34Var.d1).b2(true, str, str2, new jv0((Object) this, str2, (Object) arrayList, (Object) runnable, (byte) 8), z);
    }

    @Override // y59
    public final int b() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.E) {
            return this.G.getRecentEmoji().size() + 1;
        }
        int i = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i = 3;
        } else if (arrayList.isEmpty()) {
            i = 1;
        }
        int size = arrayList.size() + i;
        if (arrayList3.isEmpty()) {
            return size;
        }
        return arrayList3.size() + size + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r7 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004f, code lost:
    
        if (r7 == 1) goto L44;
     */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i) {
        int i2 = 2;
        if (this.d != 0) {
            if (i != 0) {
                if (i == 1) {
                    return 4;
                }
                if (i != 2) {
                    return i == b() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i == 1 && this.E && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList2.isEmpty()) {
                    return 0;
                }
                if (!arrayList.isEmpty()) {
                    i2 = 3;
                } else if (arrayList3.isEmpty()) {
                    i2 = 1;
                }
                if (i != arrayList3.size() + i2) {
                    return 0;
                }
            } else if (i == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // y59
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l;
        int i2 = u69Var.f;
        View view = u69Var.a;
        ArrayList arrayList = this.s;
        boolean z = true;
        int i3 = 1;
        ArrayList arrayList2 = this.h;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            w1b w1bVar = (w1b) view;
            if (this.d != 0) {
                w1bVar.a(0, jb6.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i3 = 3;
            } else if (!arrayList2.isEmpty()) {
                i3 = 2;
            }
            if (i == arrayList2.size() + i3) {
                w1bVar.a(0, jb6.M0(2131744564, null));
                return;
            } else {
                w1bVar.a(0, jb6.M0(2131744563, null));
                return;
            }
        }
        n24 n24Var = (n24) view;
        n24Var.a = i;
        n24Var.e = null;
        int i4 = i - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i4 = i - 3;
        } else if (!arrayList2.isEmpty()) {
            i4 = i - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i4);
            z = false;
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.E) {
                str = this.G.getRecentEmoji().get(i4);
                str2 = str;
            } else {
                str = i4 < arrayList2.size() ? ((ds6) arrayList2.get(i4)).a : ((ds6) arrayList3.get((i4 - arrayList2.size()) - 1)).a;
                str2 = str;
                z = false;
            }
            document = null;
        }
        if (str != null && str.startsWith("animated_")) {
            try {
                l = Long.valueOf(Long.parseLong(str.substring(9)));
                str4 = null;
                str3 = null;
            } catch (Exception unused) {
            }
            if (document == null || l != null) {
                n24Var.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
            } else {
                n24Var.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                n24Var.a(null, z);
                if (n24Var.getSpan() == null || n24Var.getSpan().document != document) {
                    n24Var.setSpan(new gn(document, (Paint.FontMetricsInt) null));
                }
            } else if (l != null) {
                n24Var.a(null, z);
                if (n24Var.getSpan() == null || n24Var.getSpan().getDocumentId() != l.longValue()) {
                    n24Var.setSpan(new gn(l.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                n24Var.a(gw3.f(str3), z);
                n24Var.setSpan(null);
            } else {
                n24Var.a(null, z);
                n24Var.setSpan(null);
            }
            n24Var.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l = null;
        if (document == null) {
        }
        n24Var.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
        if (document == null) {
        }
        n24Var.setTag(str4);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        e34 e34Var = this.G;
        ylb ylbVar = e34Var.a2;
        if (i == 0) {
            view = new n24(e34Var.getContext());
        } else if (i == 1) {
            View view2 = new View(e34Var.getContext());
            view2.setLayoutParams(new g69(-1, e34Var.c1));
            view = view2;
        } else if (i == 3) {
            view = new w1b(e34Var.getContext(), true, false, e34Var.a2, e34Var.j2);
        } else if (i == 4) {
            ViewGroup.LayoutParams g69Var = new g69(-1, gm.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(g69Var);
            view = view3;
        } else if (i != 5) {
            yd ydVar = new yd((byte) 18, e34Var.getContext(), this);
            TextView textView = new TextView(e34Var.getContext());
            td4.v(16.0f, 2131747947, 1, textView, null);
            int i2 = cmb.Cf;
            anb.X(textView, i2, ylbVar);
            ydVar.addView(textView, qoe.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(e34Var.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            anb.s(imageView, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
            ydVar.addView(imageView, qoe.e(48, 48, 85));
            imageView.setOnClickListener(new g6(this, (byte) 5));
            ydVar.setLayoutParams(new g69(-1, -2));
            view = ydVar;
        } else {
            View view4 = new View(e34Var.getContext());
            view4.setLayoutParams(new g69(-1, gm.L(68.0f)));
            view = view4;
        }
        return new b59(view);
    }
}
