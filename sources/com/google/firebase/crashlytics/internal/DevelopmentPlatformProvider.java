package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class DevelopmentPlatformProvider {
    private final Context context;
    private DevelopmentPlatform developmentPlatform = null;

    private class DevelopmentPlatform {
        private final String developmentPlatform;
        private final String developmentPlatformVersion;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.context, "com.google.firebase.crashlytics.unity_version", "string");
            if (resourcesIdentifier == 0) {
                if (!DevelopmentPlatformProvider.this.assetFileExists("flutter_assets/NOTICES.Z")) {
                    this.developmentPlatform = null;
                    this.developmentPlatformVersion = null;
                    return;
                } else {
                    this.developmentPlatform = "Flutter";
                    this.developmentPlatformVersion = null;
                    Logger.getLogger().v("Development platform is: Flutter");
                    return;
                }
            }
            this.developmentPlatform = "Unity";
            String string = DevelopmentPlatformProvider.this.context.getResources().getString(resourcesIdentifier);
            this.developmentPlatformVersion = string;
            Logger.getLogger().v("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean assetFileExists(String str) {
        if (this.context.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.context.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }
}
