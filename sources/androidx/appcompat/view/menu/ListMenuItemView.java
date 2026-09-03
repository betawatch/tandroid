package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import f.a;
import java.util.WeakHashMap;
import l.k;
import l.m;
import l.y;
import l7.w0;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {
    public final boolean B;
    public LayoutInflater C;
    public boolean D;
    public m a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView h;
    public ImageView n;
    public LinearLayout r;
    public final Drawable s;
    public final int v;
    public final Context w;
    public boolean x;
    public final Drawable y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.C == null) {
            this.C = LayoutInflater.from(getContext());
        }
        return this.C;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.n.getLayoutParams();
        rect.top = this.n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    @Override // l.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(m mVar) {
        boolean z4;
        String sb;
        this.a = mVar;
        boolean isVisible = mVar.isVisible();
        k kVar = mVar.n;
        int i10 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(mVar.e);
        setCheckable(mVar.isCheckable());
        if (kVar.o()) {
            if ((kVar.n() ? mVar.j : mVar.h) != 0) {
                z4 = true;
                kVar.n();
                if (z4) {
                    m mVar2 = this.a;
                    k kVar2 = mVar2.n;
                    if (kVar2.o()) {
                        boolean z10 = (kVar2.n() ? mVar2.j : mVar2.h) != 0;
                    }
                }
                i10 = 8;
                if (i10 == 0) {
                    TextView textView = this.f;
                    m mVar3 = this.a;
                    k kVar3 = mVar3.n;
                    Context context = kVar3.a;
                    char c3 = kVar3.n() ? mVar3.j : mVar3.h;
                    if (c3 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i11 = kVar3.n() ? mVar3.k : mVar3.i;
                        m.c(sb2, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        m.c(sb2, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        m.c(sb2, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        m.c(sb2, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        m.c(sb2, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        m.c(sb2, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c3 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c3 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c3 != ' ') {
                            sb2.append(c3);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f.getVisibility() != i10) {
                    this.f.setVisibility(i10);
                }
                setIcon(mVar.getIcon());
                setEnabled(mVar.isEnabled());
                setSubMenuArrowVisible(mVar.hasSubMenu());
                setContentDescription(mVar.q);
            }
        }
        z4 = false;
        kVar.n();
        if (z4) {
        }
        i10 = 8;
        if (i10 == 0) {
        }
        if (this.f.getVisibility() != i10) {
        }
        setIcon(mVar.getIcon());
        setEnabled(mVar.isEnabled());
        setSubMenuArrowVisible(mVar.hasSubMenu());
        setContentDescription(mVar.q);
    }

    @Override // l.y
    public m getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = j0.a;
        setBackground(this.s);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i10 = this.v;
        if (i10 != -1) {
            textView.setTextAppearance(this.w, i10);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.y);
        }
        this.n = (ImageView) findViewById(R.id.group_divider);
        this.r = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.b != null && this.x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.c == null && this.e == null) {
            return;
        }
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            view = this.e;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            view = this.c;
        }
        if (z4) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.D = z4;
        this.x = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility((this.B || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        k kVar = this.a.n;
        boolean z4 = this.D;
        if (z4 || this.x) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.x) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.r;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.x) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        w0 y10 = w0.y(getContext(), attributeSet, a.r, i10);
        this.s = y10.t(5);
        TypedArray typedArray = (TypedArray) y10.c;
        this.v = typedArray.getResourceId(1, -1);
        this.x = typedArray.getBoolean(7, false);
        this.w = context;
        this.y = y10.t(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.B = obtainStyledAttributes.hasValue(0);
        y10.A();
        obtainStyledAttributes.recycle();
    }
}
