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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class sx extends dk0 {
    public boolean E;
    public boolean F;
    public final /* synthetic */ ty G;
    public final ox c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public rx y;

    public sx(ty tyVar, Context context) {
        this.G = tyVar;
        ox oxVar = new ox(context, tyVar.d1, new d(this, 12), new c0(this, 29), tyVar.a2);
        this.c = oxVar;
        oxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        oxVar.setClipToPadding(false);
        oxVar.g3.r = false;
        oxVar.setNestedScrollingEnabled(false);
        oxVar.setDrawSelection(false);
        oxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(sx sxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        ty tyVar = sxVar.G;
        String[] strArr = tyVar.X0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = sxVar.w;
        if (str2 == null) {
            return;
        }
        org.telegram.messenger.si.d0(tyVar.d1).e2(true, str, str2, new bi.m2(sxVar, str2, arrayList, runnable, 10), z10);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 4;
    }

    public final void F(String str, boolean z10) {
        ty tyVar = this.G;
        gx gxVar = tyVar.Q;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            v4.i0 adapter = gxVar.getAdapter();
            dx dxVar = tyVar.S;
            if (adapter != dxVar) {
                gxVar.setAdapter(dxVar);
                this.E = false;
            }
            this.d = 0L;
            tyVar.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        rx rxVar = this.y;
        if (rxVar != null) {
            org.telegram.messenger.g0.r(rxVar);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.F = false;
        tyVar.W.e(true);
        rx rxVar2 = new rx(this);
        this.y = rxVar2;
        org.telegram.messenger.g0.h3(rxVar2, z10 ? 300L : 0L);
    }

    @Override // v4.i0
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
    @Override // v4.i0
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

    @Override // v4.i0
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l10;
        int i10 = f1Var.f;
        View view = f1Var.a;
        ArrayList arrayList = this.s;
        boolean z10 = true;
        int i11 = 1;
        ArrayList arrayList2 = this.h;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (this.d != 0) {
                k8Var.a(0, org.telegram.messenger.hd.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i11 = 3;
            } else if (!arrayList2.isEmpty()) {
                i11 = 2;
            }
            if (i7 == arrayList2.size() + i11) {
                k8Var.a(0, org.telegram.messenger.hd.N0(2131744632, null));
                return;
            } else {
                k8Var.a(0, org.telegram.messenger.hd.N0(2131744631, null));
                return;
            }
        }
        cy cyVar = (cy) view;
        cyVar.a = i7;
        cyVar.e = null;
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
                cyVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            } else {
                cyVar.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                cyVar.a(null, z10);
                if (cyVar.getSpan() == null || cyVar.getSpan().document != document) {
                    cyVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                }
            } else if (l10 != null) {
                cyVar.a(null, z10);
                if (cyVar.getSpan() == null || cyVar.getSpan().getDocumentId() != l10.longValue()) {
                    cyVar.setSpan(new y5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                cyVar.a(org.telegram.messenger.j6.f(str3), z10);
                cyVar.setSpan(null);
            } else {
                cyVar.a(null, z10);
                cyVar.setSpan(null);
            }
            cyVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        cyVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        if (document == null) {
        }
        cyVar.setTag(str4);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        ty tyVar = this.G;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.a2;
        if (i7 == 0) {
            view = new cy(tyVar.getContext());
        } else if (i7 == 1) {
            View view2 = new View(tyVar.getContext());
            view2.setLayoutParams(new v4.q0(-1, tyVar.c1));
            view = view2;
        } else if (i7 == 3) {
            view = new org.telegram.ui.Cells.k8(tyVar.getContext(), true, false, tyVar.a2, tyVar.j2);
        } else if (i7 == 4) {
            ViewGroup.LayoutParams q0Var = new v4.q0(-1, org.telegram.messenger.g0.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(q0Var);
            view = view3;
        } else if (i7 != 5) {
            bi.e3 e3Var = new bi.e3(19, tyVar.getContext(), this);
            TextView textView = new TextView(tyVar.getContext());
            org.telegram.messenger.o10.l(16.0f, 2131748020, 1, textView, null);
            int i10 = org.telegram.ui.ActionBar.m6.Df;
            org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
            e3Var.addView(textView, c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(tyVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
            e3Var.addView(imageView, c8.ma.e(48, 48, 85));
            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
            e3Var.setLayoutParams(new v4.q0(-1, -2));
            view = e3Var;
        } else {
            View view4 = new View(tyVar.getContext());
            view4.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(68.0f)));
            view = view4;
        }
        return new mj0(view);
    }
}
