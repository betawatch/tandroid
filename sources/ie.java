// default package

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ie extends dq implements DialogInterface {
    public final sd f;

    public ie(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, e(contextThemeWrapper, i));
        this.f = new sd(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & nm7.d4) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // dq, jr2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        char c;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        sd sdVar = this.f;
        sdVar.b.setContentView(sdVar.u);
        Context context = sdVar.a;
        Window window = sdVar.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = sdVar.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !sd.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (sdVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (sdVar.e != null) {
                ((LinearLayout.LayoutParams) ((o46) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = sd.b(findViewById6, findViewById3);
        ViewGroup b2 = sd.b(findViewById7, findViewById4);
        ViewGroup b3 = sd.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        sdVar.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        sdVar.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(android.R.id.message);
        sdVar.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            sdVar.m.removeView(sdVar.q);
            if (sdVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) sdVar.m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(sdVar.m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(sdVar.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                b2.setVisibility(8);
            }
        }
        Button button = (Button) b3.findViewById(android.R.id.button1);
        sdVar.h = button;
        g6 g6Var = sdVar.A;
        button.setOnClickListener(g6Var);
        sdVar.h.setVisibility(8);
        Button button2 = (Button) b3.findViewById(android.R.id.button2);
        sdVar.i = button2;
        button2.setOnClickListener(g6Var);
        boolean isEmpty = TextUtils.isEmpty(sdVar.j);
        Button button3 = sdVar.i;
        if (isEmpty) {
            button3.setVisibility(8);
            c = 0;
        } else {
            button3.setText(sdVar.j);
            sdVar.i.setVisibility(0);
            c = 2;
        }
        Button button4 = (Button) b3.findViewById(android.R.id.button3);
        sdVar.l = button4;
        button4.setOnClickListener(g6Var);
        sdVar.l.setVisibility(8);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (c == 1) {
                Button button5 = sdVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button5.setLayoutParams(layoutParams);
            } else if (c == 2) {
                Button button6 = sdVar.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button6.setLayoutParams(layoutParams2);
            }
        }
        if (c == 0) {
            b3.setVisibility(8);
        }
        if (sdVar.r != null) {
            b.addView(sdVar.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            sdVar.o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(sdVar.d) || !sdVar.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                sdVar.o.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                sdVar.p = textView2;
                textView2.setText(sdVar.d);
                Drawable drawable = sdVar.n;
                if (drawable != null) {
                    sdVar.o.setImageDrawable(drawable);
                } else {
                    sdVar.p.setPadding(sdVar.o.getPaddingLeft(), sdVar.o.getPaddingTop(), sdVar.o.getPaddingRight(), sdVar.o.getPaddingBottom());
                    sdVar.o.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = b3.getVisibility() != 8;
        if (!z3 && (findViewById = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i != 0) {
            NestedScrollView nestedScrollView2 = sdVar.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = sdVar.e != null ? b.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = sdVar.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z2) {
            View view2 = sdVar.e;
            if (view2 == null) {
                view2 = sdVar.m;
            }
            if (view2 != null) {
                int i2 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = kfc.a;
                dfc.b(view2, i | i2, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = sdVar.e;
        if (alertController$RecycleListView2 == null || (listAdapter = sdVar.s) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i3 = sdVar.t;
        if (i3 > -1) {
            alertController$RecycleListView2.setItemChecked(i3, true);
            alertController$RecycleListView2.setSelection(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.h(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.h(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // dq, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        sd sdVar = this.f;
        sdVar.d = charSequence;
        TextView textView = sdVar.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
