package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import c8.ha;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.jl;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.qs;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k4 {
    public static final x3 p = new x3();
    public static final List q;
    public static final List r;
    public final View a;
    public final i4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public qs k;
    public final g6 n;
    public final dh.c o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final y3 l = new y3(this);
    public final jl m = new jl(23);

    static {
        Integer valueOf = Integer.valueOf(R.id.menu_regular);
        Integer valueOf2 = Integer.valueOf(R.id.menu_bold);
        Integer valueOf3 = Integer.valueOf(R.id.menu_italic);
        Integer valueOf4 = Integer.valueOf(R.id.menu_strike);
        Integer valueOf5 = Integer.valueOf(R.id.menu_mono);
        Integer valueOf6 = Integer.valueOf(R.id.menu_underline);
        Integer valueOf7 = Integer.valueOf(R.id.menu_spoiler);
        Integer valueOf8 = Integer.valueOf(R.id.menu_link);
        Integer valueOf9 = Integer.valueOf(R.id.menu_quote);
        q = Arrays.asList(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, Integer.valueOf(R.id.menu_date));
        r = Arrays.asList(valueOf2, valueOf3, valueOf4, valueOf8, valueOf5, valueOf6, valueOf7, valueOf9);
    }

    public k4(Context context, View view, int i7, g6 g6Var, dh.c cVar) {
        this.a = view;
        this.i = i7;
        this.o = cVar;
        this.n = g6Var;
        this.b = new i4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i7, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i7);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout b(k4 k4Var, Context context, MenuItem menuItem, boolean z9, boolean z10, boolean z11) {
        int w02;
        int i7;
        int i10;
        ImageView imageView;
        int i11 = k4Var.i;
        g6 g6Var = k4Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(org.telegram.messenger.g0.L(48.0f));
        linearLayout.setMinimumHeight(org.telegram.messenger.g0.L(z9 ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int w03 = l6.w0(l6.i6, g6Var);
        if (i11 == 0) {
            i7 = l6.j5;
            w02 = l6.w0(i7, g6Var);
            s6.U(textView, i7, g6Var);
        } else {
            if (i11 == 2) {
                textView.setTextColor(-328966);
                i10 = -328966;
                w03 = 553648127;
                i7 = -1;
                if (!z10 || z11) {
                    linearLayout.setBackground(l6.c0(w03, !z10 ? 12 : 0, !z11 ? 12 : 0, !z11 ? 12 : 0, !z10 ? 12 : 0));
                } else {
                    linearLayout.setBackground(l6.h0(w03, 2, -1));
                }
                textView.setPaddingRelative(org.telegram.messenger.g0.L(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.g0.L(!z9 ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_mini_lock3);
                e10.setScaleType(ImageView.ScaleType.CENTER);
                if (i11 == 2) {
                    if (i7 < 0) {
                        i7 = l6.G6;
                    }
                    o6 K = s6.K(0.4f, i7);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    int i12 = K.a;
                    float f10 = K.d;
                    int P = s6.P(i12, -1, 2, f10, g6Var);
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
                    e10.setColorFilter(porterDuffColorFilter);
                    m6 N = s6.N(e10, 5, i12, -1, 2, f10, g6Var, P, porterDuffColorFilter);
                    imageView = e10;
                    N.h = mode;
                } else {
                    imageView = e10;
                    imageView.setColorFilter(new PorterDuffColorFilter(l6.r1(0.4f, i10), PorterDuff.Mode.SRC_IN));
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, ha.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                    e(linearLayout, menuItem, k4Var.j != null);
                }
                return linearLayout;
            }
            if (i11 == 1) {
                i7 = l6.G6;
                w02 = l6.w0(i7, g6Var);
                s6.U(textView, i7, g6Var);
            } else {
                w02 = l6.w0(l6.G6, g6Var);
                i7 = -1;
            }
        }
        i10 = w02;
        if (z10) {
        }
        linearLayout.setBackground(l6.c0(w03, !z10 ? 12 : 0, !z11 ? 12 : 0, !z11 ? 12 : 0, !z10 ? 12 : 0));
        textView.setPaddingRelative(org.telegram.messenger.g0.L(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.g0.L(!z9 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView e102 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_mini_lock3);
        e102.setScaleType(ImageView.ScaleType.CENTER);
        if (i11 == 2) {
        }
        imageView.setVisibility(8);
        linearLayout.addView(imageView, ha.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
        }
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(View view, MenuItem menuItem, boolean z9) {
        boolean z10;
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(menuItem.getTitle())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        }
        textView.setPaddingRelative(0, 0, 0, 0);
        if (z9) {
            if (r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z10 = true;
                viewGroup.getChildAt(2).setVisibility(z10 ? 0 : 8);
            }
        }
        z10 = false;
        viewGroup.getChildAt(2).setVisibility(z10 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r26.h != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        boolean z9;
        int i7;
        List list2;
        boolean z10;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        i4 i4Var = this.b;
        if (arrayList != null && d.size() == this.f.size()) {
            int size = d.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    MenuItem menuItem = (MenuItem) d.get(i10);
                    MenuItem menuItem2 = (MenuItem) this.f.get(i10);
                    if (menuItem.getItemId() != menuItem2.getItemId() || !TextUtils.equals(menuItem.getTitle(), menuItem2.getTitle()) || !Objects.equals(menuItem.getIcon(), menuItem2.getIcon()) || menuItem.getGroupId() != menuItem2.getGroupId()) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        boolean z11 = i4Var.F;
        Rect rect = i4Var.A;
        k4 k4Var = i4Var.Q;
        boolean z12 = true;
        if (!z11) {
            i4Var.G = false;
            i4Var.F = true;
            i4Var.x.cancel();
            i4Var.w.start();
            i4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = i4Var.H;
        i4Var.K = onMenuItemClickListener;
        i4Var.d();
        i4Var.I = null;
        i4Var.J = null;
        i4Var.N = false;
        i4Var.n();
        d61 d61Var = i4Var.g;
        d61Var.removeAllViews();
        d61Var.setPaddingRelative(0, 0, 0, 0);
        h4 h4Var = i4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) h4Var.getAdapter();
        arrayAdapter.clear();
        h4Var.setAdapter((ListAdapter) arrayAdapter);
        i4Var.f.removeAllViews();
        i4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(org.telegram.messenger.g0.L(400.0f), org.telegram.messenger.camera.q.A(16.0f, 2, rect.width()));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i11 = min;
        boolean z13 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                z9 = z12;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z14 = !hasNext2;
            z9 = z12;
            if (menuItem3 == null || k4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i12 = i11;
                list = list3;
                LinearLayout b10 = b(k4Var, i4Var.a, menuItem3, false, z13, z14);
                b10.setGravity(17);
                int i13 = min;
                b10.setPaddingRelative((int) ((z13 ? 1.5d : 1.0d) * b10.getPaddingStart()), b10.getPaddingTop(), (int) (b10.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b10.getPaddingBottom());
                b10.measure(0, 0);
                min = i13;
                int min2 = Math.min(b10.getMeasuredWidth(), min);
                boolean z15 = min2 <= i12 - size2.getWidth() ? z9 : false;
                boolean z16 = (hasNext2 || min2 > i12) ? false : z9;
                if (!z15 && !z16) {
                    break;
                }
                b10.setTag(menuItem3);
                b10.setOnClickListener(i4Var.L);
                d61Var.addView(b10);
                ViewGroup.LayoutParams layoutParams = b10.getLayoutParams();
                layoutParams.width = min2;
                b10.setLayoutParams(layoutParams);
                i11 = i12 - min2;
                it.remove();
                z12 = z9;
                z13 = false;
            } else {
                z12 = z9;
            }
        }
        if (linkedList.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 0;
            d61Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        d61Var.measure(i7, i7);
        i4Var.J = new Size(d61Var.getMeasuredWidth(), d61Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) h4Var.getAdapter();
            arrayAdapter2.clear();
            if (k4Var.j != null) {
                Collections.sort(linkedList, new jl(24));
            }
            int size3 = linkedList.size();
            boolean D3 = qp.s1(p10.s0).D3();
            int i14 = 0;
            while (i14 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i14);
                if (k4Var.j == null) {
                    z10 = z9;
                    list2 = list;
                } else {
                    list2 = list;
                    z10 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !D3 : z9;
                }
                if (z10) {
                    arrayAdapter2.add(menuItem4);
                }
                i14++;
                list = list2;
            }
            h4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (i4Var.M) {
                h4Var.setY(0.0f);
            } else {
                h4Var.setY(size2.getHeight());
            }
            int count = h4Var.getAdapter().getCount();
            int i15 = 0;
            for (int i16 = 0; i16 < count; i16++) {
                MenuItem menuItem5 = (MenuItem) h4Var.getAdapter().getItem(i16);
                ab.v vVar = i4Var.q;
                LinearLayout linearLayout = (LinearLayout) vVar.d;
                e(linearLayout, menuItem5, ((i4) vVar.e).Q.j != null ? z9 : false);
                linearLayout.measure(0, 0);
                i15 = Math.max(linearLayout.getMeasuredWidth(), i15);
            }
            Size size4 = new Size(Math.max(i15, size2.getWidth()), i4Var.c(4));
            i4Var.I = size4;
            i4.m(h4Var, size4);
        }
        i4Var.p();
        this.f = d;
        boolean f10 = i4Var.f();
        Point point = i4Var.B;
        PopupWindow popupWindow = i4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f10) {
            if (!rect2.equals(rect3) && i4Var.f() && popupWindow.isShowing()) {
                i4Var.d();
                i4Var.i(rect3);
                i4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!i4Var.f()) {
            i4Var.G = false;
            i4Var.F = false;
            i4Var.w.cancel();
            i4Var.x.cancel();
            i4Var.d();
            i4Var.i(rect3);
            i4Var.h();
            popupWindow.showAtLocation(i4Var.b, 0, point.x, point.y);
            i4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        qs qsVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (qsVar = this.k) == null || ((Boolean) qsVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
