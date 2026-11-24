// default package

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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gk4 {
    public static final tj4 p = new tj4();
    public static final List q;
    public static final List r;
    public final View a;
    public final ek4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public wf0 k;
    public final wjb n;
    public final kl0 o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final wk0 l = new wk0(this);
    public final mz2 m = new mz2(17);

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

    public gk4(Context context, View view, int i, wjb wjbVar, kl0 kl0Var) {
        this.a = view;
        this.i = i;
        this.o = kl0Var;
        this.n = wjbVar;
        this.b = new ek4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(View view, MenuItem menuItem, boolean z) {
        boolean z2;
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
        if (z) {
            if (r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z2 = true;
                viewGroup.getChildAt(2).setVisibility(z2 ? 0 : 8);
            }
        }
        z2 = false;
        viewGroup.getChildAt(2).setVisibility(z2 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinearLayout b(Context context, MenuItem menuItem, boolean z, boolean z2, boolean z3) {
        int v0;
        int i;
        int i2;
        int i3;
        ImageView imageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(gl.L(48.0f));
        linearLayout.setMinimumHeight(gl.L(z ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(gl.L(16.0f), 0, gl.L(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int i4 = bkb.h6;
        wjb wjbVar = this.n;
        int v02 = bkb.v0(i4, wjbVar);
        int i5 = this.i;
        if (i5 == 0) {
            i = bkb.i5;
            v0 = bkb.v0(i, wjbVar);
            zkb.X(textView, i, wjbVar);
        } else {
            if (i5 == 2) {
                textView.setTextColor(-328966);
                i2 = -328966;
                v02 = 553648127;
                i = -1;
                if (!z2) {
                    i3 = 12;
                } else {
                    if (!z3) {
                        linearLayout.setBackground(bkb.f0(v02, 2, -1));
                        textView.setPaddingRelative(gl.L(11.0f), 0, 0, 0);
                        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, gl.L(z ? 42.0f : 48.0f)));
                        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                        ImageView k = tb4.k(context, R.drawable.msg_mini_lock3);
                        k.setScaleType(ImageView.ScaleType.CENTER);
                        if (i5 != 2) {
                            if (i < 0) {
                                i = bkb.F6;
                            }
                            vkb K = zkb.K(0.4f, i);
                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                            int i6 = K.a;
                            float f = K.d;
                            int P = zkb.P(i6, -1, 2, f, wjbVar);
                            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
                            k.setColorFilter(porterDuffColorFilter);
                            imageView = k;
                            zkb.N(imageView, 5, i6, -1, 2, f, wjbVar, P, porterDuffColorFilter).h = mode;
                        } else {
                            imageView = k;
                            imageView.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.4f, i2), PorterDuff.Mode.SRC_IN));
                        }
                        imageView.setVisibility(8);
                        linearLayout.addView(imageView, nme.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                        if (menuItem != null) {
                            e(linearLayout, menuItem, this.j != null);
                        }
                        return linearLayout;
                    }
                    i3 = 0;
                }
                int i7 = !z3 ? 12 : 0;
                linearLayout.setBackground(bkb.a0(v02, i3, i7, i7, !z2 ? 12 : 0));
                textView.setPaddingRelative(gl.L(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, gl.L(z ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                ImageView k2 = tb4.k(context, R.drawable.msg_mini_lock3);
                k2.setScaleType(ImageView.ScaleType.CENTER);
                if (i5 != 2) {
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, nme.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                }
                return linearLayout;
            }
            if (i5 == 1) {
                i = bkb.F6;
                v0 = bkb.v0(i, wjbVar);
                zkb.X(textView, i, wjbVar);
            } else {
                v0 = bkb.v0(bkb.F6, wjbVar);
                i = -1;
            }
        }
        i2 = v0;
        if (!z2) {
        }
        if (!z3) {
        }
        linearLayout.setBackground(bkb.a0(v02, i3, i7, i7, !z2 ? 12 : 0));
        textView.setPaddingRelative(gl.L(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, gl.L(z ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView k22 = tb4.k(context, R.drawable.msg_mini_lock3);
        k22.setScaleType(ImageView.ScaleType.CENTER);
        if (i5 != 2) {
        }
        imageView.setVisibility(8);
        linearLayout.addView(imageView, nme.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
        }
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r26.h != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        boolean z;
        int i;
        List list2;
        boolean z2;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        ek4 ek4Var = this.b;
        if (arrayList != null && d.size() == this.f.size()) {
            int size = d.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    MenuItem menuItem = (MenuItem) d.get(i2);
                    MenuItem menuItem2 = (MenuItem) this.f.get(i2);
                    if (menuItem.getItemId() != menuItem2.getItemId() || !TextUtils.equals(menuItem.getTitle(), menuItem2.getTitle()) || !Objects.equals(menuItem.getIcon(), menuItem2.getIcon()) || menuItem.getGroupId() != menuItem2.getGroupId()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        boolean z3 = ek4Var.F;
        Rect rect = ek4Var.A;
        gk4 gk4Var = ek4Var.Q;
        boolean z4 = true;
        if (!z3) {
            ek4Var.G = false;
            ek4Var.F = true;
            ek4Var.x.cancel();
            ek4Var.w.start();
            ek4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = ek4Var.H;
        ek4Var.K = onMenuItemClickListener;
        ek4Var.b();
        ek4Var.I = null;
        ek4Var.J = null;
        ek4Var.N = false;
        ek4Var.n();
        pkb pkbVar = ek4Var.g;
        pkbVar.removeAllViews();
        pkbVar.setPaddingRelative(0, 0, 0, 0);
        ck4 ck4Var = ek4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) ck4Var.getAdapter();
        arrayAdapter.clear();
        ck4Var.setAdapter((ListAdapter) arrayAdapter);
        ek4Var.f.removeAllViews();
        ek4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(gl.L(400.0f), rect.width() - (gl.L(16.0f) << 1));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i3 = min;
        boolean z5 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                z = z4;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z6 = !hasNext2;
            z = z4;
            if (menuItem3 == null || gk4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i4 = i3;
                list = list3;
                LinearLayout b = gk4Var.b(ek4Var.a, menuItem3, false, z5, z6);
                b.setGravity(17);
                int i5 = min;
                b.setPaddingRelative((int) ((z5 ? 1.5d : 1.0d) * b.getPaddingStart()), b.getPaddingTop(), (int) (b.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b.getPaddingBottom());
                b.measure(0, 0);
                min = i5;
                int min2 = Math.min(b.getMeasuredWidth(), min);
                boolean z7 = min2 <= i4 - size2.getWidth() ? z : false;
                boolean z8 = (hasNext2 || min2 > i4) ? false : z;
                if (!z7 && !z8) {
                    break;
                }
                b.setTag(menuItem3);
                b.setOnClickListener(ek4Var.L);
                pkbVar.addView(b);
                ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                layoutParams.width = min2;
                b.setLayoutParams(layoutParams);
                i3 = i4 - min2;
                it.remove();
                z4 = z;
                z5 = false;
            } else {
                z4 = z;
            }
        }
        if (linkedList.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            pkbVar.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        pkbVar.measure(i, i);
        ek4Var.J = new Size(pkbVar.getMeasuredWidth(), pkbVar.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) ck4Var.getAdapter();
            arrayAdapter2.clear();
            if (gk4Var.j != null) {
                Collections.sort(linkedList, new mz2((byte) 18));
            }
            int size3 = linkedList.size();
            boolean F3 = na7.q1(y6c.t0).F3();
            int i6 = 0;
            while (i6 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i6);
                if (gk4Var.j == null) {
                    z2 = z;
                    list2 = list;
                } else {
                    list2 = list;
                    z2 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !F3 : z;
                }
                if (z2) {
                    arrayAdapter2.add(menuItem4);
                }
                i6++;
                list = list2;
            }
            ck4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (ek4Var.M) {
                ck4Var.setY(0.0f);
            } else {
                ck4Var.setY(size2.getHeight());
            }
            int count = ck4Var.getAdapter().getCount();
            int i7 = 0;
            for (int i8 = 0; i8 < count; i8++) {
                MenuItem menuItem5 = (MenuItem) ck4Var.getAdapter().getItem(i8);
                dk4 dk4Var = ek4Var.q;
                LinearLayout linearLayout = dk4Var.a;
                e(linearLayout, menuItem5, dk4Var.e.Q.j != null ? z : false);
                linearLayout.measure(0, 0);
                i7 = Math.max(linearLayout.getMeasuredWidth(), i7);
            }
            Size size4 = new Size(Math.max(i7, size2.getWidth()), ek4Var.a(4));
            ek4Var.I = size4;
            ek4.m(ck4Var, size4);
        }
        ek4Var.p();
        this.f = d;
        boolean e = ek4Var.e();
        Point point = ek4Var.B;
        PopupWindow popupWindow = ek4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (e) {
            if (!rect2.equals(rect3) && ek4Var.e() && popupWindow.isShowing()) {
                ek4Var.b();
                ek4Var.i(rect3);
                ek4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!ek4Var.e()) {
            ek4Var.G = false;
            ek4Var.F = false;
            ek4Var.w.cancel();
            ek4Var.x.cancel();
            ek4Var.b();
            ek4Var.i(rect3);
            ek4Var.h();
            popupWindow.showAtLocation(ek4Var.b, 0, point.x, point.y);
            ek4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        wf0 wf0Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (wf0Var = this.k) == null || ((Boolean) wf0Var.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
