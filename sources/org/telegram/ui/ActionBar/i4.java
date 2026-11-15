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
import c8.ja;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gl;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.xs;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i4 {
    public static final v3 p = new v3();
    public static final List q;
    public static final List r;
    public final View a;
    public final g4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public xs k;
    public final e6 n;
    public final dh.c o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final w3 l = new w3(this);
    public final gl m = new gl(22);

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

    public i4(Context context, View view, int i7, e6 e6Var, dh.c cVar) {
        this.a = view;
        this.i = i7;
        this.o = cVar;
        this.n = e6Var;
        this.b = new g4(this, context, view);
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
    public static LinearLayout b(i4 i4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int w02;
        int i7;
        int i10;
        ImageView imageView;
        int i11 = i4Var.i;
        e6 e6Var = i4Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(org.telegram.messenger.g0.L(48.0f));
        linearLayout.setMinimumHeight(org.telegram.messenger.g0.L(z10 ? 42.0f : 48.0f));
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
        int w03 = j6.w0(j6.i6, e6Var);
        if (i11 == 0) {
            i7 = j6.j5;
            w02 = j6.w0(i7, e6Var);
            q6.U(textView, i7, e6Var);
        } else {
            if (i11 == 2) {
                textView.setTextColor(-328966);
                i10 = -328966;
                w03 = 553648127;
                i7 = -1;
                if (!z11 || z12) {
                    linearLayout.setBackground(j6.c0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
                } else {
                    linearLayout.setBackground(j6.h0(w03, 2, -1));
                }
                textView.setPaddingRelative(org.telegram.messenger.g0.L(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.g0.L(!z10 ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                ImageView e10 = i20.e(context, R.drawable.msg_mini_lock3);
                e10.setScaleType(ImageView.ScaleType.CENTER);
                if (i11 == 2) {
                    if (i7 < 0) {
                        i7 = j6.G6;
                    }
                    m6 K = q6.K(0.4f, i7);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    int i12 = K.a;
                    float f10 = K.d;
                    int P = q6.P(i12, -1, 2, f10, e6Var);
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
                    e10.setColorFilter(porterDuffColorFilter);
                    k6 N = q6.N(e10, 5, i12, -1, 2, f10, e6Var, P, porterDuffColorFilter);
                    imageView = e10;
                    N.h = mode;
                } else {
                    imageView = e10;
                    imageView.setColorFilter(new PorterDuffColorFilter(j6.r1(0.4f, i10), PorterDuff.Mode.SRC_IN));
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, ja.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                    e(linearLayout, menuItem, i4Var.j != null);
                }
                return linearLayout;
            }
            if (i11 == 1) {
                i7 = j6.G6;
                w02 = j6.w0(i7, e6Var);
                q6.U(textView, i7, e6Var);
            } else {
                w02 = j6.w0(j6.G6, e6Var);
                i7 = -1;
            }
        }
        i10 = w02;
        if (z11) {
        }
        linearLayout.setBackground(j6.c0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
        textView.setPaddingRelative(org.telegram.messenger.g0.L(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.g0.L(!z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView e102 = i20.e(context, R.drawable.msg_mini_lock3);
        e102.setScaleType(ImageView.ScaleType.CENTER);
        if (i11 == 2) {
        }
        imageView.setVisibility(8);
        linearLayout.addView(imageView, ja.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
        }
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(View view, MenuItem menuItem, boolean z10) {
        boolean z11;
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
        if (z10) {
            if (r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z11 = true;
                viewGroup.getChildAt(2).setVisibility(z11 ? 0 : 8);
            }
        }
        z11 = false;
        viewGroup.getChildAt(2).setVisibility(z11 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r26.h != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        boolean z10;
        int i7;
        List list2;
        boolean z11;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        g4 g4Var = this.b;
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
        boolean z12 = g4Var.F;
        Rect rect = g4Var.A;
        i4 i4Var = g4Var.Q;
        boolean z13 = true;
        if (!z12) {
            g4Var.G = false;
            g4Var.F = true;
            g4Var.x.cancel();
            g4Var.w.start();
            g4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = g4Var.H;
        g4Var.K = onMenuItemClickListener;
        g4Var.d();
        g4Var.I = null;
        g4Var.J = null;
        g4Var.N = false;
        g4Var.n();
        z51 z51Var = g4Var.g;
        z51Var.removeAllViews();
        z51Var.setPaddingRelative(0, 0, 0, 0);
        f4 f4Var = g4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) f4Var.getAdapter();
        arrayAdapter.clear();
        f4Var.setAdapter((ListAdapter) arrayAdapter);
        g4Var.f.removeAllViews();
        g4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(org.telegram.messenger.g0.L(400.0f), i20.A(16.0f, 2, rect.width()));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i11 = min;
        boolean z14 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                z10 = z13;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z15 = !hasNext2;
            z10 = z13;
            if (menuItem3 == null || i4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i12 = i11;
                list = list3;
                LinearLayout b10 = b(i4Var, g4Var.a, menuItem3, false, z14, z15);
                b10.setGravity(17);
                int i13 = min;
                b10.setPaddingRelative((int) ((z14 ? 1.5d : 1.0d) * b10.getPaddingStart()), b10.getPaddingTop(), (int) (b10.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b10.getPaddingBottom());
                b10.measure(0, 0);
                min = i13;
                int min2 = Math.min(b10.getMeasuredWidth(), min);
                boolean z16 = min2 <= i12 - size2.getWidth() ? z10 : false;
                boolean z17 = (hasNext2 || min2 > i12) ? false : z10;
                if (!z16 && !z17) {
                    break;
                }
                b10.setTag(menuItem3);
                b10.setOnClickListener(g4Var.L);
                z51Var.addView(b10);
                ViewGroup.LayoutParams layoutParams = b10.getLayoutParams();
                layoutParams.width = min2;
                b10.setLayoutParams(layoutParams);
                i11 = i12 - min2;
                it.remove();
                z13 = z10;
                z14 = false;
            } else {
                z13 = z10;
            }
        }
        if (linkedList.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 0;
            z51Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        z51Var.measure(i7, i7);
        g4Var.J = new Size(z51Var.getMeasuredWidth(), z51Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) f4Var.getAdapter();
            arrayAdapter2.clear();
            if (i4Var.j != null) {
                Collections.sort(linkedList, new gl(23));
            }
            int size3 = linkedList.size();
            boolean D3 = np.s1(m10.t0).D3();
            int i14 = 0;
            while (i14 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i14);
                if (i4Var.j == null) {
                    z11 = z10;
                    list2 = list;
                } else {
                    list2 = list;
                    z11 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !D3 : z10;
                }
                if (z11) {
                    arrayAdapter2.add(menuItem4);
                }
                i14++;
                list = list2;
            }
            f4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (g4Var.M) {
                f4Var.setY(0.0f);
            } else {
                f4Var.setY(size2.getHeight());
            }
            int count = f4Var.getAdapter().getCount();
            int i15 = 0;
            for (int i16 = 0; i16 < count; i16++) {
                MenuItem menuItem5 = (MenuItem) f4Var.getAdapter().getItem(i16);
                ab.v vVar = g4Var.q;
                LinearLayout linearLayout = (LinearLayout) vVar.d;
                e(linearLayout, menuItem5, ((g4) vVar.e).Q.j != null ? z10 : false);
                linearLayout.measure(0, 0);
                i15 = Math.max(linearLayout.getMeasuredWidth(), i15);
            }
            Size size4 = new Size(Math.max(i15, size2.getWidth()), g4Var.c(4));
            g4Var.I = size4;
            g4.m(f4Var, size4);
        }
        g4Var.p();
        this.f = d;
        boolean f10 = g4Var.f();
        Point point = g4Var.B;
        PopupWindow popupWindow = g4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f10) {
            if (!rect2.equals(rect3) && g4Var.f() && popupWindow.isShowing()) {
                g4Var.d();
                g4Var.i(rect3);
                g4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!g4Var.f()) {
            g4Var.G = false;
            g4Var.F = false;
            g4Var.w.cancel();
            g4Var.x.cancel();
            g4Var.d();
            g4Var.i(rect3);
            g4Var.h();
            popupWindow.showAtLocation(g4Var.b, 0, point.x, point.y);
            g4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        xs xsVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (xsVar = this.k) == null || ((Boolean) xsVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
