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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ux extends sk0 {
    public boolean D;
    public boolean E;
    public final /* synthetic */ vy F;
    public final qx c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public tx y;

    public ux(vy vyVar, Context context) {
        this.F = vyVar;
        qx qxVar = new qx(context, vyVar.c1, new d(this, 11), new px(this, 0), vyVar.Z1);
        this.c = qxVar;
        qxVar.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f));
        qxVar.setClipToPadding(false);
        qxVar.f3.r = false;
        qxVar.setNestedScrollingEnabled(false);
        qxVar.setDrawSelection(false);
        qxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ux uxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        vy vyVar = uxVar.F;
        String[] strArr = vyVar.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = uxVar.w;
        if (str2 == null) {
            return;
        }
        org.telegram.messenger.ui.b0(vyVar.c1).Z1(true, str, str2, new ag.m2(uxVar, str2, arrayList, runnable, 9), z10);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        vy vyVar = this.F;
        hx hxVar = vyVar.P;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            s4.g0 adapter = hxVar.getAdapter();
            ex exVar = vyVar.R;
            if (adapter != exVar) {
                hxVar.setAdapter(exVar);
                this.D = false;
            }
            this.d = 0L;
            vyVar.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        tx txVar = this.y;
        if (txVar != null) {
            org.telegram.messenger.i0.r(txVar);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.E = false;
        vyVar.V.e(true);
        tx txVar2 = new tx(this);
        this.y = txVar2;
        org.telegram.messenger.i0.h3(txVar2, z10 ? 300L : 0L);
    }

    @Override // s4.g0
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
        int i10 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i10 = 3;
        } else if (arrayList.isEmpty()) {
            i10 = 1;
        }
        int size = arrayList.size() + i10;
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i10) {
        int i11 = 2;
        if (this.d != 0) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return 4;
                }
                if (i10 != 2) {
                    return i10 == b() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i10 != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i10 == 1 && this.D && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList2.isEmpty()) {
                    return 0;
                }
                if (!arrayList.isEmpty()) {
                    i11 = 3;
                } else if (arrayList3.isEmpty()) {
                    i11 = 1;
                }
                if (i10 != arrayList3.size() + i11) {
                    return 0;
                }
            } else if (i10 == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // s4.g0
    public final void f() {
        this.c.f3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l4;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.s;
        boolean z10 = true;
        int i12 = 1;
        ArrayList arrayList2 = this.h;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (this.d != 0) {
                n8Var.a(0, org.telegram.messenger.cd.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i12 = 3;
            } else if (!arrayList2.isEmpty()) {
                i12 = 2;
            }
            if (i10 == arrayList2.size() + i12) {
                n8Var.a(0, org.telegram.messenger.cd.L0(2131744893, null));
                return;
            } else {
                n8Var.a(0, org.telegram.messenger.cd.L0(2131744892, null));
                return;
            }
        }
        ey eyVar = (ey) view;
        eyVar.a = i10;
        eyVar.e = null;
        int i13 = i10 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i13 = i10 - 3;
        } else if (!arrayList2.isEmpty()) {
            i13 = i10 - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i13);
            z10 = false;
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.D) {
                str = this.F.getRecentEmoji().get(i13);
                str2 = str;
            } else {
                str = i13 < arrayList2.size() ? ((org.telegram.messenger.qi) arrayList2.get(i13)).a : ((org.telegram.messenger.qi) arrayList3.get((i13 - arrayList2.size()) - 1)).a;
                str2 = str;
                z10 = false;
            }
            document = null;
        }
        if (str != null && str.startsWith("animated_")) {
            try {
                l4 = Long.valueOf(Long.parseLong(str.substring(9)));
                str4 = null;
                str3 = null;
            } catch (Exception unused) {
            }
            if (document == null || l4 != null) {
                eyVar.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
            } else {
                eyVar.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                eyVar.a(null, z10);
                if (eyVar.getSpan() == null || eyVar.getSpan().document != document) {
                    eyVar.setSpan(new o5(document, (Paint.FontMetricsInt) null));
                }
            } else if (l4 != null) {
                eyVar.a(null, z10);
                if (eyVar.getSpan() == null || eyVar.getSpan().getDocumentId() != l4.longValue()) {
                    eyVar.setSpan(new o5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                eyVar.a(org.telegram.messenger.k6.f(str3), z10);
                eyVar.setSpan(null);
            } else {
                eyVar.a(null, z10);
                eyVar.setSpan(null);
            }
            eyVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l4 = null;
        if (document == null) {
        }
        eyVar.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        if (document == null) {
        }
        eyVar.setTag(str4);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        vy vyVar = this.F;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        if (i10 == 0) {
            view = new ey(vyVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(vyVar.getContext());
            view2.setLayoutParams(new s4.o0(-1, vyVar.b1));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.n8(vyVar.getContext(), true, false, vyVar.Z1, vyVar.i2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams o0Var = new s4.o0(-1, org.telegram.messenger.i0.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(o0Var);
            view = view3;
        } else if (i10 != 5) {
            jg.l0 l0Var = new jg.l0(this, vyVar.getContext(), 17);
            TextView textView = new TextView(vyVar.getContext());
            textView.setText(org.telegram.messenger.cd.L0(2131748230, null));
            textView.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.t6.Af;
            org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
            l0Var.addView(textView, w7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(vyVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.MULTIPLY);
            l0Var.addView(imageView, w7.b6.e(48, 48, 85));
            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
            l0Var.setLayoutParams(new s4.o0(-1, -2));
            view = l0Var;
        } else {
            View view4 = new View(vyVar.getContext());
            view4.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(68.0f)));
            view = view4;
        }
        return new ck0(view);
    }
}
