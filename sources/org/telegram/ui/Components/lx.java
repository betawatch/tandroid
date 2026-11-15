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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lx extends tj0 {
    public boolean E;
    public boolean F;
    public final /* synthetic */ ly G;
    public final hx c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public kx y;

    public lx(ly lyVar, Context context) {
        this.G = lyVar;
        hx hxVar = new hx(context, lyVar.d1, new d(this, 11), new gx(this, 0), lyVar.a2);
        this.c = hxVar;
        hxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        hxVar.setClipToPadding(false);
        hxVar.g3.r = false;
        hxVar.setNestedScrollingEnabled(false);
        hxVar.setDrawSelection(false);
        hxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(lx lxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        ly lyVar = lxVar.G;
        String[] strArr = lyVar.X0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = lxVar.w;
        if (str2 == null) {
            return;
        }
        org.telegram.messenger.si.b0(lyVar.d1).Z1(true, str, str2, new bi.o1(lxVar, str2, arrayList, runnable, 10), z10);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 0 || i7 == 4;
    }

    public final void F(String str, boolean z10) {
        ly lyVar = this.G;
        yw ywVar = lyVar.Q;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            v4.h0 adapter = ywVar.getAdapter();
            vw vwVar = lyVar.S;
            if (adapter != vwVar) {
                ywVar.setAdapter(vwVar);
                this.E = false;
            }
            this.d = 0L;
            lyVar.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        kx kxVar = this.y;
        if (kxVar != null) {
            org.telegram.messenger.g0.r(kxVar);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.F = false;
        lyVar.W.e(true);
        kx kxVar2 = new kx(this);
        this.y = kxVar2;
        org.telegram.messenger.g0.i3(kxVar2, z10 ? 300L : 0L);
    }

    @Override // v4.h0
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
    @Override // v4.h0
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
            if (i7 == 1 && this.E && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
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

    @Override // v4.h0
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l10;
        int i10 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList = this.s;
        boolean z10 = true;
        int i11 = 1;
        ArrayList arrayList2 = this.h;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
            if (this.d != 0) {
                i8Var.a(0, org.telegram.messenger.hd.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i11 = 3;
            } else if (!arrayList2.isEmpty()) {
                i11 = 2;
            }
            if (i7 == arrayList2.size() + i11) {
                i8Var.a(0, org.telegram.messenger.hd.M0(2131744875, null));
                return;
            } else {
                i8Var.a(0, org.telegram.messenger.hd.M0(2131744874, null));
                return;
            }
        }
        ux uxVar = (ux) view;
        uxVar.a = i7;
        uxVar.e = null;
        int i12 = i7 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i12 = i7 - 3;
        } else if (!arrayList2.isEmpty()) {
            i12 = i7 - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i12);
            z10 = false;
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.E) {
                str = this.G.getRecentEmoji().get(i12);
                str2 = str;
            } else {
                str = i12 < arrayList2.size() ? ((org.telegram.messenger.oi) arrayList2.get(i12)).a : ((org.telegram.messenger.oi) arrayList3.get((i12 - arrayList2.size()) - 1)).a;
                str2 = str;
                z10 = false;
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
                uxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            } else {
                uxVar.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                uxVar.a(null, z10);
                if (uxVar.getSpan() == null || uxVar.getSpan().document != document) {
                    uxVar.setSpan(new p5(document, (Paint.FontMetricsInt) null));
                }
            } else if (l10 != null) {
                uxVar.a(null, z10);
                if (uxVar.getSpan() == null || uxVar.getSpan().getDocumentId() != l10.longValue()) {
                    uxVar.setSpan(new p5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                uxVar.a(org.telegram.messenger.j6.f(str3), z10);
                uxVar.setSpan(null);
            } else {
                uxVar.a(null, z10);
                uxVar.setSpan(null);
            }
            uxVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        uxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        if (document == null) {
        }
        uxVar.setTag(str4);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        ly lyVar = this.G;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.a2;
        if (i7 == 0) {
            view = new ux(lyVar.getContext());
        } else if (i7 == 1) {
            View view2 = new View(lyVar.getContext());
            view2.setLayoutParams(new v4.p0(-1, lyVar.c1));
            view = view2;
        } else if (i7 == 3) {
            view = new org.telegram.ui.Cells.i8(lyVar.getContext(), true, false, lyVar.a2, lyVar.j2);
        } else if (i7 == 4) {
            ViewGroup.LayoutParams p0Var = new v4.p0(-1, org.telegram.messenger.g0.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(p0Var);
            view = view3;
        } else if (i7 != 5) {
            bi.g2 g2Var = new bi.g2(19, lyVar.getContext(), this);
            TextView textView = new TextView(lyVar.getContext());
            textView.setText(org.telegram.messenger.hd.M0(2131748213, null));
            textView.setTextSize(1, 16.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Df;
            org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
            g2Var.addView(textView, c8.ja.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(lyVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            g2Var.addView(imageView, c8.ja.e(48, 48, 85));
            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
            g2Var.setLayoutParams(new v4.p0(-1, -2));
            view = g2Var;
        } else {
            View view4 = new View(lyVar.getContext());
            view4.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(68.0f)));
            view = view4;
        }
        return new cj0(view);
    }
}
