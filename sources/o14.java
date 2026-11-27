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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class o14 extends c79 {
    public boolean E;
    public boolean F;
    public final /* synthetic */ o24 G;
    public final j14 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public n14 y;

    public o14(o24 o24Var, Context context) {
        this.G = o24Var;
        j14 j14Var = new j14(context, o24Var.d1, new n82(this, (byte) 25), new lu3(this, (byte) 3), o24Var.a2);
        this.c = j14Var;
        j14Var.setPadding(hl.L(10.0f), 0, hl.L(10.0f), hl.L(5.0f));
        j14Var.setClipToPadding(false);
        j14Var.g3.r = false;
        j14Var.setNestedScrollingEnabled(false);
        j14Var.setDrawSelection(false);
        j14Var.setOnTouchListener(new k14(this, (byte) 0));
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 0 || i == 4;
    }

    public final void E(String str, boolean z) {
        o24 o24Var = this.G;
        b14 b14Var = o24Var.Q;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            j79 adapter = b14Var.getAdapter();
            y04 y04Var = o24Var.S;
            if (adapter != y04Var) {
                b14Var.setAdapter(y04Var);
                this.E = false;
            }
            this.d = 0L;
            o24Var.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        n14 n14Var = this.y;
        if (n14Var != null) {
            hl.r(n14Var);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.F = false;
        o24Var.W.d(true);
        n14 n14Var2 = new n14(this);
        this.y = n14Var2;
        hl.d3(n14Var2, z ? 300L : 0L);
    }

    public final void F(Runnable runnable, ArrayList arrayList, boolean z) {
        o24 o24Var = this.G;
        String[] strArr = o24Var.X0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = this.w;
        if (str2 == null) {
            return;
        }
        ls6.d0(o24Var.d1).b2(true, str, str2, new ku0((Object) this, str2, (Object) arrayList, (Object) runnable, (byte) 8), z);
    }

    @Override // j79
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
    @Override // j79
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

    @Override // j79
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l;
        int i2 = f89Var.f;
        View view = f89Var.a;
        ArrayList arrayList = this.s;
        boolean z = true;
        int i3 = 1;
        ArrayList arrayList2 = this.h;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            t3b t3bVar = (t3b) view;
            if (this.d != 0) {
                t3bVar.a(0, ob6.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i3 = 3;
            } else if (!arrayList2.isEmpty()) {
                i3 = 2;
            }
            if (i == arrayList2.size() + i3) {
                t3bVar.a(0, ob6.M0(2131744532, null));
                return;
            } else {
                t3bVar.a(0, ob6.M0(2131744531, null));
                return;
            }
        }
        x14 x14Var = (x14) view;
        x14Var.a = i;
        x14Var.e = null;
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
                str = i4 < arrayList2.size() ? ((hs6) arrayList2.get(i4)).a : ((hs6) arrayList3.get((i4 - arrayList2.size()) - 1)).a;
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
                x14Var.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
            } else {
                x14Var.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                x14Var.a(null, z);
                if (x14Var.getSpan() == null || x14Var.getSpan().document != document) {
                    x14Var.setSpan(new hm(document, (Paint.FontMetricsInt) null));
                }
            } else if (l != null) {
                x14Var.a(null, z);
                if (x14Var.getSpan() == null || x14Var.getSpan().getDocumentId() != l.longValue()) {
                    x14Var.setSpan(new hm(l.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                x14Var.a(pv3.f(str3), z);
                x14Var.setSpan(null);
            } else {
                x14Var.a(null, z);
                x14Var.setSpan(null);
            }
            x14Var.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l = null;
        if (document == null) {
        }
        x14Var.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        if (document == null) {
        }
        x14Var.setTag(str4);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        o24 o24Var = this.G;
        vnb vnbVar = o24Var.a2;
        if (i == 0) {
            view = new x14(o24Var.getContext());
        } else if (i == 1) {
            View view2 = new View(o24Var.getContext());
            view2.setLayoutParams(new r79(-1, o24Var.c1));
            view = view2;
        } else if (i == 3) {
            view = new t3b(o24Var.getContext(), true, false, o24Var.a2, o24Var.j2);
        } else if (i == 4) {
            ViewGroup.LayoutParams r79Var = new r79(-1, hl.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(r79Var);
            view = view3;
        } else if (i != 5) {
            zc zcVar = new zc((byte) 18, o24Var.getContext(), this);
            TextView textView = new TextView(o24Var.getContext());
            qd4.u(16.0f, 2131747944, 1, textView, null);
            int i2 = aob.Df;
            yob.X(textView, i2, vnbVar);
            zcVar.addView(textView, tre.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(o24Var.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
            zcVar.addView(imageView, tre.e(48, 48, 85));
            imageView.setOnClickListener(new h6(this, (byte) 5));
            zcVar.setLayoutParams(new r79(-1, -2));
            view = zcVar;
        } else {
            View view4 = new View(o24Var.getContext());
            view4.setLayoutParams(new r79(-1, hl.L(68.0f)));
            view = view4;
        }
        return new n69(view);
    }
}
