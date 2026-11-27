// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a0 implements TextWatcher {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ TextView f;
    public final /* synthetic */ ScrollView h;

    public a0(ImageView imageView, int i, int i2, LinearLayout linearLayout, ArrayList arrayList, TextView textView, ScrollView scrollView) {
        this.a = imageView;
        this.b = i;
        this.c = i2;
        this.d = linearLayout;
        this.e = arrayList;
        this.f = textView;
        this.h = scrollView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        LinearLayout linearLayout;
        int i;
        int i2;
        String str;
        String lowerCase = editable.toString().trim().toLowerCase();
        boolean isEmpty = lowerCase.isEmpty();
        int i3 = 8;
        this.a.setVisibility(editable.length() > 0 ? 0 : 8);
        int i4 = this.b;
        while (true) {
            linearLayout = this.d;
            i = this.c;
            if (i4 >= i) {
                break;
            }
            linearLayout.getChildAt(i4).setVisibility(!isEmpty ? 8 : 0);
            i4++;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i5 >= arrayList.size() || (i2 = i + i5) >= linearLayout.getChildCount()) {
                break;
            }
            t4c t4cVar = (t4c) arrayList.get(i5);
            String str2 = t4cVar.d;
            if (str2 == null) {
                str2 = (t4cVar.b + " " + t4cVar.c).toLowerCase();
            }
            boolean z = isEmpty || str2.contains(lowerCase) || ((str = t4cVar.a) != null && str.toLowerCase().startsWith(lowerCase));
            linearLayout.getChildAt(i2).setVisibility(z ? 0 : 8);
            if (z) {
                i6++;
            }
            i5++;
        }
        if (!isEmpty && i6 == 0) {
            i3 = 0;
        }
        this.f.setVisibility(i3);
        this.h.scrollTo(0, 0);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
