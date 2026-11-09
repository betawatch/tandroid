package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hx extends pj0 {
    public boolean D;
    public boolean E;
    public final /* synthetic */ hy F;
    public final cx c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public gx y;

    public hx(hy hyVar, Context context) {
        this.F = hyVar;
        cx cxVar = new cx(context, hyVar.c1, new d(this, 11), new bx(this, 0), hyVar.Z1);
        this.c = cxVar;
        cxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        cxVar.setClipToPadding(false);
        cxVar.f3.r = false;
        cxVar.setNestedScrollingEnabled(false);
        cxVar.setDrawSelection(false);
        cxVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(hx hxVar, Runnable runnable, ArrayList arrayList, boolean z9) {
        hy hyVar = hxVar.F;
        String[] strArr = hyVar.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = hxVar.w;
        if (str2 == null) {
            return;
        }
        org.telegram.messenger.ui.b0(hyVar.c1).Z1(true, str, str2, new di.s2((Object) hxVar, str2, arrayList, (Object) runnable, 9), z9);
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 4;
    }

    public final void F(String str, boolean z9) {
        hy hyVar = this.F;
        tw twVar = hyVar.P;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            v4.g0 adapter = twVar.getAdapter();
            qw qwVar = hyVar.R;
            if (adapter != qwVar) {
                twVar.setAdapter(qwVar);
                this.D = false;
            }
            this.d = 0L;
            hyVar.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        gx gxVar = this.y;
        if (gxVar != null) {
            org.telegram.messenger.g0.r(gxVar);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.E = false;
        hyVar.V.e(true);
        gx gxVar2 = new gx(this);
        this.y = gxVar2;
        org.telegram.messenger.g0.i3(gxVar2, z9 ? 300L : 0L);
    }

    @Override // v4.g0
    public final int b() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.D) {
            return this.F.getRecentEmoji().size() + 1;
        }
        int i7 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i7 = 3;
        } else if (arrayList.isEmpty()) {
            i7 = 1;
        }
        int size = arrayList.size() + i7;
        if (arrayList3.isEmpty()) {
            return size;
        }
        return arrayList3.size() + size + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r8 == 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0052, code lost:
    
        if (r8 == 1) goto L49;
     */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i7) {
        int i10 = 2;
        if (this.d != 0) {
            if (i7 != 0) {
                if (i7 == 1) {
                    return 4;
                }
                if (i7 != 2) {
                    return i7 == b() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i7 != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i7 == 1 && this.D && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList2.isEmpty()) {
                    return 0;
                }
                if (!arrayList.isEmpty()) {
                    i10 = 3;
                } else if (arrayList3.isEmpty()) {
                    i10 = 1;
                }
                if (i7 != arrayList3.size() + i10) {
                    return 0;
                }
            } else if (i7 == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // v4.g0
    public final void f() {
        this.c.f3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l10;
        int i10 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.s;
        boolean z9 = true;
        int i11 = 1;
        ArrayList arrayList2 = this.h;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            if (this.d != 0) {
                j8Var.a(0, org.telegram.messenger.id.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i11 = 3;
            } else if (!arrayList2.isEmpty()) {
                i11 = 2;
            }
            if (i7 == arrayList2.size() + i11) {
                j8Var.a(0, org.telegram.messenger.id.M0(2131744875, null));
                return;
            } else {
                j8Var.a(0, org.telegram.messenger.id.M0(2131744874, null));
                return;
            }
        }
        qx qxVar = (qx) view;
        qxVar.a = i7;
        qxVar.e = null;
        int i12 = i7 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i12 = i7 - 3;
        } else if (!arrayList2.isEmpty()) {
            i12 = i7 - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i12);
            z9 = false;
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.D) {
                str = this.F.getRecentEmoji().get(i12);
                str2 = str;
            } else {
                str = i12 < arrayList2.size() ? ((org.telegram.messenger.qi) arrayList2.get(i12)).a : ((org.telegram.messenger.qi) arrayList3.get((i12 - arrayList2.size()) - 1)).a;
                str2 = str;
                z9 = false;
            }
            document = null;
        }
        if (str != null && str.startsWith("animated_")) {
            try {
                l10 = Long.valueOf(Long.parseLong(str.substring(9)));
                str4 = null;
                str3 = null;
            } catch (Exception unused) {
            }
            if (document == null || l10 != null) {
                qxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            } else {
                qxVar.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                qxVar.a(null, z9);
                if (qxVar.getSpan() == null || qxVar.getSpan().document != document) {
                    qxVar.setSpan(new r5(document, (Paint.FontMetricsInt) null));
                }
            } else if (l10 != null) {
                qxVar.a(null, z9);
                if (qxVar.getSpan() == null || qxVar.getSpan().getDocumentId() != l10.longValue()) {
                    qxVar.setSpan(new r5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                qxVar.a(org.telegram.messenger.i6.f(str3), z9);
                qxVar.setSpan(null);
            } else {
                qxVar.a(null, z9);
                qxVar.setSpan(null);
            }
            qxVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        qxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        if (document == null) {
        }
        qxVar.setTag(str4);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        hy hyVar = this.F;
        org.telegram.ui.ActionBar.g6 g6Var = hyVar.Z1;
        if (i7 == 0) {
            view = new qx(hyVar.getContext());
        } else if (i7 == 1) {
            View view2 = new View(hyVar.getContext());
            view2.setLayoutParams(new v4.o0(-1, hyVar.b1));
            view = view2;
        } else if (i7 == 3) {
            view = new org.telegram.ui.Cells.j8(hyVar.getContext(), true, false, hyVar.Z1, hyVar.i2);
        } else if (i7 == 4) {
            ViewGroup.LayoutParams o0Var = new v4.o0(-1, org.telegram.messenger.g0.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(o0Var);
            view = view3;
        } else if (i7 != 5) {
            bi.e5 e5Var = new bi.e5(18, hyVar.getContext(), this);
            TextView textView = new TextView(hyVar.getContext());
            textView.setText(org.telegram.messenger.id.M0(2131748213, null));
            textView.setTextSize(1, 16.0f);
            int i10 = org.telegram.ui.ActionBar.l6.Af;
            org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
            e5Var.addView(textView, c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(hyVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            e5Var.addView(imageView, c8.ha.e(48, 48, 85));
            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
            e5Var.setLayoutParams(new v4.o0(-1, -2));
            view = e5Var;
        } else {
            View view4 = new View(hyVar.getContext());
            view4.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(68.0f)));
            view = view4;
        }
        return new yi0(view);
    }
}
