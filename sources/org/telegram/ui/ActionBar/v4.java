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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.ct;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v4 {
    public static final h4 p = new h4();
    public static final List q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View a;
    public final t4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public ct k;
    public final b6 n;
    public final ig.a o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final i4 l = new i4(this);
    public final j9.a m = new j9.a(9);

    public v4(Context context, View view, int i9, b6 b6Var, ig.a aVar) {
        this.a = view;
        this.i = i9;
        this.o = aVar;
        this.n = b6Var;
        this.b = new t4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i9, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i9);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(v4 v4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int v02;
        b6 b6Var = v4Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        linearLayout.setMinimumHeight(AndroidUtilities.dp(z10 ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int v03 = f6.v0(f6.i6, b6Var);
        int i9 = v4Var.i;
        if (i9 == 0) {
            v02 = f6.v0(f6.j5, b6Var);
            textView.setTextColor(v02);
        } else if (i9 == 2) {
            v02 = -328966;
            textView.setTextColor(-328966);
            v03 = 553648127;
        } else if (i9 == 1) {
            v02 = f6.v0(f6.G6, b6Var);
            textView.setTextColor(v02);
        } else {
            v02 = f6.v0(f6.G6, b6Var);
        }
        if (z11 || z12) {
            linearLayout.setBackground(f6.a0(v03, z11 ? 12 : 0, z12 ? 12 : 0, z12 ? 12 : 0, z11 ? 12 : 0));
        } else {
            linearLayout.setBackground(f6.f0(v03, 2, -1));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.l1(0.4f, v02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, g7.e6.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            e(linearLayout, menuItem, v4Var.j != null);
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
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        int i9;
        List list2;
        boolean z10;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        t4 t4Var = this.b;
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
        boolean z11 = t4Var.F;
        Rect rect = t4Var.A;
        v4 v4Var = t4Var.Q;
        if (!z11) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.x.cancel();
            t4Var.w.start();
            t4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = t4Var.H;
        t4Var.K = onMenuItemClickListener;
        t4Var.d();
        t4Var.I = null;
        t4Var.J = null;
        t4Var.N = false;
        t4Var.n();
        ta1 ta1Var = t4Var.g;
        ta1Var.removeAllViews();
        ta1Var.setPaddingRelative(0, 0, 0, 0);
        s4 s4Var = t4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) s4Var.getAdapter();
        arrayAdapter.clear();
        s4Var.setAdapter((ListAdapter) arrayAdapter);
        t4Var.f.removeAllViews();
        t4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(AndroidUtilities.dp(400.0f), ll.A(16.0f, 2, rect.width()));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i11 = min;
        boolean z12 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z13 = !hasNext2;
            if (menuItem3 == null || v4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i12 = i11;
                list = list3;
                LinearLayout b10 = b(v4Var, t4Var.a, menuItem3, false, z12, z13);
                b10.setGravity(17);
                int i13 = min;
                b10.setPaddingRelative((int) ((z12 ? 1.5d : 1.0d) * b10.getPaddingStart()), b10.getPaddingTop(), (int) (b10.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b10.getPaddingBottom());
                b10.measure(0, 0);
                min = i13;
                int min2 = Math.min(b10.getMeasuredWidth(), min);
                boolean z14 = min2 <= i12 - size2.getWidth();
                boolean z15 = !hasNext2 && min2 <= i12;
                if (!z14 && !z15) {
                    break;
                }
                b10.setTag(menuItem3);
                b10.setOnClickListener(t4Var.L);
                ta1Var.addView(b10);
                ViewGroup.LayoutParams layoutParams = b10.getLayoutParams();
                layoutParams.width = min2;
                b10.setLayoutParams(layoutParams);
                i11 = i12 - min2;
                it.remove();
                z12 = false;
            }
        }
        if (linkedList.isEmpty()) {
            i9 = 0;
        } else {
            i9 = 0;
            ta1Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        ta1Var.measure(i9, i9);
        t4Var.J = new Size(ta1Var.getMeasuredWidth(), ta1Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) s4Var.getAdapter();
            arrayAdapter2.clear();
            if (v4Var.j != null) {
                Collections.sort(linkedList, new j9.a(10));
            }
            int size3 = linkedList.size();
            boolean premiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
            int i14 = 0;
            while (i14 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i14);
                if (v4Var.j == null) {
                    list2 = list;
                } else {
                    list2 = list;
                    if (list2.contains(Integer.valueOf(menuItem4.getItemId()))) {
                        z10 = !premiumFeaturesBlocked;
                        if (!z10) {
                            arrayAdapter2.add(menuItem4);
                        }
                        i14++;
                        list = list2;
                    }
                }
                z10 = true;
                if (!z10) {
                }
                i14++;
                list = list2;
            }
            s4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (t4Var.M) {
                s4Var.setY(0.0f);
            } else {
                s4Var.setY(size2.getHeight());
            }
            int count = s4Var.getAdapter().getCount();
            int i15 = 0;
            for (int i16 = 0; i16 < count; i16++) {
                MenuItem menuItem5 = (MenuItem) s4Var.getAdapter().getItem(i16);
                com.google.firebase.messaging.o oVar = t4Var.q;
                LinearLayout linearLayout = (LinearLayout) oVar.d;
                e(linearLayout, menuItem5, ((t4) oVar.e).Q.j != null);
                linearLayout.measure(0, 0);
                i15 = Math.max(linearLayout.getMeasuredWidth(), i15);
            }
            Size size4 = new Size(Math.max(i15, size2.getWidth()), t4Var.c(4));
            t4Var.I = size4;
            t4.m(s4Var, size4);
        }
        t4Var.p();
        this.f = d;
        boolean f10 = t4Var.f();
        Point point = t4Var.B;
        PopupWindow popupWindow = t4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f10) {
            if (!rect2.equals(rect3) && t4Var.f() && popupWindow.isShowing()) {
                t4Var.d();
                t4Var.i(rect3);
                t4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!t4Var.f()) {
            t4Var.G = false;
            t4Var.F = false;
            t4Var.w.cancel();
            t4Var.x.cancel();
            t4Var.d();
            t4Var.i(rect3);
            t4Var.h();
            popupWindow.showAtLocation(t4Var.b, 0, point.x, point.y);
            t4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        ct ctVar;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; menu != null && i9 < menu.size(); i9++) {
            MenuItem item = menu.getItem(i9);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ctVar = this.k) == null || ((Boolean) ctVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
