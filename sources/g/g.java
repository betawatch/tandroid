package g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import m.v1;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class g extends u implements DialogInterface {
    public final f f;

    public g(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, e(contextThemeWrapper, i10));
        this.f = new f(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // g.u, androidx.activity.n, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View view;
        View findViewById;
        super.onCreate(bundle);
        f fVar = this.f;
        fVar.b.setContentView(fVar.u);
        Context context = fVar.a;
        Window window = fVar.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = fVar.f;
        if (view2 == null) {
            view2 = null;
        }
        boolean z10 = view2 != null;
        if (!z10 || !f.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.e != null) {
                ((LinearLayout.LayoutParams) ((v1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c10 = f.c(findViewById6, findViewById3);
        ViewGroup c11 = f.c(findViewById7, findViewById4);
        ViewGroup c12 = f.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        fVar.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c11.findViewById(android.R.id.message);
        fVar.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fVar.m.removeView(fVar.q);
            if (fVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) fVar.m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(fVar.m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(fVar.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c11.setVisibility(8);
            }
        }
        Button button = (Button) c12.findViewById(android.R.id.button1);
        fVar.h = button;
        androidx.mediarouter.app.x xVar = fVar.A;
        button.setOnClickListener(xVar);
        if (TextUtils.isEmpty(null)) {
            fVar.h.setVisibility(8);
            i10 = 0;
        } else {
            fVar.h.setText((CharSequence) null);
            fVar.h.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) c12.findViewById(android.R.id.button2);
        fVar.i = button2;
        button2.setOnClickListener(xVar);
        if (TextUtils.isEmpty(fVar.j)) {
            fVar.i.setVisibility(8);
        } else {
            fVar.i.setText(fVar.j);
            fVar.i.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) c12.findViewById(android.R.id.button3);
        fVar.l = button3;
        button3.setOnClickListener(xVar);
        if (TextUtils.isEmpty(null)) {
            fVar.l.setVisibility(8);
        } else {
            fVar.l.setText((CharSequence) null);
            fVar.l.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = fVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = fVar.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = fVar.l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            c12.setVisibility(8);
        }
        if (fVar.r != null) {
            c10.addView(fVar.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            fVar.o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(fVar.d) || !fVar.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                fVar.o.setVisibility(8);
                c10.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                fVar.p = textView2;
                textView2.setText(fVar.d);
                Drawable drawable = fVar.n;
                if (drawable != null) {
                    fVar.o.setImageDrawable(drawable);
                } else {
                    fVar.p.setPadding(fVar.o.getPaddingLeft(), fVar.o.getPaddingTop(), fVar.o.getPaddingRight(), fVar.o.getPaddingBottom());
                    fVar.o.setVisibility(8);
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i11 = (c10 == null || c10.getVisibility() == 8) ? 0 : 1;
        boolean z12 = c12.getVisibility() != 8;
        if (!z12 && (findViewById = c11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = fVar.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = fVar.e != null ? c10.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = c11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fVar.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z12 || i11 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z12 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z11) {
            View view3 = fVar.e;
            if (view3 == null) {
                view3 = fVar.m;
            }
            if (view3 != null) {
                int i12 = i11 | (z12 ? 2 : 0);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 23) {
                    WeakHashMap weakHashMap = i0.a;
                    if (i13 >= 23) {
                        r0.b0.b(view3, i12, 3);
                    }
                    if (findViewById11 != null) {
                        c11.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        c11.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i12 & 1) == 0) {
                        c11.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 == null || (i12 & 2) != 0) {
                        view = findViewById12;
                    } else {
                        c11.removeView(findViewById12);
                        view = null;
                    }
                    if (findViewById11 != null || view != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = fVar.e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new a(findViewById11, view));
                            fVar.e.post(new c5.v(fVar, findViewById11, view, false, 6));
                        } else {
                            View view4 = findViewById11;
                            if (view4 != null) {
                                c11.removeView(view4);
                            }
                            if (view != null) {
                                c11.removeView(view);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = fVar.e;
        if (alertController$RecycleListView3 == null || (listAdapter = fVar.s) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i14 = fVar.t;
        if (i14 > -1) {
            alertController$RecycleListView3.setItemChecked(i14, true);
            alertController$RecycleListView3.setSelection(i14);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // g.u, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f fVar = this.f;
        fVar.d = charSequence;
        TextView textView = fVar.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
