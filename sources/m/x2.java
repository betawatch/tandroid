package m;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class x2 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public x2(View view) {
        this.a = (TextView) view.findViewById(R.id.text1);
        this.b = (TextView) view.findViewById(R.id.text2);
        this.c = (ImageView) view.findViewById(R.id.icon1);
        this.d = (ImageView) view.findViewById(R.id.icon2);
        this.e = (ImageView) view.findViewById(org.telegram.messenger.beta.R.id.edit_query);
    }
}
