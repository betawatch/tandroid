// default package

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oka implements TextWatcher, SpanWatcher {
    public final Object a;
    public final AtomicInteger b = new AtomicInteger(0);

    public oka(Object obj) {
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof y3c)) {
            ((SpanWatcher) this.a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.b.get() <= 0 || !(obj instanceof y3c)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof y3c)) {
            ((SpanWatcher) this.a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.a).onTextChanged(charSequence, i, i2, i3);
    }
}
