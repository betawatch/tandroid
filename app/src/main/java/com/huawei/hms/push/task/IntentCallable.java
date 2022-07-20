package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class IntentCallable implements Callable<Void> {
    public Context a;
    public Intent b;
    public String c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.a = context;
        this.b = intent;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.a.sendBroadcast(this.b);
        PushBiUtil.reportExit(this.a, "push.setNotifyFlag", this.c, ErrorEnum.SUCCESS);
        return null;
    }
}
