package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u implements TextWatcher, SpanWatcher {
    public final Object a;
    public final AtomicInteger b = new AtomicInteger(0);

    public u(Object obj) {
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        ((TextWatcher) this.a).beforeTextChanged(charSequence, i3, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i10) {
        if (this.b.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.a).onSpanAdded(spannable, obj, i3, i10);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.b.get() <= 0 || !(obj instanceof w)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i3 > i10) {
                    i3 = 0;
                }
                if (i11 > i12) {
                    i13 = i3;
                    i14 = 0;
                    ((SpanWatcher) this.a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
                }
            }
            i13 = i3;
            i14 = i11;
            ((SpanWatcher) this.a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i10) {
        if (this.b.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.a).onSpanRemoved(spannable, obj, i3, i10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        ((TextWatcher) this.a).onTextChanged(charSequence, i3, i10, i11);
    }
}
